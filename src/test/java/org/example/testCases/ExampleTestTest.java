package org.example.testCases;

import org.example.Main;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.*;

class ExampleTestTest {
    private WebDriver webDriver;

    @BeforeEach
    public void setup() {
        webDriver = Main.setupWebDriver();
    }

    @Test
    public void test() {
        ExampleTest exampleTest = new ExampleTest(webDriver);

        exampleTest.run();
        Assertions.assertEquals(ExampleTest.RESULT_URL, webDriver.getCurrentUrl());
    }

    @AfterEach
    public void tearDown() {
        webDriver.quit();
    }
}