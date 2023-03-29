package com.bridgelabz.selenium.test;

import com.bridgelabz.selenium.base.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class FindFramesByJsExecutor extends BaseClass {

    @Test
    public void findingFrames_UsingJsExecutor() throws InterruptedException {
        driver.get("https://www.guru99.com/locators-in-selenium.html");
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Integer noOfFrames =Integer.parseInt(js.executeScript("return window.length").toString());
        System.out.println("Number of Frames :"+noOfFrames);
    }

    @AfterTest
    public void tearDown(){

        driver.close();
   }
}
