import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveLogInTests extends Base {
    @Test
    public void logInTest() {

        String url = "https://the-internet.herokuapp.com/";
        dr.get(url);
        System.out.println("Main page is opened.");

        System.out.println("Starting positive test");





        dr.findElement(By.linkText("Form Authentication")).click();


        dr.findElement(By.id("username")).sendKeys("tomsmith");
        dr.findElement(By.id("password")).sendKeys("SuperSecretPassword!");

        WebDriverWait wait = new WebDriverWait(dr, 10);


        WebElement logInButton = dr.findElement(By.className("radius"));
        wait.until(ExpectedConditions.elementToBeClickable(logInButton));
        logInButton.click();


        String expectedUrl = "https://the-internet.herokuapp.com/secure";
        String url1 = dr.getCurrentUrl();
        Assert.assertEquals(url1, expectedUrl);


        Assert.assertTrue(dr.findElement(By.xpath("//a[@class='button secondary radius']")).isDisplayed(),
                "logOutButton is not visible.");


        String expectedSuccessMessage = "You logged into a secure area!";
        String actualSuccessMessage = dr.findElement(By.id("flash")).getText();
        Assert.assertTrue(actualSuccessMessage.contains(expectedSuccessMessage),
                "actualSuccessMessage does not contain expectedSuccessMessage\nexpectedSuccessMessage: "
                        + expectedSuccessMessage + "\nactualSuccessMessage: " + actualSuccessMessage);
    }

    @Test
    public void checkBoxTest(){
        String url = "https://the-internet.herokuapp.com/";
        dr.get(url);
        System.out.println("Main page is opened.");

        // Click on Form Authentication link
        dr.findElement(By.linkText("Checkboxes")).click();
        dr.findElement(By.xpath("//form[@id=\"checkboxes\"]/input[1]")).click();

    }
}
