import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown extends Base {
    @Test
    public void testDropDown() {
        String url = "https://the-internet.herokuapp.com/";
        dr.get(url);
        System.out.println("Main page is opened.");
        System.out.println("Starting drop down test");
        dr.findElement(By.linkText("Dropdown")).click();
        Select option = new Select(dr.findElement(By.cssSelector("#dropdown")));
        option.selectByVisibleText("Option 1");
        Select option1 = new Select(dr.findElement(By.cssSelector("#dropdown")));
        option1.selectByIndex(2);
    }
}
