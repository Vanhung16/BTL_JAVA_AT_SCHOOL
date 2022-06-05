package services;

import java.sql.Connection;
import java.sql.SQLException;

import com.mycompany.quanlydangkymonhoc.connectDB.connectDataBase;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Services {

    private static String host = "localhost";
    private static String username = "root";
    private static String password = "";
    private static String dbName = "10_java";
    private static Integer port = 3306;

    public static Connection getConnection() {
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
            Logger.getLogger("Get Connection " + connectDataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cnn;
    }

    public static ResultSet get(String sql) {
        PreparedStatement st;
        ResultSet rs = null;
        try {
            st = connectDataBase.getConnection().prepareStatement(sql);
            rs = st.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return rs;
    }

    public static void post(String sql) throws SQLException {
        PreparedStatement st;
        try {
            st = connectDataBase.getConnection().prepareStatement(sql);
            st.executeUpdate();
        } catch (SQLException ex) {
            throw new SQLException();
        }
    }
}
