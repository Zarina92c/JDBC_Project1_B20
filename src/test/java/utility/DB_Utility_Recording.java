package utility;

import java.sql.*;

public class DB_Utility_Recording {

    static Connection conn;
    /* a static method to create connection
     * with valid url username and password
     **/

    public static void createConnection (){

        String connectionStr = "jdbc:oracle:thin:@52.91.172.117:1521:XE";
        String username = "hr" ;
        String password = "hr" ;

        try {
             conn = DriverManager.getConnection(connectionStr,username,password) ;
            System.out.println("CONNECTION SUCCESSFUL!");
        } catch (SQLException e) {
            System.out.println("Connection has failed "+ e.getMessage());
        }

    }


    /**
     * a static method to get the ResultSet object
     * with valid connection by executing query
      * @param
     * @return ResultSet object that contain the result just in cases needed outside the class
     */

    /*public static ResultSet runQuery (String query) {

    }

     */




    public static void main(String[] args) {


        createConnection();
        try {
            Statement stmnt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
           // ResultSet rs = stmnt.executeQuery(query);



        } catch (SQLException e) {

        }


    }
}
