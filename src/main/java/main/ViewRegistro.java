package main;

// @author armando
public class ViewRegistro extends javax.swing.JFrame {

    private ViewLogin viewLogin;

    public ViewRegistro() {
        initComponents();
    }

    public void setViewLogin(ViewLogin login) {
        this.viewLogin = login;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        JPForm = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnIniciarS = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPForm.setBackground(new java.awt.Color(255, 255, 255));
        JPForm.setToolTipText("");
        JPForm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Registrate");
        JPForm.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 23, 113, -1));

        txtCorreo.setBackground(new java.awt.Color(255, 255, 255));
        txtCorreo.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(0, 0, 0));
        txtCorreo.setAutoscrolls(false);
        txtCorreo.setBorder(null);
        JPForm.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 99, 270, 20));

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Correo:");
        JPForm.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 59, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Contraseña:");
        JPForm.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 147, -1, -1));

        btnIniciarS.setBackground(new java.awt.Color(0, 153, 204));
        btnIniciarS.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        btnIniciarS.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarS.setText("Registrarse");
        btnIniciarS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JPForm.add(btnIniciarS, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 324, 140, -1));

        jButton1.setBackground(new java.awt.Color(0, 153, 204));
        jButton1.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Inicia sesion");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        JPForm.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 389, 129, -1));
        JPForm.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 120, 270, 10));
        JPForm.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 207, 270, 10));
        JPForm.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 295, 270, 10));

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Confirmar contraseña:");
        JPForm.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 235, -1, -1));

        jPasswordField1.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(0, 0, 0));
        jPasswordField1.setBorder(null);
        JPForm.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 275, 270, 20));

        jPasswordField2.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordField2.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        jPasswordField2.setForeground(new java.awt.Color(0, 0, 0));
        jPasswordField2.setBorder(null);
        JPForm.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 187, 270, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPForm, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPForm, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        viewLogin.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPForm;
    private javax.swing.JButton btnIniciarS;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField txtCorreo;
    // End of variables declaration//GEN-END:variables
}
