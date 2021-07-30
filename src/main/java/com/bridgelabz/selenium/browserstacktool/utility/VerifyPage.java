package com.bridgelabz.selenium.browserstacktool.utility;

import com.bridgelabz.selenium.browserstacktool.base.BrowserStack;
import org.openqa.selenium.By;
import org.testng.Assert;

public class VerifyPage extends BrowserStack{

    public void verifyLogin(){

        driver.get ("https://www.linkedin.com/");
        Assert.assertEquals (driver.getTitle (),"LinkedIn: Log In or Sign Up");

        driver.findElement (By.id ("session_key")).sendKeys ("abc@gmail.com");
        driver.findElement (By.id ("session_password")).sendKeys ("abcd@1234");
        driver.findElement (By.xpath ("//button[normalize-space()='Sign in']")).click ();
       Assert.assertEquals (driver.getTitle (),"Security Verification | LinkedIn");
       driver.close ();

    }
}
