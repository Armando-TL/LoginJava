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
        jLregistrate = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLcorreo = new javax.swing.JLabel();
        jLpassword = new javax.swing.JLabel();
        btnRegistrarse = new javax.swing.JButton();
        btnIniciarS = new javax.swing.JButton();
        jSeparator = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLpasswordC = new javax.swing.JLabel();
        txtPasswordC = new javax.swing.JPasswordField();
        txtPassword = new javax.swing.JPasswordField();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPForm.setBackground(new java.awt.Color(255, 255, 255));
        JPForm.setToolTipText("");
        JPForm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLregistrate.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        jLregistrate.setForeground(new java.awt.Color(0, 0, 0));
        jLregistrate.setText("Registrate");
        JPForm.add(jLregistrate, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 23, 113, -1));

        txtCorreo.setBackground(new java.awt.Color(255, 255, 255));
        txtCorreo.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(0, 0, 0));
        txtCorreo.setAutoscrolls(false);
        txtCorreo.setBorder(null);
        JPForm.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 99, 270, 20));

        jLcorreo.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        jLcorreo.setForeground(new java.awt.Color(0, 0, 0));
        jLcorreo.setText("Correo:");
        JPForm.add(jLcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 59, -1, -1));

        jLpassword.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        jLpassword.setForeground(new java.awt.Color(0, 0, 0));
        jLpassword.setText("Contraseña:");
        JPForm.add(jLpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 147, -1, -1));

        btnRegistrarse.setBackground(new java.awt.Color(0, 153, 204));
        btnRegistrarse.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JPForm.add(btnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 324, 140, -1));

        btnIniciarS.setBackground(new java.awt.Color(0, 153, 204));
        btnIniciarS.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        btnIniciarS.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarS.setText("Inicia sesion");
        btnIniciarS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSActionPerformed(evt);
            }
        });
        JPForm.add(btnIniciarS, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 129, -1));
        JPForm.add(jSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 120, 270, 10));
        JPForm.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 207, 270, 10));
        JPForm.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 295, 270, 10));

        jLpasswordC.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        jLpasswordC.setForeground(new java.awt.Color(0, 0, 0));
        jLpasswordC.setText("Confirmar contraseña:");
        JPForm.add(jLpasswordC, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 235, -1, -1));

        txtPasswordC.setBackground(new java.awt.Color(255, 255, 255));
        txtPasswordC.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        txtPasswordC.setForeground(new java.awt.Color(0, 0, 0));
        txtPasswordC.setBorder(null);
        JPForm.add(txtPasswordC, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 275, 270, 20));

        txtPassword.setBackground(new java.awt.Color(255, 255, 255));
        txtPassword.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(0, 0, 0));
        txtPassword.setBorder(null);
        JPForm.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 187, 270, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPForm, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPForm, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSActionPerformed

        viewLogin.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnIniciarSActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPForm;
    private javax.swing.JButton btnIniciarS;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLcorreo;
    private javax.swing.JLabel jLpassword;
    private javax.swing.JLabel jLpasswordC;
    private javax.swing.JLabel jLregistrate;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtPasswordC;
    // End of variables declaration//GEN-END:variables
}
