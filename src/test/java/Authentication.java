import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import javax.swing.*;
import java.awt.*;

public class Authentication extends Base {

    @Parameters({"UserName", "Password"})
    @Test
    public void testpositiveBasicAuth() {
        String url = "https://the-internet.herokuapp.com/";
        dr.get(url);
        System.out.println("Main page is opened.");

      dr.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
      String text = dr.findElement(By.cssSelector("p")).getText();
      System.out.println(text);

    }
    @Test
    public void testNegativeBasicAuth() {
        String url = "https://the-internet.herokuapp.com/";
        dr.get(url);
        System.out.println("Main page is opened.");
        dr.findElement(By.linkText("Basic Auth")).click();
        new Actions(dr).moveByOffset(600,10).click();

        //String text1 = dr.findElement(By.cssSelector("body")).getText();
        //System.out.println(text1);
    }
}
