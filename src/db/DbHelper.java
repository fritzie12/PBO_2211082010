/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FRITZIE.db;

import com.mysql.cj.jdbc.MysqlDataSource;
import FRITZIE.dao.*;
import FRITZIE.model.Anggota;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author LAB-MM
 */
public class DbHelper {
    private static Connection connection;
    
    public static Connection getConnection()throws SQLException{
        if(connection==null){
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setURL("jdbc:mysql://localhost/pbo_2211082010");
        dataSource.setUser("root");
        dataSource.setPassword("");
        connection = dataSource.getConnection();
       
        }
       return connection;
    }
    
    public static void main(String[] args) throws Exception {
       try{
           connection = DbHelper.getConnection();
           AnggotaDao dao=new AnggotaDaoImpl (connection);
           Anggota anggota = new Anggota ("A001","Ali","Padang","L");
           dao.insert(anggota);
           JOptionPane.showMessageDialog(null, "enter data ok");
       }catch(SQLException ex){
               JOptionPane.showMessageDialog (null, ex.getMessage());
   
       }
    }
}
