/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gvillena;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class pago extends javax.swing.JFrame {

    /**
     * Creates new form pago
     */
    public pago() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Pagos Onlain");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbNombre = new javax.swing.JLabel();
        lbNumeroTarjeta = new javax.swing.JLabel();
        lbCodigoSeguridad = new javax.swing.JLabel();
        lbCaducidad = new javax.swing.JLabel();
        etMes = new javax.swing.JTextField();
        etNombreTitular = new javax.swing.JTextField();
        etNumeroTarjeta = new javax.swing.JTextField();
        lbPagoConTarjeta = new javax.swing.JLabel();
        lbCiudad = new javax.swing.JLabel();
        lbImagenVisa = new javax.swing.JLabel();
        jbtnvolver = new javax.swing.JButton();
        btnOtrometodopag1 = new javax.swing.JToggleButton();
        txtsc = new javax.swing.JTextField();
        jpass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbNombre.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lbNombre.setText("Nombre del Titular");

        lbNumeroTarjeta.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lbNumeroTarjeta.setText("Numero de Tarjeta");

        lbCodigoSeguridad.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lbCodigoSeguridad.setText("CVV (Código de seguridad)");

        lbCaducidad.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lbCaducidad.setText("Fecha de Caducidad");

        lbPagoConTarjeta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbPagoConTarjeta.setText("Pago con Tarjeta");

        lbCiudad.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lbCiudad.setText("Nombre de la Ciudad");

        jbtnvolver.setText("Volver");
        jbtnvolver.setBorder(null);
        jbtnvolver.setBorderPainted(false);
        jbtnvolver.setContentAreaFilled(false);
        jbtnvolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnvolver.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnvolver.setIconTextGap(-3);
        jbtnvolver.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnvolver.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnvolverActionPerformed(evt);
            }
        });

        btnOtrometodopag1.setText("Comprar");
        btnOtrometodopag1.setBorder(null);
        btnOtrometodopag1.setBorderPainted(false);
        btnOtrometodopag1.setContentAreaFilled(false);
        btnOtrometodopag1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOtrometodopag1.setDoubleBuffered(true);
        btnOtrometodopag1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOtrometodopag1.setIconTextGap(-3);
        btnOtrometodopag1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnOtrometodopag1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOtrometodopag1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOtrometodopag1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNombre)
                            .addComponent(lbNumeroTarjeta)
                            .addComponent(lbCodigoSeguridad)
                            .addComponent(lbCaducidad)
                            .addComponent(lbCiudad))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(etNombreTitular, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                .addComponent(etNumeroTarjeta, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                .addComponent(txtsc)
                                .addComponent(etMes, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jpass, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(lbPagoConTarjeta)))
                .addGap(221, 221, 221)
                .addComponent(lbImagenVisa)
                .addGap(79, 79, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jbtnvolver, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOtrometodopag1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(lbImagenVisa, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(lbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(lbNumeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbCodigoSeguridad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(etMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(lbPagoConTarjeta)
                                .addGap(38, 38, 38)
                                .addComponent(etNombreTitular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(etNumeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnvolver, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOtrometodopag1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOtrometodopag1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOtrometodopag1ActionPerformed
     
        JOptionPane.showMessageDialog(null, "Su Compra a sido Exitosa. GRACIAS POR SU PREFERENCIA");
       
        dispose();
         formulario fr=new formulario();
                fr.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnOtrometodopag1ActionPerformed

    private void jbtnvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnvolverActionPerformed
        Plan obj=new Plan();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbtnvolverActionPerformed

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
            java.util.logging.Logger.getLogger(pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnOtrometodopag1;
    public static javax.swing.JTextField etMes;
    public static javax.swing.JTextField etNombreTitular;
    public static javax.swing.JTextField etNumeroTarjeta;
    private javax.swing.JButton jbtnvolver;
    private javax.swing.JPasswordField jpass;
    private javax.swing.JLabel lbCaducidad;
    private javax.swing.JLabel lbCiudad;
    private javax.swing.JLabel lbCodigoSeguridad;
    private javax.swing.JLabel lbImagenVisa;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbNumeroTarjeta;
    private javax.swing.JLabel lbPagoConTarjeta;
    public static javax.swing.JTextField txtsc;
    // End of variables declaration//GEN-END:variables
}
