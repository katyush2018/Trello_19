package com.tr.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TeamHelper {
    WebDriver wd;
    public TeamHelper(WebDriver wd) {
        this.wd = wd;
    }

    public void selectCreateTeamFromDropDown() {
       click(By.cssSelector(".js-new-org"));
    }

    public void fillTeamCreationForm(String teamName, String desc) {
        //name
       type(By.name("displayName"), teamName);
       type(By.name("desc"), desc);
    }

    public void submitTeamCreation() {
       click(By.cssSelector("[type=submit]"));
    }

    public String getTeamName(){
        return wd.findElement(By.cssSelector("h1.u-inline")).getText();
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }

    public void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }
}
