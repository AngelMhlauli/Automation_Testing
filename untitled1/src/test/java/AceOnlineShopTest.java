import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.w3c.dom.html.HTMLInputElement;

import java.time.Instant;

public class AceOnlineShopTest  {
    public static ChromeOptions options;
    public static WebDriver driver;
    @BeforeTest
    void Setup(){
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/src/test/Resources/chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
    }

    @Test
    void teststeps() throws InterruptedException {
        driver.findElement(By.xpath(" //*[@id=\"menuToggle\"]/input")).click();//menu path
        Thread.sleep(2000);
        driver.findElement(By.xpath(" //*[@id=\"menu\"]/a[2]/li")).click(); //menu signup path

        driver.findElement(By.xpath(" //*[@id=\"usr\"]")).sendKeys("AngelMhlauli");//username
        driver.findElement(By.xpath(" //*[@id=\"pwd\"]")).sendKeys("AngieM");//password
        Thread.sleep(2000);
        driver.findElement(By.xpath(" //*[@id=\"second_form\"]/input")).click();//login path
        WebElement webElement = driver.findElement(By.xpath(" //*[@id=\"ShoeType\"]"));
        Thread.sleep(2000);
        String actualFirstCategory = webElement.getText();
        String expectedFirstCategory = "Click Exclusive Collection";
        driver.findElement(By.xpath( "/html/body/div[3]/div/div[1]/button")).click();//  formal shoe path  /html/body/div[3]/div/div[1]/button
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[6]/button")).click();//  add to cart path
        Thread.sleep(2000);




         //Verify that the item has been added to the cart
        WebElement cartMessageElement = driver.findElement(By.xpath("/html/body/center[1]/h1"));
        String cartMessage = cartMessageElement.getText();
       Assert.assertTrue(cartMessage.contains("Added to Cart Successfully !!!"));




    }
}