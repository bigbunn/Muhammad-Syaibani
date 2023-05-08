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
public class HitungLuasPersegiPanjang {
    HitungLuasPersegiPanjang()  {
    }
    void luas() {
        int panjang;
        int lebar;
        int luas;
        panjang = Integer.parseInt(JOptionPane.showInputDialog("Inputkan panjang"));
        lebar = Integer.parseInt(JOptionPane.showInputDialog("Inputkan lebar"));
        
        luas = panjang * lebar;
        JOptionPane.showMessageDialog(null, "Luas = panjang X lebar = " + luas);
    }
}