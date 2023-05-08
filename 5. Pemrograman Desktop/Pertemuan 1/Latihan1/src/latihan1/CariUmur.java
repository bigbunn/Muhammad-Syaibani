/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;

import javax.swing.JOptionPane;

/**
 *
 * @author Alya Aiman Salsabila Arif
 */
public class CariUmur {
    CariUmur(){
        
    }
    void hasil(){
        int umur;
        String nama, kesimpulan;
        nama = JOptionPane.showInputDialog("Inputkan nama");
        umur = Integer.parseInt(JOptionPane.showInputDialog("Inputkan umur:"));
        if (umur <= 0){
            kesimpulan = "inputan salah";
            JOptionPane.showMessageDialog(null, kesimpulan);
        } else if (umur < 17){
            kesimpulan = "anda belum bisa menonton bioskop dan mendapatkan KTP";
            JOptionPane.showMessageDialog(null, "nama : "+ nama +" \nkesimpulan: " + kesimpulan);
        } else if (umur >= 17) {
            kesimpulan = "anda sudah bisa menonton bioskop dan mendapatkan KTP";
            JOptionPane.showMessageDialog(null, "nama : "+ nama +" \nkesimpulan: " + kesimpulan);        
        }
    }
}