import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JTextField mainid = new JTextField();
        JPasswordField mainpw = new JPasswordField();
        new Login(mainid, mainpw);
    }
}