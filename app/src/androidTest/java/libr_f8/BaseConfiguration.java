package libr_f8;

import com.microsoft.appcenter.appium.EnhancedAndroidDriver;
import com.microsoft.appcenter.appium.Factory;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

import io.appium.java_client.remote.MobileCapabilityType;

/**
 * Created by keya on 12/24/17.
 */

public class BaseConfiguration {
    EnhancedAndroidDriver driver;
    public EnhancedAndroidDriver loadDriver()throws  Exception
    {


        DesiredCapabilities cap=new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");

        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.VERSION, "4.2.2");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
        cap.setCapability(MobileCapabilityType.APP_PACKAGE, "com.facebook.f8");
        cap.setCapability(MobileCapabilityType.APP_ACTIVITY, "com.facebook.f8.MainActivity");
        driver = Factory.createAndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);

        if (driver != null) {
            System.out.print("Not null");
        }
        else{
            System.out.print("null");
        }
        return driver;
    }
}
