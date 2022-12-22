
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.openqa.selenium.By.*;


public class ContextMenu extends Base{
    @Test
    public void testContextMenu() {
        String url = "https://the-internet.herokuapp.com/";
        dr.get(url);
        System.out.println("Main page is opened.");
        System.out.println("Starting right Click test");
        dr.findElement(By.linkText("Context Menu")).click();
        Actions actions = new Actions(dr);
        WebElement element;
        element = dr.findElement(By.cssSelector("#hot-spot"));
        actions.contextClick(element).perform();
        dr.switchTo().alert().accept();
    }
}
