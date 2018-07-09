
package Conexion;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *En esta clase se obtiene la conexion a la base de datos
 * @author DavidV
 */
public class Conexion {

    private String user, pass, driver, url;

    private Connection cnx;

    public static Conexion instance;
/**
 * Implementacion del patron singleton
 * @return la isntancia de la conexion
 */
    public synchronized static Conexion conectar() {
        if (instance == null) {
            return new Conexion();
        }
        return instance;
    }
/**
 * En este metodo se intenta obtener la conexion a la base de datos
 */
    private Conexion() {
        cargarCredenciales();

        try {

            Class.forName(this.driver);
            cnx = (Connection) DriverManager.getConnection(this.url, this.user, this.pass);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Contiene todos los datos necesarios para realizar la conexion
     */
    private void cargarCredenciales() {
        user = "root";
        pass = "";
        driver = "com.mysql.jdbc.Driver";
        url = "jdbc:mysql://localhost/proyectopoo";
    }
/**
 * Este metodo nos devuelve la conexion a la base de datos
 * @return la conexion
 */
    public Connection getCnx() {
        return cnx;
    }
    /**
     * Este metodo se encarga de cerrar la conexion
     */

    public void cerrarConexion() {
        instance = null;
    }

}
