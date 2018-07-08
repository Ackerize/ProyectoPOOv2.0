/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colission;

/**
 * 
 * 
 *
 * @author Mi PC
 */
import java.awt.EventQueue;
import javax.swing.JFrame;

public class VideoGame extends JFrame {

    public VideoGame(int speed, int vidas, int dobledisparo, int oro) {
        
        initUI(speed, vidas, dobledisparo, oro);
    }
    
    private void initUI(int speed, int vidas, int dobledisparo, int oro) {
        
        add(new Board(vidas, dobledisparo, speed, oro));
        
        setResizable(false);
        pack();
        
        setTitle("AurelionSol's Adventure");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String [] args){
        EventQueue.invokeLater(() -> {
            VideoGame ex = new VideoGame(2,0,0,0);
            ex.setVisible(true);
        });
    }
}

    
 

