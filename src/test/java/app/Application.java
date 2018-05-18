package app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.*;

import java.util.Set;

public class Application {

    private WebDriver driver;
    private AdminPanelLoginPage adminPanelLoginPage;
    private MainCatalogPage mainCatalogPage;
    private DetailedProductPage detailedProductPage;
    private BucketPage bucketPage;

    public Application() {
        driver = new ChromeDriver();
        adminPanelLoginPage = new AdminPanelLoginPage(driver);
        mainCatalogPage = new MainCatalogPage(driver);
        detailedProductPage = new DetailedProductPage(driver);
        bucketPage = new BucketPage(driver);
    }

    /*public void quit() {
        driver.quit();
    }*/

    public void workWithBucket() {
        for(int i = 1; i < 4; i++) {
            mainCatalogPage.open();
            mainCatalogPage.products.get(0).click();
            if(!detailedProductPage.listQuantity.isEmpty()){
                detailedProductPage.quantity.click();
                detailedProductPage.size.click();
            }

            detailedProductPage.addToCartButton.click();

            String text = i + "";
            detailedProductPage.checkingCounter(text);
        }

        detailedProductPage.checkoutButton.click();
        bucketPage.removingProducts();
    }
}