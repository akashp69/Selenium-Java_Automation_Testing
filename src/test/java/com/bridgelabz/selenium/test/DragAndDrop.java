package com.bridgelabz.selenium.test;


import com.bridgelabz.selenium.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragAndDrop extends BaseClass {

    @Test
    public void dragAndDrop() throws InterruptedException {
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));

        WebElement dragElement =driver.findElement(By.id("draggable"));
        Actions actions=new Actions(driver);
        actions.clickAndHold(dragElement).perform();

        WebElement dropElement =driver.findElement(By.id("droppable"));
        actions.dragAndDrop(dragElement,dropElement).perform();
        Thread.sleep(2000);

        driver.switchTo().parentFrame();
        actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
        Thread.sleep(1000);
        actions.keyUp(Keys.CONTROL).sendKeys(Keys.END).perform();

    }

    @AfterTest
    public void driverTearDown(){

        driver.close();
    }

}
