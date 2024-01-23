package model;

public class Staff {
	private String staffIdCard;
	private String staffName; 
	private String staffAddress;
	private String staffWagePerMonth;
	private String staffPhoneNumber;
	public String getStaffWagePerMonth() {
		return staffWagePerMonth;
	}
	public void setStaffWagePerMonth(String staffWagePerMonth) {
		this.staffWagePerMonth = staffWagePerMonth;
	}
	public String getStaffIdCard() {
		return staffIdCard;
	}
	public void setStaffIdCard(String staffIdCard) {
		this.staffIdCard = staffIdCard;
	}
	@Override
	public String toString() {
		return "Staff [staffId=" + staffIdCard + ", staffName=" + staffName + ", staffAddress=" + staffAddress
				+ ", staffPhoneNumber=" + staffPhoneNumber + "]";
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName (String staffName) {
		this.staffName = staffName;
	}
	public String getStaffAddress() {
		return staffAddress;
	}
	public void setStaffAddress(String staffAddress) {
		this.staffAddress = staffAddress;
	}
	public String getStaffPhoneNumber() {
		return staffPhoneNumber;
	}
	public void setStaffPhoneNumber(String staffPhoneNumber) {
		this.staffPhoneNumber = staffPhoneNumber;
	}
	public Staff(String staffIdCard, String staffName, String staffPhoneNumber,String staffAddress, String  staffWagePerMonth) {
		super();
		this.staffIdCard = staffIdCard;
		this.staffName = staffName;
		this.staffAddress = staffAddress;
		this.staffPhoneNumber = staffPhoneNumber;
		this.staffWagePerMonth = staffWagePerMonth;
	}
	public Staff() {};
	

}
