import org.openqa.selenium.By;
import org.testng.Assert;

import org.testng.annotations.Test;

public class NegativeLogInTests extends Base {


    @Test()
    public void negativeTest() {

        String url = "https://the-internet.herokuapp.com/";
        dr.get(url);
        System.out.println("Main page is opened.");
        System.out.println("Starting negativeTest");


        dr.findElement(By.linkText("Form Authentication")).click();


        dr.findElement(By.id("username")).sendKeys("username");
        dr.findElement(By.id("password")).sendKeys("password");


        dr.findElement(By.className("radius")).click();


        String actualErrorMessage = dr.findElement(By.id("flash")).getText();
        CharSequence expectedErrorMessage = "Your username is invalid!";
        Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage),
                "actualErrorMessage does not contain expectedErrorMessage\nexpectedErrorMessage: "
                        + expectedErrorMessage + "\nactualErrorMessage: " + actualErrorMessage);
    }
}
