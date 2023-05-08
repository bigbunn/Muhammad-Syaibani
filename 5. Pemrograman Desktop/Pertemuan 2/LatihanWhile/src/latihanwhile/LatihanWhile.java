/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanwhile;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class LatihanWhile {

    /**
     * @param args the command line arguments
     */
    static void proses()    {
        int harga;
        int menu = Integer.parseInt(JOptionPane.showInputDialog("1. Nasi goreng(15000)\n"
                + "2. Ayam goreng(16000)\n"
                + "3. Mie goreng(17000)\n"
                + "Masukkan pilihan (1-3)"));
        if (menu == 1)  {
            int jumlah = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah yang dibeli"));
            harga = jumlah * 15000;
            JOptionPane.showMessageDialog(null,"Anda membeli nasi goreng dengan harga " + harga);
        }   else if (menu == 2) {
            int jumlah = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah yang dibeli"));
            harga = jumlah * 16000;
            JOptionPane.showMessageDialog(null,"Anda membeli ayam goreng dengan harga " + harga);
        }   else if (menu == 3) {
            int jumlah = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah yang dibeli"));
            harga = jumlah * 17000;
            JOptionPane.showMessageDialog(null,"Anda membeli mie goreng dengan harga " + harga);
        }
    }
    static void perulangan()    {
        boolean i = true;
        while (i==true) {
            proses();
            int opsi = JOptionPane.showConfirmDialog(null, "Mau lanjut????");
            if (opsi == JOptionPane.YES_OPTION) {
                i = true;
            }   else if (opsi == JOptionPane.NO_OPTION) {
                i = false;
                JOptionPane.showMessageDialog(null, "Terima kasih.... Bye....");
            }   else    {
                i = false;
                JOptionPane.showMessageDialog(null, "Cancel");
            }
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        perulangan();
    }
    
}
