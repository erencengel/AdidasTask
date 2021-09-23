package com.adidas.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdidasBasicNavigation {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/index.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement locatorLaptop = driver.findElement(By.xpath("//a[.='Laptops']"));
        wait.until(ExpectedConditions.elementToBeClickable(locatorLaptop));
        locatorLaptop.click();
        Thread.sleep(3000);
        String title = driver.getTitle();
        System.out.println("title = " + title);
        driver.close();


    }

}
