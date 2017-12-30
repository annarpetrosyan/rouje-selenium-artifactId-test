import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MainPage extends BasePage {
    private final String baseUrl= "http://www.rouge.am/";
    private final String searchInputSelector = "input[id=search]";
    private final String searchButtonSelector = "button#basic-search";
    private final String resultMessageAfterSearch = "div.page-title>h1";
    private final String comboboxSelect = "div[class=pull-right]>select";


    public MainPage(WebDriver webDriver) {
        super(webDriver);
//        goBasePage(baseUrl);

    }

    public void goBasePage(){
        goBasePage(baseUrl);
    }

    public void clickOnSearchButton(){
        click(searchButtonSelector);
//        wait.until(ExpectedConditions.textToBePresentInElement(find(resultMessageAfterSearch),"Search Results For 'Moschino'"));
    }

    public void fillSearch(String value){
        fill(searchInputSelector,value);
    }


    public WebElement getCombobox(){
        return find(By.className(comboboxSelect));
    }

    public List<WebElement> getComboboxOptions(){
        return  getCombobox().findElements(By.tagName("option"));
    }

    public void selectValue(String value){
        List<WebElement> elements = getComboboxOptions();
        for (WebElement element:elements){
            if (element.getText().equals(value)){
                element.click();
            }
        }
    }
}

