package com.bridgelabz.selenium.test;

import com.bridgelabz.selenium.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class FacebookLoginTest extends BaseClass {

    @Test
    public void facebookLogin_Success() throws InterruptedException {
        driver.get("https://www.facebook.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.findElement(By.id("email")).sendKeys("akashpakhare9999@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("");
        WebElement loginBtn =driver.findElement(By.name("login"));
        js.executeScript("arguments[0].click()",loginBtn);
        Thread.sleep(3000);

        String homeTittle = driver.getTitle();
        Assert.assertEquals("(5) Facebook",homeTittle);
        Thread.sleep(1000);

        js.executeScript("alert('Logged in  Successfully');");
        driver.switchTo().alert().accept();
        Thread.sleep(2000);

        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(2000);
    }

    @AfterTest
    public void tearDown(){
        driver.close();
    }
}
