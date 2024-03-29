/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import BaseDAO.UsuariosDAO;
import Entidad.Usuario;
import PrincipalScreen.PantallaPrincipal;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *Clase encargada de loggear al usuario a la ventana inicial del videojuego 
 * @author DavidV
 */
public class InicioSesion extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public InicioSesion() {
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

        PanelVentana = new javax.swing.JPanel();
        PanelIconoUsuario = new javax.swing.JPanel();
        LabelIconoUsuario = new javax.swing.JLabel();
        DescripcionVentana = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        CerrarVentana = new javax.swing.JLabel();
        TituloVentana = new javax.swing.JLabel();
        TextFieldUsuario = new javax.swing.JFormattedTextField();
        LabelUsuario = new javax.swing.JLabel();
        LabelContraseña = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        BotonIngresar = new javax.swing.JButton();
        LabelRegistro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login ");
        setUndecorated(true);
        setResizable(false);

        PanelVentana.setBackground(new java.awt.Color(255, 255, 255));
        PanelVentana.setLayout(null);

        PanelIconoUsuario.setBackground(new java.awt.Color(0, 153, 51));

        LabelIconoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/User_No-.png"))); // NOI18N

        DescripcionVentana.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        DescripcionVentana.setForeground(new java.awt.Color(255, 255, 255));
        DescripcionVentana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DescripcionVentana.setText("Inicio de sesion");

        javax.swing.GroupLayout PanelIconoUsuarioLayout = new javax.swing.GroupLayout(PanelIconoUsuario);
        PanelIconoUsuario.setLayout(PanelIconoUsuarioLayout);
        PanelIconoUsuarioLayout.setHorizontalGroup(
            PanelIconoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelIconoUsuarioLayout.createSequentialGroup()
                .addGroup(PanelIconoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelIconoUsuarioLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(LabelIconoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelIconoUsuarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(DescripcionVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        PanelIconoUsuarioLayout.setVerticalGroup(
            PanelIconoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelIconoUsuarioLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(LabelIconoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DescripcionVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(174, Short.MAX_VALUE))
        );

        PanelVentana.add(PanelIconoUsuario);
        PanelIconoUsuario.setBounds(0, 0, 296, 457);

        jPanel3.setBackground(new java.awt.Color(0, 153, 51));
        jPanel3.setPreferredSize(new java.awt.Dimension(33, 33));

        CerrarVentana.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        CerrarVentana.setForeground(new java.awt.Color(255, 255, 255));
        CerrarVentana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CerrarVentana.setText("x");
        CerrarVentana.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CerrarVentana.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CerrarVentana.setMaximumSize(new java.awt.Dimension(33, 33));
        CerrarVentana.setMinimumSize(new java.awt.Dimension(33, 33));
        CerrarVentana.setPreferredSize(new java.awt.Dimension(33, 33));
        CerrarVentana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarVentanaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CerrarVentana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CerrarVentana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PanelVentana.add(jPanel3);
        jPanel3.setBounds(584, 0, 33, 33);

        TituloVentana.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        TituloVentana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloVentana.setText("Iniciar Sesion");
        PanelVentana.add(TituloVentana);
        TituloVentana.setBounds(360, 60, 210, 50);

        TextFieldUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        TextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldUsuarioActionPerformed(evt);
            }
        });
        PanelVentana.add(TextFieldUsuario);
        TextFieldUsuario.setBounds(350, 180, 240, 40);

        LabelUsuario.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        LabelUsuario.setForeground(new java.awt.Color(51, 51, 51));
        LabelUsuario.setText("Usuario");
        PanelVentana.add(LabelUsuario);
        LabelUsuario.setBounds(350, 144, 230, 30);

        LabelContraseña.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        LabelContraseña.setForeground(new java.awt.Color(51, 51, 51));
        LabelContraseña.setText("Contraseña");
        PanelVentana.add(LabelContraseña);
        LabelContraseña.setBounds(350, 240, 250, 40);

        PasswordField.setForeground(new java.awt.Color(51, 51, 51));
        PasswordField.setToolTipText("");
        PasswordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        PanelVentana.add(PasswordField);
        PasswordField.setBounds(350, 280, 240, 40);

        BotonIngresar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        BotonIngresar.setText("Ingresar");
        BotonIngresar.setBorder(null);
        BotonIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonIngresarMouseClicked(evt);
            }
        });
        BotonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIngresarActionPerformed(evt);
            }
        });
        PanelVentana.add(BotonIngresar);
        BotonIngresar.setBounds(390, 360, 150, 40);

        LabelRegistro.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        LabelRegistro.setForeground(new java.awt.Color(0, 102, 204));
        LabelRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelRegistro.setText("No tienes una cuenta? Registrate");
        LabelRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LabelRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelRegistroMouseClicked(evt);
            }
        });
        PanelVentana.add(LabelRegistro);
        LabelRegistro.setBounds(330, 420, 270, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelVentana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelVentana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(617, 457));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldUsuarioActionPerformed
/**
 * Si el usuario presiona la "x", la ejecucion del programa termina
 * @param evt 
 */
    private void CerrarVentanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarVentanaMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CerrarVentanaMouseClicked
/**
 * Si el usuario aun no esta registrado, se le enviara a la ventana de registro, cerrando la ventana de inicio de sesion
 * @param evt 
 */
    private void LabelRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelRegistroMouseClicked
        dispose();
        new RegistroUsuario().setVisible(true);
    }//GEN-LAST:event_LabelRegistroMouseClicked

    private void BotonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIngresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonIngresarActionPerformed
/**
 * Si el usuario presiona el boton, inmediatamente se ejecuta la consulta en donde se valida que las credenciales existan en la base de datos
 * @param evt 
 */
    private void BotonIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonIngresarMouseClicked
        UsuariosDAO ud = new UsuariosDAO();
        Usuario u = ud.buscarU(TextFieldUsuario.getText());
        if(u == null){
            JOptionPane.showMessageDialog(null, "El usuario ingresado no existe");
        } else {
            if(convertir(PasswordField.getPassword()).equals(u.getPass())){
                dispose();
                PantallaPrincipal pp = new PantallaPrincipal(u.getUser());
                pp.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null, "Contraseña invalida");
            }
        }
    }//GEN-LAST:event_BotonIngresarMouseClicked
/**
 * Convierte el contenido del campo en donde se introduce la contraseña a String
 * @param pass el arreglo de char que devuelve el campo de la contraseña
 * @return nueva, el arreglo de char convertido en String
 */
        private String convertir(char[] pass){
        String nueva = "";
        for(int i =0; i < pass.length; i++){
            nueva += pass[i];
        }
        return nueva;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonIngresar;
    private javax.swing.JLabel CerrarVentana;
    private javax.swing.JLabel DescripcionVentana;
    private javax.swing.JLabel LabelContraseña;
    private javax.swing.JLabel LabelIconoUsuario;
    private javax.swing.JLabel LabelRegistro;
    private javax.swing.JLabel LabelUsuario;
    private javax.swing.JPanel PanelIconoUsuario;
    private javax.swing.JPanel PanelVentana;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JFormattedTextField TextFieldUsuario;
    private javax.swing.JLabel TituloVentana;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
