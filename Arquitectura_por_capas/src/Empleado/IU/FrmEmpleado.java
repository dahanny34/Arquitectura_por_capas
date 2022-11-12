/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Empleado.IU;

import Empleado.BO.EmpleadoBO;
import Empleado.ENTITY.Empleado;
import javax.swing.JOptionPane;

/**
 *
 * @author wolve
 */
public class FrmEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form Empleado
     */
    private EmpleadoBO ebo = new EmpleadoBO();

    public FrmEmpleado() {
        initComponents();
        listarEmpleado();
        idMax();
        
        setTitle("FORMULARIO EMPLEADO");
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public void listarEmpleado() {
        ebo.listarEmpleado(TbEmpleado);
    }
    
    public void idMax(){
      txtIdEmpleado.setText(ebo.getMaxID( ) + "");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GroupEstadoCivil = new javax.swing.ButtonGroup();
        GroupGenero = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        txtnombres = new javax.swing.JTextField();
        txtapellidos = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtIdEmpleado = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        RbUnionLibre = new javax.swing.JRadioButton();
        RbSoltero = new javax.swing.JRadioButton();
        RbCasado = new javax.swing.JRadioButton();
        RbViudo = new javax.swing.JRadioButton();
        RbMasculino = new javax.swing.JRadioButton();
        RbFemenino = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbEmpleado = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(null);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jLabel1.setText("Formulario empleado");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        txtEdad.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });
        jPanel1.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 50, -1));

        txtnombres.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jPanel1.add(txtnombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 220, -1));

        txtapellidos.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jPanel1.add(txtapellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 220, -1));

        txtCedula.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        jPanel1.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 140, -1));

        jLabel2.setFont(new java.awt.Font("Cambria Math", 3, 16)); // NOI18N
        jLabel2.setText("Edad  ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 50, 40));

        jLabel3.setFont(new java.awt.Font("Cambria Math", 3, 16)); // NOI18N
        jLabel3.setText("Nombres ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 80, -1));

        jLabel4.setFont(new java.awt.Font("Cambria Math", 3, 16)); // NOI18N
        jLabel4.setText("Apellidos ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Cambria Math", 3, 16)); // NOI18N
        jLabel5.setText("Cedula ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Cambria Math", 3, 16)); // NOI18N
        jLabel6.setText("Estado Civil ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Cambria Math", 3, 16)); // NOI18N
        jLabel7.setText("Genero ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 60, 40));

        txtIdEmpleado.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jPanel1.add(txtIdEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 220, -1));

        jLabel8.setFont(new java.awt.Font("Cambria Math", 3, 16)); // NOI18N
        jLabel8.setText("ID:  ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 40, -1));

        GroupEstadoCivil.add(RbUnionLibre);
        RbUnionLibre.setFont(new java.awt.Font("Cambria Math", 3, 16)); // NOI18N
        RbUnionLibre.setText("Union Libre ");
        RbUnionLibre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbUnionLibreActionPerformed(evt);
            }
        });
        jPanel1.add(RbUnionLibre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));

        GroupEstadoCivil.add(RbSoltero);
        RbSoltero.setFont(new java.awt.Font("Cambria Math", 3, 16)); // NOI18N
        RbSoltero.setText("Soltero  ");
        RbSoltero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbSolteroActionPerformed(evt);
            }
        });
        jPanel1.add(RbSoltero, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, -1));

        GroupEstadoCivil.add(RbCasado);
        RbCasado.setFont(new java.awt.Font("Cambria Math", 3, 16)); // NOI18N
        RbCasado.setText("Casado  ");
        RbCasado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbCasadoActionPerformed(evt);
            }
        });
        jPanel1.add(RbCasado, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, -1, -1));

        GroupEstadoCivil.add(RbViudo);
        RbViudo.setFont(new java.awt.Font("Cambria Math", 3, 16)); // NOI18N
        RbViudo.setText("Viudo  ");
        RbViudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbViudoActionPerformed(evt);
            }
        });
        jPanel1.add(RbViudo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        GroupGenero.add(RbMasculino);
        RbMasculino.setFont(new java.awt.Font("Cambria Math", 3, 16)); // NOI18N
        RbMasculino.setText("Masculino ");
        RbMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbMasculinoActionPerformed(evt);
            }
        });
        jPanel1.add(RbMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 100, -1));

        GroupGenero.add(RbFemenino);
        RbFemenino.setFont(new java.awt.Font("Cambria Math", 3, 16)); // NOI18N
        RbFemenino.setText("Femenino ");
        RbFemenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbFemeninoActionPerformed(evt);
            }
        });
        jPanel1.add(RbFemenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 120, -1));

        TbEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TbEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TbEmpleadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TbEmpleado);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 500, 90));

        btnModificar.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 110, 40));

        btnEliminar.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 110, 40));

        btnSalir.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, 110, 40));

        btnAgregar.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 110, 40));

        btnLimpiar.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 110, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadActionPerformed

    private void RbUnionLibreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbUnionLibreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RbUnionLibreActionPerformed

    private void RbSolteroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbSolteroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RbSolteroActionPerformed

    private void RbCasadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbCasadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RbCasadoActionPerformed

    private void RbViudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbViudoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RbViudoActionPerformed

    private void RbMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbMasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RbMasculinoActionPerformed

    private void RbFemeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbFemeninoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RbFemeninoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (txtIdEmpleado.getText().isEmpty() || txtnombres.getText().isEmpty() || txtapellidos.getText().isEmpty()
                || txtCedula.getText().isEmpty() || txtEdad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Es obligatorio el llenar todos los campos");
        } else {
           
            char estado = 0;
            
            if (RbCasado.isSelected()){
                estado = 'C';
            }
            if (RbSoltero.isSelected()){
                estado = 'S';
            }
               if (RbUnionLibre.isSelected()){
                estado = 'U';
            }
                  if (RbViudo.isSelected()){
                estado = 'V';
            }
                  
            char genero;
            if (RbFemenino.isSelected()){
                
                genero= 'F';
                
            }else{
                
                genero= 'M';
            
            }
            
            Empleado emp = new Empleado();
            
            emp.setIdEmpleado(Integer.parseInt(txtIdEmpleado.getText()));

            emp.setNombres(txtnombres.getText());
            emp.setApellidos(txtapellidos.getText());
            emp.setCedula(txtCedula.getText());
            emp.setEstadoCivil(estado);
            emp.setGenero(genero);
            emp.setEdad(Integer.parseInt(txtEdad.getText()));
            
            String mensaje = ebo.agregarEmpleado(emp);
            JOptionPane.showMessageDialog(null, mensaje);
            Limpiar();
            listarEmpleado();
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
            if (txtIdEmpleado.getText().isEmpty() || txtnombres.getText().isEmpty() || txtapellidos.getText().isEmpty()
                || txtCedula.getText().isEmpty() || txtEdad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Es obligatorio el llenar todos los campos");
        } else {
           
            char estado = 0;
            
            if (RbCasado.isSelected()){
                estado = 'C';
            }
            if (RbSoltero.isSelected()){
                estado = 'S';
            }
               if (RbUnionLibre.isSelected()){
                estado = 'U';
            }
                  if (RbViudo.isSelected()){
                estado = 'V';
            }
                  
            char genero;
            if (RbFemenino.isSelected()){
                
                genero= 'F';
                
            }else{
                
                genero= 'M';
            
            }
            
            Empleado emp = new Empleado();
            
            emp.setIdEmpleado(Integer.parseInt(txtIdEmpleado.getText()));
            emp.setNombres(txtnombres.getText());
            emp.setApellidos(txtapellidos.getText());
            emp.setCedula(txtCedula.getText());
            emp.setEstadoCivil(estado);
            emp.setGenero(genero);
            emp.setEdad(Integer.parseInt(txtEdad.getText()));
            
            String mensaje = ebo.modificarEmpleado(emp);
            JOptionPane.showMessageDialog(null, mensaje);
            Limpiar();
            listarEmpleado();
        }
                    
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
  if (txtIdEmpleado.getText().isEmpty() || txtnombres.getText().isEmpty() || txtapellidos.getText().isEmpty()
                || txtCedula.getText().isEmpty() || txtEdad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Es obligatorio el llenar todos los campos");
        } else {
      
            String mensaje = ebo.eliminarEmpleado(Integer.parseInt(txtIdEmpleado.getText()));
            JOptionPane.showMessageDialog(null, mensaje);
            Limpiar();
            listarEmpleado();
        }        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void TbEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TbEmpleadoMouseClicked
        int seleccion = TbEmpleado.rowAtPoint(evt.getPoint());
        
         //limpieza de las cajas de texto  
        txtIdEmpleado.setText(TbEmpleado.getValueAt(seleccion, 0)+ "");
        txtnombres.setText(TbEmpleado.getValueAt(seleccion, 1)+ "");
        txtapellidos.setText(TbEmpleado.getValueAt(seleccion, 2)+ "");
        txtCedula.setText(TbEmpleado.getValueAt(seleccion, 3)+ "");
        String estado = TbEmpleado.getValueAt(seleccion, 4)+"";
        
        if (estado.equals("S")){
            RbSoltero.setSelected(true);
        }
        
         if (estado.equals("C")){
            RbCasado.setSelected(true);
        }
         
          if (estado.equals("U")){
            RbUnionLibre.setSelected(true);
        }
          
           if (estado.equals("V")){
            RbViudo.setSelected(true);
        }
           
           String genero= TbEmpleado.getValueAt(seleccion, 5)+"";
           
            if (genero.equals("F")){
            RbFemenino.setSelected(true);
        }else{
                RbMasculino.setSelected(true);
            }
        txtEdad.setText(TbEmpleado.getValueAt(seleccion, 6)+ "");

        
    }//GEN-LAST:event_TbEmpleadoMouseClicked

    public void Limpiar() {
        //limpieza de las cajas de texto  
        txtIdEmpleado.setText("");
        txtnombres.setText("");
        txtapellidos.setText("");
        txtCedula.setText("");
        txtEdad.setText("");

        //vacia los radiobuttons por grupos
        GroupEstadoCivil.clearSelection();
        GroupGenero.clearSelection();
        
         idMax();

    }

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GroupEstadoCivil;
    private javax.swing.ButtonGroup GroupGenero;
    private javax.swing.JRadioButton RbCasado;
    private javax.swing.JRadioButton RbFemenino;
    private javax.swing.JRadioButton RbMasculino;
    private javax.swing.JRadioButton RbSoltero;
    private javax.swing.JRadioButton RbUnionLibre;
    private javax.swing.JRadioButton RbViudo;
    private javax.swing.JTable TbEmpleado;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtIdEmpleado;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtnombres;
    // End of variables declaration//GEN-END:variables
}
