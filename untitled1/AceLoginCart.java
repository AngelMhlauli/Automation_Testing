import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AceLoginCart {
    public static ChromeOptions options;
    public static WebDriver driver;

    @BeforeTest
    void setup() {
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/Resources/chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
    }

    @Test
    void testAddToCart() throws InterruptedException {
        // Perform login steps
        login("AngelMhlauli", "AngieM");

        // Navigate to Formal Shoes category and add to cart
        addToCart("Formal Shoes");

        // Verify item added to cart successfully
        WebElement cartMessageElement = driver.findElement(By.cssSelector(".alert-success"));
        String cartMessage = cartMessageElement.getText();
        Assert.assertTrue(cartMessage.contains("Added to Cart Successfully !!!"));
    }

    private void login(String username, String password) throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='menuToggle']/input")).click(); // Click menu
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='menu']/a[2]/li")).click(); // Click menu signup
        driver.findElement(By.id("usr")).sendKeys(username); // Enter username
        driver.findElement(By.id("pwd")).sendKeys(password); // Enter password
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='second_form']/input")).click(); // Click login
    }

    private void addToCart(String shoeType) throws InterruptedException {
        // Click on the desired shoe type (e.g., Formal Shoes, Sneakers, Sport)
        driver.findElement(By.linkText(shoeType)).click();
        Thread.sleep(2000);

        // Add to Cart
        driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[6]/button")).click(); // Click Add to Cart
    }
}