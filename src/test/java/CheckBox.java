import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CheckBox extends Base{

    @Test
    public void testCheckBox() {

        String url = "https://the-internet.herokuapp.com/";
        dr.get(url);
        System.out.println("Main page is opened.");
        System.out.println("Starting checkbox test");
        dr.findElement(By.linkText("Checkboxes")).click();
        dr.findElement(By.xpath("//input[1]")).click();
        dr.findElement(By.xpath("//input[2]")).click();
    }
}
