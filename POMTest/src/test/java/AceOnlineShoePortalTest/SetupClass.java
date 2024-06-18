package AceOnlineShoePortalTest;

import AceOnlineShoePortal.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

public class SetupClass {
    public WebDriver driver;
    public WebDriverWait wait;
    public Page page;

   @BeforeClass
    public void setUp() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("WebDriver.chrome.driver",System.getProperty("user.dir") + "C:/Users/AMHLAUL/IdeaProjects/POMTest/src/test/Resources/chromedriver.exe"); // Chromedriver path
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/SignIn.html"); // Website URL
        try {
            Thread.sleep(6000);//Pause execution time with 6 seconds
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        //Create the object of page class:Instantiate Page Class
          page = new Page(driver, wait);
        }

//@AfterClass
//public void tearDown(){
//driver.quit();
//}
    }

