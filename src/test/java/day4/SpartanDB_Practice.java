package day4;

import utility.ConfigurationReader;
import utility.DB_Utility;

public class SpartanDB_Practice {
    public static void main(String[] args) {
        // create a main method
        // call your create connection method with 3 params
        // provide same connection string as HR
        // provide username and password as SP SP

    String connectionStr = ConfigurationReader.getProperty("spartan.database.url");
    String username=ConfigurationReader.getProperty("spartan.database.username");
    String password=ConfigurationReader.getProperty("spartan.database.password");

    DB_Utility.createConnection(connectionStr, username, password);


        // run query SELECT * FROM SPARTANS
        DB_Utility.runQuery("SELECT * FROM SPARTANS");

        // call few methods from DB_Utility
        ;
        System.out.println(DB_Utility.getRowCount());
        System.out.println(DB_Utility.getColumnNames());

        DB_Utility.destroy();

    }



    // REPLACE YOUR HARDCODED CONNECTION INFO IN THIS CLASS WITH PROPERTIES FILE

}
