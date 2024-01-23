package view;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.LayoutManager;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import controller.StaffController;
import dao.StaffDAO;
import model.Staff;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.ImageIcon;

public class StaffView extends JPanel {

	private static final long serialVersionUID = 1L;
	public static JTable table = new JTable();
	public static DefaultTableModel model;
	private JTextField staffIdCardText;
	private JTextField staffNameText;
	private JTextField staffPhoneNumberText;
	private JTextField staffAddressText;
	private JTextField staffWagePerMonthText;
	public JLabel addLabel;
	public JLabel deleteLabel;
	public JLabel updateLabel;
	private JLabel decorateLabel;

	/**
	 * Create the panel.
	 */
	public StaffView() {
	   StaffController staffController = new StaffController(this);	
	   this.setBackground(new Color(230, 224, 207));
       table.addMouseListener(staffController);
       this.setBounds(170,1,908,704);
       setLayout(null);
       this.repaint();
       
       JScrollPane scrollPane = new JScrollPane();
       scrollPane.setBounds(94, 93, 732, 280);
       add(scrollPane);
       
       model = (DefaultTableModel) table.getModel();
       dao.StaffDAO.getInstance().selecetAll();
       scrollPane.setViewportView(table);
       table.setModel(model);
       
       JLabel staffIdCardLabel = new JLabel("Staff Id Card");
       staffIdCardLabel.setHorizontalAlignment(SwingConstants.CENTER);
       staffIdCardLabel.setFont(new Font("Roboto Black", Font.BOLD, 13));
       staffIdCardLabel.setBounds(94, 384, 147, 40);
       staffIdCardLabel.setBackground(new Color(46, 45, 41));
       staffIdCardLabel.setForeground(new Color(222, 217, 200));
       staffIdCardLabel.setOpaque(true);
       add(staffIdCardLabel);
       
       JLabel staffNameLabel = new JLabel("Staff Name");
       staffNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
       staffNameLabel.setFont(new Font("Roboto Black", Font.BOLD, 13));
       staffNameLabel.setBounds(94, 434, 147, 40);
       staffNameLabel.setBackground(new Color(46, 45, 41));
       staffNameLabel.setForeground(new Color(222, 217, 200));
       staffNameLabel.setOpaque(true);
       add(staffNameLabel);
       
       JLabel staffAddressLabel = new JLabel("Staff Address");
       staffAddressLabel.setHorizontalAlignment(SwingConstants.CENTER);
       staffAddressLabel.setFont(new Font("Roboto Black", Font.BOLD, 13));
       staffAddressLabel.setBounds(94, 531, 147, 40);
       staffAddressLabel.setBackground(new Color(46, 45, 41));
       staffAddressLabel.setForeground(new Color(222, 217, 200));
       staffAddressLabel.setOpaque(true);
       add(staffAddressLabel);
       
       JLabel staffWagePerMonthLabel = new JLabel("StaffWagePerMonth");
       staffWagePerMonthLabel.setHorizontalAlignment(SwingConstants.CENTER);
       staffWagePerMonthLabel.setFont(new Font("Roboto Black", Font.BOLD, 13));
       staffWagePerMonthLabel.setBounds(94, 581, 147, 40);
       staffWagePerMonthLabel.setBackground(new Color(46, 45, 41));
       staffWagePerMonthLabel.setForeground(new Color(222, 217, 200));
       staffWagePerMonthLabel.setOpaque(true);
       add(staffWagePerMonthLabel);
       
       JLabel staffPhoneLabel = new JLabel("Staff Phone");
       staffPhoneLabel.setHorizontalAlignment(SwingConstants.CENTER);
       staffPhoneLabel.setFont(new Font("Roboto Black", Font.BOLD, 13));
       staffPhoneLabel.setBounds(94, 484, 147, 37);
       staffPhoneLabel.setBackground(new Color(46, 45, 41));
       staffPhoneLabel.setForeground(new Color(222, 217, 200));
       staffPhoneLabel.setOpaque(true);
       add(staffPhoneLabel);
       
       staffIdCardText = new JTextField();
       staffIdCardText.setBounds(245, 383, 581, 40);
       add(staffIdCardText);
       staffIdCardText.setColumns(10);
       
       staffNameText = new JTextField();
       staffNameText.setBounds(245, 433, 581, 38);
       add(staffNameText);
       staffNameText.setColumns(10);
       
       staffPhoneNumberText = new JTextField();
       staffPhoneNumberText.setBounds(245, 484, 581, 40);
       add(staffPhoneNumberText);
       staffPhoneNumberText.setColumns(10);
       
       staffAddressText = new JTextField();
       staffAddressText.setBounds(245, 531, 581, 40);
       add(staffAddressText);
       staffAddressText.setColumns(10);
       
       staffWagePerMonthText = new JTextField();
       staffWagePerMonthText.setBounds(245, 581, 581, 40);
       add(staffWagePerMonthText);
       staffWagePerMonthText.setColumns(10);
       
       addLabel = new JLabel("ADD");
      addLabel.setIcon(new ImageIcon("C:\\Users\\latru\\Desktop\\icon\\add 30.png"));
       addLabel.setFont(new Font("Poppins", Font.BOLD, 13));
       addLabel.setHorizontalAlignment(SwingConstants.CENTER);
       addLabel.setBounds(245, 643, 135, 40);
       addLabel.addMouseListener(staffController);
       addLabel.setBackground(new Color(46, 45, 41));
       addLabel.setOpaque(true);
       addLabel.setForeground(new Color(235, 204, 101));
       add(addLabel);
       
       deleteLabel = new JLabel("DELETE");
      deleteLabel.setIcon(new ImageIcon(("C:\\Users\\latru\\Desktop\\icon\\delete20.png")));
       deleteLabel.setFont(new Font("Poppins", Font.BOLD, 13));
       deleteLabel.setHorizontalAlignment(SwingConstants.CENTER);
       deleteLabel.setBounds(471, 645, 135, 37);
       deleteLabel.setBackground(new Color(46, 45, 41));
       deleteLabel.addMouseListener(staffController);
       deleteLabel.setOpaque(true);
       deleteLabel.setForeground(new Color(235, 204, 101));
       add(deleteLabel);
       
       updateLabel = new JLabel("UPDATE");
       updateLabel.setIcon(new ImageIcon(("C:\\Users\\latru\\Desktop\\icon\\edit 20.png")));
       updateLabel.setFont(new Font("Poppins", Font.BOLD, 13));
       updateLabel.setBackground(new Color(46, 45, 41));
       updateLabel.setHorizontalAlignment(SwingConstants.CENTER);
       updateLabel.setBounds(691, 646, 135, 34);
       updateLabel.addMouseListener(staffController);
       updateLabel.setOpaque(true);
       updateLabel.setForeground(new Color(235, 204, 101));
       add(updateLabel);
       
       decorateLabel = new JLabel("STAFF MANAGEMENT");
       decorateLabel.setIcon(new ImageIcon(("C:\\Users\\latru\\Desktop\\icon\\staff 64.png")));
       decorateLabel.setHorizontalAlignment(SwingConstants.CENTER);
       decorateLabel.setFont(new Font("Nexa Heavy", Font.BOLD, 25));
       decorateLabel.setBounds(0, 0, 908, 73);
       add(decorateLabel);
       decorateLabel.setBackground(new Color(46, 45, 41));
		decorateLabel.setOpaque(true);
		decorateLabel.setForeground(new Color(196, 166, 43));
       
}
	
	public void pressAddLabel() {
		//backend
		Staff staff = new Staff();
		staff.setStaffIdCard(staffIdCardText.getText());
		staff.setStaffName(staffNameText.getText());
		staff.setStaffPhoneNumber(staffPhoneNumberText.getText());
		staff.setStaffAddress(staffAddressText.getText());
		staff.setStaffWagePerMonth(staffWagePerMonthText.getText());
		int ketQua =StaffDAO.getInstance().insert(staff);
		//frontend
		if(ketQua == 0) {
			DefaultTableModel model = (DefaultTableModel) table.getModel();
	        String [] data = {staff.getStaffIdCard(), staff.getStaffName(), staff.getStaffPhoneNumber(), staff.getStaffAddress(),
	        				  staff.getStaffWagePerMonth()};
	        model.addRow(data);
	        JOptionPane.showMessageDialog(null, "Add Successfully");
	     }else if(ketQua == 1) {
	    	 JOptionPane.showMessageDialog(null, "Product Id Card Has Already Exist");
	     }
	}
	public void pressDeleteLabel() {
		if(table.getSelectedRowCount() == 1) {
			//backend
			Staff staff = new Staff();
			staff.setStaffIdCard(staffIdCardText.getText());
			staff.setStaffAddress(staffAddressText.getText());
			staff.setStaffName(staffNameText.getText());
			staff.setStaffPhoneNumber(staffPhoneNumberText.getText());
			staff.setStaffWagePerMonth(staffWagePerMonthText.getText());
			int ketQua =StaffDAO.getInstance().delete(staff);
			if(ketQua ==0) {
				//frontend 
				DefaultTableModel model = (DefaultTableModel)table.getModel();
			    model.removeRow(table.getSelectedRow());
				JOptionPane.showMessageDialog(null,"Delete Successfully");
			}else if(ketQua ==1) {
				JOptionPane.showMessageDialog(null, "Not found data to delete");
			}
		}else{
			JOptionPane.showMessageDialog(null, "Please select 1 row");
		}
			} 
	public void pressUpdateLabel() {
		if(table.getSelectedRowCount() == 1) {
			//backend
			Staff staff = new Staff();
			staff.setStaffIdCard(staffIdCardText.getText());
			staff.setStaffAddress(staffAddressText.getText());
			staff.setStaffName(staffNameText.getText());
			staff.setStaffPhoneNumber(staffPhoneNumberText.getText());
			staff.setStaffWagePerMonth(staffWagePerMonthText.getText());
			int ketQua = StaffDAO.getInstance().update(staff);
		    //frontend
			if(ketQua == 0) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				int columnNum =table.getSelectedColumn();
				int rowNum = table.getSelectedRow();
				model.setValueAt(staff.getStaffIdCard(), rowNum, 0);
				model.setValueAt(staff.getStaffName(), rowNum, 1);
				model.setValueAt(staff.getStaffPhoneNumber(), rowNum, 2);
				model.setValueAt(staff.getStaffAddress(), rowNum, 3);
				model.setValueAt(staff.getStaffWagePerMonth(), rowNum, 4);
				JOptionPane.showMessageDialog(null, "Update SuccessFully");
			  }else if(ketQua ==1) {
				   JOptionPane.showMessageDialog(null,"StaffIdCard has already exist");}
		}else if(table.getSelectedRowCount() == 0) {
				JOptionPane.showMessageDialog(null, "Please Select Row");
		}
	}
	public void clickTable() {
     DefaultTableModel model = (DefaultTableModel) table.getModel();
     int colNum =table.getSelectedRow();
     staffIdCardText.setText(model.getValueAt(colNum, 0).toString());
	 staffNameText.setText( model.getValueAt(colNum,1).toString());
	 staffPhoneNumberText.setText( model.getValueAt(colNum,2).toString());
	 staffAddressText.setText( model.getValueAt(colNum,3).toString());
	 staffWagePerMonthText.setText( model.getValueAt(colNum,4).toString());
	 
	}
}
