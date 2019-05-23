package com.tr.tests;

import org.testng.annotations.Test;

public class CreateBoard extends TestBase {


    @Test
    public void boardCreationTest() throws InterruptedException {
        app.getHeader().clickOnPlusButtonOnHeader();
        app.getBoardHelper().selectCreateBoardFromDropDown();
        app.getBoardHelper().fillBoardCreationBoard("boardName");
        app.getBoardHelper().submitBoardCreation();
        app.getHeader().clickOnTheHomeIconOnHeader();

        //verify, board created
    }

    @Test(enabled = false)
    public void boardCreationNegativeTest() {
    }


}
