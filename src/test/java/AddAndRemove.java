import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class AddAndRemove extends Base{

    @Test
    public void addAndRemove(){

        String url = "https://the-internet.herokuapp.com/";
        dr.get(url);
        System.out.println("Main page is opened.");
        System.out.println("Starting add and remove test");
        dr.findElement(By.linkText("Add/Remove Elements")).click();
        dr.findElement(By.tagName("button")).click();
        dr.findElement(By.xpath("//button[contains(text(),'Delete')]")).click();



    }
}
