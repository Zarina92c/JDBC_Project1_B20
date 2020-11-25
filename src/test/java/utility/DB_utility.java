package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_utility {

    static Connection conn;

    public static void createConnection(){

        String connectionStr = "jdbc:oracle:thin:@52.91.172.117:1521:XE";
        String username = "hr" ;
        String password = "hr" ;

        try {
             conn = DriverManager.getConnection(connectionStr,username,password) ;
            System.out.println("CONNECTION SUCCESSFUL !! ");
        } catch (SQLException e) {
            System.out.println("CONNECTION HAS FAILED !!! " +  e.getMessage() );
        }

    }

    public static void main(String[] args) {

        createConnection();

    }


}
