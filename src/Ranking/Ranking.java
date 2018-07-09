/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ranking;

import BaseDAO.UsuariosDAO;
import Entidad.Usuario;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *Clase encargada de mostrar a todos los usuarios con su respectivo score
 * @author DavidV
 */
public class Ranking extends JFrame{
    public JLabel titulo, imagen;
    public JTable consulta;
    public JPanel table;
    public JButton back;
    private static final int ANCHOC = 130, ALTOC = 20;
    private static final String TITLE = "RANKING";
    DefaultTableModel tm;

    public Ranking(){
        super(TITLE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        agregarLabels();
        formulario();
        LlenarTable();
        Container container = getContentPane();
        container.add(titulo);
        container.add(back);
        container.add(table);
        container.add(imagen);
        setSize(550, 400);
        eventos();
        
    }
    /**
     * Se encarga de cargar todas las etiquetas de la ventana
     */
    private void agregarLabels() {
        titulo = new JLabel();
        imagen = new JLabel();
        imagen.setIcon(new ImageIcon("src/resources/rank.png"));
        titulo.setIcon(new ImageIcon("src/resources/ranking.png"));
        titulo.setBounds(225, 20, 150, 50);
        imagen.setBounds(160, 20, 50, 50);
    }
    /**
     * se encarga de cargar todos los elementos a excepcion de las etiquetas
     */
    private void formulario(){
        consulta = new JTable();
        table = new JPanel();
        back = new JButton("Regresar");
        back.setBounds(210,305, ANCHOC, 40);
        table.setBounds(10, 100, 500, 200);
        table.add(new JScrollPane(consulta));
    }
    /**
     * Se encarga de crear la tabla que posteriormente se le mostrara al usuario con datos
     */
    private void LlenarTable(){
        tm = new DefaultTableModel() {
            public Class<?> getColumnClass(int column) {
                switch (column) {
                    case 0:
                        return String.class;
                    default:
                        return Integer.class;
                }
            }
        };
        tm.addColumn("USUARIO");
        tm.addColumn("SCORE");
        
        UsuariosDAO ud = new UsuariosDAO();
        ArrayList<Usuario> users = ud.leerTodo();
        for(Usuario u: users){
            tm.addRow(new Object[]{u.getUser(), u.getScore()});
        }
        consulta.setModel(tm);
    }
    /**
     * Se encarga de escuchar los eventos de los botones de la pantalla
     */
        private void eventos() {
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
            
        });

    }
}
