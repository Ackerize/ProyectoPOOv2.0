/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrincipalScreen;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

/**
 *
 * @author CRISTIAN
 */
public class ImagePanel extends javax.swing.JPanel {
    private Image BackGroundImage;
    
    public ImagePanel(){}
    
    public Image getImage(){
        return this.BackGroundImage;
    }
    
    public void setImage(Image image){
        
        this.BackGroundImage = image;
        Dimension size = new Dimension(this.getWidth(), this.getHeight());
        this.setPreferredSize(size);
        this.setMinimumSize(size);
        this.setMaximumSize(size);
        this.setSize(size);
        this.setOpaque(false);  
    }
    
    public static void main(String [] args){
    
    }
    
    @Override
    public void paintComponent(Graphics g){
        if(this.BackGroundImage!=null){
            g.drawImage(BackGroundImage, 0, 0, this.getWidth(), this.getHeight(),null);
        }
    } 
}