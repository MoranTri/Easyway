package Activities.Actions;

import Utilities.commonOperations;
import io.qameta.allure.Step;

import java.util.ArrayList;
import java.util.List;

public class dbActions extends commonOperations
{
    @Step("Get form details, stored in the DB.")
    public static List<String> getDetailsFromDB(String query)
    {
        List<String> detailsList = new ArrayList<String>();
        try
        {
            rs = stmt.executeQuery(query);
            rs.next();
            detailsList.add(rs.getString(2));
            detailsList.add(rs.getString(3));
            detailsList.add(rs.getString(4));
            detailsList.add(rs.getString(5));
            detailsList.add(rs.getString(6));
            detailsList.add(rs.getString(7));
            detailsList.add(rs.getString(8));
            detailsList.add(rs.getString(9));
            detailsList.add(rs.getString(10));
            detailsList.add(rs.getString(11));
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e);
        }
        return detailsList;
    }
}
