import GUI.Login;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JTextField id_main = new JTextField();
        JPasswordField password_main = new JPasswordField();

        Login frame = new Login(id_main, password_main);
    }
}