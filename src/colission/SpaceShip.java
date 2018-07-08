/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colission;

/**
 * @author Mi PC
 */
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class SpaceShip extends Sprite {

    private int dx;
    private int dy;
    public int score;
    public boolean flag;
    private List<Missile> missiles;

    public SpaceShip(int x, int y, int health, int damage, int vidas, int dobledisparo, int speed) {
        super(x, y, health, damage, vidas, dobledisparo, speed);

        initCraft();
    }

    private void initCraft() {     
        missiles = new ArrayList<>();
        loadImage("src/resources/spaceship.png");
        getImageDimensions();
    }

    public void move() {

        x += dx;
        y += dy;

        if (x < 1) {
            x = 1;
        }

        if (y < 1) {
            y = 1;
        }
    }

    public List<Missile> getMissiles() {
        return missiles;
    }

    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_SPACE) {
            Fire();
        }

        if (key == KeyEvent.VK_LEFT) {
            dx = -1;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 1;
        }

        if (key == KeyEvent.VK_UP) {
            dy = -1;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 1;
        }
        if(key == KeyEvent.VK_ESCAPE){
            flag = false;
        }
    }

    public void DoubleFire() {
        missiles.add(new Missile(x + width, y + height, 0, damage, 0, 0, speed));
        missiles.add(new Missile(x + width, y - height, 0, damage,0,0, speed));
    }
    public void Fire(){
         missiles.add(new Missile(x + width, y + height / 2, 0, damage, 0, 0, 2));
    }

    public void keyReleased(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_UP) {
            dy = 0;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 0;
        }
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
}