import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class UploadFile extends Base{
    @Test
    public void testUploadFile() {
        String url = "https://the-internet.herokuapp.com/";
        dr.get(url);
        System.out.println("Main page is opened.");
        System.out.println("Starting upload file test");
        dr.findElement(By.linkText("File Upload")).click();
        dr.findElement(By.cssSelector("#file-upload")).sendKeys("/Users/leonsubhan/IdeaProjects/com.the-internet.herokuapp/some-file.txt");
        dr.findElement(By.cssSelector("#file-submit")).click();
    }
}
