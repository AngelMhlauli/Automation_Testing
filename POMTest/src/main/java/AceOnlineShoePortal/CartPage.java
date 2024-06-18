package AceOnlineShoePortal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class CartPage extends BasePage {

    // Constructor
    public CartPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    By addToCartButton = By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[6]/button");//add to cart button path
    By cartSuccessMessage = By.xpath("/html/body/center[1]/h1");//Cart message path

    // Method to add a shoe to the cart
    public void addShoeToCart() {
        // Use the WebDriver instance from the base class to find the element
        doClick(addToCartButton);
    }

    // Method to get the success message after adding to cart
    public String getCartSuccessMessage() {// ADDED CODE
        return doGetText(cartSuccessMessage);
    }
}
