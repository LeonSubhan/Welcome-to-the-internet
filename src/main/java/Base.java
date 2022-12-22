import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class Base {

    protected WebDriver dr;

    @Parameters({ "browser", "operatorSystem" })
    @BeforeMethod(alwaysRun = true)
    public void setUp(@Optional("chrome") String browser, @Optional("mac") String operatorSystem) {

        System.out.println("Create driver: " + browser);
        switch (browser) {
            case "chrome":
                if(operatorSystem.equals("mac"))
                    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
                else if (operatorSystem.equals("windows"))
                    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                dr = new ChromeDriver();
                break;

            case "firefox":
                if(operatorSystem.equals("mac"))
                    System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver");
                else if (operatorSystem.equals("windows"))
                    System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
                dr = new FirefoxDriver();
                break;

            default:
                System.out.println("Do not know how to start: " + browser + ", starting chrome.");
                if(operatorSystem.equals("mac"))
                    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
                else if (operatorSystem.equals("windows"))
                    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                dr = new ChromeDriver();
                break;
        }
        dr.get("https://the-internet.herokuapp.com/");
        //dr.manage().window().maximize();

    }


    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        System.out.println("Close driver");

        //dr.quit();
    }
}
