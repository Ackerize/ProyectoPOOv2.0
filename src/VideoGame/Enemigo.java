/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VideoGame;

/**
 * Clase encargada de manipular el comportamiento de los enemigos
 * @author Mi PC
 */
public class Enemigo extends Personaje {

    private final int INITIAL_X = 800;

    public Enemigo(int x, int y, int health, int damage, int vidas, int dobledisparo, int speed) {
        super(x, y, health, damage, vidas, dobledisparo, speed);

        initAlien();
    }
    
/**
 * Carga la imagen definida
 */
    private void initAlien() {

        loadImage("src/resources/alien.png");
        getImageDimensions();
    }
/**
 * Se encarga del movimiento del enemigo
 */
    public void move() {

        if (x < 0) {
            x = INITIAL_X;
            setVisible(true);
            setHealth(45);
        }

        x -= 1;
    }
}