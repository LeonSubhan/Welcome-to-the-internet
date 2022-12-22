import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ChallengingDOM extends Base {
    @Test
    public void testChallengingDOM() {
        System.out.println("Challenging DOM test started");
        dr.findElement(By.linkText("Challenging DOM")).click();
        String text = dr.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")).getText();
        System.out.println(text);
        String text1 = dr.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[2]")).getText();
        System.out.println(text1);
        String text2 = dr.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[3]")).getText();
        System.out.println(text2);
    }
}
