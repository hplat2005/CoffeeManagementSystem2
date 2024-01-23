package view;


import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField userNameText;
	private JTextField passwordText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 831, 534);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel userNameLabel = new JLabel("User Name");
		userNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		userNameLabel.setBounds(109, 118, 137, 39);
		contentPane.add(userNameLabel);
		
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setHorizontalAlignment(SwingConstants.CENTER);
		passwordLabel.setBounds(121, 201, 137, 49);
		contentPane.add(passwordLabel);
		
		userNameText = new JTextField();
		userNameText.setBounds(256, 118, 362, 39);
		contentPane.add(userNameText);
		userNameText.setColumns(10);
		
		passwordText = new JTextField();
		passwordText.setBounds(258, 206, 368, 39);
		contentPane.add(passwordText);
		passwordText.setColumns(10);
		
		JLabel signInLabel = new JLabel("Sign In");
		signInLabel.setHorizontalAlignment(SwingConstants.CENTER);
		signInLabel.setBounds(339, 271, 115, 30);
		contentPane.add(signInLabel);

	}
}
