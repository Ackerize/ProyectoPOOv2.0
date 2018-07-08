/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda;

import colission.VideoGame;
import java.awt.EventQueue;
import javax.swing.JOptionPane;
/**
 *
 * @author DavidV
 */
public class Tienda extends javax.swing.JFrame {
    private int cant_maxRevivir = 0, cant_maxDobleDisparo = 0, cant_maxVelocidadAtaque = 0, cant_maxOrox2 = 0;
    
    /**
     * Creates new form Tienda
     */
    public Tienda() {
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

        jPanel1 = new javax.swing.JPanel();
        LabelDobleDisparo = new javax.swing.JLabel();
        LabelVelocidadDisparo = new javax.swing.JLabel();
        LabelRevivir = new javax.swing.JLabel();
        LabelOrox2 = new javax.swing.JLabel();
        DescripcionVelocidadAtaque = new javax.swing.JLabel();
        DescripcionRevivir = new javax.swing.JLabel();
        DescripcionDobleDisparo = new javax.swing.JLabel();
        DescripcionOrox2 = new javax.swing.JLabel();
        BotonRevivir = new javax.swing.JButton();
        BotonDobleDisparo = new javax.swing.JButton();
        BotonVelocidadAtaque = new javax.swing.JButton();
        BotonOrox2 = new javax.swing.JButton();
        BotonJugarNuevamente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelDobleDisparo.setIcon(new javax.swing.ImageIcon("C:\\Users\\DavidV\\Documents\\NetBeansProjects\\ProyectoPOOv2.0\\src\\resources\\dobleDisparo().png")); // NOI18N

        LabelVelocidadDisparo.setIcon(new javax.swing.ImageIcon("C:\\Users\\DavidV\\Documents\\NetBeansProjects\\ProyectoPOOv2.0\\src\\resources\\velocidadAtaque.png")); // NOI18N

        LabelRevivir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/revive.png"))); // NOI18N

        LabelOrox2.setIcon(new javax.swing.ImageIcon("C:\\Users\\DavidV\\Documents\\NetBeansProjects\\ProyectoPOOv2.0\\src\\resources\\oro x2.png")); // NOI18N

        DescripcionVelocidadAtaque.setText("Descripcion");

        DescripcionRevivir.setText("Descripcion");

        DescripcionDobleDisparo.setText("Descripcion");

        DescripcionOrox2.setText("Descripcion");

        BotonRevivir.setIcon(new javax.swing.ImageIcon("C:\\Users\\DavidV\\Documents\\NetBeansProjects\\ProyectoPOOv2.0\\src\\resources\\Buy_Button.png")); // NOI18N
        BotonRevivir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonRevivir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonRevivirMouseClicked(evt);
            }
        });

        BotonDobleDisparo.setIcon(new javax.swing.ImageIcon("C:\\Users\\DavidV\\Documents\\NetBeansProjects\\ProyectoPOOv2.0\\src\\resources\\Buy_Button.png")); // NOI18N
        BotonDobleDisparo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonDobleDisparo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonDobleDisparoMouseClicked(evt);
            }
        });

        BotonVelocidadAtaque.setIcon(new javax.swing.ImageIcon("C:\\Users\\DavidV\\Documents\\NetBeansProjects\\ProyectoPOOv2.0\\src\\resources\\Buy_Button.png")); // NOI18N
        BotonVelocidadAtaque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonVelocidadAtaque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonVelocidadAtaqueMouseClicked(evt);
            }
        });

        BotonOrox2.setIcon(new javax.swing.ImageIcon("C:\\Users\\DavidV\\Documents\\NetBeansProjects\\ProyectoPOOv2.0\\src\\resources\\Buy_Button.png")); // NOI18N
        BotonOrox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonOrox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonOrox2MouseClicked(evt);
            }
        });

        BotonJugarNuevamente.setText("Volver a jugar");
        BotonJugarNuevamente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonJugarNuevamente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonJugarNuevamenteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LabelRevivir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DescripcionRevivir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LabelVelocidadDisparo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DescripcionVelocidadAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LabelDobleDisparo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DescripcionDobleDisparo, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LabelOrox2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DescripcionOrox2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(BotonJugarNuevamente, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonRevivir, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonDobleDisparo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonVelocidadAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonOrox2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LabelRevivir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DescripcionRevivir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BotonRevivir, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonDobleDisparo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelDobleDisparo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DescripcionDobleDisparo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelVelocidadDisparo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DescripcionVelocidadAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonVelocidadAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonOrox2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelOrox2)
                    .addComponent(DescripcionOrox2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(BotonJugarNuevamente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonRevivirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRevivirMouseClicked
        if(cant_maxRevivir < 3){
            JOptionPane.showMessageDialog(null, "Objecto <REVIVIR> comprado con exito");
            cant_maxRevivir++;
        }
        else{
            JOptionPane.showMessageDialog(null, "Ya tiene el limite de compra del objecto");
        }
    }//GEN-LAST:event_BotonRevivirMouseClicked

    private void BotonDobleDisparoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonDobleDisparoMouseClicked
        if(cant_maxDobleDisparo < 1){
            JOptionPane.showMessageDialog(null, "Objecto <DOBLE DISPARO> comprado con exito");
            cant_maxDobleDisparo++;
        }
        else{
            JOptionPane.showMessageDialog(null, "Ya tiene el limite de compra del objecto");
        }
    }//GEN-LAST:event_BotonDobleDisparoMouseClicked

    private void BotonVelocidadAtaqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonVelocidadAtaqueMouseClicked
        if(cant_maxVelocidadAtaque < 1){
            JOptionPane.showMessageDialog(null, "Objecto <VELOCIDAD DE ATAQUE> comprado con exito");
            cant_maxVelocidadAtaque++;
        }
        else{
            JOptionPane.showMessageDialog(null, "Ya tiene el limite de compra del objecto");
        }
    }//GEN-LAST:event_BotonVelocidadAtaqueMouseClicked

    private void BotonOrox2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonOrox2MouseClicked
        if(cant_maxOrox2 < 1){
            JOptionPane.showMessageDialog(null, "Objecto <ORO X2> comprado con exito");
            cant_maxOrox2++;
        }
        else{
            JOptionPane.showMessageDialog(null, "Ya tiene el limite de compra del objecto");
        }
    }//GEN-LAST:event_BotonOrox2MouseClicked

    private void BotonJugarNuevamenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonJugarNuevamenteMouseClicked
        VerificarParametros();
        EventQueue.invokeLater(() -> {
            VideoGame ex = new VideoGame(cant_maxVelocidadAtaque, cant_maxRevivir, cant_maxDobleDisparo, cant_maxOrox2);
            ex.setVisible(true);
        });
    }//GEN-LAST:event_BotonJugarNuevamenteMouseClicked

    
    private void VerificarParametros(){
        if(cant_maxVelocidadAtaque == 1){
            cant_maxVelocidadAtaque = 10;
        }
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tienda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonDobleDisparo;
    private javax.swing.JButton BotonJugarNuevamente;
    private javax.swing.JButton BotonOrox2;
    private javax.swing.JButton BotonRevivir;
    private javax.swing.JButton BotonVelocidadAtaque;
    private javax.swing.JLabel DescripcionDobleDisparo;
    private javax.swing.JLabel DescripcionOrox2;
    private javax.swing.JLabel DescripcionRevivir;
    private javax.swing.JLabel DescripcionVelocidadAtaque;
    private javax.swing.JLabel LabelDobleDisparo;
    private javax.swing.JLabel LabelOrox2;
    private javax.swing.JLabel LabelRevivir;
    private javax.swing.JLabel LabelVelocidadDisparo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
