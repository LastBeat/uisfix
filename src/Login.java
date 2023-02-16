import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Login extends JFrame {
    private JPanel contentPane;

    private JTextField fieldid;
    private JPasswordField fieldpw;

    public Login(JTextField id, JPasswordField password) {
        setTitle("대학정보시스템(UIS)::Login"); // 화면 Title 지정
        setResizable(false); // 화면 크기 조정 불가
        setBounds(100, 100, 510, 340);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setVisible(true);

        Font basicFont = new Font("맑은 고딕", Font.BOLD, 13);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 504, 305);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel labelpw = new JLabel("Password");
        labelpw.setBounds(160, 158, 76, 19);
        panel.add(labelpw);
        labelpw.setForeground(Color.DARK_GRAY);
        labelpw.setFont(basicFont);

        JLabel labeltitle = new JLabel("대학정보시스템(UIS)");
        labeltitle.setBounds(160, 66, 191, 32);
        panel.add(labeltitle);
        labeltitle.setForeground(new Color(25, 25, 112));
        labeltitle.setFont(basicFont);

        JLabel labelid = new JLabel("ID");
        labelid.setBounds(161, 127, 22, 23);
        panel.add(labelid);
        labelid.setForeground(Color.DARK_GRAY);
        labelid.setFont(basicFont);

        fieldid = id;

        fieldid.setBounds(221, 129, 130, 19);
        panel.add(fieldid);
        fieldid.setColumns(10);

        fieldpw = password;
        fieldpw.setBounds(221, 158, 130, 19);
        panel.add(fieldpw);
        fieldpw.setColumns(10);

        JButton btnlogin = new JButton("로그인");
        btnlogin.setBounds(160, 192, 191, 32);
        panel.add(btnlogin);
        btnlogin.setBackground(new Color(25, 25, 112));
        btnlogin.setForeground(new Color(255, 255, 255));
        btnlogin.setContentAreaFilled(false); // 1
        btnlogin.setOpaque(true); // 2 //1,2를 선언해줘야 변경하기 버튼의 배경색
        btnlogin.setBackground(new Color(0, 0, 139));

        btnlogin.setFont(basicFont);

        JLabel label = new JLabel("");
        label.setBounds(-3, 0, 510, 305);
        panel.add(label);
    }
}
