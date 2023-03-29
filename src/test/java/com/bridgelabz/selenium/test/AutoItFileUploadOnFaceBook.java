package com.bridgelabz.selenium.test;

import com.bridgelabz.selenium.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class AutoItFileUploadOnFaceBook extends BaseClass {

    @Test
    public void fileUpload_OnFacebook() throws InterruptedException, IOException {
        driver.get("https://www.facebook.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.findElement(By.id("email")).sendKeys("akashpakhare9999@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("");
        WebElement loginBtn = driver.findElement(By.name("login"));
        js.executeScript("arguments[0].click()", loginBtn);

        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,100)");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/i[1]")).click();
        Thread.sleep(2000);

        Runtime.getRuntime().exec("C:\\AutoIT\\facebook_photo.exe");
        Thread.sleep(1000);
        System.out.println("File SuccessFully Uploaded !!");
    }
    @AfterTest
    public void tearDown(){
        driver.close();
    }


}
