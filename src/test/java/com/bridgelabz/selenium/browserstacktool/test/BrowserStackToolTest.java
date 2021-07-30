package com.bridgelabz.selenium.browserstacktool.test;

import com.bridgelabz.selenium.browserstacktool.base.BrowserStack;
import com.bridgelabz.selenium.browserstacktool.utility.VerifyPage;
import org.testng.annotations.Test;

public class BrowserStackToolTest extends BrowserStack{

    @Test(priority = 1)
    public void test_login_page(){

        VerifyPage verifyPage = new VerifyPage ();
        verifyPage.verifyLogin ();
    }
}
