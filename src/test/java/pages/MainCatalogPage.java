package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainCatalogPage extends Page {

    public MainCatalogPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void open() {
        driver.get("http://localhost/litecart/");
    }

    @FindBy(css="li[class=\"product column shadow hover-light\"]")
    public List <WebElement> products;

}
