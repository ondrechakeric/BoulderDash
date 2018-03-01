
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1795863
 */
public class Database {

    private final static String HOSTNAME = "den1.mysql4.gear.host";
    private final static String DBNAME = "boulderbash";
    private final static String USERNAME = "boulderbash";
    private final static String PASSWORD = "myjacpass!";

    Connection conn;

    public Database() throws SQLException {
        conn = DriverManager.getConnection(
                "jdbc:mysql://" + HOSTNAME + "/" + DBNAME,
                USERNAME, PASSWORD);
    }
}
