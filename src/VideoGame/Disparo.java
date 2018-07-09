/*      
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VideoGame;

/**
 *Clase encargada del comportamiento de los disparos realizado por el jugador
 * @author DavidV
 */
public class Disparo extends Personaje {

    private final int BOARD_WIDTH = 790;
    private int MISSILE_SPEED;

    public Disparo(int x, int y, int health, int damage, int vidas, int dobledisparo,int speed) {
        super(x, y, health, damage, vidas, dobledisparo, speed);
        MISSILE_SPEED = speed;
        initMissile();
    }
    /**
     * Carga la imagen del disparo
     */
    private void initMissile() {
        
        loadImage("src/resources/shot.png");
        getImageDimensions();        
    }
/**
 * Se encarga del movimiento del disparo hecho
 */
    public void move() {
        
        x += MISSILE_SPEED;
        
        if (x > BOARD_WIDTH)
            visible = false;
    }
}
