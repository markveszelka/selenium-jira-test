package org.example.testCases.LoginLogout;

import org.example.LogIn;
import org.example.WebDriverProvider;
import org.example.testCases.LoginLogout.SuccessfulLogOut;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class SuccessfulLogOutTest {
    private WebDriver webDriver;
    private LogIn logIn;

    @BeforeEach
    public void setup(){
        webDriver = WebDriverProvider.setupWebDriver();
        logIn = new LogIn(webDriver);
    };

    @Test
    // TODO: rename test to more accurate
    public void test(){
        SuccessfulLogOut successfulLogOut = new SuccessfulLogOut(webDriver, logIn);
        successfulLogOut.run();

        WebElement userOptions = webDriver.findElement(By.id("user-options"));
        Assertions.assertNotNull(userOptions);
    }

    @AfterEach
    public void tearDown(){
        webDriver.quit();
    }

}
