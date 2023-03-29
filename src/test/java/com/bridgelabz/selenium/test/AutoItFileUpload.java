package com.bridgelabz.selenium.test;

import com.bridgelabz.selenium.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class AutoItFileUpload extends BaseClass {

    @Test
    public void fileUpload() throws InterruptedException , IOException {
        driver.get("https://www.freepdfconvert.com/pdf-to-word");
        Thread.sleep(2000);

        WebElement chooseBTn =driver.findElement(By.xpath("//span[contains(text(),'Choose PDF file')]"));
        chooseBTn.click();

        Runtime.getRuntime().exec("C:\\AutoIT\\CQATesting.exe");
        Thread.sleep(1000);
        System.out.println("File SuccessFully Uploaded !!");
    }

    @AfterTest
    public void tearDown(){
        driver.close();
    }
}
