package pages;

import app.Application;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class DetailedProductPage extends Page {

    public DetailedProductPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void open() {
        driver.get("http://localhost/litecart/en/rubber-ducks-c-1/subcategory-c-2/yellow-duck-p-1");
    }

    @FindBy(name="options[Size]")
    public List <WebElement> listQuantity;


    @FindBy(name="options[Size]")
    public WebElement quantity;

    @FindBy(css="option[value=\"Small\"]")
    public WebElement size;

    @FindBy(name="add_cart_product")
    public WebElement addToCartButton;

    @FindBy(css="a[href=\"http://localhost/litecart/en/checkout\"][class=\"link\"]")
    public WebElement checkoutButton;

    public void checkingCounter(String text) {
        WebElement counter = driver.findElement(By.cssSelector("span[class=\"quantity\"]"));
        wait.until(ExpectedConditions.textToBePresentInElement(counter, text));
    }



}
