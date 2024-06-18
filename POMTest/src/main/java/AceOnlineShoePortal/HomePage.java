package AceOnlineShoePortal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends Page {

    // Constructor
    public HomePage(WebDriver driver) {
        super(driver);
    }



    // Method to navigate to the catalog page
    public void goToCatalogPage() {
        WebElement catalogLink = driver.findElement(By.linkText("Catalog")); // Assuming there's a link with text "Catalog"
        catalogLink.click(); // Click on the "Catalog" link to navigate to the catalog page
    }

}
