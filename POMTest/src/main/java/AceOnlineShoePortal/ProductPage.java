package AceOnlineShoePortal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    // Define Page locators:
    By exclusiveButton = By.xpath("/html/body/div[3]/div/div[1]/button");
    public void clickExclusiveButton(){
    doClick(exclusiveButton);

    }
}