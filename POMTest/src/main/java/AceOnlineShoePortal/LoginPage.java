package AceOnlineShoePortal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    // Define Page locators:
    By emailId = By.id("usr");
    By password = By.id("pwd");
    By loginButton = By.xpath("//*[@id='second_form']/input");

    // Page actions
    public String getLoginPageTitle() {
        return driver.getTitle();
    }

    public void doLogin(String username, String pwd) {
        doSendKeys(emailId, username);
        doSendKeys(password, pwd);
        doClick(loginButton);
    }
}