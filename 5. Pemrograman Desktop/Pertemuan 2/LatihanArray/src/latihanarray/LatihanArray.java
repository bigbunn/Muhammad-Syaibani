/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanarray;

import javax.swing.JOptionPane;

/**
 *
 * @author Alya Aiman Salsabila Arif
 */
public class LatihanArray {

    /**
     * @param args the command line arguments
     */
    static void proses()    {
        int []array=new int[5];
        int ctkData;
        
        array[0]=Integer.parseInt(JOptionPane.showInputDialog("Masukkan data ke-1"));
        array[1]=Integer.parseInt(JOptionPane.showInputDialog("Masukkan data ke-2"));
        array[2]=Integer.parseInt(JOptionPane.showInputDialog("Masukkan data ke-3"));
        array[3]=Integer.parseInt(JOptionPane.showInputDialog("Masukkan data ke-4"));
        array[4]=Integer.parseInt(JOptionPane.showInputDialog("Masukkan data ke-5"));
        ctkData = array[0] + array[1] + array[2] + array[3] + array[4];
        
        JOptionPane.showMessageDialog(null, "Data dalam array : " + ctkData);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        proses();
    }
    
}
