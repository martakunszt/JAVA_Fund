import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; // imports Selenium webdriver from dependencies
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; //adds chrome webdriver
import java.util.List;

public class Main {
    public static void main(String[] args) {

       WebDriver driver = new ChromeDriver(); //starts internet browser
       driver.get("file:///Users/martakunsztowicz/IdeaProjects/Java_Fund/src/index/index.html"); //void procedure
        System.out.println("Webpage address is :" + driver.getCurrentUrl());
        System.out.println("The title of the page is: " + driver.getTitle());
        //driver.quit(); //void procedure -> no output

        WebElement firstParagraph = driver.findElement(By.tagName("p")); //getting text
        String paraText = firstParagraph.getText(); //since p is a String, then we need to get this
        System.out.println(paraText);

        List<WebElement> listP = driver.findElements(By.tagName("p")); //will print all paragraphs
       for (WebElement i:listP) { //i - iterating on a list, basically 'i' is just a variable that iterates on our listP and sout first p, than it does the same thing on the other 'p'
           System.out.println(i.getText()); //this prints every paragraph from the listP
       }

       WebElement thirdParagraph = driver.findElement(By.name("newUniqueName")); //find element by name attribute
        System.out.println("This is our third paragraph, find by name attribute: "  + thirdParagraph.getText());

        WebElement magentaParagraph = driver.findElement(By.id("firstParagraph")); //find element by id attribute
        System.out.println("This is our first magenta paragraph, find by id attribute: " + magentaParagraph.getText());

        WebElement secondParagraph = driver.findElement(By.className("paragraph"));
        System.out.println("This is our second paragraph, find element by class: " + secondParagraph.getText() ); //find by class attribute

        WebElement headingXpath = driver.findElement(By.xpath("/html/body/h2")); //finding element by xPath absolute attribute
        System.out.println("This is header found by xpath attribute: " + headingXpath.getText());

        WebElement relXpath = driver.findElement(By.xpath("//h2[@class='relativePath']")); //finding element by xPath relative attribute
        System.out.println("This is header found by xpath relative attribute: " + relXpath.getText());

        WebElement myAtt = driver.findElement(By.cssSelector("h5[data-test-id='heading']"));
        System.out.println("Finding element using my own HTML attribute: " + myAtt.getText()); //for some reason this doesn't work

        driver.quit();

    }
}
