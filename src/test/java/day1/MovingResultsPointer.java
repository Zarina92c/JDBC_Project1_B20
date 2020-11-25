package day1;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.*;

public class MovingResultsPointer {

    public static void main(String[] args) throws SQLException {

        String connectionStr = "jdbc:oracle:thin:@52.201.187.226:1521:XE";
        String username = "hr";
        String password = "hr";

        Connection conn = DriverManager.getConnection(connectionStr, username, password);
        Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = stmt.executeQuery("SELECT * FROM REGIONS");

        while (rs.next()) {
            System.out.println("REGION_NAME: " + rs.getString("REGION_NAME"));
        }

        System.out.println("**************************************************");
        while (rs.previous()) {
            System.out.println("BACKWARD - REGION_NAME: " + rs.getString("REGION_NAME"));
        }

        /**
         * other resultSet method for moving your pointer to specific locations
         */
        rs.first();
        rs.last();
        rs.beforeFirst();
        rs.afterLast();
        rs.absolute(3);

       // how to find out which row the pointer is at right now
       int currentRowNum = rs.getRow();

    }




}
