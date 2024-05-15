package main;
// @author armando

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTable;
import static main.Usuarios.conexion;

public abstract class Registros {

    int id;
    
    String nombre;
    

    public Registros(String dni, String nombre, String apellidos) {
        this.nombre = nombre;
        
    }

    public Registros(String nombre) {
        this.nombre = nombre;
    }
    
    
    

    //Para modificar mediante id
    public Registros(int id, String dni, String nombre, String apellidos) {
        this.id = id;

        this.nombre = nombre;
    }

    //para rol
    public Registros(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    

    public Registros(int id) {
        this.id = id;
    }

    // para mostrar tabla
    public Registros() {
    }

    public abstract void mostrarTabla(JTable tabla);

    public void cargarBox(JComboBox comboBox) {

        try {
            String sql = "SELECT * FROM `roles` WHERE est = true ORDER BY id ASC;";
            Statement st = conexion.conetandoBase().createStatement();
            ResultSet rs = st.executeQuery(sql);

            comboBox.removeAllItems();

            while (rs.next()) {
                comboBox.addItem(rs.getString("nombre"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public abstract void seleccionar(JTable tabla);

    public abstract void eliminar();
}
