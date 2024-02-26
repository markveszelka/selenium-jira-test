package org.example.testCases;

import org.example.WebDriverProvider;
import org.example.testCases.SuccessfulLogin;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class SuccessfulLoginTest {
    private WebDriver webDriver;

    @BeforeEach
    public void setup() {
        webDriver = WebDriverProvider.setupWebDriver();
    }

    @Test
    public void test() {
        SuccessfulLogin exampleTest = new SuccessfulLogin(webDriver);

        exampleTest.run();
        WebElement userOption = webDriver.findElement(By.id("user-options"));

        Assertions.assertNotNull(userOption);
    }

    @AfterEach
    public void tearDown() {
        webDriver.quit();
    }
}