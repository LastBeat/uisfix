import guis.Login;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JTextField idmain = new JTextField();
        JPasswordField passwordmain = new JPasswordField();

        new Login(idmain, passwordmain);
    }
}