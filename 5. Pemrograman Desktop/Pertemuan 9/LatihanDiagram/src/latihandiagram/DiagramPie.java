/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihandiagram;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;

/**
 *
 * @author Alya Aiman Salsabila Arif
 */

public class DiagramPie extends JFrame{
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
        this.setSize(600, 400);
        this.setTitle("Diagram PIE");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //membuat diagram/chart jfreechart
        //membuat/mengkalkulasikan data chart
        PieDataset dataset = buildData();
        //membuat chart bedasarkan data yang ada pada dataset
        JFreeChart chart = buildChart(dataset, "Data dari Grafik Input");
        //membuat JPANEL untuk INPUT diagram PIE 
        JPanel pane = new JPanel(new GridLayout(1,1));
        //menambahkan CHART 1 dan 2 ke PANEL
        pane.add(new ChartPanel(chart));
        //memasukkan chart panel ke dalam jpanel
        this.setContentPane(pane);
    }
    
    private JFreeChart buildChart(PieDataset dataset, String judul) {
        JFreeChart chart = ChartFactory.createPieChart3D(judul, //Judul Chart
        dataset, //data chart yang akan ditampilkan
        true, //jika iya maka chart/diagram akan ditampilkan
        true,
        false); 
        PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setStartAngle(290);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.5f);
        return chart;
    }
    
    private PieDataset buildData() {
        DefaultPieDataset dataSet = new DefaultPieDataset();
        dataSet.setValue("Nilai 1", n1);
        dataSet.setValue("Nilai 2", n2);
        dataSet.setValue("Nilai 3", n3);
        
        return dataSet;
 }
    
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
    }
    
        SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
            new PieInput().setVisible(true);
        }
        });
    }
}
