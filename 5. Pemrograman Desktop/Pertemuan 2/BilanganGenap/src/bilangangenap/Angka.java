/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bilangangenap;

import javax.swing.JOptionPane;

/**
 *
 * @author Alya Aiman Salsabila Arif
 */
public class Angka {
    Angka() {
    }
    void genap(){
         int awal, akhir;
         awal = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai awal"));
         akhir = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai akhir"));
         
         for(int i=awal; i<=akhir; i++){
             if(i%2==0){
                 JOptionPane.showMessageDialog(null, "Bilangan genap: " + i);
             }
         }
         
         for(int i=awal; i>=akhir; i--){
             if(i%2==0){
                 JOptionPane.showMessageDialog(null, "Bilangan genap: " + i);
             }
         }
    }
}
