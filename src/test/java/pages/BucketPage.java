package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class BucketPage extends Page {

    public BucketPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void open() {
        driver.get("http://localhost/litecart/en/checkout");
    }

    @FindBy(css="[name=\"remove_cart_item\"]")
    public WebElement removeButton;

    public void removingProducts() {
        Integer counterProductsUpdate = 2;
        while (counterProductsUpdate != 1){
            driver.findElement(By.cssSelector("[name=\"remove_cart_item\"]")).click();
            List<WebElement> listProductsAfter = driver.findElements(By.cssSelector("[style=\"text-align: center;\"]"));
            counterProductsUpdate = listProductsAfter.size();
            //wait until element will disappear
            wait.until(ExpectedConditions.stalenessOf(listProductsAfter.get(0)));
        }
    }

}
