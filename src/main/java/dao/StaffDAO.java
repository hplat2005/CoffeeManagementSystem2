package dao;

import java.util.ArrayList;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import Database.ConnectDatabase;
import model.Staff;
import view.StaffView;


public class StaffDAO implements DAOInterface <Staff> {
	public  static StaffDAO getInstance(){
		return new StaffDAO(); 
	}

	
	@Override
	public ArrayList selectByCondition(String condition) {
		ArrayList<Staff> ketQuaArr = new ArrayList<>();
		try {
			Connection connect = ConnectDatabase.getConnection();
			Statement st = connect.createStatement();
			String sql = "SELECT * FROM staff WHERE " + condition;
			ResultSet rs= st.executeQuery(sql);
			 
			System.out.println("ban vua thuc hien" + sql);
			
			while(rs.next()) {
				String staffId = rs.getString("staffId");
				String staffName = rs.getString("staffName");
				String staffAddress = rs.getString("staffAddress");
				String staffPhoneNumber = rs.getString("staffPhoneNumber");
			}
			ConnectDatabase.closeConnection(connect);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int insert(Staff t) {
		try {
		   Connection connect =  ConnectDatabase.getConnection();
		   Statement st = connect.createStatement();
		   String sql = "INSERT INTO staff(staffIdCard,staffName,  staffPhoneNumber,staffAddress,staffWagePerMonth) "
		  		+ " VALUES (" + "\""+  t.getStaffIdCard() + "\",\"" + t.getStaffName() + "\",\" " + t.getStaffPhoneNumber()
		  		+ "\",\" " + t.getStaffAddress() + " \",\" " + t.getStaffWagePerMonth() + "\")";  
		   st.executeUpdate(sql);
		   ConnectDatabase.closeConnection(connect);
		   
	    } catch (SQLException e) {
		            return 1;
	    }
	 return 0;
	}

	@Override 
	public int delete(Staff t) {
		try {
			Connection connect =  ConnectDatabase.getConnection();
			Statement st = connect.createStatement();
			String sql = "DELETE from staff WHERE staffIdCard= \"" + t.getStaffIdCard() + "\"";
		    int ketqua = st.executeUpdate(sql);
			ConnectDatabase.closeConnection(connect);
			
		} catch (SQLException e) {
			
			return 1;
		}
	return 0;
	}

	@Override 
	public int update(Staff t) {
		try {
			Connection connect = ConnectDatabase.getConnection();
			Statement st = connect.createStatement();
			String sql = "UPDATE staff " + "SET " + "staffName= \"" + t.getStaffName() + "\", staffAddress= \"" + t.getStaffAddress() + "\", staffPhoneNumber= \"" + t.getStaffPhoneNumber() 
			+ "\" WHERE staffIdCard =" + t.getStaffIdCard();
			st.executeUpdate(sql);   
			ConnectDatabase.closeConnection(connect);
	     } catch (Exception e) {
			   return 1;
		}
		return 0;
	}

	@Override
	public Staff selectById(Staff t) {
		Staff selectStaffById = null;
		try {
			Connection connect = ConnectDatabase.getConnection();
			Statement st = connect.createStatement();
			String sql = "SELECT * FROM staff WHERE staffIdCard= \"" + t.getStaffIdCard() + "\"";
			ResultSet rs= st.executeQuery(sql);
			while(rs.next()) {
				String staffIdCard = rs.getString("staffIdCard");
				String staffName = rs.getString("staffName");
				String staffAddress = rs.getString("staffAddress");
				String staffPhoneNumber = rs.getString("staffPhoneNumber");
				String staffWagePerMonth = rs.getString("staffWagePerMonth");
				
				 selectStaffById = new Staff(staffIdCard, staffName, staffPhoneNumber,staffAddress , staffWagePerMonth);
			}
			    ConnectDatabase.closeConnection(connect);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return selectStaffById;
	}

	@Override
	public ArrayList<Staff> selecetAll() {
		
		try {
			Connection connect = ConnectDatabase.getConnection();
			Statement st = connect.createStatement();
			String sql = "SELECT * FROM staff";
			ResultSet rs= st.executeQuery(sql);
			ResultSetMetaData rsmd = rs.getMetaData();
			
			int columnCount = rsmd.getColumnCount();
			String[] columnName = new String[columnCount];
			
			for(int i = 0; i< columnCount;i++) {
				columnName[i] = rsmd.getColumnName(i+1);
				
			}
			StaffView.model.setColumnIdentifiers(columnName);
			
		
			String staffIdCard, staffName, staffPhoneNumber, staffAddress, staffWagePerMonth;
			while(rs.next()) {
				 staffIdCard = rs.getString(1);
				 staffName = rs.getString(2);
				 staffPhoneNumber = rs.getString(3);
				 staffAddress = rs.getString(4);
				 staffWagePerMonth = rs.getString(5);
				
				String[] row = {staffIdCard, staffName, staffPhoneNumber, staffAddress, staffWagePerMonth};
				StaffView.model.addRow(row);
			}
			ConnectDatabase.closeConnection(connect);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}


}
