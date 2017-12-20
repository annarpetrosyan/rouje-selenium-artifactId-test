import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    private  WebDriver driver;

    public BasePage(WebDriver webDriver){
        this.driver=webDriver;
    }

    public void goBasePage(String baseUrl){
         driver.get(baseUrl);
    }
    // implementation of "find" function with all types of locators

    /**
     *
     * @param locator By
     */
    public WebElement find(By locator){
        return driver.findElement(locator);
    }
    /**
     *
     * @param cssSelector String
     * @return
     */
    public WebElement find(String cssSelector){
        return find(By.cssSelector(cssSelector));
    }

    // implementation of "click" function with all types of locators

    /**
     *
     * @param webElement WebElement
     */
    public void click(WebElement webElement){
        webElement.click();
    }

    /**
     *
     * @param locator By
     */
    public void click(By locator){
        click(find(locator));
    }

    /**
     *
     * @param cssSelector String
     */
    public void click(String cssSelector){
        click(find(cssSelector));
    }

    /**
     *
     * @param webElement WebElement
     * @param value
     */
    public void fill(WebElement webElement, String value){
        webElement.sendKeys(value);
    }

    /**
     *
     * @param locator By
     * @param value
     */
    public void fill(By locator, String value) {
        fill(find(locator), value);
    }

    /**
     *
     * @param cssLocator String
     * @param value
     */
     public void fill(String cssLocator, String value){
        find(cssLocator).sendKeys(value);
    }
}
