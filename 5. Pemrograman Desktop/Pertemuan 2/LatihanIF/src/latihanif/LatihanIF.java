/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanif;

import javax.swing.JOptionPane;

/**
 *
 * @author Alya Aiman Salsabila Arif
 */
public class LatihanIF {
    
    /**
     * @param args the command line arguments
     */
    static void nilai() {
        String a = JOptionPane.showInputDialog("Masukkan Nilai");
        double grade = Double.parseDouble(a);
        String pesan="";
        if (grade >= 90)    {
            pesan = "Excellent";
        }   else if ((grade < 90) && (grade >= 80))   {
            pesan = "Bagus!";
        }   else if ((grade < 80) && (grade >= 60)) {
            pesan = "Belajar Lagi!";
        }
            else    {
            pesan = "Maaf, Anda gagal";
        }
        JOptionPane.showMessageDialog(null, pesan);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        nilai();
    }
    
}
