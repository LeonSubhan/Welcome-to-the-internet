import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class WelcomePage extends Base{
    @Test
    public void testWelcomePage() {
        List<WebElement> list = dr.findElements(By.xpath("//*[@id=\"content\"]/ul/li"));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i);
            String name = list.get(i).getText();
            System.out.println(name);
        }
    }
}
