package vistas;

import java.text.SimpleDateFormat;

import java.sql.*;
import modelo.Ticket;
import modelo.Usuario;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author
 */
public class Formulario_RegistroTicket extends javax.swing.JFrame {

    String nom;
    Usuario empleado;
    Date fecha_Entrada;
    Date fecha_Salida;
    int id_parqueadero;

    public void RecibirNombre(String nom) {
        nombre_parquedero.setText(nombre_parquedero.getText() + nom);
    }

    /**
     * Creates new form Formulario
     */
    public Formulario_RegistroTicket() {
        initComponents();
        Jlabel_Placa.setVisible(false);
        Jlabel_fecha.setVisible(false);
        tf_fecha.setVisible(false);
        tf_placa.setVisible(false);
        tf_hora.setVisible(false);
        Jlabel_Hora.setVisible(false);
    }

    public void recibirEmpleado(Usuario empleado) {
        this.empleado = empleado;
        this.id_parqueadero = this.empleado.getIdParqueadero();
    }
    
     public void recibirId(int id) {
        this.id_parqueadero = id;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        nombre_parquedero = new javax.swing.JLabel();
        Jlabel_fecha = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Jlabel_Hora = new javax.swing.JLabel();
        tf_fecha = new javax.swing.JTextField();
        tf_hora = new javax.swing.JTextField();
        tf_placa = new javax.swing.JTextField();
        Jlabel_Placa = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nombre_parquedero.setText("PARQUEADERO: ");

        Jlabel_fecha.setText("FECHA :");

        jButton1.setText("ENTRADA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("SALIDA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Jlabel_Hora.setText("HORA :");

        tf_hora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_horaActionPerformed(evt);
            }
        });

        Jlabel_Placa.setText("PLACA : ");

        jButton3.setText("Cerrar Sesion");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre_parquedero, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Jlabel_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Jlabel_Placa))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_placa, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tf_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Jlabel_Hora)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tf_hora, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addContainerGap(215, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(nombre_parquedero)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jlabel_Placa))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jlabel_fecha)
                    .addComponent(tf_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jlabel_Hora)
                    .addComponent(tf_hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(75, 75, 75))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_horaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_horaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_horaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        Jlabel_Placa.setVisible(true);
        Jlabel_fecha.setVisible(true);
        tf_fecha.setVisible(true);
        tf_placa.setVisible(true);
        tf_hora.setVisible(true);
        Jlabel_Hora.setVisible(true);
        
        java.util.Date fecha_entrada =new java.util.Date();
        
        
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MMM-YYYY");
        SimpleDateFormat formatoHora = new SimpleDateFormat("h:mm a");
        tf_fecha.setText(formatoFecha.format(fecha_entrada));
        tf_hora.setText(formatoHora.format(fecha_entrada));
        fecha_Entrada =new Date(fecha_entrada.getTime());
        
        Ticket ticket=new Ticket(fecha_Entrada, null, tf_placa.getText(), 0, empleado.getId(), 0,this.id_parqueadero);
        ticket.crear(ticket);
        
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        java.util.Date fecha_salida =new java.util.Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MMM-YYYY");
        SimpleDateFormat formatoHora = new SimpleDateFormat("h:mm a");
        fecha_Salida= new Date(fecha_salida.getTime());
        
        long dife = fecha_Salida.getTime() - fecha_Entrada.getTime();
        tf_hora.setText(formatoHora.format(fecha_Salida));
        long horas = dife / (1000 * 60);
        System.out.println(horas);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        empleado.CerrarSesion(empleado.getEmail());
        Formulario_Login formLogin = new Formulario_Login();
        formLogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Formulario_RegistroTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario_RegistroTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario_RegistroTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario_RegistroTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new Formulario_RegistroTicket().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jlabel_Hora;
    private javax.swing.JLabel Jlabel_Placa;
    private javax.swing.JLabel Jlabel_fecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JFileChooser jFileChooser1;
    private static javax.swing.JLabel nombre_parquedero;
    private javax.swing.JTextField tf_fecha;
    private javax.swing.JTextField tf_hora;
    private javax.swing.JTextField tf_placa;
    // End of variables declaration//GEN-END:variables
}
