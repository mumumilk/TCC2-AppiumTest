package com.mycompany.appiumteste;

import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 *
 * @author mist
 */
public class Principal {
    
    public static void main(String[] args) throws Exception{
        DesiredCapabilities capabilities = new DesiredCapabilities();
        
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("browserName", "Chrome");
        
        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.100:4723/wd/hub"), capabilities);
        
        driver.get("http://squad5.eastus.cloudapp.azure.com:82/login");
        
        WebElement elem = driver.findElement(By.id("header-img"));
        System.out.println(elem.getAttribute("src"));
    }
    
    
    
}
