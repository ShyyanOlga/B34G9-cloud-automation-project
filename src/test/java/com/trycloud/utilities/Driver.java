package com.trycloud.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {


    // Create a privet constructor to restrict access to this object
    private Driver(){}

    // Creat WebDriver privet and static -> to close access from outside the class.
    //We are make it static, to use it in static method
    // private static WebDriver driver; // default value = null
/*
InheritableThreadLocal<WebDriver>driverPool will wrap out driver object and multiply it giving us a pool of the object we provided, in our case Driver. so each time when new thread is created it will go to the pool and get one Driver for us.
 */
    private static InheritableThreadLocal<WebDriver>driverPool = new InheritableThreadLocal<>();

    // Creat a public method to reach our privet webDriver the logic of this method will return the same driver instance one we call it.
    //If instance does not exist it will create it first and then return always the same instance
    public static WebDriver getDriver(){



        if(driverPool.get() == null){

            //We will read our browseType from configuration.properties file
            //This way, we can control which browser is opened from outside our code.

            String browserType = ConfigurationReader.getProperties("browser");

            switch (browserType){
                case"chrome":
                    driverPool.set(new ChromeDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;
                case"firefox":
                    driverPool.set(new FirefoxDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;
            }
        }
        return driverPool.get();
    }

    public static void closeDriver(){

        if(driverPool.get() != null){
 /*
     This line will terminate the current existing driver completely. It will not exist going forward.
             */
            driverPool.get().quit();

 /*
     We assign the value back to "null" so that my "singleton" can creat a newer one if needed
             */
            driverPool.remove();
        }
    }


}
