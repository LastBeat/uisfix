package GUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Login extends JFrame {
    private JPanel contentPane;
    public static String PassID;
    public static String PassPW;

    private static JTextField FieldID;
    private static JPasswordField FieldPW;

    public Login(JTextField id, JPasswordField password) {
        setTitle("대학정보시스템(UIS)::Login"); // 화면 Title 지정
        setResizable(false); // 화면 크기 조정 불가
        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 화면 종료 시 프로세스도 종료
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

        JLabel LabelPW = new JLabel("Password");
        LabelPW.setBounds(160, 158, 76, 19);
        panel.add(LabelPW);
        LabelPW.setForeground(Color.DARK_GRAY);
        LabelPW.setFont(basicFont);

        JLabel LabelTitle = new JLabel("대학정보시스템(UIS)");
        LabelTitle.setBounds(160, 66, 191, 32);
        panel.add(LabelTitle);
        LabelTitle.setForeground(new Color(25, 25, 112));
        LabelTitle.setFont(basicFont);

        JLabel LabelID = new JLabel("ID");
        LabelID.setBounds(161, 127, 22, 23);
        panel.add(LabelID);
        LabelID.setForeground(Color.DARK_GRAY);
        LabelID.setFont(basicFont);

        FieldID = id;

        FieldID.setBounds(221, 129, 130, 19);
        panel.add(FieldID);
        FieldID.setColumns(10);

        FieldPW = password;
        FieldPW.setBounds(221, 158, 130, 19);
        panel.add(FieldPW);
        FieldPW.setColumns(10);

        JButton BtnLogin = new JButton("로그인");
        BtnLogin.setBounds(160, 192, 191, 32);
        panel.add(BtnLogin);
        BtnLogin.setBackground(new Color(25, 25, 112));
        BtnLogin.setForeground(new Color(255, 255, 255));
        BtnLogin.setContentAreaFilled(false); // 1
        BtnLogin.setOpaque(true); // 2 //1,2를 선언해줘야 변경하기 버튼의 배경색
        BtnLogin.setBackground(new Color(0, 0, 139));

        // BtnLogin.addActionListener(new ActionListener() {
            /* public void actionPerformed(ActionEvent arg0) {
                new DAO(); // 데이터를 불러옴
                Check(); // 허용된 사용자인지 확인
            }
        }); */

        BtnLogin.setFont(basicFont);

        JLabel label = new JLabel("");
        label.setBounds(-3, 0, 510, 305);
        // label.setIcon(new ImageIcon("./Images/Login_sc.jpg"));
        panel.add(label);
    }

    // 등록된 계정인지 확인하는 기능을 수행하는 메소드
    // public void Check() {
        /* HashMap<String, String> map = new HashMap<String, String>();
        DAO dao = new DAO();
        ArrayList<LoginGS> members = new ArrayList<LoginGS>();

        try {
            members = dao.getMembers();

            for (int i = 0; i < members.size(); i++)
                // DB에서 불러온 자료에서 id, pw 값을 매핑
                map.put(members.get(i).getId(), members.get(i).getPw());

            while (true) {
                String id = LoginGUI.FieldID.getText();

                @SuppressWarnings("deprecation")
                String password = Login.FieldPW.getText();

                if (!map.containsKey(id)) {
                    JOptionPane.showMessageDialog(null, "입력하신 id는 존재하지 않습니다. 다시 입력해주세요.", "로그인 실패",
                            JOptionPane.ERROR_MESSAGE);
                    break;
                }

                else if (!(map.get(id)).equals(password)) {
                    JOptionPane.showMessageDialog(null, "비밀번호가 일치하지 않습니다. 다시 입력해주세요.", "로그인 실패",
                            JOptionPane.ERROR_MESSAGE);
                    break;
                }

                else {
                    setVisible(false);

                    PassID = id;
                    PassPW = password;

                    // 사용자 직급별로 해당되는 창으로 이동
                    if (id.substring(0, 1).equals("S"))
                        // new WindowSTU();
                    else if (id.substring(0, 1).equals("P"))
                        // new WindowPROF();
                    else if (id.substring(0, 1).equals("H"))
                        // new WindowSTFH();
                    else if (id.substring(0, 1).equals("G"))
                        // new WindowSTFG();

                    break;
                }

            }
            // 예외 처리
        } catch (SQLException e) {
            System.out.println("[ERROR]" + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("[ERROR]" + e.getMessage());
            e.printStackTrace();
        }
    } */
}
