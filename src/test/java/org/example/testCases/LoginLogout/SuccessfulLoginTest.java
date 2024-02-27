package org.example.testCases.LoginLogout;

import org.example.LogIn;
import org.example.WebDriverProvider;
import org.example.testCases.LoginLogout.SuccessfulLogin;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class SuccessfulLoginTest {
    private LogIn logIn;
    private WebDriver webDriver;

    @BeforeEach
    public void setup() {
        webDriver = WebDriverProvider.setupWebDriver();
        logIn = new LogIn(webDriver);
    }

    @Test
    // TODO: rename test to more accurate
    public void test() {
        SuccessfulLogin exampleTest = new SuccessfulLogin(logIn);

        exampleTest.run();
        WebElement userOption = webDriver.findElement(By.id("user-options"));

        Assertions.assertNotNull(userOption);
    }

    @AfterEach
    public void tearDown() {
        webDriver.quit();
    }
}
