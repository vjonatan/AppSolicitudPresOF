/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opfisa.presentacion;

import com.opfisa.datos.Banco;
import com.opfisa.datos.Localidad;
import com.opfisa.datos.ManagerBanco;
import com.opfisa.datos.ManagerLocalidad;
import com.opfisa.datos.ManagerPersona;
import com.opfisa.datos.ManagerTipoDocumento;
import com.opfisa.datos.Persona;
import com.opfisa.datos.TipoDocumento;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
//public class FramePersona extends javax.swing.JFrame {
public class FramePersona extends javax.swing.JInternalFrame {
    /**
     * Creates new form FramePersona
     */
    private String accion = "guardar";
    DefaultComboBoxModel<TipoDocumento> modeloTipoDocumentos;
    DefaultComboBoxModel<Localidad> modeloLocalidades;
    DefaultComboBoxModel<Localidad> modeloLocalidadesTrabajo;
    DefaultComboBoxModel<Banco> modeloBancos;

    public FramePersona() {
        modeloTipoDocumentos = new DefaultComboBoxModel<>();
        modeloLocalidades = new DefaultComboBoxModel<>();
        modeloLocalidadesTrabajo = new DefaultComboBoxModel<>();
        modeloBancos = new DefaultComboBoxModel<>();

        cargarModeloTipoDocumento();
        cargarModeloLocalidad();
        cargarModeloLocalidadTrabajo();
        cargarModeloBanco();

        initComponents();
        mostrar("");
        inhabilitar();

    }

    /**
     * Oculta columna para que no se muestre.
     */
    void ocultarColumnas() {
        tablaListadoPersonas.getColumnModel().getColumn(3).setMaxWidth(0);      //calle
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

        tablaListadoPersonas.getColumnModel().getColumn(7).setMaxWidth(0);      //nacido
        tablaListadoPersonas.getColumnModel().getColumn(7).setMinWidth(0);
        tablaListadoPersonas.getColumnModel().getColumn(7).setPreferredWidth(0);

        tablaListadoPersonas.getColumnModel().getColumn(8).setMaxWidth(0);      //sexo
        tablaListadoPersonas.getColumnModel().getColumn(8).setMinWidth(0);
        tablaListadoPersonas.getColumnModel().getColumn(8).setPreferredWidth(0);

        tablaListadoPersonas.getColumnModel().getColumn(9).setMaxWidth(0);      //ecivil
        tablaListadoPersonas.getColumnModel().getColumn(9).setMinWidth(0);
        tablaListadoPersonas.getColumnModel().getColumn(9).setPreferredWidth(0);

        tablaListadoPersonas.getColumnModel().getColumn(10).setMaxWidth(0);     //trabajo
        tablaListadoPersonas.getColumnModel().getColumn(10).setMinWidth(0);
        tablaListadoPersonas.getColumnModel().getColumn(10).setPreferredWidth(0);

        tablaListadoPersonas.getColumnModel().getColumn(11).setMaxWidth(0);     //tcalle
        tablaListadoPersonas.getColumnModel().getColumn(11).setMinWidth(0);
        tablaListadoPersonas.getColumnModel().getColumn(11).setPreferredWidth(0);

        tablaListadoPersonas.getColumnModel().getColumn(12).setMaxWidth(0);     //tubica
        tablaListadoPersonas.getColumnModel().getColumn(12).setMinWidth(0);
        tablaListadoPersonas.getColumnModel().getColumn(12).setPreferredWidth(0);

        tablaListadoPersonas.getColumnModel().getColumn(13).setMaxWidth(0);     //tcloca
        tablaListadoPersonas.getColumnModel().getColumn(13).setMinWidth(0);
        tablaListadoPersonas.getColumnModel().getColumn(13).setPreferredWidth(0);

        tablaListadoPersonas.getColumnModel().getColumn(14).setMaxWidth(0);     //ttelefo
        tablaListadoPersonas.getColumnModel().getColumn(14).setMinWidth(0);
        tablaListadoPersonas.getColumnModel().getColumn(14).setPreferredWidth(0);

        tablaListadoPersonas.getColumnModel().getColumn(15).setMaxWidth(0);     //tseccion
        tablaListadoPersonas.getColumnModel().getColumn(15).setMinWidth(0);
        tablaListadoPersonas.getColumnModel().getColumn(15).setPreferredWidth(0);

        tablaListadoPersonas.getColumnModel().getColumn(16).setMaxWidth(0);     //sueldo
        tablaListadoPersonas.getColumnModel().getColumn(16).setMinWidth(0);
        tablaListadoPersonas.getColumnModel().getColumn(16).setPreferredWidth(0);

        tablaListadoPersonas.getColumnModel().getColumn(17).setMaxWidth(0);     //factual
        tablaListadoPersonas.getColumnModel().getColumn(17).setMinWidth(0);
        tablaListadoPersonas.getColumnModel().getColumn(17).setPreferredWidth(0);

        tablaListadoPersonas.getColumnModel().getColumn(18).setMaxWidth(0);     //fbaja
        tablaListadoPersonas.getColumnModel().getColumn(18).setMinWidth(0);
        tablaListadoPersonas.getColumnModel().getColumn(18).setPreferredWidth(0);
        
        tablaListadoPersonas.getColumnModel().getColumn(19).setMaxWidth(0);     //ctmovil
        tablaListadoPersonas.getColumnModel().getColumn(19).setMinWidth(0);
        tablaListadoPersonas.getColumnModel().getColumn(19).setPreferredWidth(0);

        tablaListadoPersonas.getColumnModel().getColumn(20).setMaxWidth(0);     //telmovil
        tablaListadoPersonas.getColumnModel().getColumn(20).setMinWidth(0);
        tablaListadoPersonas.getColumnModel().getColumn(20).setPreferredWidth(0);
        
        tablaListadoPersonas.getColumnModel().getColumn(21).setMaxWidth(0);     //ctref
        tablaListadoPersonas.getColumnModel().getColumn(21).setMinWidth(0);
        tablaListadoPersonas.getColumnModel().getColumn(21).setPreferredWidth(0);

        tablaListadoPersonas.getColumnModel().getColumn(22).setMaxWidth(0);     //telref
        tablaListadoPersonas.getColumnModel().getColumn(22).setMinWidth(0);
        tablaListadoPersonas.getColumnModel().getColumn(22).setPreferredWidth(0);

        tablaListadoPersonas.getColumnModel().getColumn(23).setMaxWidth(0);     //email
        tablaListadoPersonas.getColumnModel().getColumn(23).setMinWidth(0);
        tablaListadoPersonas.getColumnModel().getColumn(23).setPreferredWidth(0);

        tablaListadoPersonas.getColumnModel().getColumn(24).setMaxWidth(0);     //cctabanc
        tablaListadoPersonas.getColumnModel().getColumn(24).setMinWidth(0);
        tablaListadoPersonas.getColumnModel().getColumn(24).setPreferredWidth(0);

        tablaListadoPersonas.getColumnModel().getColumn(25).setMaxWidth(0);     //docucony
        tablaListadoPersonas.getColumnModel().getColumn(25).setMinWidth(0);
        tablaListadoPersonas.getColumnModel().getColumn(25).setPreferredWidth(0);

        tablaListadoPersonas.getColumnModel().getColumn(26).setMaxWidth(0);     //docugara
        tablaListadoPersonas.getColumnModel().getColumn(26).setMinWidth(0);
        tablaListadoPersonas.getColumnModel().getColumn(26).setPreferredWidth(0);

        tablaListadoPersonas.getColumnModel().getColumn(27).setMaxWidth(0);     //codbanc
        tablaListadoPersonas.getColumnModel().getColumn(27).setMinWidth(0);
        tablaListadoPersonas.getColumnModel().getColumn(27).setPreferredWidth(0);

        tablaListadoPersonas.getColumnModel().getColumn(28).setMaxWidth(0);     //cbu
        tablaListadoPersonas.getColumnModel().getColumn(28).setMinWidth(0);
        tablaListadoPersonas.getColumnModel().getColumn(28).setPreferredWidth(0);

    }

    /**
     * Inhabilita los campos y botones.
     */
    void inhabilitar() {
        campoDocumento.setEnabled(false);
        comboTipoDocumento.setEnabled(false);
        campoRazonSocial.setEnabled(false);
        campoCuit.setEnabled(false);
        comboSexo.setEnabled(false);
        dcFechaNacimiento.setEnabled(false);
        comboEstadoCivil.setEnabled(false);
        campoEmail.setEnabled(false);
        campoDomicilio.setEnabled(false);
        campoNroCalle.setEnabled(false);
        comboLocalidad.setEnabled(false);
        campoTelefono.setEnabled(false);
        campoTelCelular.setEnabled(false);
        campoTelReferencia.setEnabled(false);
        campoCtaBancaria.setEnabled(false);
        comboBanco.setEnabled(false);
        campoCbu.setEnabled(false);

        campoTrabajo.setEnabled(false);
        campoTrabajadorSector.setEnabled(false);
        campoSueldo.setEnabled(false);
        campoTrabajoDomicilio.setEnabled(false);
        campoTrabajoDomicilioNro.setEnabled(false);
        comboLocalidadTrabajo.setEnabled(false);
        campoTelTrabajo.setEnabled(false);

        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnEliminar.setEnabled(false);

    }

    /**
     * Habilita los campos y botones.
     */
    void habilitar() {
        System.out.println("accion = " + this.accion);
        if (accion == "editar"){
            campoDocumento.setEnabled(false);
        }else{
            campoDocumento.setEnabled(true); 
        }
        
        comboTipoDocumento.setEnabled(true);
        campoRazonSocial.setEnabled(true);
        comboSexo.setEnabled(true);
        dcFechaNacimiento.setEnabled(true);
        comboEstadoCivil.setEnabled(true);
        campoEmail.setEnabled(true);
        campoDomicilio.setEnabled(true);
        campoNroCalle.setEnabled(true);
        comboLocalidad.setEnabled(true);
        campoTelefono.setEnabled(true);
        campoTelCelular.setEnabled(true);
        campoTelReferencia.setEnabled(true);
        campoCtaBancaria.setEnabled(true);
        comboBanco.setEnabled(true);
        campoCbu.setEnabled(true);

        campoTrabajo.setEnabled(true);
        campoTrabajadorSector.setEnabled(true);
        campoSueldo.setEnabled(true);
        campoTrabajoDomicilio.setEnabled(true);
        campoTrabajoDomicilioNro.setEnabled(true);
        comboLocalidadTrabajo.setEnabled(true);
        campoTelTrabajo.setEnabled(true);

        campoTrabajo.setEnabled(true);
        campoTrabajadorSector.setEnabled(true);
        campoSueldo.setEnabled(true);
        campoTrabajoDomicilio.setEnabled(true);
        campoTrabajoDomicilioNro.setEnabled(true);
        comboLocalidadTrabajo.setEnabled(true);
        campoTelTrabajo.setEnabled(true);

        btnNuevo.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnEliminar.setEnabled(true);
    }
    
    /**
     * Limpia el formulario para cuando necesitemos ingresar una Nueva Persona.
     */
    public void limpiarFormulario(){
        campoDocumento.setText("");
        comboTipoDocumento.setEnabled(true);
        campoRazonSocial.setText("");
        comboSexo.setEnabled(true);
        dcFechaNacimiento.setCalendar(null);
        comboEstadoCivil.setEnabled(true);
        campoEmail.setText("");
        campoDomicilio.setText("");
        campoNroCalle.setText("");
        comboLocalidad.setEnabled(true);
        campoTelefono.setText("");
        campoTelCelular.setText("");
        campoTelReferencia.setText("");
        campoCtaBancaria.setText("");
        comboBanco.setEnabled(true);
        campoCbu.setText("");

        campoTrabajo.setText("");
        campoTrabajadorSector.setText("");
        campoSueldo.setText("");
        campoTrabajoDomicilio.setText("");
        campoTrabajoDomicilioNro.setText("");
        comboLocalidadTrabajo.setEnabled(true);
        campoTelTrabajo.setText("");
    }

    /**
     * Invoca al manager de Habitación para activar el método de busqueda y generar la tabla.
     * 
     * @param buscar 
     */
    void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            ManagerPersona mHabitacion = new ManagerPersona();
            modelo = mHabitacion.mostrar(buscar);

            tablaListadoPersonas.setModel(modelo);
            this.ocultarColumnas();
            lblRegistrosTotales.setText("Total Registros: " + Integer.toString(mHabitacion.totalRegistros));

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
            e.printStackTrace();
        }

    }
    
    /**
     * Invoca al manager de Habitación para activar el método de busquedaXdocumento y generar la tabla.
     * 
     * @param buscar 
     */
    void mostrarXdocumento(String buscar) {
        try {
            DefaultTableModel modelo;
            ManagerPersona mHabitacion = new ManagerPersona();
            modelo = mHabitacion.buscarXdocumento(buscar);

            tablaListadoPersonas.setModel(modelo);
            this.ocultarColumnas();
            lblRegistrosTotales.setText("Total Registros: " + Integer.toString(mHabitacion.totalRegistros));

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
            e.printStackTrace();
        }

    }

    public void cargarModeloTipoDocumento() {
        ArrayList<TipoDocumento> listaTipoDocumentos = new ArrayList<TipoDocumento>();

        ManagerTipoDocumento mTipoDocumento = new ManagerTipoDocumento();

        listaTipoDocumentos = mTipoDocumento.obtenerTipoDocumento();
        modeloTipoDocumentos.addElement(new TipoDocumento(0, "-- Seleccione Opcion --"));
        
        for (TipoDocumento tipoDocumento : listaTipoDocumentos) {
            modeloTipoDocumentos.addElement(tipoDocumento);
        }

    }

    public void cargarModeloLocalidad() {
        ArrayList<Localidad> listaLocalidades = new ArrayList<Localidad>();

        ManagerLocalidad mLocalidad = new ManagerLocalidad();

        listaLocalidades = mLocalidad.obtenerLocalidades();
        modeloLocalidades.addElement(new Localidad(null, "-- Seleccione Localidad --", 0, null, null));

        for (Localidad localidad : listaLocalidades) {
            modeloLocalidades.addElement(localidad);
        }

    }
    
    public void cargarModeloLocalidadTrabajo() {
        ArrayList<Localidad> listaLocalidades = new ArrayList<Localidad>();

        ManagerLocalidad mLocalidad = new ManagerLocalidad();

        listaLocalidades = mLocalidad.obtenerLocalidades();
        modeloLocalidadesTrabajo.addElement(new Localidad(null, "-- Selecciones Localidad --", 0, null, null));

        for (Localidad localidad : listaLocalidades) {
            modeloLocalidadesTrabajo.addElement(localidad);
        }

    }

    public void cargarModeloBanco() {
        System.out.println("Ejecuta >> cargaModeloBanco");
        ArrayList<Banco> listaBancos = new ArrayList<Banco>();

        ManagerBanco mBanco = new ManagerBanco();

        listaBancos = mBanco.obtenerBanco();
        modeloBancos.addElement(new Banco(null, "-- Seleccione Banco --"));

        for (Banco banco : listaBancos) {
            modeloBancos.addElement(banco);
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        campoDocumento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        comboTipoDocumento = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        campoRazonSocial = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboSexo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        comboEstadoCivil = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        campoTelefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        campoTelCelular = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        campoTelReferencia = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        campoTrabajo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        campoTrabajoDomicilio = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        campoDomicilio = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        campoNroCalle = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        comboLocalidad = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        campoCtaBancaria = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        campoCbu = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        comboBanco = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        campoTrabajoDomicilioNro = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        comboLocalidadTrabajo = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        campoTrabajadorSector = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        campoTelTrabajo = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        campoSueldo = new javax.swing.JTextField();
        dcFechaNacimiento = new com.toedter.calendar.JDateChooser();
        campoCuit = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        campoCaracteristicaTelefono = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        campoCaracteristicaCelular = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaListadoPersonas = new javax.swing.JTable();
        jLabel25 = new javax.swing.JLabel();
        campoBuscarXdocumento = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblRegistrosTotales = new javax.swing.JLabel();
        campoBuscarXnombre = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Persona");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro de Persona"));

        jLabel2.setText("Documento:");

        campoDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoDocumentoKeyTyped(evt);
            }
        });

        jLabel3.setText("Tipo Documento:");

        comboTipoDocumento.setModel(modeloTipoDocumentos);
        comboTipoDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoDocumentoActionPerformed(evt);
            }
        });

        jLabel4.setText("Raz. Social:");

        jLabel5.setText("F. Nacimiento:");

        jLabel6.setText("Sexo:");

        comboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione Sexo--", "M", "F" }));
        comboSexo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboSexoItemStateChanged(evt);
            }
        });

        jLabel7.setText("Estado Civil:");

        comboEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S", "C", "D" }));

        jLabel8.setText("Teléfono:");

        jLabel9.setText("Celular:");

        jLabel10.setText("Tel. Referencia:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Datos Laborales:");

        jLabel12.setText("Trabajo:");

        jLabel13.setText("Domicilio Lab.:");

        jLabel14.setText("Domicilio:");

        campoDomicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDomicilioActionPerformed(evt);
            }
        });

        jLabel15.setText("Número:");

        jLabel16.setText("Localidad");

        comboLocalidad.setModel(modeloLocalidades);

        jLabel17.setText("E-mail:");

        jLabel18.setText("Cta. Bancaria:");

        jLabel19.setText("CBU:");

        campoCbu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoCbuKeyTyped(evt);
            }
        });

        jLabel20.setText("Banco:");

        comboBanco.setModel(modeloBancos);

        jLabel21.setText("Número:");

        jLabel22.setText("Localidad:");

        comboLocalidadTrabajo.setModel(modeloLocalidadesTrabajo);

        jLabel23.setText("Sector Trabajo:");

        jLabel24.setText("Teléfono:");

        campoTelTrabajo.setAlignmentX(0.0F);
        campoTelTrabajo.setAlignmentY(0.0F);
        campoTelTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTelTrabajoActionPerformed(evt);
            }
        });

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

        jLabel26.setText("Sueldo:");

        campoSueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSueldoActionPerformed(evt);
            }
        });
        campoSueldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoSueldoKeyTyped(evt);
            }
        });

        campoCuit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoCuitKeyTyped(evt);
            }
        });

        jLabel27.setText("CUIT/CUIL:");

        campoCaracteristicaTelefono.setText(" ");

        jLabel28.setText("(");

        jLabel29.setText(")");

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("-");

        campoCaracteristicaCelular.setText(" ");

        jLabel31.setText("(");

        jLabel32.setText(")");

        jLabel33.setText("15 -");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel10)
                                .addComponent(jLabel16)
                                .addComponent(jLabel14)
                                .addComponent(jLabel17))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoTelReferencia)
                            .addComponent(comboLocalidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoEmail)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(campoCtaBancaria, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel20)
                                .addGap(18, 18, 18)
                                .addComponent(comboBanco, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(campoDomicilio, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campoRazonSocial)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel28)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoCaracteristicaTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(dcFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel24))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboLocalidadTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoTrabajoDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoTelTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(50, 50, 50)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel19)
                        .addGap(36, 36, 36)
                        .addComponent(campoCbu))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoCaracteristicaCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoTelCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(2, 37, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(comboTipoDocumento, 0, 140, Short.MAX_VALUE)
                                        .addComponent(campoNroCalle, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(campoCuit)
                                        .addComponent(comboSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(comboEstadoCivil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel26)
                                        .addGap(0, 0, 0)
                                        .addComponent(campoSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(campoTrabajoDomicilioNro, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(campoTrabajadorSector, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(campoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(campoRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoCuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(dcFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(comboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(comboEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(campoDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoNroCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)))
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(comboLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(campoTelCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCaracteristicaTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30)
                    .addComponent(campoCaracteristicaCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTelReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(campoCtaBancaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(campoCbu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(comboBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(campoTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTrabajoDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(campoTrabajadorSector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboLocalidadTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(campoTrabajoDomicilioNro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTelTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel26)
                    .addComponent(campoSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado de Personas"));

        tablaListadoPersonas.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaListadoPersonas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaListadoPersonas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaListadoPersonasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaListadoPersonas);

        jLabel25.setText("Buscar Por Documento:");

        campoBuscarXdocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoBuscarXdocumentoKeyReleased(evt);
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

        lblRegistrosTotales.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRegistrosTotales.setText("Registros:");

        campoBuscarXnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoBuscarXnombreActionPerformed(evt);
            }
        });
        campoBuscarXnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoBuscarXnombreKeyReleased(evt);
            }
        });

        jLabel34.setText("Buscar Por Razón Social:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(campoBuscarXdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(campoBuscarXnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblRegistrosTotales, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(campoBuscarXdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(campoBuscarXnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addGap(10, 10, 10)
                .addComponent(lblRegistrosTotales)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoDomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDomicilioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDomicilioActionPerformed

    private void campoTelTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTelTrabajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTelTrabajoActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        limpiarFormulario();
        habilitar();
        btnGuardar.setText("Guardar");
        this.accion = "guardar";
        campoDocumento.requestFocus();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        if (campoDocumento.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un Número de Documento");
            campoDocumento.requestFocus();
            return;
        }

        if (campoRazonSocial.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un Nombre");
            campoRazonSocial.requestFocus();
            return;
        }

        if (campoTrabajo.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un lugar de trabajo");
            campoTrabajo.requestFocus();
            return;
        }

        if (campoTrabajadorSector.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un sector de trabajo");
            campoTrabajadorSector.requestFocus();
            return;
        }

        Persona persona = new Persona();
        ManagerPersona mPersona = new ManagerPersona();

        persona.setDocumento(Integer.parseInt(campoDocumento.getText()));

        TipoDocumento tipoDocumento = (TipoDocumento) comboTipoDocumento.getSelectedItem();
        persona.setTipoDocumento(tipoDocumento.getCodTipoDocumento());

        persona.setRazon(campoRazonSocial.getText());
        
        persona.setSexo(comboSexo.getSelectedItem().toString());

        //persona.setFechaNacimiento(Date.valueOf(campoFechaNacimiento.getText()));
        persona.setEmail(campoEmail.getText());

        persona.setCalle(campoDomicilio.getText());

        persona.setUbica(campoNroCalle.getText());

        Localidad localidad = (Localidad) comboLocalidad.getSelectedItem();
        persona.setUbica(localidad.getCodigoLocalidad());
        
        persona.setTelefono(campoTelefono.getText());

        persona.setTelefonoMovil(campoTelCelular.getText());

        persona.setTelefonoReferencia(campoTelReferencia.getText());

        persona.setNroCtaBancaria(campoCtaBancaria.getText());

        Banco banco = (Banco) comboBanco.getSelectedItem();
        persona.setCodBanco(banco.getCodBanco());
        
        persona.setCbu(campoCbu.getText());

        persona.setLugarTrabajo(campoTrabajo.getText());

        persona.setSeccionTrabajo(campoTrabajadorSector.getText());

        persona.setCalleTrabajo(campoTrabajoDomicilio.getText());

        persona.setUbicacionNroTrabajo(campoTrabajoDomicilioNro.getText());

        Localidad localidadTrabajo = (Localidad) comboLocalidadTrabajo.getSelectedItem();
        persona.setCodLocalidadTrabajo(localidadTrabajo.getCodigoLocalidad());
        
        persona.setTelefonoTrabajo(campoTelTrabajo.getText());

        if (accion.equals("guardar")) {
            if (mPersona.insertar(persona)) {
                JOptionPane.showMessageDialog(rootPane, "La Persona fué Registrada Exitosamente");
                mostrar("");
                inhabilitar();
            }
        } else if (accion.equals("editar")) {
            if (mPersona.editar(persona)) {
                //limpiarTabla();
                JOptionPane.showMessageDialog(rootPane, "La Persona fué Editada Exitosamente");
                mostrar("");
                inhabilitar();
            }
        }
        
        this.limpiarFormulario();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:        
        limpiarFormulario();
        cargarModeloLocalidad();
        inhabilitar();
        accion = "guardar";
        btnNuevo.setEnabled(true);
        campoBuscarXdocumento.setText("");
        mostrar("");
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        mostrar(campoBuscarXdocumento.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        if (!campoDocumento.equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "¿Está seguro de eliminar a " + campoRazonSocial.getText() +"?", "Confirmar", 2);

            if (confirmacion == 0) {
                Persona persona = new Persona();
                ManagerPersona mPersona = new ManagerPersona();

                persona.setDocumento(Integer.parseInt(campoDocumento.getText()));

                if (mPersona.eliminar(persona)) {
                    JOptionPane.showMessageDialog(rootPane, "La Persona fué Eliminada exitosamente");
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
     * Permite setear el valor del combobox que tiene el registro de la tabla
     * Esto permite leer el registro y verificar el Tipo Documento
     * 
     * @param comboBox
     * @param value 
     */
    public void setSelectedValueTipoDocumento(JComboBox comboBox, String value)
    {
        TipoDocumento item;
        for (int i = 0; i < comboBox.getItemCount(); i++)
        {
            item = (TipoDocumento)comboBox.getItemAt(i);
            if (item.getDescripcionTipoDocumento().equalsIgnoreCase(value))
            {
                comboBox.setSelectedIndex(i);
                break;
            }
        }
    }
    
    /**
     * Permite setear el valor del combobox que tiene el registro de la tabla
     * Esto permite leer el registro y verificar Localidad
     * 
     * @param comboBox
     * @param value 
     */
    public void setSelectedValueLocalidad(JComboBox comboBox, String value)
    {
        Localidad item;
        for (int i = 0; i < comboBox.getItemCount(); i++)
        {
            item = (Localidad)comboBox.getItemAt(i);
            if (item.getDescripcionLocalidad().equalsIgnoreCase(value))
            {
                comboBox.setSelectedIndex(i);
                break;
            }
        }
    }
    
    /**
     * Permite setear el valor del combobox que tiene el registro de la tabla
     * Esto permite leer el registro y verificar Banco
     * 
     * @param comboBox
     * @param value 
     */
    public void setSelectedValueBanco(JComboBox comboBox, String value)
    {
        Banco item;
        System.out.println("cantidad de elementos del comboBanco >> " + comboBox.getItemCount());
        for (int i = 0; i < comboBox.getItemCount(); i++)
        {
            item = (Banco)comboBox.getItemAt(i);
            System.out.println("item.getCodBanco >> " + item.getCodBanco());
            System.out.println("item.getNombreBanco >> " + item.getNombreBanco());
            System.out.println("value >> " + value);
            if (item.getNombreBanco().equalsIgnoreCase(value))
            {
                comboBox.setSelectedIndex(i);
                break;
            }
        }
    }
    
    public Date ParseFecha(String fecha){
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaDate = null;
        
        try {
            fechaDate = (Date) formato.parse(fecha);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
            e.printStackTrace();
        }
        
        return fechaDate;
    }
    
    /**
     * Recupera los datos del registro seleccionado y los setea en en el formulario.
     * 
     * @param evt 
     */
    private void tablaListadoPersonasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaListadoPersonasMouseClicked
        // TODO add your handling code here:
        btnGuardar.setText("Editar");
        habilitar();
        btnEliminar.setEnabled(true);
        accion = "editar";
        
        ManagerTipoDocumento mTipoDocumento = new ManagerTipoDocumento();
        ManagerLocalidad mLocalidad = new ManagerLocalidad();
        ManagerBanco mBanco = new ManagerBanco();

        int fila = tablaListadoPersonas.rowAtPoint(evt.getPoint());

        if (tablaListadoPersonas.getValueAt(fila, 0).toString() != null) {
            String numeroDocumento = tablaListadoPersonas.getValueAt(fila, 0).toString();
            Double nroDocAux = Double.valueOf(numeroDocumento);
            Integer nroDocAux2 = nroDocAux.intValue();
            System.out.println("nroDocAux2 " + nroDocAux2);
            
            campoDocumento.setText(nroDocAux2.toString());
        }
        
        if (tablaListadoPersonas.getValueAt(fila, 1).toString() != null) {
            this.setSelectedValueTipoDocumento(comboTipoDocumento, mTipoDocumento.obtenerTipoDocumentoXCriterio(tablaListadoPersonas.getValueAt(fila, 1).toString()).getDescripcionTipoDocumento());            
        }

        if (tablaListadoPersonas.getValueAt(fila, 2).toString() != null) {
            campoRazonSocial.setText(tablaListadoPersonas.getValueAt(fila, 2).toString());
        }

        if (tablaListadoPersonas.getValueAt(fila, 3) != null) {
            campoDomicilio.setText(tablaListadoPersonas.getValueAt(fila, 3).toString());
        }

        if (tablaListadoPersonas.getValueAt(fila, 4) != null) {
            campoNroCalle.setText(tablaListadoPersonas.getValueAt(fila, 4).toString());
        }

        if (tablaListadoPersonas.getValueAt(fila, 5) != null) {
           this.setSelectedValueLocalidad(comboLocalidad, mLocalidad.obtenerLocalidadXCriterio(tablaListadoPersonas.getValueAt(fila, 5).toString()).getDescripcionLocalidad());
        }

        if (tablaListadoPersonas.getValueAt(fila, 6) != null) {
            campoTelefono.setText(tablaListadoPersonas.getValueAt(fila, 6).toString());
        }

        if (tablaListadoPersonas.getValueAt(fila, 7) != null) {
            //campoFechaNacimiento.setText(tablaListadoPersonas.getValueAt(fila, 7).toString());
            //dcFechaNacimiento.setDate(this.ParseFecha(tablaListadoPersonas.getValueAt(fila, 7).toString()));
            dcFechaNacimiento.setDate( Date.valueOf( tablaListadoPersonas.getValueAt(fila, 7).toString() ) );
        }

        if (tablaListadoPersonas.getValueAt(fila, 8) != null) {
            comboSexo.setSelectedItem(tablaListadoPersonas.getValueAt(fila, 8));
        }

        if (tablaListadoPersonas.getValueAt(fila, 9) != null) {
            comboEstadoCivil.setSelectedItem(tablaListadoPersonas.getValueAt(fila, 9));
        }

        if (tablaListadoPersonas.getValueAt(fila, 10) != null) {
            campoTrabajo.setText(tablaListadoPersonas.getValueAt(fila, 10).toString());
        }

        if (tablaListadoPersonas.getValueAt(fila, 11) != null) {
            campoTrabajoDomicilio.setText(tablaListadoPersonas.getValueAt(fila, 11).toString());
        }

        if (tablaListadoPersonas.getValueAt(fila, 12) != null) {
            campoTrabajoDomicilioNro.setText(tablaListadoPersonas.getValueAt(fila, 12).toString());
        }

        if (tablaListadoPersonas.getValueAt(fila, 13) != null) {
            //comboLocalidadTrabajo.setSelectedItem(tablaListadoPersonas.getValueAt(fila, 13));
            this.setSelectedValueLocalidad(comboLocalidadTrabajo, mLocalidad.obtenerLocalidadXCriterio(tablaListadoPersonas.getValueAt(fila, 13).toString()).getDescripcionLocalidad());
        }

        if (tablaListadoPersonas.getValueAt(fila, 14) != null) {
            campoTelTrabajo.setText(tablaListadoPersonas.getValueAt(fila, 14).toString());
        }

        if (tablaListadoPersonas.getValueAt(fila, 15) != null) {
            campoTrabajadorSector.setText(tablaListadoPersonas.getValueAt(fila, 15).toString());
        }

        if (tablaListadoPersonas.getValueAt(fila, 16) != null) {
            campoSueldo.setText(tablaListadoPersonas.getValueAt(fila, 16).toString());
        }

        //Nota: no se agrega campo fechaActualizacion ya que lo vamos a obtener fecha/hora del sistema
        //Nota: no se agrega campo fechaBaja ya que lo vamos a obtener fecha/hora del sistema
        if (tablaListadoPersonas.getValueAt(fila, 19) != null) {
            campoCaracteristicaCelular.setText(tablaListadoPersonas.getValueAt(fila, 19).toString());
        }
        
        if (tablaListadoPersonas.getValueAt(fila, 20) != null) {
            campoTelCelular.setText(tablaListadoPersonas.getValueAt(fila, 20).toString());
        }
        
        if (tablaListadoPersonas.getValueAt(fila, 21) != null) {
            campoCaracteristicaTelefono.setText(tablaListadoPersonas.getValueAt(fila, 21).toString());
        }

        if (tablaListadoPersonas.getValueAt(fila, 22) != null) {
            campoTelReferencia.setText(tablaListadoPersonas.getValueAt(fila, 22).toString());
        }

        if (tablaListadoPersonas.getValueAt(fila, 23) != null) {
            campoEmail.setText(tablaListadoPersonas.getValueAt(fila, 23).toString());
        }

        if (tablaListadoPersonas.getValueAt(fila, 24) != null) {
            campoCtaBancaria.setText(tablaListadoPersonas.getValueAt(fila, 24).toString());
        }

        //FALTA CAMPO DOCUMENTO GARANTE - VER LA MANERA DE AGREGAR EN TABLA PERSONA EL nombre/documento del GARANTE
        //FALTA CAMPO DOCUMENTO CONYUGUE - VER LA MANERA DE AGREGAR EN TABLA PERSONA EL nombre/documento del CONYUGUE
        
        if (tablaListadoPersonas.getValueAt(fila, 27) != null) {
            //comboBanco.setSelectedItem(tablaListadoPersonas.getValueAt(fila, 25));
            this.setSelectedValueBanco(comboBanco, mBanco.obtenerBancoXCriterio(tablaListadoPersonas.getValueAt(fila, 27).toString()).getNombreBanco());
        }

        if (tablaListadoPersonas.getValueAt(fila, 28) != null) {
            campoCbu.setText(tablaListadoPersonas.getValueAt(fila, 28).toString());
        }
    }//GEN-LAST:event_tablaListadoPersonasMouseClicked

    private void campoSueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSueldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSueldoActionPerformed

    private void comboTipoDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTipoDocumentoActionPerformed

    private void campoBuscarXdocumentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoBuscarXdocumentoKeyReleased
        // TODO add your handling code here:
        String cadenaBuscar = campoBuscarXdocumento.getText();
        mostrarXdocumento(cadenaBuscar);
    }//GEN-LAST:event_campoBuscarXdocumentoKeyReleased

    private void comboSexoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboSexoItemStateChanged
        // TODO add your handling code here:
        System.out.println("Ítem seleccionado: " + comboSexo.getSelectedItem());
    }//GEN-LAST:event_comboSexoItemStateChanged

    private void campoCuitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoCuitKeyTyped
        char car = evt.getKeyChar();
        if((car<'0' || car>'9'))
            evt.consume();
    }//GEN-LAST:event_campoCuitKeyTyped

    private void campoDocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoDocumentoKeyTyped
        char car = evt.getKeyChar();
        if((car<'0' || car>'9'))
            evt.consume();
    }//GEN-LAST:event_campoDocumentoKeyTyped

    private void campoCbuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoCbuKeyTyped
        char car = evt.getKeyChar();
        if((car<'0' || car>'9') && campoCbu.getText().length() <= 23)
            evt.consume();
    }//GEN-LAST:event_campoCbuKeyTyped

    private void campoSueldoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoSueldoKeyTyped
        char car = evt.getKeyChar();
        if((car<'0' || car>'9') & (car<'.') || car>'.')
            evt.consume();
    }//GEN-LAST:event_campoSueldoKeyTyped

    private void campoBuscarXnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoBuscarXnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoBuscarXnombreActionPerformed

    private void campoBuscarXnombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoBuscarXnombreKeyReleased
        // TODO add your handling code here:
        String cadenaBuscar = campoBuscarXnombre.getText();
        mostrar(cadenaBuscar);
    }//GEN-LAST:event_campoBuscarXnombreKeyReleased

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
            java.util.logging.Logger.getLogger(FramePersona.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePersona.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePersona.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePersona.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePersona().setVisible(true);
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
    private javax.swing.JTextField campoBuscarXdocumento;
    private javax.swing.JTextField campoBuscarXnombre;
    private javax.swing.JTextField campoCaracteristicaCelular;
    private javax.swing.JTextField campoCaracteristicaTelefono;
    private javax.swing.JTextField campoCbu;
    private javax.swing.JTextField campoCtaBancaria;
    private javax.swing.JTextField campoCuit;
    private javax.swing.JTextField campoDocumento;
    private javax.swing.JTextField campoDomicilio;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoNroCalle;
    private javax.swing.JTextField campoRazonSocial;
    private javax.swing.JTextField campoSueldo;
    private javax.swing.JTextField campoTelCelular;
    private javax.swing.JTextField campoTelReferencia;
    private javax.swing.JTextField campoTelTrabajo;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JTextField campoTrabajadorSector;
    private javax.swing.JTextField campoTrabajo;
    private javax.swing.JTextField campoTrabajoDomicilio;
    private javax.swing.JTextField campoTrabajoDomicilioNro;
    private javax.swing.JComboBox<Banco> comboBanco;
    private javax.swing.JComboBox<String> comboEstadoCivil;
    private javax.swing.JComboBox<Localidad> comboLocalidad;
    private javax.swing.JComboBox<Localidad> comboLocalidadTrabajo;
    private javax.swing.JComboBox<String> comboSexo;
    private javax.swing.JComboBox<TipoDocumento> comboTipoDocumento;
    private com.toedter.calendar.JDateChooser dcFechaNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRegistrosTotales;
    private javax.swing.JTable tablaListadoPersonas;
    // End of variables declaration//GEN-END:variables
}
