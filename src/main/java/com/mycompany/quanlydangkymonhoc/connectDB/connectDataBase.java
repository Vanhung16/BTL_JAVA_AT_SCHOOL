package com.mycompany.quanlydangkymonhoc.connectDB;


import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class connectDataBase {
    private static String host = "localhost" ;
    private static String username = "root";
    private static String password = "";
    private static String dbName = "10_java";
    private static Integer port = 3306;
    
    public static Connection getConnection(){
        Connection cnn = null;
        
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setServerName(host);
        dataSource.setPassword(password);
        dataSource.setDatabaseName(dbName);
        dataSource.setPort(port);
        dataSource.setUser(username);
        try {
            cnn = dataSource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger("Get Connection "+ connectDataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cnn;
    }
}
