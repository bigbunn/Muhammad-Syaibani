/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import Entitas.StokBarang;
import java.awt.Color;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import Services.ServicesStokBarang;

/**
 *
 * @author Alya Aiman Salsabila Arif
 */
public class DataStokBarang extends javax.swing.JFrame {

    final ServicesStokBarang servicesBarang;
    /**
     * Creates new form DataStokBarang
     */
    public DataStokBarang()throws RemoteException, NotBoundException {
        Registry registry= LocateRegistry.getRegistry(1099);
        servicesBarang=(ServicesStokBarang) registry.lookup("barang");
        initComponents();
        select(tblBarang);
 }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bHapus = new javax.swing.JButton();
        bKeluar = new javax.swing.JButton();
        bRubah = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tNama = new javax.swing.JTextField();
        tJumlah = new javax.swing.JTextField();
        tKode = new javax.swing.JTextField();
        bSimpan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBarang = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 0));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        bHapus.setBackground(new java.awt.Color(102, 102, 255));
        bHapus.setText("Hapus");
        bHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHapusActionPerformed(evt);
            }
        });

        bKeluar.setBackground(new java.awt.Color(102, 102, 255));
        bKeluar.setText("Keluar");
        bKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bKeluarActionPerformed(evt);
            }
        });

        bRubah.setBackground(new java.awt.Color(102, 102, 255));
        bRubah.setText("Rubah");
        bRubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRubahActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Stok Barang");

        jLabel2.setText("Kode Barang");

        jLabel3.setText("Nama Barang");

        jLabel4.setText("Jumlah Barang");

        tNama.setBackground(new java.awt.Color(204, 255, 255));
        tNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNamaActionPerformed(evt);
            }
        });

        tJumlah.setBackground(new java.awt.Color(204, 255, 255));

        tKode.setBackground(new java.awt.Color(204, 255, 255));

        bSimpan.setBackground(new java.awt.Color(102, 102, 255));
        bSimpan.setText("Simpan");
        bSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSimpanActionPerformed(evt);
            }
        });

        tblBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode", "Nama", "Jumlah"
            }
        ));
        tblBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBarang);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bSimpan)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tJumlah)
                                    .addComponent(tNama)
                                    .addComponent(tKode, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bHapus)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bRubah)
                                    .addComponent(bKeluar))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4))
                                    .addComponent(tJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(tNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bSimpan)
                            .addComponent(bRubah))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bHapus)
                            .addComponent(bKeluar)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void select (javax.swing.JTable tblBarang) throws RemoteException {
        // begin
        String header[]={" Kode "," Nama "," Jumlah "};
        java.util.List list = servicesBarang.getBarang();
        Object data[][] = new Object[list.size()][3];
        int x = 0;
        for (Iterator it = list.iterator(); it.hasNext();) {
        StokBarang b = (StokBarang) it.next();
        data[x][0] = b.getKode();
        data[x][1] = b.getNama();
        data[x][2] = b.getJumlah();
        ++x;
    }
    tblBarang.setModel(new DefaultTableModel(data, header));
    JTableHeader head = tblBarang.getTableHeader();
    head.setBackground(Color.orange);
    // end
    }
    
    private void insert(ServicesStokBarang servicesBarang) throws RemoteException{
 
        StokBarang b=new StokBarang();
        b.setKode(Integer.valueOf(tKode.getText()));
        b.setNama(tNama.getText());
        b.setJumlah(Integer.valueOf(tJumlah.getText()));
        servicesBarang.insert(b);
    }
    
    private void update(ServicesStokBarang servicesBarang) throws RemoteException{
        StokBarang b = new StokBarang();
        b.setKode(Integer.valueOf(tKode.getText()));
        b.setNama(tNama.getText());
        b.setJumlah(Integer.valueOf(tJumlah.getText()));
        servicesBarang.update(b);
    }
    private void delete(ServicesStokBarang servicesBarang) throws RemoteException{
        StokBarang b = new StokBarang();
        b.setKode(Integer.valueOf(tKode.getText()));
        servicesBarang.delete(b);
    }
    
    private void clear(){ 
        tKode.setText("");
        tNama.setText("");
        tJumlah.setText("");
    }
    
    private void tNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNamaActionPerformed

    private void bSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSimpanActionPerformed
        // TODO add your handling code here:
        if (tKode.getText().equals("") || tNama.getText().equals("") 
                || tJumlah.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Silahkan Input Data Dulu");
        }
        else{
            try {
                insert(servicesBarang);
                select(tblBarang);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            } 
        }
        clear();
    }//GEN-LAST:event_bSimpanActionPerformed

    private void tblBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBarangMouseClicked
        // TODO add your handling code here:
        tKode.setText(tblBarang.getValueAt(tblBarang.getSelectedRow(),0).toString());
        tNama.setText(tblBarang.getValueAt(tblBarang.getSelectedRow(),1).toString());
        tJumlah.setText(tblBarang.getValueAt(tblBarang.getSelectedRow(),2).toString());
    }//GEN-LAST:event_tblBarangMouseClicked

    private void bRubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRubahActionPerformed
        // TODO add your handling code here:
        if (tKode.getText().equals("") || tNama.getText().equals("")
                || tJumlah.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Silahkan pilih data yang akan di Update");
        }else{
            try {
                update(servicesBarang);
                select(tblBarang);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            clear();
        }
    }//GEN-LAST:event_bRubahActionPerformed

    private void bHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHapusActionPerformed
        // TODO add your handling code here:
        if (tKode.getText().equals("") || tNama.getText().equals("")
                || tJumlah.getText().equals(""))    {
            JOptionPane.showMessageDialog(null, "Silahkan pilih data yang akan di Delete");
        }   else    {
            try {
                delete(servicesBarang);
                select(tblBarang);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            clear();
        }
    }//GEN-LAST:event_bHapusActionPerformed

    private void bKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bKeluarActionPerformed
        // TODO add your handling code here:
        MenuUtama mu = new MenuUtama();
        mu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bKeluarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bHapus;
    private javax.swing.JButton bKeluar;
    private javax.swing.JButton bRubah;
    private javax.swing.JButton bSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tJumlah;
    private javax.swing.JTextField tKode;
    private javax.swing.JTextField tNama;
    private javax.swing.JTable tblBarang;
    // End of variables declaration//GEN-END:variables
}
