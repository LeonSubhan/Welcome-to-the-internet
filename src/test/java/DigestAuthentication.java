import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DigestAuthentication extends Base{
    @Test
    public void testDigestAuthentication() {
    dr.get("https://admin:admin@the-internet.herokuapp.com/digest_auth");
    String expected = "Congratulations! You must have the proper credentials.";
    String actual = dr.findElement(By.tagName("p")).getText();
        Assert.assertEquals(expected, actual);

    }
}
