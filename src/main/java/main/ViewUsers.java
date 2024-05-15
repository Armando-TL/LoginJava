package main;

// @author amdtr
import javax.swing.JOptionPane;

public class ViewUsers extends javax.swing.JFrame {

    public ViewUsers() {
        initComponents();
        setTitle("Lista de usuarios");
        Usuarios usuarios = new Usuarios();
        usuarios.mostrarTabla(tabla);
        usuarios.cargarBox(boxRol);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenedor = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLnombres = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLapellidos = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLdni = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        boxRol = new javax.swing.JComboBox<>();
        txtPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jPasswordTwo = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        JLtable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Contenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLId.setText("ID");
        jPanel1.add(jLId, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 30, 40, -1));
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 27, 90, -1));

        jLnombres.setText("Nombres");
        jPanel1.add(jLnombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 72, -1, -1));
        jPanel1.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 69, 116, -1));

        jLapellidos.setText("Apellidos");
        jPanel1.add(jLapellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 114, -1, -1));
        jPanel1.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 111, 185, -1));

        jLdni.setText("DNI");
        jPanel1.add(jLdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 156, -1, -1));
        jPanel1.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 153, 185, -1));

        jLabel1.setText("Rol");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 198, -1, -1));

        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, -1, -1));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, -1, -1));
        jPanel1.add(boxRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 195, 185, -1));
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 231, 185, -1));

        jLabel2.setText("Contraseña");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 234, -1, -1));
        jPanel1.add(jPasswordTwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 273, 185, -1));

        jLabel3.setText("Confirmar");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 276, -1, -1));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, -1, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        Contenedor.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 430, 380));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        Contenedor.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 46, 450, 318));

        JLtable.setText("Registros");
        Contenedor.add(JLtable, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 16, 90, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 932, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        if (!txtNombres.getText().isEmpty() && !txtApellidos.getText().isEmpty() && !txtDni.getText().isEmpty() && boxRol.getItemCount() > 0) {
            char[] passwordONE = txtPassword.getPassword();
            String password = new String(passwordONE);
            char[] passwordTWO = jPasswordTwo.getPassword();
            String passwordC = new String(passwordTWO);

            if (password.equals(passwordC)) {
                String dni = txtDni.getText();
                String nombre = txtNombres.getText();
                String apellidos = txtApellidos.getText();
                //
                Usuarios usuarios = new Usuarios(dni, nombre, apellidos, password);
                usuarios.crearUsuario(boxRol);
                usuarios.mostrarTabla(tabla);
            } else {
                JOptionPane.showMessageDialog(null, "Confirme su contraseña");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
        }
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (!txtNombres.getText().isEmpty() && !txtApellidos.getText().isEmpty() && !txtDni.getText().isEmpty() && boxRol.getItemCount() > 0 && txtPassword.getPassword().length > 0) {

            int id = Integer.parseInt(txtId.getText());
            char passs[] = txtPassword.getPassword();
            String pass = new String(passs);
            Usuarios usuarios = new Usuarios(pass,txtApellidos.getText(), txtDni.getText(),id, txtNombres.getText() );
            
            
            usuarios.modificar(boxRol);
            usuarios.mostrarTabla(tabla);
            limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        //Rol rol = new Rol();
        //Usuarios usuarios = new Usuarios(rol, txtId, txtNombres, txtApellidos, txtDni);
        //consultas.selecionar(tabla, usuarios);
        Usuarios usuarios = new Usuarios();
        usuarios.seleccionar(tabla);
        txtId.setText(String.valueOf(usuarios.id));
        txtNombres.setText(usuarios.nombre);
        txtApellidos.setText(usuarios.apellidos);
        txtDni.setText(usuarios.dni);


    }//GEN-LAST:event_tablaMouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int id = Integer.parseInt(txtId.getText());
        Usuarios usuarios = new Usuarios(id);
        usuarios.eliminar();
        usuarios.mostrarTabla(tabla);
    }//GEN-LAST:event_btnEliminarActionPerformed

    public void limpiar() {
        txtId.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
        txtDni.setText("");
        txtPassword.setText("");
        jPasswordTwo.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenedor;
    private javax.swing.JLabel JLtable;
    private javax.swing.JComboBox<String> boxRol;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLapellidos;
    private javax.swing.JLabel jLdni;
    private javax.swing.JLabel jLnombres;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordTwo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
