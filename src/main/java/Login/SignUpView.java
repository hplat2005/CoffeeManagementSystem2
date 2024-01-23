package Login;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import org.springframework.boot.SpringApplication;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import model.User;
import view.Login;
import view.LoginView;

public class SignUpView extends JFrame {
	private JPanel contentPane;
	private JTextField userNameText;
	private JTextField emailText;
	private JTextField passwordText;
	private JTextField otpText;
	static int otp;
	public static String emailAdd;

	public SignUpView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1115, 699);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel userNameLabel = new JLabel("User Name");
		userNameLabel.setFont(new Font("Poppins SemiBold", Font.BOLD, 14));
		userNameLabel.setBounds(639, 212, 114, 40);
		contentPane.add(userNameLabel);


		JLabel emailLabel = new JLabel("Email");
		emailLabel.setFont(new Font("Poppins SemiBold", Font.BOLD, 14));
		emailLabel.setBounds(639, 401, 114, 40);
		contentPane.add(emailLabel);

		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setFont(new Font("Poppins SemiBold", Font.BOLD, 14));
		passwordLabel.setHorizontalAlignment(SwingConstants.LEFT);
		passwordLabel.setBounds(639, 313, 114, 40);
		contentPane.add(passwordLabel);

		userNameText = new JTextField();
		userNameText.setBounds(638, 249, 329, 40);
		contentPane.add(userNameText);
		userNameText.setColumns(10);

		emailText = new JTextField();
		emailText.setColumns(10);
		emailText.setBounds(639, 441, 329, 40);
		contentPane.add(emailText);

		passwordText = new JTextField();
		passwordText.setColumns(10);
		passwordText.setBounds(638, 350, 329, 40);
		contentPane.add(passwordText);

		otpText = new JTextField();
		otpText.setColumns(10);
		otpText.setBounds(639, 522, 329, 41);
		contentPane.add(otpText);
		
		JLabel sendOTPLabel = new JLabel("Send OTP");
		sendOTPLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Random random = new Random();
				int min = 100000;
				int max = 999999;
				otp = random.nextInt(max - min)+ min;
				emailAdd = emailText.getText();
				SpringApplication.run(CoffeeManagementSystemApplication.class,new String[0]);
				JOptionPane.showMessageDialog(null,"OTP send, Please check your email");
			}
		});
		sendOTPLabel.setFont(new Font("Roboto", Font.BOLD, 15));
		sendOTPLabel.setHorizontalAlignment(SwingConstants.CENTER);
		sendOTPLabel.setBounds(978, 441, 97, 40);
		sendOTPLabel.setBackground(new Color(251, 212, 252));
		sendOTPLabel.setOpaque(true);
		sendOTPLabel.setForeground(new Color(99, 63, 99));
		contentPane.add(sendOTPLabel);

		JLabel otpLabel = new JLabel("OTP");
		otpLabel.setFont(new Font("Poppins SemiBold", Font.BOLD, 14));
		otpLabel.setBounds(639, 484, 114, 40);
		contentPane.add(otpLabel);
		
		JLabel verifyLabel = new JLabel("Verify");
		verifyLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				clickVerify();
			}
		});
		verifyLabel.setFont(new Font("Roboto", Font.BOLD, 15));
		verifyLabel.setHorizontalAlignment(SwingConstants.CENTER);
		verifyLabel.setBounds(978, 521, 97, 40);
		verifyLabel.setBackground(new Color(251, 212, 252));
		verifyLabel.setOpaque(true);
		verifyLabel.setForeground(new Color(99, 63, 99));
		contentPane.add(verifyLabel);


		JLabel signUpLabel = new JLabel("Sign Up");
		signUpLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				clickSignUp();
			}
		});
		signUpLabel.setFont(new Font("Roboto", Font.BOLD, 15));
		signUpLabel.setHorizontalAlignment(SwingConstants.CENTER);
		signUpLabel.setBounds(808, 612, 129, 40);
		signUpLabel.setBackground(new Color(251, 212, 252));
		signUpLabel.setOpaque(true);
		signUpLabel.setForeground(new Color(99, 63, 99));
		contentPane.add(signUpLabel);

		JLabel decorateLabel = new JLabel();
		decorateLabel.setIcon(new ImageIcon(("C:\\Users\\latru\\Desktop\\icon\\gradient color.jpg")));
		decorateLabel.setBounds(0, 0, 481, 662);
		contentPane.add(decorateLabel);

		JLabel lblNewLabel = new JLabel("Register");
		lblNewLabel.setFont(new Font("Quantum", Font.BOLD, 51));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(480, 0, 621, 186);
		contentPane.add(lblNewLabel);


		JLabel loginPageLabel = new JLabel("Login page");
		loginPageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		loginPageLabel.setFont(new Font("Roboto", Font.BOLD, 15));
		loginPageLabel.setBounds(675, 612, 114, 40);
		loginPageLabel.setBackground( new Color(251, 212, 252));
		loginPageLabel.setOpaque(true);
		loginPageLabel.setForeground(new Color(99, 63, 99));
		loginPageLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				clickLoginPage();
			}
		});
		contentPane.add(loginPageLabel);
		this.setVisible(true);

	}
	public void clickSignUp(){
		User user = new User();
		user.setUserName(userNameText.getText());
		user.setPassword(passwordText.getText());
		user.setEmail(emailText.getText());
		user.setOTP(otpText.getText());
		int ketqua = dao.userDAO.getInstance().insert(user);
		System.out.println(ketqua);
		if(ketqua == 0){
			JOptionPane.showMessageDialog(null,"Sign Up Complete");
			new LoginView();
		}else if(ketqua ==1){
			JOptionPane.showMessageDialog(null,"Information Exist");
		}

	}
	public void clickVerify() {
		int otp2 = Integer.valueOf(otpText.getText());

		if (otp == otp2) {
			new view.Dashboard();
			JOptionPane.showMessageDialog(null, "Verify Complete");
		} else {
			JOptionPane.showMessageDialog(null, "Wrong OTP");
		}
	}
	public void clickLoginPage(){
		this.dispose();
		new LoginView();
	}

}
