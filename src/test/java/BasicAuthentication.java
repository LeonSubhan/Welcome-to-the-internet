import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BasicAuthentication extends Base{
    @Test
    public void testBasicAuthentication() {
        dr.findElement(By.linkText("Basic Auth")).click();
        dr.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        String text = dr.findElement(By.tagName("p")).getText();
        System.out.println(text);
    }
}
