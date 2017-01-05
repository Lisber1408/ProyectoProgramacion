package com.renta.view;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PRINCIPAL-PC
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form jfVistaPrincipal
     */
    public Main() {
        initComponents();
        setLocationRelativeTo(null);//para que la imagen quede centrada
        //setResizable(false); //para que la ventana no se maximice
        setTitle("Main"); //colocar nombre de la ventana
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
        jbAdministrador = new javax.swing.JButton();
        jbCliente = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

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
        getContentPane().setLayout(null);

        jbAdministrador.setBackground(new java.awt.Color(204, 204, 255));
        jbAdministrador.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jbAdministrador.setText("ADMINISTRADOR");
        jbAdministrador.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jbAdministradorStateChanged(evt);
            }
        });
        jbAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAdministradorActionPerformed(evt);
            }
        });
        getContentPane().add(jbAdministrador);
        jbAdministrador.setBounds(130, 180, 210, 40);

        jbCliente.setBackground(new java.awt.Color(204, 204, 255));
        jbCliente.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jbCliente.setText("CLIENTE"); // NOI18N
        jbCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jbCliente);
        jbCliente.setBounds(180, 230, 110, 40);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(340, 280, 60, 26);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenFondo/fondoProject.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(100, 70));
        jLabel1.setMinimumSize(new java.awt.Dimension(100, 70));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-20, -140, 650, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAdministradorActionPerformed
        // TODO add your handling code here:
        LoginAdministrador loginAd = new LoginAdministrador();
        loginAd.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbAdministradorActionPerformed

    private void jbAdministradorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jbAdministradorStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jbAdministradorStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbClienteActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbAdministrador;
    private javax.swing.JButton jbCliente;
    // End of variables declaration//GEN-END:variables


}
