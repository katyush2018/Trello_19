package com.tr.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager{
    private  BoardHelper boardHelper ;
    WebDriver wd;

    public void start() {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wd.manage().window().maximize();

        openSite("https://trello.com/");
        login("shinya@bk.ru", "12345.com");
        boardHelper = new BoardHelper(wd);

    }


    public void click(By locator) {
        wd.findElement(locator).click();
    }

    public void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }
    


    protected void clickOnPlusButtonOnHeader() throws InterruptedException {
        Thread.sleep(5000);
       click(By.cssSelector("[aria-label='Создать доску или организацию']"));

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

    public String getTeamName() throws InterruptedException {
        return wd.findElement(By.cssSelector("h1.u-inline")).getText();
    }

    public BoardHelper getBoardHelper() {
        return boardHelper;
    }
}
