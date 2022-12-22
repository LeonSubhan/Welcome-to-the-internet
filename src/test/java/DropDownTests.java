import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DropDownTests extends Base {

    @Test
    public void checkBoxTest (){

        String url = "https://the-internet.herokuapp.com/";
        dr.get(url);
        System.out.println("Main page is opened.");
        System.out.println("Starting checkbox test");


        dr.findElement(By.linkText("Checkboxes")).click();
        dr.findElement(By.xpath("//form[@id=\"checkboxes\"]/input[1]")).click();

    }
}
