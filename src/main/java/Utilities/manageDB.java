package Utilities;

import java.sql.DriverManager;

public class manageDB extends commonOperations
{
    public static void initDBConnection(String dbURL, String user, String password)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(dbURL, user, password);
            stmt = con.createStatement();
        }
        catch (Exception e)
        {
            System.out.println("Error2: " + e);
        }
    }

    public static void closeDBConnection()
    {
        try
        {
            con.close();
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e);
        }
    }
}
