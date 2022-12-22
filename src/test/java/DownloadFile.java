import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.HashMap;

public class DownloadFile  {
    @Test
    public void testDownloadFile() {

        String downloadFilePath = "/Users/leonsubhan/IdeaProjects/com.the-internet.herokuapp";
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("download.default_directory", downloadFilePath);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);
        WebDriverManager.chromedriver().setup();
        WebDriver dr = new ChromeDriver(options);
        String url = "https://the-internet.herokuapp.com/";
        dr.navigate().to(url);
        System.out.println("Main page is opened.");
        System.out.println("Starting download file test");
        dr.findElement(By.linkText("File Download")).click();
        dr.findElement(By.linkText("some-file.txt")).click();
        dr.quit();


    }
}
