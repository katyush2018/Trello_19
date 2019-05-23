package com.tr.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HeaderHelper {
    WebDriver wd;
    public HeaderHelper(WebDriver wd) {
        this.wd = wd;
    }

    protected void clickOnPlusButtonOnHeader() throws InterruptedException {
        Thread.sleep(10000);
        click(By.xpath("//span[@class='header-btn-icon icon-lg icon-house light']"));
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }


    public void clickOnTheHomeIconOnHeader() throws InterruptedException {
       // Thread.sleep(10000);
        WebDriverWait wait = new WebDriverWait(wd, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".icon-house")));
        click(By.cssSelector(".header-btn .icon-house"));
    }
}
