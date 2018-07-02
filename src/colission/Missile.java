/*      
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colission;




/**
 *
 * @author Mi PC
 */
public class Missile extends Sprite {

    private final int BOARD_WIDTH = 390;
    private int MISSILE_SPEED;

    public Missile(int x, int y, int health, int damage, int speed) {
        super(x, y, health, damage, speed);
        MISSILE_SPEED = speed;
        initMissile();
    }
    
    private void initMissile() {
        
        loadImage("src/resources/missile.png");
        getImageDimensions();        
    }

    public void move() {
        
        x += MISSILE_SPEED;
        
        if (x > BOARD_WIDTH)
            visible = false;
    }
}