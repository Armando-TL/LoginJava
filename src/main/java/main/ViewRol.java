package main;

// @author amdtr
import javax.swing.JOptionPane;

public class ViewRol extends javax.swing.JFrame {

    public ViewRol() {
        initComponents();
        setTitle("Lista de usuarios");
        Rol rol = new Rol();
        rol.mostrarTabla(tabla);
        rol.cargarBox(boxRol);

    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenedor = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        panelTxt = new javax.swing.JPanel();
        jLId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLnombres = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLCombobox = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        boxRol = new javax.swing.JComboBox<>();
        btnLimpiar = new javax.swing.JButton();
        jLDescripcion = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        btnEliminar = new javax.swing.JButton();
        JLTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        panelTxt.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLId.setText("ID");
        panelTxt.add(jLId, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 30, 40, -1));
        panelTxt.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 90, -1));

        jLnombres.setText("Nombre");
        panelTxt.add(jLnombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 80, -1, -1));
        panelTxt.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 116, -1));

        jLCombobox.setText("Vista previa");
        panelTxt.add(jLCombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        panelTxt.add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        panelTxt.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, -1));
        panelTxt.add(boxRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 185, -1));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        panelTxt.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, -1, -1));

        jLDescripcion.setText("Descripcion");
        panelTxt.add(jLDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        txtDescripcion.setDragEnabled(true);
        jScrollPane2.setViewportView(txtDescripcion);

        panelTxt.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        panelTxt.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, -1));

        JLTitulo.setText("Registros");

        javax.swing.GroupLayout ContenedorLayout = new javax.swing.GroupLayout(Contenedor);
        Contenedor.setLayout(ContenedorLayout);
        ContenedorLayout.setHorizontalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JLTitulo)
                    .addComponent(panelTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        ContenedorLayout.setVerticalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(JLTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked

        Rol rol = new Rol();
        rol.seleccionar(tabla);
        txtId.setText(String.valueOf(rol.id));
        txtNombre.setText(rol.nombre);
        txtDescripcion.setText(rol.descripcion);

    }//GEN-LAST:event_tablaMouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (!txtNombre.getText().isEmpty() && !txtId.getText().isEmpty()) {

            int id = Integer.parseInt(txtId.getText());
            String descripcion = txtDescripcion.getText();
            String nombre = txtNombre.getText();
            Rol rol = new Rol(descripcion, id, nombre);
            rol.modificar();
            rol.mostrarTabla(tabla);
            rol.cargarBox(boxRol);
            limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        if (!txtNombre.getText().isEmpty() && !txtDescripcion.getText().isEmpty()) {

            String nombre = txtNombre.getText();
            String descripcion = txtDescripcion.getText();
            //
            Rol rol = new Rol(descripcion, nombre);
            rol.crearRol();
            rol.mostrarTabla(tabla);
            rol.cargarBox(boxRol);

        } else {
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
        }
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
            
        if (!txtId.getText().isEmpty()) {
            int id = Integer.parseInt(txtId.getText());
            Rol rol = new Rol(id);
            rol.eliminar();  
            rol.mostrarTabla(tabla);
            rol.cargarBox(boxRol);
        }else{
            JOptionPane.showMessageDialog(null, "Debe ingresar un ID valido");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    public void limpiar() {
        txtId.setText("");
        txtNombre.setText("");
        txtDescripcion.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenedor;
    private javax.swing.JLabel JLTitulo;
    private javax.swing.JComboBox<String> boxRol;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLCombobox;
    private javax.swing.JLabel jLDescripcion;
    private javax.swing.JLabel jLId;
    private javax.swing.JLabel jLnombres;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelTxt;
    private javax.swing.JTable tabla;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
