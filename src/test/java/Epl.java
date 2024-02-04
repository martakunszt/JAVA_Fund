import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.assertj.core.api.Assertions; //adding assertions library

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Epl {
    private static WebDriver driver;
    String sut = "http://e.pl/";
    @BeforeAll
    static void setupClass(){
        WebDriverManager.chromedriver().setup(); //resolves any conflicts with drivers and browser's version
        System.out.println("Driver found");
    }

    @BeforeEach
    void setup(){
        driver = WebDriverManager.chromedriver().create(); //creates browser instance
    }

    @AfterEach
    void tearDown(){
        driver.quit();
    }

   // @AfterAll //used in big projects

    @Test
    @Order(1)
    public void checkURL(){
        driver.get(sut);
        String expectedURL = "http://e.pl/";
        String currentURL = driver.getCurrentUrl();
        Assertions.assertThat(currentURL).as("Invalid URL").isEqualTo(expectedURL); //only prints when  exected=/=actual
    }

    @Test
    @Order(2)
    public void openPage() {
        driver.getTitle();
        System.out.println("Welcome to the e.pl page");
        System.out.println("Second test: finished");
    }

    // clicking on the menu
    @Test
    @Order(3)
    public void clickMenu(){
        driver.get(sut);

        WebElement emailButton = driver.findElement(By.cssSelector("a[title=Email]"));
        emailButton.click();
        System.out.println("Page title: " + driver.getTitle());

       WebElement domainButton = driver.findElement(By.cssSelector("a[title=Domeny]"));
        domainButton.click();
        System.out.println("Page title: " + driver.getTitle());

        WebElement hostButton = driver.findElement(By.cssSelector("a[title=Hosting]"));
        hostButton.click();
        System.out.println("Page title: " + driver.getTitle());
        System.out.println("First test: finished");
    }
}
