/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administracion;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import static java.lang.Class.forName;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Jaime Andres
 */
public class Control extends javax.swing.JFrame {

    /**
     * Creates new form Control
     */
    public Control() {
        initComponents();
        setLocationRelativeTo(null);
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
        btnautomoviles = new javax.swing.JButton();
        btnclientes = new javax.swing.JButton();
        btnproveedores = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ADMINISTRADOR");

        btnautomoviles.setText("Automoviles");
        btnautomoviles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnautomovilesActionPerformed(evt);
            }
        });

        btnclientes.setText("Clientes");
        btnclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclientesActionPerformed(evt);
            }
        });

        btnproveedores.setText("Proveedores");
        btnproveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnproveedoresActionPerformed(evt);
            }
        });

        btnsalir.setText("SALIR");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnproveedores)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnclientes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnautomoviles, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(170, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnsalir))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(btnautomoviles)
                .addGap(66, 66, 66)
                .addComponent(btnclientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(btnproveedores)
                .addGap(33, 33, 33)
                .addComponent(btnsalir))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnautomovilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnautomovilesActionPerformed
Automoviles A1= new Automoviles();
A1.setVisible(true);
A1.setLocationRelativeTo(null);
dispose();

// TODO add your handling code here:
    }//GEN-LAST:event_btnautomovilesActionPerformed

    private void btnclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclientesActionPerformed
Clientes C1 = new Clientes();
C1.setVisible(true);
C1.setLocationRelativeTo(null);
dispose();// TODO add your handling code here:
    }//GEN-LAST:event_btnclientesActionPerformed

    private void btnproveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnproveedoresActionPerformed
Proveedores P1= new Proveedores();
P1.setVisible(true);
P1.setLocationRelativeTo(null);
dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_btnproveedoresActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_btnsalirActionPerformed

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
            java.util.logging.Logger.getLogger(Control.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Control.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Control.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Control.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Control().setVisible(true);
            }
        });
        try{
         Class.forName("com.mysql.jdbc.Driver");
          
         Connection connect= (Connection) DriverManager.getConnection("jdbc:mysql://localhost/agenciaautos?"+"user=root&password=");
         String crearautos= "CREATE TABLE if not exists autos (id INT PRIMARY KEY, marca VARCHAR(20),linea VARCHAR(20),modelo VARCHAR(20),color VARCHAR(20), serie VARCHAR(20) );";
         String crearclientes= "CREATE TABLE if not exists clientes (id INT PRIMARY KEY, nombre VARCHAR(20),direccion VARCHAR(20),telefono VARCHAR(20),sexo VARCHAR(20))";
         String crearproveedores= "CREATE TABLE if not exists proveedores (id INT PRIMARY KEY, nombre VARCHAR(20),direccion VARCHAR(20),telefono VARCHAR(20),empresa VARCHAR(20));";
         PreparedStatement ps2; 
         ps2= (PreparedStatement) connect.prepareStatement(crearautos);
         ps2.execute();
         ps2= (PreparedStatement) connect.prepareStatement(crearclientes);
         ps2.execute();
         ps2= (PreparedStatement) connect.prepareStatement(crearproveedores);
         ps2.execute();
         
         
    }catch(ClassNotFoundException ex){
         Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
     }
     catch(SQLException ex){
         Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
     }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnautomoviles;
    private javax.swing.JButton btnclientes;
    private javax.swing.JButton btnproveedores;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}