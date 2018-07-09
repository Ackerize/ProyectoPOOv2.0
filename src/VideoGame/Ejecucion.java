/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VideoGame;

/**
 * Clase encarga de ejecutar todos los procesos necesarios para que el videojuego se lleve a cabo
 * @author Drim Tim
 */
import BaseDAO.UsuariosDAO;
import Entidad.Usuario;
import Pause.Pausa;
import Puntaje.puntos;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Ejecucion extends JPanel implements ActionListener {
    long remaining;
    long lastUpdate;
    private Timer timer;
    private NaveJugador spaceship;
    private List<Enemigo> aliens;
    private boolean ingame, game = true;
    private final int ICRAFT_X = 40;
    private final int ICRAFT_Y = 60;
    private final int B_WIDTH = 800;
    private final int B_HEIGHT = 600;
    private final int DELAY = 15;
    private final int MONEY_PS = 15;
    private int TOTALMONEDAS = 0;
    private int Orox2;
    private int SPEED_MISSILE;
    private int VIDAS;
    private int DOBLEDISPARO;
    private int flag = 0;
    private String player, url;
    public Pausa pause = new Pausa();
    private VideoGame juego;

    private final int[][] pos = {
        {790, 259}, {760, 50}, {790, 150},
        {2380, 60}, {2500, 90}, {1380, 120},
        {780, 150}, {580, 180}, {680, 210},
        {790, 240}, {760, 270}, {790, 300},
        {980, 330}, {560, 360}, {510, 390},
        {930, 420}, {590, 450}, {530, 480},
        {940, 510}, {990, 540}, {920, 570},
        {900, 75}, {660, 90}, {540, 105},
        {810, 120}, {860, 135}, {740, 150},
        {820, 165}, {490, 180}, {700, 195},
    };

    public Ejecucion(String name, String nave, int vidas, int dobleDisparo, int speed, int oro, VideoGame jg) {
        SPEED_MISSILE = speed;
        VIDAS = vidas;
        DOBLEDISPARO = dobleDisparo;
        Orox2 = oro;
        player = name;
        url = nave;
        juego = jg;
        initBoard();
    }

/**
 * Se encarga de cargar los elementos e iniciar el hilo
 */
    private void initBoard() {

        addKeyListener(new TAdapter());
        setFocusable(true);
        setBackground(Color.DARK_GRAY);
        setDoubleBuffered(true);
        ingame = true;

        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));

        spaceship = new NaveJugador(ICRAFT_X, ICRAFT_Y, 0, 15, VIDAS, DOBLEDISPARO, SPEED_MISSILE, url);

        initAliens();

        timer = new Timer(DELAY, this);
        timer.start();
    }
/**
 * Carga los enemigos que se encuentran vivos
 */
    public void initAliens() {
        
        aliens = new ArrayList<>();

        for (int[] p : pos) {
            aliens.add(new Enemigo(p[0], p[1], 60, 0, 0, 0, 0));
        }
    }
/**
 * Se encarga de refrescar los aspectos graficos de la ventana
 * @param g grafico a actualizar
 */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (ingame) {

            drawObjects(g);

        } else {
            juego.dispose();
            actualizar();
            puntos p = new puntos(player,url,TOTALMONEDAS);
            p.setVisible(true);
                
  
        }

        Toolkit.getDefaultToolkit().sync();
    }
/**
 * Valida si los objectos estan visibles y si es asi, los muestra en la ventana
 * @param g grafico a mostrar
 */
    private void drawObjects(Graphics g) {

        if (spaceship.isVisible()) {
            g.drawImage(spaceship.getImage(), spaceship.getX(), spaceship.getY(),
                    this);
        }

        List<Disparo> ms = spaceship.getMissiles();

        for (Disparo missile : ms) {
            if (missile.isVisible()) {
                g.drawImage(missile.getImage(), missile.getX(), 
                        missile.getY(), this);
            }
        }

        for (Enemigo alien : aliens) {
            if (alien.isVisible()) {
                g.drawImage(alien.getImage(), alien.getX(), alien.getY(), this);
            }
        }

        g.setColor(Color.WHITE);
        g.drawString("MONEDAS ACTUALES: " + TOTALMONEDAS, 5, 15);
    }


/**
 * Se encarga de ejecutar todo lo necesario para que el juego se lleve a cabo, es el metodo ejecutado por el hilo
 * @param e ActionEvent
 */
    @Override
    public void actionPerformed(ActionEvent e) {
        if(!pause.isVisible()){
                inGame();
                updateShip();
                updateMissiles();
                updateAliens();
                checkCollisions();
                repaint();  
        }
    }
/**
 * Valida si aun sigue la partida
 */
    private void inGame() {
        if(!ingame){
            timer.stop();
        }
    }
/**
 * Actualiza/refresca a jugador, mientras sigue vivo
 */
    private void updateShip() {

        if (spaceship.isVisible()) {
            
            spaceship.move();
        }
    }
/**
 * Actualiza/refresca a los disparos hechos por el usuario
 */
    private void updateMissiles() {

        List<Disparo> ms = spaceship.getMissiles();

        for (int i = 0; i < ms.size(); i++) {

            Disparo m = ms.get(i);

            if (m.isVisible()) {
                m.move();
            } else {
                ms.remove(i);
            }
        }
    }
    /**
     * Actualiza/refresca el comportamiento del enemigo
     */

    private void updateAliens() {

        if (aliens.isEmpty()) {

            ingame = false;
            return;
        }

        for (int i = 0; i < aliens.size(); i++) {

            Enemigo a = aliens.get(i);
            a.move();
        }
    }
/**
 * Se encarga de verificar si existe colision entre los elementos de la ventana.
 */
    public void checkCollisions() {

        Rectangle r3 = spaceship.getBounds();

        for (Enemigo alien : aliens) {
            
            Rectangle r2 = alien.getBounds();

            if (r3.intersects(r2) && alien.isVisible()) {
                if(VIDAS == 0){
                    spaceship.setVisible(false);
                    alien.setVisible(false);
                    ingame = false;
                }
                else{
                    alien.setVisible(false);
                    VIDAS--;
                }
            }
        }

        List<Disparo> ms = spaceship.getMissiles();

        for (Disparo m : ms) {

            Rectangle r1 = m.getBounds();

            for (Enemigo alien : aliens) {

                Rectangle r2 = alien.getBounds();

                if (r1.intersects(r2) && alien.isVisible()) {
                    alien.setHealth(alien.getHealth() - m.getDamage());
                    m.setVisible(false);
                    if(alien.getHealth()<=0){                        
                        alien.setVisible(false);
                        if(Orox2 == 2){
                            TOTALMONEDAS += MONEY_PS*Orox2;
                        }
                        else{
                           TOTALMONEDAS += MONEY_PS; 
                        }
                    }
                }
            }
        }
    }
    /**
     * Encargado de ejecutar a query UPDATE para actualizar el score del usuario
     */
    private void actualizar(){
        UsuariosDAO ud = new UsuariosDAO();
        Usuario u = new Usuario(player, TOTALMONEDAS);
        if(ud.actualizar(u)){
            System.out.println("Se actualizo correctamente");
        }
    }
/**
 * Clase encargada de escuchar los eventos del teclado
 */
    private class TAdapter extends KeyAdapter {
        /**
         * Escucha los eventos cuando se presiona X tecla
         * @param e KeyEvent
         */
        @Override
        public void keyReleased(KeyEvent e) {
            spaceship.keyReleased(e);
        }
        /**
         * Escucha los eventos cuando se deja de presionar X tecla
         * @param e KeyEvent
         */
        @Override
        public void keyPressed(KeyEvent e) {
            spaceship.keyPressed(e, pause);
        }
    }
}
    
