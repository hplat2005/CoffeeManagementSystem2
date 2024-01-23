package Login;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import org.springframework.boot.SpringApplication;

import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import javax.swing.JButton;

public class EmailForm extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField emailAddressText;
	private JTextField enterOTPText;

	public JLabel messageLabel;
	static int otp;
	public static String emailAdd;
	/**
	 * Create the panel.
	 */
	public EmailForm() {
		setLayout(null);
		this.setBounds(0,0,600,434);
		 
		JLabel emailAddressLabel = new JLabel("Email Address");
		emailAddressLabel.setHorizontalAlignment(SwingConstants.CENTER);
		emailAddressLabel.setBounds(20, 10, 128, 37);
		add(emailAddressLabel);
		
		JLabel enterOTPLabel = new JLabel("Enter OTP");
		enterOTPLabel.setHorizontalAlignment(SwingConstants.CENTER);
		enterOTPLabel.setBounds(20, 57, 130, 37);
		add(enterOTPLabel);
		
		emailAddressText = new JTextField();
		emailAddressText.setBounds(158, 10, 259, 37);
		add(emailAddressText);
		emailAddressText.setColumns(10);
		
		enterOTPText = new JTextField();
		enterOTPText.setBounds(158, 57, 259, 37);
		add(enterOTPText);
		enterOTPText.setColumns(10);
		
		JButton sendCodeButton = new JButton("Send Code");
		sendCodeButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Random random = new Random();
				int min = 100000;
				int max = 999999;
				otp = random.nextInt(max - min)+ min;
				emailAdd = emailAddressText.getText();
				SpringApplication.run(CoffeeManagementSystemApplication.class,new String[0]);
				JOptionPane.showMessageDialog(null,"OTP send, Please check your email");
				sendCodeButton.setEnabled(false);
				
				 
			}
		});
		sendCodeButton.setHorizontalAlignment(SwingConstants.CENTER);
		sendCodeButton.setBounds(427, 10, 106, 37);
		add(sendCodeButton);
		
		JButton verifyButton = new JButton("Verify");
		verifyButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int otp2 = Integer.parseInt(enterOTPLabel.getText());
				if(otp == otp2) {
					messageLabel.setText("Email Verification Complete");
				}else {
					JOptionPane.showMessageDialog(null, "Wrong OTP");
					 
				}
			}
		});
		verifyButton.setHorizontalAlignment(SwingConstants.CENTER);
		verifyButton.setBounds(427, 57, 106, 37);
		add(verifyButton);
		
		messageLabel = new JLabel("");
		messageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		messageLabel.setBounds(20, 114, 527, 121);
		add(messageLabel);
		
		this.setVisible(true);
	}
}
