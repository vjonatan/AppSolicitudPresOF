/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opfisa.presentacion;

/**
 *
 * @author ACER
 */
public class FrameInicial extends javax.swing.JFrame {

    /**
     * Creates new form FrameInicial
     */
    public FrameInicial() {
        initComponents();
        this.setExtendedState(FrameInicial.MAXIMIZED_BOTH);
        this.setTitle("Sistema Solicitud de Préstamo OPFISA");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        editMenu = new javax.swing.JMenu();
        personaMenuItem = new javax.swing.JMenuItem();
        tipoDocumentoMenuItem = new javax.swing.JMenuItem();
        bancoMenuItem = new javax.swing.JMenuItem();
        localidadMenuItem = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        solicitudPrestamoMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/opfisa/files/Inicio.png"))); // NOI18N
        fileMenu.setMnemonic('f');
        fileMenu.setText("SistemaOPSFISA");
        menuBar.add(fileMenu);

        editMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/opfisa/files/Configuraciones.png"))); // NOI18N
        editMenu.setMnemonic('e');
        editMenu.setText("Configuraciones");

        personaMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/opfisa/files/clientes.png"))); // NOI18N
        personaMenuItem.setMnemonic('t');
        personaMenuItem.setText("Clientes");
        personaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personaMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(personaMenuItem);

        tipoDocumentoMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/opfisa/files/documents.png"))); // NOI18N
        tipoDocumentoMenuItem.setMnemonic('y');
        tipoDocumentoMenuItem.setText("Tipo Documento");
        tipoDocumentoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoDocumentoMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(tipoDocumentoMenuItem);

        bancoMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/opfisa/files/bank.png"))); // NOI18N
        bancoMenuItem.setMnemonic('p');
        bancoMenuItem.setText("Banco");
        bancoMenuItem.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bancoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bancoMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(bancoMenuItem);

        localidadMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/opfisa/files/place-store.png"))); // NOI18N
        localidadMenuItem.setMnemonic('d');
        localidadMenuItem.setText("Localidad");
        localidadMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localidadMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(localidadMenuItem);

        menuBar.add(editMenu);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/opfisa/files/habitaciones.png"))); // NOI18N
        jMenu1.setText("Préstamos");

        solicitudPrestamoMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/opfisa/files/Reservas.png"))); // NOI18N
        solicitudPrestamoMenuItem1.setText("Solicitud Préstamo");
        solicitudPrestamoMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solicitudPrestamoMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(solicitudPrestamoMenuItem1);

        menuBar.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/opfisa/files/Consultas.png"))); // NOI18N
        jMenu2.setText("Consultas");
        menuBar.add(jMenu2);

        menuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/opfisa/files/Salir.png"))); // NOI18N
        menuSalir.setMnemonic('h');
        menuSalir.setText("Salir");
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        menuBar.add(menuSalir);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 1327, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void solicitudPrestamoMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solicitudPrestamoMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_solicitudPrestamoMenuItem1ActionPerformed

    private void personaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personaMenuItemActionPerformed
        // TODO add your handling code here:
        FramePersona frmPersona = new FramePersona();
        escritorio.add(frmPersona);
        frmPersona.toFront();
        frmPersona.setVisible(true);
    }//GEN-LAST:event_personaMenuItemActionPerformed

    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_menuSalirActionPerformed

    private void tipoDocumentoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoDocumentoMenuItemActionPerformed
        // TODO add your handling code here:
        FrameTipoDocumento frmTipoPersona = new FrameTipoDocumento();
        escritorio.add(frmTipoPersona);
        frmTipoPersona.toFront();
        frmTipoPersona.setVisible(true);
    }//GEN-LAST:event_tipoDocumentoMenuItemActionPerformed

    private void bancoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bancoMenuItemActionPerformed
        // TODO add your handling code here:
        FrameBanco frmBanco = new FrameBanco();
        escritorio.add(frmBanco);
        frmBanco.toFront();
        frmBanco.setVisible(true);
    }//GEN-LAST:event_bancoMenuItemActionPerformed

    private void localidadMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localidadMenuItemActionPerformed
        // TODO add your handling code here:
        FrameLocalidad frmLocalidad = new FrameLocalidad();
        escritorio.add(frmLocalidad);
        frmLocalidad.toFront();
        frmLocalidad.setVisible(true);
    }//GEN-LAST:event_localidadMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(FrameInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem bancoMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem localidadMenuItem;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuSalir;
    private javax.swing.JMenuItem personaMenuItem;
    private javax.swing.JMenuItem solicitudPrestamoMenuItem1;
    private javax.swing.JMenuItem tipoDocumentoMenuItem;
    // End of variables declaration//GEN-END:variables

}
