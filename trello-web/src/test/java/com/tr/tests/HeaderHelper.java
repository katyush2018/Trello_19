package com.tr.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderHelper {
    WebDriver wd;
    public HeaderHelper(WebDriver wd) {
        this.wd = wd;
    }

    protected void clickOnPlusButtonOnHeader() throws InterruptedException {
        Thread.sleep(5000);
        click(By.cssSelector("[aria-label='Создать доску или организацию']"));
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }


}
