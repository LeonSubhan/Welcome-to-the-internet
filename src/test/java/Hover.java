import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Hover extends Base{
    @Test
    public void testHover() {
        System.out.println("Hover test started:");
        dr.findElement(By.linkText("Hovers")).click();
        WebElement element1 = dr.findElement(By.xpath("//div[@class='example']//div[1]//img[1]"));

        Actions actions = new Actions(dr);
        actions.moveToElement(element1).perform();

    }
}
