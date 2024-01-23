package model;

public class User {
	private String userName;
	private String email;
	private String password;
	private String otp;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getOTP() {
		return otp;
	}
	public void setOTP(String oTP) {
		this.otp = oTP;
	}
	public User(String userName, String email, String password, String oTP) {
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.otp = oTP;
	}
	public User(){

	}

}
