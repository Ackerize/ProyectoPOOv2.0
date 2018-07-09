/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDAO;

/**
 *Esta interface contiene todos los metodos necesarios para ejecutar las consultas requeridas
 * @author DavidV
 */
import java.util.ArrayList;


public interface metodosDAO <Generic>{
    public boolean insertar(Generic g);
    public boolean actualizar (Generic c);
    public Generic buscarU(Object key);
    public Generic buscarC(Object key);
    public ArrayList<Generic> leerTodo();
    
}
