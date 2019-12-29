/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas_oop_181080200213;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Locale;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author ROBBY
 */
public class Menu_form_181080200213 extends javax.swing.JFrame {
    private Connection conn;
    private ResultSet result;
    Winiconn_181080200213 connectpsql = new Winiconn_181080200213();
    /**
     * Creates new form Menu_form_181080200213
     */
    public Menu_form_181080200213() {
        initComponents();
        conn=connectpsql.getConnection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        btn_create = new javax.swing.JButton();
        btn_close = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_lpr = new javax.swing.JButton();
        btn_look1 = new javax.swing.JButton();
        btn_lprsat = new javax.swing.JButton();
        btn_ctklpr = new javax.swing.JButton();
        btn_ctklprsat = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_create.setText("ENTRY DATA");
        btn_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_createActionPerformed(evt);
            }
        });

        btn_close.setText("CLOSE");
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Selamat Datang di Aplikasi Input Barang");

        btn_lpr.setText("LIHAT LAPORAN");
        btn_lpr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lprActionPerformed(evt);
            }
        });

        btn_look1.setText("LIHAT DATA");
        btn_look1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_look1ActionPerformed(evt);
            }
        });

        btn_lprsat.setText("LIHAT LAPORAN SATUAN");
        btn_lprsat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lprsatActionPerformed(evt);
            }
        });

        btn_ctklpr.setText("CETAK LAPORAN TRANSAKSI");
        btn_ctklpr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ctklprActionPerformed(evt);
            }
        });

        btn_ctklprsat.setText("CETAK LAPORAN SATUAN");
        btn_ctklprsat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ctklprsatActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_create, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(btn_look1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_lpr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_lprsat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_ctklpr, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_ctklprsat, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_create, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_lpr, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_look1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_lprsat, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ctklpr, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ctklprsat, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_createActionPerformed
        // TODO add your handling code here:
        Input_form_181080200213 createinput = new Input_form_181080200213();
        createinput.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_createActionPerformed
            
    private void btn_lprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lprActionPerformed
        // TODO add your handling code here:
        try {
            JasperDesign jasdes = JRXmlLoader.load("./reports/report_uas_oop_181080200213.jrxml");
            JasperReport jasrep = JasperCompileManager.compileReport(jasdes);
            JasperPrint jasprint = JasperFillManager.fillReport(jasrep, null, connectpsql.getConnection());
            JasperViewer.viewReport(jasprint, false);
        } catch (Exception e) {
            String conmsg = "Cant Create Report" +ex.getMessage()+" "+ex.getLocalizedMessage();
            JOptionPane.showMessageDialog(null, conmsg);
        }
    }//GEN-LAST:event_btn_lprActionPerformed

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_closeActionPerformed

    private void btn_look1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_look1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_look1ActionPerformed

    private void btn_lprsatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lprsatActionPerformed
        // TODO add your handling code here:
        try {
            JasperDesign jasdes = JRXmlLoader.load("./reports/reportsatuan_uas_oop_181080200213.jrxml");
            JasperReport jasrep = JasperCompileManager.compileReport(jasdes);
            JasperPrint jasprint = JasperFillManager.fillReport(jasrep, null, connectpsql.getConnection());
            JasperViewer.viewReport(jasprint, false);
        } catch (Exception e) {
            String conmsg = "Cant Create Report" +ex.getMessage()+" "+ex.getLocalizedMessage();
            JOptionPane.showMessageDialog(null, conmsg);
        }
    }//GEN-LAST:event_btn_lprsatActionPerformed

    private void btn_ctklprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ctklprActionPerformed
        // TODO add your handling code here:
        try {
            Statement state = connectpsql.getConnection().createStatement();
            result = state.executeQuery("Select * from barang");
            JRResultSetDataSource resultdatasource = new JRResultSetDataSource(result);
            JasperPrint jasprint = JasperFillManager.fillReport("./reports/report_uas_oop_181080200213.jasper", new HashMap(), resultdatasource);
            JasperPrintManager.printReport(jasprint, true);
        } catch (Exception e) {
            String conmsg = "Cant Create Report" +ex.getMessage()+" "+ex.getLocalizedMessage();
            JOptionPane.showMessageDialog(null, conmsg);
        }
    }//GEN-LAST:event_btn_ctklprActionPerformed

    private void btn_ctklprsatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ctklprsatActionPerformed
        // TODO add your handling code here:
        try {
            Statement state = connectpsql.getConnection().createStatement();
            result = state.executeQuery("Select * from satuan");
            JRResultSetDataSource resultdatasource = new JRResultSetDataSource(result);
            JasperPrint jasprint = JasperFillManager.fillReport("./reports/reportsatuan_uas_oop_181080200213.jasper", new HashMap(), resultdatasource);
            JasperPrintManager.printReport(jasprint, true);
        } catch (Exception e) {
            String conmsg = "Cant Create Report" +ex.getMessage()+" "+ex.getLocalizedMessage();
            JOptionPane.showMessageDialog(null, conmsg);
        }
    }//GEN-LAST:event_btn_ctklprsatActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_form_181080200213.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_form_181080200213.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_form_181080200213.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_form_181080200213.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_form_181080200213().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_create;
    private javax.swing.JButton btn_ctklpr;
    private javax.swing.JButton btn_ctklprsat;
    private javax.swing.JButton btn_look1;
    private javax.swing.JButton btn_lpr;
    private javax.swing.JButton btn_lprsat;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}