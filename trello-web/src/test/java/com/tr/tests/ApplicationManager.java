package com.tr.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    TeamHelper teamHelper;
    BoardHelper boardHelper ;
    HeaderHelper header;
    WebDriver wd;



    public void start() {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wd.manage().window().maximize();

        openSite("https://trello.com/");
        login("shinya@bk.ru", "12345.com");
        boardHelper = new BoardHelper(wd);
        teamHelper = new TeamHelper(wd);
        header = new HeaderHelper(wd);

    }


    public void click(By locator) {
        wd.findElement(locator).click();
    }

    public void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }
    


    public void openSite(String url) {
        wd.get(url);
    }

    public void login(String userName, String password) {
        //login
        //clickOn loginButton
       click(By.cssSelector("[href='/login']"));
        //fill login form
       type(By.name("user"), userName);
       type(By.name("password"), password);

       click(By.id("login"));
    }

    public void stop() {
        wd.quit();
    }

    public BoardHelper getBoardHelper() {
        return boardHelper;
    }

    public TeamHelper getTeamHelper() {
        return teamHelper;
    }

    public HeaderHelper getHeader() {
        return header;
    }
}
