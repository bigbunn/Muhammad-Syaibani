/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
    public void setNilai(String namatable) {
        this.setSize(600, 400);
        this.setTitle("Diagram Pie Data Barang Masuk");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //membuat diagram/chart jfreechart
        //membuat/mengkalkulasikan data chart
        PieDataset dataset = buildData(namatable);
        //membuat chart bedasarkan data yang ada pada dataset
        JFreeChart chart = buildChart(dataset, "Data dari Grafik Input");
        //membuat JPANEL untuk INPUT diagram PIE 
        JPanel pane = new JPanel(new GridLayout(1, 1));
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

    private PieDataset buildData(String namatable) {
        final DefaultPieDataset dataSet = new DefaultPieDataset();
        try {
            Connection c = Koneksi.getKoneksi();
            Statement s = c.createStatement();
            String sql = "SELECT * FROM " + namatable;
            ResultSet r = s.executeQuery(sql);
            while (r.next()) {
                // lakukan penelusuran baris
                String Nama_Barang = r.getString("Nama_Barang");
                String Jumlah = r.getString("Jumlah");
                dataSet.setValue(Nama_Barang, Integer.parseInt(Jumlah));
            }
            r.close();
            s.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Terjadi Kesalahan!");
        }
        return dataSet;
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.
                    getSystemLookAndFeelClassName());
        } catch (Exception e) {
        }
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }
}
