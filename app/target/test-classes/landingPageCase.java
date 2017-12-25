package testSteps;


import com.microsoft.appcenter.appium.EnhancedAndroidDriver;
import com.microsoft.appcenter.appium.Factory;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;

import libr_f8.BaseConfiguration;
import serviceImplementation.landingPageServiceImpl;
import serviceInterface.landingPage;


/**
 * Created by keya on 12/24/17.
 */

public class landingPageCase {
    private BaseConfiguration baseConfig = new BaseConfiguration();
    private static EnhancedAndroidDriver driver = null;
    landingPage pageL = new landingPageServiceImpl();

    @Rule
    public TestWatcher watcher = Factory.createWatcher();

    @Before
    public void initDriver() throws Exception {
        driver = baseConfig.loadDriver();
    }

    @Test
    public void textValidation( ) throws Exception
    {
        pageL.textValidation( driver );

    }

    @After
    public void TearDown(){
        driver.label("Stopping App");
        driver.quit();
    }
}