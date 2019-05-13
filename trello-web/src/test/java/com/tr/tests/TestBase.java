package com.tr.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

public class TestBase {

    protected  ApplicationManager app = new ApplicationManager();

    @BeforeTest
    public void setUp() {
        app.start();
    }

    @AfterClass
    public void tearDown() {
        app.stop();
    }

}
