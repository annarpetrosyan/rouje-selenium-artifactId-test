import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {
    private final String baseUrl= "http://www.rouge.am/";
    private final String searchInputSelector = "input[id=search]";

    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void goBasePage(){
        goBasePage(baseUrl);
    }

    public void clickOn(){
        click(searchInputSelector);
    }
}

