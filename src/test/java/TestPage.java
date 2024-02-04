import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;


public class TestPage
{
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        String sut = "file:///Users/martakunsztowicz/IdeaProjects/Java_Fund/src/web-template/index.html";
        driver.get(sut);

        System.out.println("The current URL is: " + driver.getCurrentUrl());
        System.out.println("The title is: " + driver.getTitle());

        WebElement findDiv = driver.findElement(By.tagName("div"));
        System.out.println(findDiv.getText());

        List<WebElement> divObjs = driver.findElements(By.tagName("div"));

        int counter = 1;
        for (WebElement object:divObjs){
            System.out.println(counter);
            System.out.println("This is a tag name: " + object.getTagName());
            System.out.println("This is a name attribute: " + object.getAttribute("name"));
            System.out.println("This is a class attribute: " + object.getAttribute("class"));
            System.out.println("This is an id: " + object.getAttribute("id"));
            System.out.println("-------------------------------------------------------------------");
            counter++;
        }

        driver.quit();
    }
}
