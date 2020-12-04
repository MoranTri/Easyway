package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class commonOperations extends base
{
    public static String getDataFromXMLFile(String nodeName)
    {
        File fXmlFile;
        DocumentBuilderFactory dbFactory;
        DocumentBuilder dBuilder;
        Document doc = null;
        try
        {
            fXmlFile = new File("./Configuration/configurations.xml");
            dbFactory = DocumentBuilderFactory.newInstance();
            dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(fXmlFile);
        }
        catch (Exception e)
        {
            System.out.println("Error Reading XML file: " + e);
        }
        finally
        {
            return doc.getElementsByTagName(nodeName).item(0).getTextContent();
        }
    }

    public static void initBrowser(String browserName)
    {
        switch (browserName.toLowerCase())
        {
            case "chrome":
                driver = initChromeDriver();
                break;
            case "firefox":
                driver = initFFDriver();
                break;
            default:
                throw new RuntimeException(("Invalid platform name stated."));
        }
        driver.manage().window().maximize();
        driver.get(getDataFromXMLFile("url"));
//        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 8);
        action = new Actions(driver);
        manageDB.initDBConnection("jdbc:mysql://remotemysql.com:3306/RtSQRMWl6c", "RtSQRMWl6c", "1BFLkm0d0b");
    }

    public static WebDriver initChromeDriver()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        return driver;
    }

    public static WebDriver initFFDriver()
    {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        return driver;
    }

    @BeforeClass
    public void startSession()
    {
        initBrowser(getDataFromXMLFile("BrowserName"));
        managePages.initPages();
        WorkFlows.webFlows.closeCookiesPopup();
    }

    @AfterMethod
    public void afterMethod()
    {
        driver.get(getDataFromXMLFile("url"));
    }

    @AfterClass
    public void closeSession()
    {
        manageDB.closeDBConnection();
        driver.quit();
    }
}
