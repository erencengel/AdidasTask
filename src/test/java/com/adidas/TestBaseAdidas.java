package com.adidas;

import com.adidas.utilities.ConfigurationReader;
import com.adidas.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBaseAdidas {

    protected WebDriver driver;
    protected String url;

    @BeforeMethod
    public void setUp(){

        driver = Driver.get();
        url = ConfigurationReader.get("url");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver,10);
        driver.get(url);

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
