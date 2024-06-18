package AceOnlineShoePortalTest;
import AceOnlineShoePortal.CartPage;
import AceOnlineShoePortal.LoginPage;
import AceOnlineShoePortal.ProductPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.lang.reflect.InvocationTargetException;

public class ShoppingTestCases extends SetupClass {

    @Test
    public void verifyLoginPageTitleTest() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        String title = page.getInstance(LoginPage.class).getLoginPageTitle();
        System.out.println("Login page title is: " + title);
        String expectedTitle = "Ace Online Shoe Portal Login"; //expected title


    }

    @Test
    public void loginTest() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        if (page != null) {
            page.getInstance(LoginPage.class).doLogin("AngelMhlauli@gmail.com", "Test@1234");
        } else {
            // Handle the case where 'page' is not initialized
            Assert.fail("Page object is not initialized.");


                ChromeOptions options = new ChromeOptions();
                options.addArguments("--start-maximized"); // Maximize the browser window
                System.setProperty("Webdriver.chrome.driver",System.getProperty("user.dir") + "C:/Users/AMHLAUL/IdeaProjects/POMTest/src/test/Resources/chromedriver.exe"); // Chromedriver path
                WebDriver driver = new ChromeDriver(options);
                driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/FormalShoeslist.html"); // Cart page URL,
            }
    }
    @Test
    public void testAddShoeToCart() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        // Instantiate CartPage with the WebDriver instance
        // Add a shoe to the cart
        page.getInstance(ProductPage.class).clickExclusiveButton();
        page.getInstance(CartPage.class).addShoeToCart();
        //inserting assertion for string confirmation
        String SuccessMessage = page.getInstance(CartPage.class).getCartSuccessMessage();
Assert.assertEquals(SuccessMessage,"Added to Cart Successfully !!!","Response Text does not match");
    }
    }
