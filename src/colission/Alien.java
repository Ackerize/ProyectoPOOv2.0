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
 *
 * @author Mi PC
 */
public class Alien extends Sprite {

    private final int INITIAL_X = 400;

    public Alien(int x, int y, int health, int damage, int vidas, int dobledisparo, int speed) {
        super(x, y, health, damage, vidas, dobledisparo, speed);

        initAlien();
    }
    

    private void initAlien() {

        loadImage("src/resources/alien.png");
        getImageDimensions();
    }

    public void move() {

        if (x <= 0) {
            x = INITIAL_X;
            visible = true;
            setHealth(45);
        }

        x -= 1;
    }
}