package dao;

import Database.ConnectDatabase;
import model.Staff;
import model.User;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;

public class userDAO implements dao.DAOInterface <model.User>{

    public static userDAO getInstance(){
        return new userDAO();
    }
    @Override
    public int insert(User user) {
        try {
            Connection connect =  ConnectDatabase.getConnection();
            Statement st = connect.createStatement();
            String sql = "INSERT INTO user(userName,password, email,otp) "
                    + " VALUES (" + "\""+ user.getUserName() + "\",\"" + user.getPassword() + "\",\" "
                    + "\",\" " + user.getEmail()+ " \",\" " +user.getOTP() + "\")";
            st.executeUpdate(sql);
            ConnectDatabase.closeConnection(connect);
            st.close();

        } catch (SQLException e) {
            return 1;
        }
        return 0;
    }

    @Override
    public int delete(User user) {
        return 0;
    }

    @Override
    public int update(User user) {
        return 0;
    }

    @Override
    public ArrayList<User> selecetAll() {

        return null;
    }

    @Override
    public User selectById(User user) {
        return null;
    }

    @Override
    public ArrayList<User> selectByCondition(String condition) {
        return null;
    }
    public int selectByNamePasswordEmail(User user){
        int ketqua =2;
        try {
            Connection connect = ConnectDatabase.getConnection();
            Statement st = connect.createStatement();
            String sql = "SELECT * FROM user WHERE userName= \'" + user.getUserName() + "\'" + " AND password= \'" +
                    user.getPassword() + "\'AND email=\'" +user.getEmail() +"\'"  ;
            ResultSet rs = st.executeQuery(sql);
            String name =null;
            while(rs.next()){
                 name = rs.getString("userName");
                String password = rs.getString("password");
                String email = rs.getString("email");
                String opt =rs.getString("otp");
            }
            rs.last();
            ketqua = rs.getRow();;



            ConnectDatabase.closeConnection(connect);
        } catch (Exception e) {
                e.getStackTrace();

        }
        return ketqua;
    }
}
