/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelo.Conectar;
import modelo.Parqueadero;
import modelo.Usuario;

/**
 *
 * @author Myrian Chica
 */
public class Formulario_RegistroParqueadero extends javax.swing.JFrame {

    public JTextField getTf_p_direccion() {
        return tf_p_direccion;
    }

    public void setTf_p_direccion(JTextField tf_p_direccion) {
        this.tf_p_direccion = tf_p_direccion;
    }

    public JTextField getTf_p_email() {
        return tf_p_email;
    }

    public void setTf_p_email(JTextField tf_p_email) {
        this.tf_p_email = tf_p_email;
    }

    public JTextField getTf_p_nombre() {
        return tf_p_nombre;
    }

    public void setTf_p_nombre(JTextField tf_p_nombre) {
        this.tf_p_nombre = tf_p_nombre;
    }

    public JTextField getTf_p_telefono() {
        return tf_p_telefono;
    }

    public void setTf_p_telefono(JTextField tf_p_telefono) {
        this.tf_p_telefono = tf_p_telefono;
    }

    /**
     * Creates new form ingreso_datos_parquedero
     */
    public Formulario_RegistroParqueadero() {
        initComponents();

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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_p_nombre = new javax.swing.JTextField();
        tf_p_direccion = new javax.swing.JTextField();
        tf_p_telefono = new javax.swing.JTextField();
        tf_p_email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btn_p_guardar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NOMBRE:");

        jLabel2.setText("DIRECCION:");

        jLabel3.setText("TELEFONO: ");

        jLabel4.setText("EMAIL :");

        tf_p_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_p_nombreActionPerformed(evt);
            }
        });

        tf_p_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_p_direccionActionPerformed(evt);
            }
        });

        tf_p_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_p_telefonoActionPerformed(evt);
            }
        });

        jLabel5.setText("DATOS PARQUEADERO");

        btn_p_guardar.setText("GUARDAR");
        btn_p_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_p_guardarActionPerformed(evt);
            }
        });

        jButton1.setText("LIMPIAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1))
                                .addGap(69, 69, 69)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_p_nombre)
                                    .addComponent(tf_p_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_p_telefono)
                                    .addComponent(tf_p_email, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(btn_p_guardar)
                                .addGap(47, 47, 47)
                                .addComponent(jButton1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel5)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel2)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel4))
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(tf_p_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(tf_p_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(tf_p_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tf_p_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_p_guardar)
                    .addComponent(jButton1))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_p_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_p_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_p_nombreActionPerformed

    private void tf_p_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_p_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_p_direccionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tf_p_telefono.setText("");
        tf_p_email.setText("");
        tf_p_nombre.setText("");
        tf_p_direccion.setText("");

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

//    public void ConexionBD() {
//        Conectar con = new Conectar();
//        Connection reg = con.conexion();
//        String nombre, email, telefono, direccion;
//        String sql, sql_parking_id;
//
//        nombre = tf_p_nombre.getText();
//        email = tf_p_email.getText();
//        telefono = tf_p_telefono.getText();
//        direccion = tf_p_direccion.getText();
//        sql = "INSERT INTO `parquedero`( `nombre`, `direccion`, `telefono`, `email`) VALUES (?,?,?,?)";
//
//        try {
//            PreparedStatement pst = reg.prepareStatement(sql);
//            pst.setString(1, nombre);
//            pst.setString(2, direccion);
//            pst.setString(3, telefono);
//            pst.setString(4, email);
//            int n = pst.executeUpdate();
//            if (n > 0) {
//                JOptionPane.showMessageDialog(null, "Registrado con exito BITCH");
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(ingreso_datos_parquedero.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    private void btn_p_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_p_guardarActionPerformed
        // TODO add your handling code here:

        
        Parqueadero parqueadero=new Parqueadero(tf_p_nombre.getText(), tf_p_direccion.getText(), Integer.parseInt(tf_p_telefono.getText()), tf_p_email.getText(), null, null, null, null);
        parqueadero.registrarParqueadero();
        int idparqueadero = parqueadero.GetIdParquedero();
//        System.out.println("el id del parking> "+idparqueadero); 
        Formulario_RegistroUsuarios formularioRegistroUsuarios = new Formulario_RegistroUsuarios();
        formularioRegistroUsuarios.recibirId(idparqueadero);
        formularioRegistroUsuarios.setVisible(true);
        setVisible(false);
        
//            sql_parking_id="SELECT * FROM Parquedero";
//            PreparedStatement pst2= reg.prepareStatement(sql_parking_id);
//            Statement stmt= reg.createStatement();
//            ResultSet resultado=stmt.executeQuery(sql_parking_id);
//            
//            while(resultado.next()){
//                String id =resultado.getString("idParquedero");
//                
//                //System.out.println(id);
//            }

            //System.out.println(""+resultado);
        // ResultSet resultado= pst_p_id.executeQuery(sql_parking_id);
            //System.out.println(resultado);
           // System.out.println(tf_p_nombre.getText());
        //Formulario f=new Formulario();
        //f.setVisible(true);

    }//GEN-LAST:event_btn_p_guardarActionPerformed

    private void tf_p_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_p_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_p_telefonoActionPerformed

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
            java.util.logging.Logger.getLogger(Formulario_RegistroParqueadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario_RegistroParqueadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario_RegistroParqueadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario_RegistroParqueadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario_RegistroParqueadero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_p_guardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField tf_p_direccion;
    private javax.swing.JTextField tf_p_email;
    private javax.swing.JTextField tf_p_nombre;
    private javax.swing.JTextField tf_p_telefono;
    // End of variables declaration//GEN-END:variables
}