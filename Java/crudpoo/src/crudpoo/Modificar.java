/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudpoo;

import crudpoo.clases.Conexion;
import crudpoo.clases.Vehiculos;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author carlo
 */
public class Modificar extends javax.swing.JFrame {

    /**
     * Creates new form Modificar
     */
    public Modificar() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBusquedaPlaca = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        txtBusquedaPlaca = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombreCompleto = new javax.swing.JTextField();
        lblCampos = new javax.swing.JLabel();
        lblPlaca = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        lblNumeroRuedas = new javax.swing.JLabel();
        txtNumeroRuedas = new javax.swing.JTextField();
        lblColor = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtTipoVehiculo = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        lblId = new javax.swing.JLabel();
        Id = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblBusquedaPlaca.setText("Placa:");

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblTitulo.setText("BUSQUEDA DE INFORMACION");

        jLabel2.setText("Nombre Completo:");

        lblCampos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCampos.setText("CAMPOS PARA MODIFICAR LOS DATOS");

        lblPlaca.setText("Placa:");

        lblNumeroRuedas.setText("Número de Ruedas:");

        lblColor.setText("Color:");

        jLabel1.setText("Tipo Vehiculo:");

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        lblId.setText("Id:");

        Id.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(btnBuscar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtTipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblPlaca)
                                .addComponent(jLabel2)
                                .addComponent(lblNumeroRuedas)
                                .addComponent(lblColor)
                                .addComponent(lblId))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtNombreCompleto)
                                        .addComponent(txtPlaca)
                                        .addComponent(txtNumeroRuedas)
                                        .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(74, 74, 74)
                                    .addComponent(Id)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnModificar)
                        .addGap(65, 65, 65)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblCampos)
                        .addGap(119, 119, 119))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblBusquedaPlaca)
                        .addGap(18, 18, 18)
                        .addComponent(txtBusquedaPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(202, 202, 202))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addGap(34, 34, 34))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblTitulo)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBusquedaPlaca)
                    .addComponent(txtBusquedaPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnBuscar)
                .addGap(35, 35, 35)
                .addComponent(lblCampos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(Id))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlaca)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroRuedas)
                    .addComponent(txtNumeroRuedas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblColor)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnModificar)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        Conexion con = new Conexion();
        String placaB = txtBusquedaPlaca.getText();
        if (!placaB.isEmpty()) {
            try {
                ArrayList<Vehiculos> listaVehiculos = con.buscarPorPlaca(placaB);
                String id = "";
                String usuario = "";
                String placa = "";
                String numeroRuedas = "";
                String color = "";
                String tipoVehiculo = "";
                for (Vehiculos vehiculo : listaVehiculos) {
                    id = String.valueOf(vehiculo.getIdVehiculo());
                    usuario = vehiculo.getNombreCompleto();
                    placa = vehiculo.getPlaca();
                    numeroRuedas = String.valueOf(vehiculo.getNumeroRuedas());
                    color = vehiculo.getColor();
                    tipoVehiculo = vehiculo.getTipoVehiculo();
                }
                Id.setText(id);
                txtNombreCompleto.setText(usuario);
                txtPlaca.setText(placa);
                txtNumeroRuedas.setText(numeroRuedas);
                txtColor.setText(color);
                txtTipoVehiculo.setText(tipoVehiculo);
            } catch (SQLException ex) {

            }catch(NullPointerException ex){
                JOptionPane.showMessageDialog(null, "NO SE HA ENCONTRADO LA PLACA! " + txtBusquedaPlaca.getText());
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        Conexion con = new Conexion();
        try{
            int id = Integer.parseInt(Id.getText());
            String usuario = txtNombreCompleto.getText();
            String placa = txtPlaca.getText();
            int numRuedas = Integer.parseInt(txtNumeroRuedas.getText());
            String color = txtColor.getText();
            String tipoVehiculo = txtTipoVehiculo.getText();
            con.actualizarInformacionVehiculos(id, usuario, placa, numRuedas, color, tipoVehiculo);
        }catch(SQLException ex){
        
        }
    
    }//GEN-LAST:event_btnModificarActionPerformed

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
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modificar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Id;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblBusquedaPlaca;
    private javax.swing.JLabel lblCampos;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNumeroRuedas;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtBusquedaPlaca;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtNombreCompleto;
    private javax.swing.JTextField txtNumeroRuedas;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtTipoVehiculo;
    // End of variables declaration//GEN-END:variables
}
