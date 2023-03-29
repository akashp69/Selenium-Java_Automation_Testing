package com.bridgelabz.selenium.test;

import com.bridgelabz.selenium.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ActionsFacebookTest extends BaseClass {

    @Test
    public void actionClass_FacebookLoginTest() throws InterruptedException {
        driver.get("https://www.facebook.com/");
        Actions actions=new Actions(driver);

        WebElement email = driver.findElement(By.id("email"));
        Action seriesOfActions =actions.moveToElement(email).click().keyDown(email, Keys.SHIFT)
                .sendKeys(email,"Akash")
                .keyUp(email, Keys.SHIFT)
                .doubleClick(email)
                .build();

        seriesOfActions.perform();

        Thread.sleep(1000);
        WebElement loginBtn = driver.findElement(By.name("login"));
        actions.moveToElement(loginBtn).click().perform();
        Thread.sleep(1000);
    }

    @AfterTest
    public void tearDown(){
        driver.close();
    }
}
