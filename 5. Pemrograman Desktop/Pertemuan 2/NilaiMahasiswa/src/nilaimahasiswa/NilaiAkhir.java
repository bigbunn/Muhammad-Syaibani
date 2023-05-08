/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilaimahasiswa;

import javax.swing.JOptionPane;

/**
 *
 * @author Alya Aiman Salsabila Arif
 */
public class NilaiAkhir {
    private double uts,uas;
    private double nilaiakhir;
    
    NilaiAkhir()    {
        
    }
    
    void setUTS(double uts) {
        this.uts = uts;
    }
    double getUTS() {
        return uts;
    }
    
    void setUAS(double uas) {
        this.uas = uas;
    }
    double getUAS() {
        return uas;
    }
    
    void hasil()    {
        setUTS(Integer.parseInt(JOptionPane.showInputDialog("Inputkan Nilai UTS")));
        setUAS(Integer.parseInt(JOptionPane.showInputDialog("Inputkan Nilai UAS")));
        nilaiakhir = getUAS() * 50 / 100 +getUTS() * 50 / 100;
        JOptionPane.showMessageDialog(null, nilaiakhir);
    }
}
