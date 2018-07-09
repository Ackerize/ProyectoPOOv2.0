/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package About;


/**
 *Esta clase es la ventana "About" que describe en que consiste el proyecto de la materia
 * @author CRISTIAN
 */
public class About extends javax.swing.JFrame {

    /**
     * Creates new form About
     */
    public About() {
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
        Titulo = new javax.swing.JLabel();
        Descripcion1 = new javax.swing.JLabel();
        Descripcion2 = new javax.swing.JLabel();
        Descripcion3 = new javax.swing.JLabel();
        BotonOK = new javax.swing.JButton();
        icono = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        Titulo.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        Titulo.setText("SOBRE EL JUEGO");
        Titulo.setBorder(new javax.swing.border.MatteBorder(null));
        Titulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Descripcion1.setText("Este es un proyecto de la materia Programacion Orientada");

        Descripcion2.setText("a Objetos (POO) en la cual decidimos hacer un juego que");

        Descripcion3.setText("tratara sobre un juego tipo shooter de naves espaciales");

        BotonOK.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        BotonOK.setText("OK");
        BotonOK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonOK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonOKMouseClicked(evt);
            }
        });

        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/about.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Descripcion3)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel2))
                            .addComponent(Descripcion1)
                            .addComponent(Descripcion2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(BotonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(icono)
                        .addGap(18, 18, 18)
                        .addComponent(Titulo)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(icono, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(Descripcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Descripcion2)
                .addGap(11, 11, 11)
                .addComponent(Descripcion3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(BotonOK)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /**
     * Se encarga de cerrar la ventana
     * @param evt 
     */
            
    private void BotonOKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonOKMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_BotonOKMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonOK;
    private javax.swing.JLabel Descripcion1;
    private javax.swing.JLabel Descripcion2;
    private javax.swing.JLabel Descripcion3;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel icono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}