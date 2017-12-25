package serviceImplementation;

import com.microsoft.appcenter.appium.EnhancedAndroidDriver;

import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import libr_f8.UIElementsContants;
import libr_f8.XpathConstants;
import serviceInterface.landingPage;


/**
 * Created by keya on 12/24/17.
 */

public class landingPageServiceImpl implements landingPage {
    @Override
    public void textValidation(EnhancedAndroidDriver driver) {

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        String a = driver.findElement(By.xpath(XpathConstants.text_validation.appName )).getText();
        System.out.print( a );
        Assert.assertEquals(UIElementsContants.appName, driver.findElement(By.xpath(XpathConstants.text_validation.appName )).getText());
        Assert.assertEquals( UIElementsContants.devConDate,driver.findElement( By.xpath( XpathConstants.text_validation.devConDate  ) ).getText() );
    }
}
