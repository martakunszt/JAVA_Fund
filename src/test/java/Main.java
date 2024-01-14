import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; // imports Selenium webdriver from dependencies
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; //adds chrome webdriver

public class Main {
    public static void main(String[] args) {

       WebDriver driver = new ChromeDriver(); //starts internet browser
       driver.get("file:///Users/martakunsztowicz/Desktop/Postgraduate/examplePage/index.html"); //void procedure
        System.out.println("Webpage address is :" + driver.getCurrentUrl());
        System.out.println("The title of the page is: " + driver.getTitle());
        //driver.quit(); //void procedure -> no output

        WebElement firstParagraph = driver.findElement(By.tagName("p")); //getting text
        String paraText = firstParagraph.getText(); //since p is a String, then we need to get this
        System.out.println(paraText);
    }
}
