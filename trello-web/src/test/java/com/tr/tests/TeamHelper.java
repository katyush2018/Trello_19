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

    public void fillTeamCreationForm(Team team) {
        //name
       type(By.name("displayName"), team.getTeamName());
        type(By.name("desc"), team.getDesc());
    }

    public void submitTeamCreation() {
       click(By.cssSelector("[type=submit]"));
    }

    public String getTeamName(){
        return wd.findElement(By.cssSelector("h1")).getText();
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
