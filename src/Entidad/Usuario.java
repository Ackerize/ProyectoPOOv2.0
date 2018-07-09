/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *Esta clase es la encargada de Mapear los usuarios de la base de datos y los futuros usuarios
 * @author DavidV
 */
public class Usuario {
    private int id, score;
    private String user, pass, correo;
    
    public Usuario(){}
    /**
     * Constructor de la clase
     * @param user es el nickname  ingresado por el usuario
     * @param pass es la contraseña elegida por el usuario
     * @param correo es el correo proporcionado por el usuario
     */
    public Usuario(String user, String pass, String correo){
        this.user = user;
        this.pass = pass;
        this.correo = correo;
    }
    /**
     * Contructor de la clase que se utilizara para mostrar el ranking
     * @param user nickname del usuario
     * @param score  puntaje alcanzado del usuario durante la partida
     */
    public Usuario(String user, int score){
        this.user = user;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getCorreo() {
        return correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    
          
    
}
