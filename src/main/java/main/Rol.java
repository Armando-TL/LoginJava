package main;
// @author amdtr

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static main.Usuarios.conexion;

public class Rol extends Registros {

    String descripcion;

    //Para modificar
    public Rol(String descripcion, int id, String nombre) {
        super(id, nombre);
        this.descripcion = descripcion;
    }

    public Rol(String descripcion, String nombre) {
        super(nombre);
        this.descripcion = descripcion;
    }

    public Rol(int id) {
        super(id);
    }

    public Rol() {

    }

    
    public void modificar() {

        try {
            String sql = "UPDATE roles SET nombre = ?, descripción = ? WHERE id = ?;";
            try (PreparedStatement ps = conexion.conetandoBase().prepareStatement(sql)) {
                ps.setString(1, nombre);
                ps.setString(2, descripcion);
                ps.setInt(3, id);

                ps.execute();
            }
            JOptionPane.showMessageDialog(null, "Rol modificado con exito");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        } finally {
            conexion.cerrarBase();
        }
    }

    @Override
    public void mostrarTabla(JTable tabla) {
        String sql = """
                     SELECT id, nombre, descripción
                     FROM roles
                     WHERE est = 1
                     ORDER BY id ASC;""";
        DefaultTableModel modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        };

        modelo.addColumn("ID");
        modelo.addColumn("Nombre de rol");
        modelo.addColumn("descripcion");

        try {
            Statement ps = conexion.conetandoBase().createStatement();
            ResultSet rs = ps.executeQuery(sql);

            while (rs.next()) {
                String idR = rs.getString("id");
                String name = rs.getString("nombre");
                String description = rs.getString("descripción");

                modelo.addRow(new Object[]{idR, name, description});
                tabla.setModel(modelo);

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL: " + e);
        } finally {
            conexion.cerrarBase();
        }
    }

    @Override
    public void seleccionar(JTable tabla) {
        {
            int fila = tabla.getSelectedRow();

            if (fila >= 0) {
                id = Integer.parseInt(tabla.getValueAt(fila, 0).toString());
                nombre = tabla.getValueAt(fila, 1).toString();
                descripcion = tabla.getValueAt(fila, 2).toString();
            }
        }
    }

    @Override
    public void eliminar() {
        try {
            String sql = "UPDATE roles SET est = 0  WHERE id = ?;";
            PreparedStatement ps = conexion.conetandoBase().prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Eliminado con exito");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar: " + ex);
        } finally {
            conexion.cerrarBase();
        }
    }
    
    public void crearRol() {

        try {
            String sql = "INSERT INTO roles(nombre,descripción) VALUES (?, ?);";
            PreparedStatement ps = conexion.conetandoBase().prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, descripcion);
            ps.execute();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        } finally {
            conexion.cerrarBase();
        }
    }

}
