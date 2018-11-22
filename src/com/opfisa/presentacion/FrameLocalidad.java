/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opfisa.presentacion;

import com.opfisa.datos.Localidad;
import com.opfisa.datos.ManagerLocalidad;
import com.opfisa.datos.ManagerTipoDocumento;
import com.opfisa.datos.TipoDocumento;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
//public class FrameLocalidad extends javax.swing.JFrame {
public class FrameLocalidad extends javax.swing.JInternalFrame {
    /**
     * Creates new form FrameLocalidad
     */
    
    private String accion = "guardar";
    
    public FrameLocalidad() {
        initComponents();
        mostrar("");
        inhabilitar();
    }
    
    /**
     * Oculta columna para que no se muestre.
     */
    void ocultarColumnas() {
        //Se comenta porque por el momento no se van a ocultar las columas, sino
        //que se van a mostrar todas las columnas
        
        /*tablaListadoPersonas.getColumnModel().getColumn(3).setMaxWidth(0);      //calle
        tablaListadoPersonas.getColumnModel().getColumn(3).setMinWidth(0);
        tablaListadoPersonas.getColumnModel().getColumn(3).setPreferredWidth(0);

        tablaListadoPersonas.getColumnModel().getColumn(4).setMaxWidth(0);      //ubicacion
        tablaListadoPersonas.getColumnModel().getColumn(4).setMinWidth(0);
        tablaListadoPersonas.getColumnModel().getColumn(4).setPreferredWidth(0);

        tablaListadoPersonas.getColumnModel().getColumn(5).setMaxWidth(0);      //cloca
        tablaListadoPersonas.getColumnModel().getColumn(5).setMinWidth(0);
        tablaListadoPersonas.getColumnModel().getColumn(5).setPreferredWidth(0);

        tablaListadoPersonas.getColumnModel().getColumn(6).setMaxWidth(0);      //telefono
        tablaListadoPersonas.getColumnModel().getColumn(6).setMinWidth(0);
        tablaListadoPersonas.getColumnModel().getColumn(6).setPreferredWidth(0);
        */

    }
    
    /**
     * Inhabilita los campos y botones.
     */
    void inhabilitar() {
        campoCodigoLocalidad.setEnabled(false);
        campoDescripcionLocalidad.setEnabled(false);
        campoCodigoPostal.setEnabled(false);
        comboDepartamento.setEnabled(false);
        comboProvincia.setEnabled(false);
        
        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnEliminar.setEnabled(false);

    }
    
    /**
     * Habilita los campos y botones.
     */
    void habilitar() {
        if (accion == "editar"){
            campoCodigoLocalidad.setEnabled(false);
        }else{
            campoCodigoLocalidad.setEnabled(true); 
        }
        
        campoDescripcionLocalidad.setEnabled(true);
        campoCodigoPostal.setEnabled(true);
        comboDepartamento.setEnabled(true);
        comboProvincia.setEnabled(true);

        btnNuevo.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnEliminar.setEnabled(true);
    }
    
    /**
     * Limpia el formulario para cuando necesitemos ingresar un Tipo Documento.
     */
    public void limpiarFormulario(){
        campoCodigoLocalidad.setText("");
        campoDescripcionLocalidad.setText("");
        campoCodigoPostal.setText("");
        comboDepartamento.setEnabled(true);
        comboProvincia.setEnabled(true);
    }
    
    /**
     * Invoca al manager de Localidad para activar el método de busqueda y generar la tabla.
     * 
     * @param buscar 
     */
    void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            ManagerLocalidad mLocalidad = new ManagerLocalidad();
            modelo = mLocalidad.mostrar(buscar);

            tablaListadoLocalidades.setModel(modelo);
            this.ocultarColumnas();
            lblRegistrosTotales.setText("Total Registros " + Integer.toString(mLocalidad.totalRegistros));

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
            e.printStackTrace();
        }

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
        jLabel2 = new javax.swing.JLabel();
        campoCodigoLocalidad = new javax.swing.JTextField();
        comboDepartamento = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        campoDescripcionLocalidad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        comboProvincia = new javax.swing.JComboBox<>();
        campoCodigoPostal = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaListadoLocalidades = new javax.swing.JTable();
        jLabel25 = new javax.swing.JLabel();
        campoBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblRegistrosTotales = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Administración de Localidades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel2.setText("Código:");

        comboDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MENDOZA", "GODOY CRUZ", "LUJAN", "MAIPU", "LAS HERAS", "JUNIN" }));
        comboDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDepartamentoActionPerformed(evt);
            }
        });

        jLabel4.setText("Descripción");

        jLabel5.setText("Código Postal:");

        comboProvincia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MENDOZA" }));
        comboProvincia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboProvinciaItemStateChanged(evt);
            }
        });

        campoCodigoPostal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCodigoPostalActionPerformed(evt);
            }
        });

        jLabel14.setText("Provincia:");

        jLabel17.setText("Departamento:");

        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/opfisa/files/nuevo.GIF"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/opfisa/files/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/opfisa/files/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel14)
                                                    .addComponent(jLabel17))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(12, 12, 12)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campoDescripcionLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboProvincia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(campoCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoCodigoLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboDepartamento, 0, 375, Short.MAX_VALUE))))))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoCodigoLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoDescripcionLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(comboDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(comboProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listado de Localidades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        tablaListadoLocalidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaListadoLocalidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaListadoLocalidadesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaListadoLocalidades);

        jLabel25.setText("Buscar:");

        campoBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoBuscarKeyReleased(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/opfisa/files/buscar.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/opfisa/files/eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/opfisa/files/salir.gif"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblRegistrosTotales.setText("Registros:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblRegistrosTotales, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel25)
                        .addComponent(campoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblRegistrosTotales)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDepartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboDepartamentoActionPerformed

    private void comboProvinciaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboProvinciaItemStateChanged
        // TODO add your handling code here:
        System.out.println("Ítem seleccionado: " + comboProvincia.getSelectedItem());
    }//GEN-LAST:event_comboProvinciaItemStateChanged

    private void campoCodigoPostalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCodigoPostalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCodigoPostalActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        limpiarFormulario();
        habilitar();
        btnGuardar.setText("Guardar");
        this.accion = "guardar";
        campoCodigoLocalidad.requestFocus();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        if (campoCodigoLocalidad.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un Código.");
            campoCodigoLocalidad.requestFocus();
            return;
        }

        if (campoDescripcionLocalidad.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar una descripción para la Localidad");
            campoDescripcionLocalidad.requestFocus();
            return;
        }

        if (campoCodigoPostal.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un Código Postal");
            campoCodigoPostal.requestFocus();
            return;
        }

        
        Localidad localidad = new Localidad();
        ManagerLocalidad mLocalidad = new ManagerLocalidad();

        localidad.setCodigoLocalidad(campoCodigoLocalidad.getText());
        
        localidad.setDescripcionLocalidad(campoDescripcionLocalidad.getText());
        
        localidad.setCodigoPostal(Integer.parseInt(campoCodigoPostal.getText()));
        
        localidad.setDepartamento(comboDepartamento.getSelectedItem().toString());
        
        localidad.setProvincia(comboProvincia.getSelectedItem().toString());
        

        if (accion.equals("guardar")) {
            if (mLocalidad.insertar(localidad)) {
                JOptionPane.showMessageDialog(rootPane, "Localidad registrada Exitosamente");
                mostrar("");
                inhabilitar();
            }
        } else if (accion.equals("editar")) {
            if (mLocalidad.editar(localidad)) {
                //limpiarTabla();
                JOptionPane.showMessageDialog(rootPane, "Localidad editada Exitosamente");
                mostrar("");
                inhabilitar();
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        limpiarFormulario();
        inhabilitar();
        btnNuevo.setEnabled(true);
        mostrar("");
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tablaListadoLocalidadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaListadoLocalidadesMouseClicked
        // TODO add your handling code here:
        accion = "editar";
        btnGuardar.setText("Editar");
        habilitar();
        btnEliminar.setEnabled(true);
        

        ManagerLocalidad mLocalidad = new ManagerLocalidad();

        int fila = tablaListadoLocalidades.rowAtPoint(evt.getPoint());

        if (tablaListadoLocalidades.getValueAt(fila, 0).toString() != null) {            
            campoCodigoLocalidad.setText(tablaListadoLocalidades.getValueAt(fila, 0).toString());
        }

        if (tablaListadoLocalidades.getValueAt(fila, 1).toString() != null) {
            campoDescripcionLocalidad.setText(tablaListadoLocalidades.getValueAt(fila, 1).toString());
        }

        if (tablaListadoLocalidades.getValueAt(fila, 2).toString() != null) {
            String codigoPostal = tablaListadoLocalidades.getValueAt(fila, 2).toString();
            Double codigoPostalAux = Double.valueOf(codigoPostal);
            Integer codigoPostalAux2 = codigoPostalAux.intValue();

            campoCodigoPostal.setText(codigoPostalAux2.toString());
        }

        if (tablaListadoLocalidades.getValueAt(fila, 3) != null) {
            comboDepartamento.setSelectedItem(tablaListadoLocalidades.getValueAt(fila, 3));
        }

        if (tablaListadoLocalidades.getValueAt(fila, 4) != null) {
            comboProvincia.setSelectedItem(tablaListadoLocalidades.getValueAt(fila, 4));
        }
    }//GEN-LAST:event_tablaListadoLocalidadesMouseClicked

    private void campoBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoBuscarKeyReleased
        // TODO add your handling code here:
        String cadenaBuscar = campoBuscar.getText();
        mostrar(cadenaBuscar);
    }//GEN-LAST:event_campoBuscarKeyReleased

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        mostrar(campoBuscar.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        if (!campoCodigoLocalidad.equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "¿Está seguro de eliminar la localidad " + campoDescripcionLocalidad.getText() +"?", "Confirmar", 2);

            if (confirmacion == 0) {
                Localidad localidad = new Localidad();
                ManagerLocalidad mLocalidad = new ManagerLocalidad();

                localidad.setCodigoLocalidad(campoCodigoLocalidad.getText());

                if (mLocalidad.eliminar(localidad)) {
                    JOptionPane.showMessageDialog(rootPane, "Localidad eliminada exitosamente");
                    mostrar("");
                    inhabilitar();
                }
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(FrameLocalidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameLocalidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameLocalidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameLocalidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameLocalidad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JTextField campoBuscar;
    private javax.swing.JTextField campoCodigoLocalidad;
    private javax.swing.JTextField campoCodigoPostal;
    private javax.swing.JTextField campoDescripcionLocalidad;
    private javax.swing.JComboBox<String> comboDepartamento;
    private javax.swing.JComboBox<String> comboProvincia;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRegistrosTotales;
    private javax.swing.JTable tablaListadoLocalidades;
    // End of variables declaration//GEN-END:variables
}
