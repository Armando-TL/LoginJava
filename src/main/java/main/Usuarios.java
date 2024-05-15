package main;
// @author amdtr

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Usuarios extends Registros {

    String password;
    String apellidos;
    String dni;

    // Para inciar sesion

    public Usuarios(String password, String dni) {
        this.password = password;
        this.dni = dni;
    }

    public Usuarios(String password, String apellidos, String dni, String nombre) {
        super(nombre);
        this.password = password;
        this.apellidos = apellidos;
        this.dni = dni;
    }

    

    // Para crear usuarios
    

    //Para modificar usuarios
    

    public Usuarios(String password, String apellidos, String dni, int id, String nombre) {
        super(id, nombre);
        this.password = password;
        this.apellidos = apellidos;
        this.dni = dni;
    }

    public Usuarios() {
    }

    public Usuarios(int id) {
        super(id);
    }

    public static Conexion conexion = new Conexion();

    //SOLO MOSTRARA LOS QUE SEAN ALUMNOS
    @Override
    public void mostrarTabla(JTable tabla) {
        String sql = """
                     SELECT u.id AS id_usuario, u.nombres, u.apellidos, u.dni, r.nombre AS rol
                     FROM usuarios u
                     INNER JOIN usuariosroles ur ON u.id = ur.idusuarios
                     INNER JOIN roles r ON ur.idrol = r.id
                     WHERE estado = 1
                     ORDER BY id_usuario ASC;""";
        DefaultTableModel modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        };

        modelo.addColumn("ID");
        modelo.addColumn("Nombres");
        modelo.addColumn("Apellidos");
        modelo.addColumn("DNI");
        modelo.addColumn("Rol");

        try {
            Statement ps = conexion.conetandoBase().createStatement();
            ResultSet rs = ps.executeQuery(sql);

            while (rs.next()) {
                String idB = rs.getString("id_usuario");
                String name = rs.getString("nombres");
                String lastName = rs.getString("apellidos");
                String dniB = rs.getString("dni");
                String rolB = rs.getString("rol");

                modelo.addRow(new Object[]{idB, name, lastName, dniB, rolB});
                tabla.setModel(modelo);

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL: " + e);
        } finally {
            conexion.cerrarBase();
        }
    }

    public void modificar(JComboBox comboBox) {

        try {
            String sql = "UPDATE usuarios SET nombres = ?, apellidos = ?, dni = ?, pass= ? WHERE id = ?;";
            try (PreparedStatement ps = conexion.conetandoBase().prepareStatement(sql)) {
                ps.setString(1, nombre);
                ps.setString(2, apellidos);
                ps.setString(3, dni);
                ps.setString(4, password);
                ps.setInt(5, id);
                ps.execute();
                ps.close();
            }
            String sqll = "UPDATE usuariosroles SET idrol = ? WHERE idusuarios = ?";
            try (PreparedStatement pss = conexion.conetandoBase().prepareStatement(sqll)) {
                pss.setInt(1, comboBox.getSelectedIndex() + 1);
                pss.setInt(2, id);
                pss.execute();
                pss.close();
            }

            JOptionPane.showMessageDialog(null, "Usuario modificado con exito");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        } finally {
            conexion.cerrarBase();
        }

    }

    @Override
    public void seleccionar(JTable tabla) {
        int fila = tabla.getSelectedRow();

        if (fila >= 0) {
            id = Integer.parseInt(tabla.getValueAt(fila, 0).toString());
            nombre = tabla.getValueAt(fila, 1).toString();
            apellidos = tabla.getValueAt(fila, 2).toString();
            dni = tabla.getValueAt(fila, 3).toString();

        }
    }

    @Override
    public void eliminar() {

        try {
            String sql = "UPDATE usuarios SET estado = 0  WHERE id = ?;";
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

    public void crearUsuario(JComboBox comboBox) {

        String sql = "INSERT INTO usuarios(nombres, apellidos, dni, pass) VALUES (?, ?, ?, ?);";
        try {
            try ( //Insercion de usuario
                  PreparedStatement ps = conexion.conetandoBase().prepareStatement(sql)) {
                ps.setString(1, nombre);
                ps.setString(2, apellidos);
                ps.setString(3, dni);
                ps.setString(4, password);
                ps.execute();
            }

            //Insercion de rol del usuario
            sql = "INSERT INTO usuariosroles(idusuarios, idrol) VALUES ((SELECT id FROM usuarios WHERE estado = true ORDER BY id DESC limit 1), ?);";
            PreparedStatement pss = conexion.conetandoBase().prepareStatement(sql);
            pss.setInt(1, comboBox.getSelectedIndex() + 1);
            pss.execute();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        } finally {
            conexion.cerrarBase();
        }

    }

    private ViewLogin viewLogin;

    
    public void setViewLogin(ViewLogin login) {
        this.viewLogin = login;
    }

    
    public void iniciarSesion() {

        

        try {
            String sql = """
                     SELECT u.pass, u.dni, r.nombre AS rol
                     FROM usuarios u
                     INNER JOIN usuariosroles ur ON u.id = ur.idusuarios
                     INNER JOIN roles r ON ur.idrol = r.id
                     WHERE dni = ? AND pass = ? and estado = 1
                    """;
            PreparedStatement ps = conexion.conetandoBase().prepareStatement(sql);
            ps.setString(1, dni);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            

            if (rs.next()) {

                viewLogin.setVisible(false);
                ViewMenu viewMenu = new ViewMenu();
                viewMenu.setVisible(true);
                viewMenu.setLocationRelativeTo(viewLogin);

            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL: " + e);
        } finally {
            conexion.cerrarBase();
        }

    }

}
