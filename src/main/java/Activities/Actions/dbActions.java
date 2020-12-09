package Activities.Actions;

import Utilities.commonOperations;
import io.qameta.allure.Step;

import java.util.ArrayList;
import java.util.List;

public class dbActions extends commonOperations
{
    @Step("Get form details, stored in the DB.")
    public static List<String> getCredentialsFromDB(String query)
    {
        List<String> loginCredentials = new ArrayList<String>();
        try
        {
            rs = stmt.executeQuery(query);
            rs.next();
            loginCredentials.add(rs.getString(2));
            loginCredentials.add(rs.getString(3));
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e);
        }
        return loginCredentials;
    }
}
