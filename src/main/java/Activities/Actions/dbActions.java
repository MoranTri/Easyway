package Activities.Actions;

import Utilities.commonOperations;
import io.qameta.allure.Step;

import java.util.ArrayList;
import java.util.List;

public class dbActions extends commonOperations
{
    @Step("Get delivery address, stored in the DB.")
    public static List<String> getAddressFromDB(String query)
    {
        List<String> address = new ArrayList<String>();
        try
        {
            rs = stmt.executeQuery(query);
            rs.next();
            address.add(rs.getString(1));
            address.add(rs.getString(2));
            address.add(rs.getString(3));
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e);
        }
        return address;
    }
}
