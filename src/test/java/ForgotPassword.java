import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ForgotPassword extends Base{
    @Test
    public void testForgotPassword() {
        String url = "https://the-internet.herokuapp.com/";
        dr.get(url);
        System.out.println("Main page is opened.");
        System.out.println("Starting forgot password test");
        dr.findElement(By.linkText("Forgot Password")).click();
        dr.findElement(By.cssSelector("#email")).sendKeys("aaa@yahoo.com");
        dr.findElement(By.tagName("i")).click();
    }
}
