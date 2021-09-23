package com.adidas.test;

import com.adidas.TestBaseAdidas;
import com.adidas.pages.AdidasHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class BasicNavigationwithTestNG extends TestBaseAdidas {

    @Test
    public void testNavigation() throws InterruptedException {

        //WebElement locatorLaptop = driver.findElement(By.xpath("//a[.='Laptops']"));
        new AdidasHomePage().Laptops.click();
        Thread.sleep(3000);
        String title = driver.getTitle();
        System.out.println("title = " + title);

    }

}
