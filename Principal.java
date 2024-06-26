/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Trikitrakicolores;

import javax.swing.JOptionPane;

/**
 *
 * @author TOÑO
 */
public class Principal extends javax.swing.JFrame {

    private Juego j;

    /**
     * Creates new form Inicio
     */
    public Principal() {
        this.j = new Juego();
        initComponents();
        this.setTitle("Triki Traki");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        butgroupmodojuego = new javax.swing.ButtonGroup();
        butgroupInicia = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreJugadorX = new javax.swing.JTextField();
        radiobx = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        txtNombreJugadorO = new javax.swing.JTextField();
        radiobo = new javax.swing.JRadioButton();
        btIniciarJuego = new javax.swing.JButton();
        cbColorX = new javax.swing.JComboBox<>();
        cbColorO = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        cmb3x3 = new javax.swing.JRadioButton();
        cmb4x4 = new javax.swing.JRadioButton();
        cmb5x5 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("     TRIKI TRAKI");

        jLabel2.setText("NOMBRE JUGADOR X");

        butgroupInicia.add(radiobx);
        radiobx.setText("Comienza");
        radiobx.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                radiobxStateChanged(evt);
            }
        });

        jLabel3.setText("NOMBRE JUGADOR O");

        butgroupInicia.add(radiobo);
        radiobo.setText("Comienza");

        btIniciarJuego.setText("INICIAR JUEGO");
        btIniciarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIniciarJuegoActionPerformed(evt);
            }
        });

        cbColorX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Rojo", "Azul" }));
        cbColorX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbColorXActionPerformed(evt);
            }
        });

        cbColorO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Rojo", "Azul" }));
        cbColorO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbColorOActionPerformed(evt);
            }
        });

        jLabel4.setText("Color");

        jLabel5.setText("Color");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("MODO DE JUEGO");

        butgroupmodojuego.add(cmb3x3);
        cmb3x3.setText("3x3");
        cmb3x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb3x3ActionPerformed(evt);
            }
        });

        butgroupmodojuego.add(cmb4x4);
        cmb4x4.setText("4x4");
        cmb4x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb4x4ActionPerformed(evt);
            }
        });

        butgroupmodojuego.add(cmb5x5);
        cmb5x5.setText("5x5");
        cmb5x5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb5x5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNombreJugadorX, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNombreJugadorO, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(radiobx)
                                            .addComponent(radiobo))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbColorX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbColorO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel1)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(cmb3x3)
                        .addGap(99, 99, 99)
                        .addComponent(cmb4x4)
                        .addGap(101, 101, 101)
                        .addComponent(cmb5x5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(btIniciarJuego))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(radiobx)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radiobo))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombreJugadorX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNombreJugadorO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbColorX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cbColorO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb3x3)
                    .addComponent(cmb4x4)
                    .addComponent(cmb5x5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(btIniciarJuego)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btIniciarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIniciarJuegoActionPerformed

        int x = 0;
        int y = 0;
        int turno = 1;

        if (this.cmb3x3.isSelected()) {
            x = y = 3;
        }

        if (this.cmb4x4.isSelected()) {
            x = y = 4;
        }
        if (this.cmb5x5.isSelected()) {
            x = y = 5;
        }

        if (this.radiobx.isSelected()) {
            turno = 1;
        }
        if (this.radiobo.isSelected()) {
            turno = 0;
        }

        if (cbColorX.getSelectedItem().equals("") || cbColorO.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un color para cada jugador");
            return;
        }
        this.j.iniciarPartida(this.txtNombreJugadorX.getText(), this.cbColorX.getSelectedItem().toString(), 'X', this.txtNombreJugadorO.getText(), this.cbColorO.getSelectedItem().toString(), 'O', x, y, turno);

        if (this.cmb3x3.isSelected()) {
            new Tablero3x3(j).setVisible(true);
            this.setVisible(false);
        }else if(this.cmb4x4.isSelected()) {
            new Tablero4x4(j).setVisible(true);
            this.setVisible(false);
        }else if(this.cmb5x5.isSelected()) {
            new Tablero5x5(j).setVisible(true);
            this.setVisible(false);
        }

    }//GEN-LAST:event_btIniciarJuegoActionPerformed

    private void cbColorXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbColorXActionPerformed

        if (cbColorX.getSelectedItem().equals("Rojo")) {
            cbColorO.setSelectedItem("Azul");
        } else if (cbColorX.getSelectedItem().equals("Azul")) {
            cbColorO.setSelectedItem("Rojo");
        }
    }//GEN-LAST:event_cbColorXActionPerformed

    private void cmb3x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb3x3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb3x3ActionPerformed

    private void cmb4x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb4x4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb4x4ActionPerformed

    private void cmb5x5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb5x5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb5x5ActionPerformed

    private void radiobxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_radiobxStateChanged

    }//GEN-LAST:event_radiobxStateChanged

    private void cbColorOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbColorOActionPerformed

        if (cbColorO.getSelectedItem().equals("Rojo")) {
            cbColorX.setSelectedItem("Azul");
        } else if (cbColorO.getSelectedItem().equals("Azul")) {
            cbColorX.setSelectedItem("Rojo");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_cbColorOActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btIniciarJuego;
    private javax.swing.ButtonGroup butgroupInicia;
    private javax.swing.ButtonGroup butgroupmodojuego;
    private javax.swing.JComboBox<String> cbColorO;
    private javax.swing.JComboBox<String> cbColorX;
    private javax.swing.JRadioButton cmb3x3;
    private javax.swing.JRadioButton cmb4x4;
    private javax.swing.JRadioButton cmb5x5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton radiobo;
    private javax.swing.JRadioButton radiobx;
    private javax.swing.JTextField txtNombreJugadorO;
    private javax.swing.JTextField txtNombreJugadorX;
    // End of variables declaration//GEN-END:variables
}
