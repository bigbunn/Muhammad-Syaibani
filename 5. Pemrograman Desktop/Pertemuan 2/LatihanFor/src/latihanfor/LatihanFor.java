/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanfor;

import javax.swing.JOptionPane;

/**
 *
 * @author Alya Aiman Salsabila Arif
 */
public class LatihanFor {
    /**
     * @param args the command line arguments
     */
    static void hitung()   {
        int awal = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai awal"));
        int akhir = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai akhir"));
        if (awal < akhir)   {
            for (int i=awal; i<akhir; i++)  {
                if (i % 2 == 0)   {
                    JOptionPane.showMessageDialog(null, "bilangan genap : " + i);
                }
            }
        }   else    {
            for (int i=awal; i>akhir; i++)  {
                if (i % 2 == 0) {
                    JOptionPane.showMessageDialog(null, "bilangan genap : " + i);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        hitung();
    }
    
}
