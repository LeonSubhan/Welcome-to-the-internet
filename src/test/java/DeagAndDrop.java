import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DeagAndDrop extends Base{
    @Test
    public void testDragAndDrop() {
        String url = "https://the-internet.herokuapp.com/";
        dr.get(url);
        System.out.println("Main page is opened.");
        System.out.println("Starting drag and drop test");

        dr.findElement(By.linkText("Drag and Drop")).click();
        dr.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        WebElement A = dr.findElement(By.cssSelector("#column-a"));
        WebElement B = dr.findElement(By.cssSelector("#column-b"));
        Actions actions = new Actions(dr);
        Actions actions1 = actions.dragAndDrop(A, B);
        actions1.perform();
    }
}
