package AceOnlineShoePortal;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.reflect.InvocationTargetException;

public class Page {
public static WebDriver driver;
public WebDriverWait wait;

//Page class constructor:
public Page(WebDriver driver, WebDriverWait wait){
this.driver = driver;
this.wait = wait;

   }

    public Page() {

    }

    public Page(WebDriver driver) {
    }

    //Create a method with Java Generics and return a new page
public <TPage extends BasePage> TPage getInstance(Class<TPage> pageClass) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
    try {
        return pageClass.getDeclaredConstructor(WebDriver.class, WebDriverWait.class).newInstance(this.driver, this.wait);
    } catch (Exception e) {
        e.printStackTrace();
        return null;
    }
    }



}


