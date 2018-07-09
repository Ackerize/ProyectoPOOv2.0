/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VideoGame;

/**
 * Clase que contiene los elementos necesarios y comunes entre todos los personajes que participan en el videojuego
 * @author DavidV
 */
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

public class Personaje {

    protected int x;
    protected int y;
    protected int width;
    protected int height;
    protected boolean visible;
    protected Image image;
    protected int health;
    protected int damage;
    protected int speed;
    protected int vidas;
    protected int DobleDisparo;


    public Personaje(int x, int y, int health, int damage,  int vidas, int DobleDisparo, int speed){

        this.x = x;
        this.y = y;
        this.health = health;
        this.damage = damage;
        this.speed = speed;
        this.DobleDisparo = DobleDisparo;
        this.vidas = vidas;
        visible = true;
    }

    protected void getImageDimensions() {

        width = image.getWidth(null);
        height = image.getHeight(null);
    }

    protected void loadImage(String imageName) {
        ImageIcon icon = new ImageIcon(imageName);
        image = icon.getImage();
    }

    public Image getImage() {
        return image;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, width, height);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public int getDobleDisparo() {
        return DobleDisparo;
    }

    public void setDobleDisparo(int DobleDisparo) {
        this.DobleDisparo = DobleDisparo;
    }


}