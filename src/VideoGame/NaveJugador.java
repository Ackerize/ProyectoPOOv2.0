/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VideoGame;

/**
 * Clase encargada del comportamiento del jugador
 * @author DavidV
 */
import Pause.Pausa;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class NaveJugador extends Personaje {

    private int dx;
    private int dy;
    public int score;
    public boolean flag;
    private List<Disparo> missiles;
    private String url;
    private long start = 0;

    public NaveJugador(int x, int y, int health, int damage, int vidas, int dobledisparo, int speed, String image) {
        super(x, y, health, damage, vidas, dobledisparo, speed);
        url = image;

        initCraft();
    }
/**
 * Carga la imagen elegida por el usuario e inicializa el array de disparos
 */
    private void initCraft() {     
        missiles = new ArrayList<>();
        loadImage(url);
        getImageDimensions();
    }
/**
 * Se encarga del movimiento del jugador
 */
    public void move() {

        x += dx;
        y += dy;

        if (x < 1) {
            x = 1;
        }
        if (y < 1) {
            y = 1;
        }
        else if(y > 550){
            y = 550;
        }
    }
/**
 * Se encarga de devolver en un array los misiles que ha disparado el jugador
 * @return los misiles que ha disparado
 */
    public List<Disparo> getMissiles() {
        return missiles;
    }
    
    /**
     * Se encarga de escuchar el evento de teclas, y dependiendo de la tecla, ejecutar una accion
     * @param e KeyEvent
     * @param pause ventana Pausa
     */
    
    public void keyPressed(KeyEvent e, Pausa pause) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_SPACE) {
            if(start == 0){
                start = System.currentTimeMillis();
            } 
            else if(System.currentTimeMillis() - start >=  125){
                start = 0;
                if(DobleDisparo == 1){
                    DoubleFire();
                }
                else{
                    Fire(); 
                }
            }
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
            pause.setVisible(true);
        }
    }
/**
 * Ejecuta disparo doble en vez de uno
 */
    public void DoubleFire() {
        missiles.add(new Disparo(x + width, y + height, 0, damage, 0, 0, speed));
        missiles.add(new Disparo(x + width, y - height, 0, damage,0,0, speed));
    }
    /**
     * Ejecuta un solo disparo
     */
    public void Fire(){
         missiles.add(new Disparo(x + width, y + height / 2, 0, damage, 0, 0, speed));
    }
/**
 * Se encargar de asignar acciones, dependiendo de que tecla dejo de presionar
 * @param e KeyEvent
 */
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

    
}
