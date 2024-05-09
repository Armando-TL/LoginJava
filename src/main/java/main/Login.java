package main;

import javax.swing.WindowConstants;


// @author armando
 
public class Login {

    public static void main(String[] args) {
        ViewLogin login = new ViewLogin();
        login.setResizable(false);
        login.setLocationRelativeTo(null);
        login.setTitle("Iniciar sesion");
        login.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        login.setVisible(true);
    }
}
