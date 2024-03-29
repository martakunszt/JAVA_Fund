import io.github.bonigarcia.wdm.WebDriverManager; //importing WebDriver Manager
import org.junit.jupiter.api.*; //importing Jupiter
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.assertj.core.api.Assertions; //adding assertions library
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration; //to add wait/timeouts etc

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
        Assertions.assertThat(currentURL).as("Invalid URL").isEqualTo(expectedURL); //only prints when  expected=/=actual
    }

    @Test
    @Order(2)
    public void checkDomain(){
        driver.get(sut);
        String[] domainsToCheck = {"programming", "testing", "coding"};

        String expectedUrl = "http://e.pl/";
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertThat(currentUrl).as("Invalid URL").isEqualTo(expectedUrl);

        WebElement domainClick = driver.findElement(By.xpath("/html/body/table/tbody/tr[5]/td/table/tbody/tr[1]/td[1]/table[2]/tbody/tr[4]/td/table/tbody/tr/td/table/tbody/tr[3]/td/input"));
        //WebElement domainClick = driver.findElement(By.xpath("//input[@name='image']"));
        domainClick.click();
        String expectedUrlDomain = "http://e.pl/domain.html";
        String currentUrlDomain = driver.getCurrentUrl();
        Assertions.assertThat(currentUrlDomain).as("Invalid URL").isEqualTo(expectedUrlDomain);

        for(int i = 0; i < domainsToCheck.length; i++) {

            WebElement fieldDomain = driver.findElement(By.name("DomainName"));
            fieldDomain.sendKeys(domainsToCheck[i]);

            WebElement checkBox = driver.findElement(By.name("Domain[1]"));
            //negation
            if (!checkBox.isSelected()) {
                checkBox.click();
            }
            WebElement check = driver.findElement(By.xpath("/html/body/table/tbody/tr[5]/td/table/tbody/tr/td[3]/table/tbody/tr[2]/td/table[2]/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[3]/td[2]/input"));
            check.click();

            //WebElement newSearch = driver.findElement(By.xpath("/html/body/table/tbody/tr[5]/td/table/tbody/tr/td[3]/table/tbody/tr[2]/td/table[2]/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/input[2]"));
           // WebElement newSearch = driver.findElement(By.cssSelector("input[src = '/file/generated_02045fad7a6678ea127995bbb0a969b2.gif']"));
            //newSearch.click();



           // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //implicit wait
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5)); //explicit wait
            WebElement newSearch = wait.until((ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[src = '/file/generated_02045fad7a6678ea127995bbb0a969b2.gif']"))));
            newSearch.click();
        }
    }


    @Test
    @Order(3)
    public void openPage() {
        driver.getTitle();
        System.out.println("Welcome to the e.pl page");
        System.out.println("Second test: finished");
    }

    // clicking on the menu
    @Test
    @Order(4)
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

    @Test
    @Order(5)
   public void dropDown(){
        driver.get(sut);
        Select select = new Select(driver.findElement(By.name("Domain")));
        String optionToSelect = "a.e.pl";
        select.selectByVisibleText(optionToSelect);

        WebElement login = driver.findElement(By.name("CheckName"));
        login.sendKeys("info");

        WebElement checkLogin = driver.findElement(By.xpath("/html/body/table/tbody/tr[5]/td/table/tbody/tr[1]/td[1]/table[1]/tbody/tr[4]/td/table/tbody/tr/td/table/tbody/tr[3]/td/input"));
        checkLogin.click();
    }


}
