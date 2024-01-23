package view;

import java.awt.Color;
import java.awt.EventQueue;
import model.User;
import Login.SignUpView;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginView extends JFrame {
    private JPanel contentPane;
    private final JLabel decorateLabel = new JLabel("");
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;

    public JLabel userNameLabel;
    public JLabel passwordLabel;
    public JLabel emailLabel;

    public LoginView() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1115, 685);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setBackground(new Color(227, 226, 213));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        decorateLabel.setIcon(new ImageIcon("C:\\Users\\latru\\Desktop\\icon\\coffee2(561-648).jpg"));
        decorateLabel.setBounds(0, 0, 561, 648);
        contentPane.add(decorateLabel);

         userNameLabel = new JLabel("User Name");
        userNameLabel.setFont(new Font("Roboto Black", Font.BOLD, 16));
        userNameLabel.setBounds(675, 226, 105, 27);
        contentPane.add(userNameLabel);

         passwordLabel = new JLabel("Password");
        passwordLabel.setFont(new Font("Roboto Black", Font.BOLD, 16));
        passwordLabel.setBounds(675, 309, 105, 27);
        contentPane.add(passwordLabel);

         emailLabel = new JLabel("Email");
        emailLabel.setFont(new Font("Roboto Black", Font.BOLD, 16));
        emailLabel.setBounds(675, 395, 105, 27);
        contentPane.add(emailLabel);

        textField = new JTextField();
        textField.setBounds(673, 250, 344, 49);
        contentPane.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(673, 336, 344, 49);
        contentPane.add(textField_1);

        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(673, 423, 344, 49);
        contentPane.add(textField_2);

        JLabel loginLabel = new JLabel("Login");
        loginLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                clickLoginLabel();
            }
        });
        loginLabel.setFont(new Font("Segoe UI", Font.BOLD, 22));
        loginLabel.setHorizontalAlignment(SwingConstants.CENTER);
        loginLabel.setBounds(675, 517, 342, 34);
        loginLabel.setBackground(new Color(56, 55, 46));
        loginLabel.setOpaque(true);
        loginLabel.setForeground(new Color(227, 226, 213));
        contentPane.add(loginLabel);

        JLabel lblNewLabel = new JLabel("SIGN IN");
        lblNewLabel.setFont(new Font("Quantum", Font.PLAIN, 35));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(668, 64, 342, 134);
        lblNewLabel.setBackground(new Color(59, 59, 46));
        lblNewLabel.setOpaque(true);
        lblNewLabel.setForeground(new Color(240, 217, 38));
        contentPane.add(lblNewLabel);


        JLabel lblNewLabel_1 = new JLabel("Don't have an account yet?");
        lblNewLabel_1.setFont(new Font("Roboto", Font.BOLD, 14));
        lblNewLabel_1.setBounds(723, 597, 171, 27);
        contentPane.add(lblNewLabel_1);

        JLabel signUpLabel = new JLabel("Sign up");
        signUpLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        signUpLabel.setFont(new Font("Lato", Font.BOLD, 15));
        signUpLabel.setBounds(887, 600, 67, 19);
        signUpLabel.setForeground(new Color(82, 82, 60));
        contentPane.add(signUpLabel);
        signUpLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                clickSignUpLabel();
            }
        });

        this.setVisible(true);
    }
    public void clickLoginLabel(){
        User user = new User();
        user.setUserName(textField.getText());
        user.setPassword(textField_1.getText());
        user.setEmail(textField_2.getText());
        int ketqua = dao.userDAO.getInstance().selectByNamePasswordEmail(user);
        if(ketqua ==2){
            new view.Dashboard();
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null,"Information does not exist");
        }
    }
    public void clickSignUpLabel(){
        this.dispose();
        new SignUpView();
    }

}

