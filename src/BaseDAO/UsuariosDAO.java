/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDAO;

import Conexion.Conexion;
import Entidad.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *Esta clase es la que se encarga de realizar las consultas en la bases de datos
 * @author DavidV
 */
public class UsuariosDAO implements metodosDAO<Usuario>{
    private static final String SQL_INSERT = "INSERT INTO usuarios (Usuario, PassW, Correo, score) VALUES(?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE usuarios SET score = ? WHERE Usuario = ? AND score < ?";
    private static final String SQL_SEARCH_USER = "SELECT * FROM usuarios WHERE Usuario = ?";
    private static final String SQL_SEARCH_CE = "SELECT * FROM usuarios WHERE Correo = ?";
    private static final String SQL_READALL = "SELECT Usuario, score FROM usuarios WHERE score <> 0 ORDER BY score DESC";
    private static final Conexion con = Conexion.conectar();
    private static PreparedStatement ps;
    private static ResultSet rs;
    
    /**
     * Este metodo ejecuta la query INSERT e introduce al usuario en la base de dato
     * @param g es el usuario con sus respectivos datos
     * @return true si la query fue realiza, false si no se realizo
     */
    @Override
    public boolean insertar(Usuario g) {
        try {
            ps = con.getCnx().prepareStatement(SQL_INSERT);
            ps.setString(1, g.getUser());
            ps.setString(2, g.getPass());
            ps.setString(3, g.getCorreo());
            ps.setInt(4, g.getScore());
            if (ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            con.cerrarConexion();
        }
        return false;
    }
/**
 * Este metodo ejecuta la query UPDATE y de ser posible actualiza el score del usuario que esta jugando
 * @param c es el usuario con sus respectivos datos
 * @return true si la query fue realizada, false si no se realizo
 */
    @Override
    public boolean actualizar(Usuario c) {

        try{
            
            ps = con.getCnx().prepareStatement(SQL_UPDATE);
            ps.setInt(1, c.getScore());
            ps.setString(2, c.getUser());
            ps.setInt(3, c.getScore());
            if(ps.executeUpdate() > 0){
                return true;
            }
        } catch (SQLException ex){
            System.out.println(c.getScore());
            System.out.println(c.getUser());
        } finally{
            con.cerrarConexion();
        }
        return false;
    }
    
    /**
     * Este metodo busca dentro de la bases de datos al usuario
     * @param key respecto a que lo queremos buscar
     * @return usuario, si se encuentra en la bases de datos, de lo contrario, null
     */

    @Override
    public Usuario buscarU(Object key) {
        Usuario u = null;
        try{
            ps = con.getCnx().prepareStatement(SQL_SEARCH_USER);
             ps.setString(1, key.toString());
            rs = ps.executeQuery();
            while(rs.next()){
                u = new Usuario(rs.getString(2), rs.getString(3), rs.getString(4));
            }
            rs.close();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            con.cerrarConexion();
        }
        return u;
    }
/**
 * Este metodo ejecuta la query SELECT * y nos muestra el usuario con su respectivo score
 * @return ArrayList<Usuario> que incluye a todos los usuarios registrados con su respectivo score
 */ 
    @Override
    public ArrayList<Usuario> leerTodo() {
        ArrayList<Usuario> all = new ArrayList();
        try{
            ps = con.getCnx().prepareStatement(SQL_READALL);
            rs = ps.executeQuery();
            while(rs.next()){
                all.add(new Usuario(rs.getString(1), rs.getInt(2)));
            }
            rs.close();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            con.cerrarConexion();
        }
        return all;
    }
    
    /**
     * Este metodo busca dentro de la bases de datos el correo electronico del usuario
     * @param key respecto a que lo queremos buscar
     * @return usuario, si se encuentra en la bases de datos, de lo contrario, null
     */

    @Override
    public Usuario buscarC(Object key) {
       Usuario u = null;
       try{
           ps = con.getCnx().prepareStatement(SQL_SEARCH_CE);
           ps.setString(1, key.toString());
           rs = ps.executeQuery();
           while(rs.next()){
               u = new Usuario(rs.getString(2), rs.getString(3), rs.getString(4));
           }
           rs.close();
           
       } catch(SQLException ex){
            System.out.println(ex.getMessage());
            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
       } finally{
           con.cerrarConexion();
       }
       return u;
    }



    
}
