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

    public VideoGame() {
        
        initUI();
    }
    
    private void initUI() {
        
        add(new Board(2));
        
        setResizable(false);
        pack();
        
        setTitle("Collision");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {
            VideoGame ex = new VideoGame();
            ex.setVisible(true);
        });
    }
}

