package day3;

import utility.DB_Utility_Recording;
import utility.DB_utility;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UtilityPractice {
    public static void main(String[] args) throws SQLException {


        DB_utility.createConnection();
        ResultSet jobRS = DB_utility.runQuery("SELECT * FROM JOBS");

        jobRS.last();
        int rowCount = jobRS.getRow();
        System.out.println("Row Count = "+ rowCount);

        DB_utility.destroy();

    }
}
