/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package latihandiagram;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.category.CategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

/**
*
* @author Alya Aiman Salsabila Arif
*/

public class DiagramBar extends JFrame {
    double n1=0, n2=0, n3=0;
    public void setNilai(String nilai1, String nilai2, String nilai3) {
        try {
            n1 = Double.parseDouble(nilai1);
        } catch (NumberFormatException ex){
        }
        try {
            n2 = Double.parseDouble(nilai2);
        } catch (NumberFormatException ex){
        }
        try {
            n3 = Double.parseDouble(nilai3);
        } catch (NumberFormatException ex){
        }

        String chartTitle = null;
        this.setSize(600, 400);
        this.setTitle("Report Diagram Bar");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JFreeChart barChart = ChartFactory.createBarChart(
        chartTitle,
        "Nilai",
        "Frekuensi",
        createDataset(),
        PlotOrientation.VERTICAL,
        true, true, true);
        ChartPanel chartPanel = new ChartPanel ( barChart );
        chartPanel.setPreferredSize(new java.awt.Dimension( 800 , 370 ) );
        setContentPane ( chartPanel );
    }

    private CategoryDataset createDataset() {
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(n1, "Nilai 1" , "");
        dataset.setValue(n2, "Nilai 2" , "");
        dataset.setValue(n3, "Nilai 3" , "");
        return dataset;
    }

    public static void main (String args[]){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
        }
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                BarInput bi = new BarInput();
                bi.setVisible(true);
            }
        });
    }
}