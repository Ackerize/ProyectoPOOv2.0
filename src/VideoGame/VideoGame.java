/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VideoGame;

/**
 * En esta clase se ejecuta la ventana principal del videojuego
 * @author DavidV
 */


import javax.swing.JFrame;

public class VideoGame extends JFrame {

    public VideoGame(String name, String nave, int speed, int vidas, int dobledisparo, int oro) {
        
        initUI(name, nave, speed, vidas, dobledisparo, oro);
    }
    /**
     * Carga todos los elementos, para ser mostrados al usuario
     * @param name nickname del usuario a jugar
     * @param nave url de la imagen seleccionada por el usuario
     * @param speed velocidad asignada a los disparos
     * @param vidas cantidad de vidas extras que posee el usuario
     * @param dobledisparo posibilidad de disparar doble  o no
     * @param oro posibilidad de poner el doble de oro o no
     */
    private void initUI(String name, String nave, int speed, int vidas, int dobledisparo, int oro) {
        
        add(new Ejecucion(name, nave, vidas, dobledisparo, speed, oro, this));
        
        setResizable(false);
        pack();
        
        setTitle("AurelionSol's Game");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}



    
 

