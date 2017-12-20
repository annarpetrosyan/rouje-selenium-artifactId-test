import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage {
    private final String baseUrl= "http://www.rouge.am/";
    private final String searchInputSelector = "input[id=search]";
    private final String searchButtonSelector = "button#basic-search";
    private final String resultMessageAfterSearch = "div.page-title>h1";

    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void goBasePage(){
        goBasePage(baseUrl);
    }

    public void clickOnSearchButton(){
        click(searchButtonSelector);
        wait.until(ExpectedConditions.textToBePresentInElement(find(resultMessageAfterSearch),"Search Results For 'Moschino'"));
    }

    public void fillSearch(String value){
        fill(searchInputSelector,value);
    }
}

