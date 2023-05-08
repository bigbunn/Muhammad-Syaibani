package quiz;

import java.awt.event.MouseEvent;


public class MenuPopUp extends javax.swing.JFrame {

    public MenuPopUp() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        klik_logout_y = new javax.swing.JPopupMenu();
        logout = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        HitungBerat = new javax.swing.JMenu();
        MenuKalkulatorBMI = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu1 = new javax.swing.JMenu();
        Pria = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        Wanita = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        PesanMakan = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        MenuInfoKelompok = new javax.swing.JMenuItem();

        klik_logout_y.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                klik_logout_yMousePressed(evt);
            }
        });

        logout.setIcon(new javax.swing.ImageIcon("D:\\CoolYeah\\Semester 6\\Pemrograman Desktop\\Assigntment\\quiz\\lock15.png")); // NOI18N
        logout.setText("Logout dulu y?");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        klik_logout_y.add(logout);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        HitungBerat.setIcon(new javax.swing.ImageIcon("D:\\CoolYeah\\Semester 6\\Pemrograman Desktop\\Assigntment\\quiz\\titik.png")); // NOI18N
        HitungBerat.setText("Hitung Berat Badan Ideal");

        MenuKalkulatorBMI.setIcon(new javax.swing.ImageIcon("D:\\CoolYeah\\Semester 6\\Pemrograman Desktop\\Assigntment\\quiz\\icon biru kecil.png")); // NOI18N
        MenuKalkulatorBMI.setText("Kalkulator BMI");
        MenuKalkulatorBMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuKalkulatorBMIActionPerformed(evt);
            }
        });
        HitungBerat.add(MenuKalkulatorBMI);
        HitungBerat.add(jSeparator1);

        jMenu1.setIcon(new javax.swing.ImageIcon("D:\\CoolYeah\\Semester 6\\Pemrograman Desktop\\Assigntment\\quiz\\icon biru kecil.png")); // NOI18N
        jMenu1.setText("Kalkulator Broca");

        Pria.setIcon(new javax.swing.ImageIcon("D:\\CoolYeah\\Semester 6\\Pemrograman Desktop\\Assigntment\\quiz\\people_y.png")); // NOI18N
        Pria.setText("Pria");
        Pria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriaActionPerformed(evt);
            }
        });
        jMenu1.add(Pria);
        jMenu1.add(jSeparator2);

        Wanita.setIcon(new javax.swing.ImageIcon("D:\\CoolYeah\\Semester 6\\Pemrograman Desktop\\Assigntment\\quiz\\people_y.png")); // NOI18N
        Wanita.setText("Wanita");
        Wanita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WanitaActionPerformed(evt);
            }
        });
        jMenu1.add(Wanita);

        HitungBerat.add(jMenu1);

        jMenuBar1.add(HitungBerat);

        jMenu2.setIcon(new javax.swing.ImageIcon("D:\\CoolYeah\\Semester 6\\Pemrograman Desktop\\Assigntment\\quiz\\titik.png")); // NOI18N
        jMenu2.setText("Transaksi");

        PesanMakan.setIcon(new javax.swing.ImageIcon("D:\\CoolYeah\\Semester 6\\Pemrograman Desktop\\Assigntment\\quiz\\icon biru kecil.png")); // NOI18N
        PesanMakan.setText("Pesan Makanan");
        PesanMakan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesanMakanActionPerformed(evt);
            }
        });
        jMenu2.add(PesanMakan);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon("D:\\CoolYeah\\Semester 6\\Pemrograman Desktop\\Assigntment\\quiz\\titik.png")); // NOI18N
        jMenu3.setText("Info");

        MenuInfoKelompok.setIcon(new javax.swing.ImageIcon("D:\\CoolYeah\\Semester 6\\Pemrograman Desktop\\Assigntment\\quiz\\icon biru kecil.png")); // NOI18N
        MenuInfoKelompok.setText("Info Kelompok");
        MenuInfoKelompok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuInfoKelompokActionPerformed(evt);
            }
        });
        jMenu3.add(MenuInfoKelompok);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 378, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void showpopupMenu(MouseEvent e){
        klik_logout_y.show(this, e.getX(), e.getY());
    }
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
        showpopupMenu(evt);
    }//GEN-LAST:event_formMousePressed

    private void MenuKalkulatorBMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuKalkulatorBMIActionPerformed
        // TODO add your handling code here:
        KalkulatorBMI gui = new KalkulatorBMI();
        gui.setVisible(true);
                    dispose();

    }//GEN-LAST:event_MenuKalkulatorBMIActionPerformed

    private void MenuInfoKelompokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuInfoKelompokActionPerformed
        // TODO add your handling code here:
        InfoKelompok guiinfo = new InfoKelompok();
        guiinfo.setVisible(true); 
                    dispose();

    }//GEN-LAST:event_MenuInfoKelompokActionPerformed

    private void PriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriaActionPerformed
        // TODO add your handling code here:
        Pria otoko = new Pria();
        otoko.setVisible(true);
                    dispose();

    }//GEN-LAST:event_PriaActionPerformed

    private void WanitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WanitaActionPerformed
        // TODO add your handling code here:
        Wanita wamen = new Wanita();
        wamen.setVisible(true);
                    dispose();

    }//GEN-LAST:event_WanitaActionPerformed

    private void PesanMakanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesanMakanActionPerformed
        // TODO add your handling code here:
        PesanMakanan ngemie = new PesanMakanan();
        ngemie.setVisible(true);
                    dispose();
    }//GEN-LAST:event_PesanMakanActionPerformed

    private void klik_logout_yMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_klik_logout_yMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_klik_logout_yMousePressed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        Login awal = new Login();
        awal.setVisible(true);
                    dispose();
    }//GEN-LAST:event_logoutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPopUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu HitungBerat;
    private javax.swing.JMenuItem MenuInfoKelompok;
    private javax.swing.JMenuItem MenuKalkulatorBMI;
    private javax.swing.JMenuItem PesanMakan;
    private javax.swing.JMenuItem Pria;
    private javax.swing.JMenuItem Wanita;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu klik_logout_y;
    private javax.swing.JMenuItem logout;
    // End of variables declaration//GEN-END:variables
}
