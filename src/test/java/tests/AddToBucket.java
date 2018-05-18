package tests;

import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Set;

import static org.junit.Assert.assertTrue;

@RunWith(DataProviderRunner.class)
public class AddToBucket extends TestBase{

    @Test
    public void workWithBucket() {

        app.workWithBucket();




    }

}
