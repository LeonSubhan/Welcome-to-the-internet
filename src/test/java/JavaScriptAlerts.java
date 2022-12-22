import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class JavaScriptAlerts extends Base{
    @Test
    public void testJavaScriptAlerts() {
        dr.findElement(By.linkText("JavaScript Alerts")).click();
        dr.findElement(By.cssSelector("button[onclick='jsAlert()']")).click();
        dr.switchTo().alert().accept();
        System.out.println(dr.findElement(By.id("result")).getText());
        dr.findElement(By.cssSelector("button[onclick='jsConfirm()']")).click();
        dr.switchTo().alert().dismiss();
        System.out.println(dr.findElement(By.xpath("//p[@id=\"result\"]")).getText());
        dr.findElement(By.cssSelector("button[onclick='jsPrompt()']")).click();
        Alert alert = dr.switchTo().alert();
        alert.sendKeys("Leon");
        alert.accept();
        System.out.println(dr.findElement(By.id("result")).getText());
        

    }
}
