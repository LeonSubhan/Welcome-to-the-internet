import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DisappearingElements extends Base{
    @Test
    public void testDisappearingElements() {
        System.out.println("Disappearing Elements test started");
        dr.findElement(By.linkText("Disappearing Elements")).click();
        if (dr.findElement(By.linkText("Gallery")).isEnabled()){
            System.out.println("pass");
        }
        else {
            System.out.println("fail");
        }
    }
}
