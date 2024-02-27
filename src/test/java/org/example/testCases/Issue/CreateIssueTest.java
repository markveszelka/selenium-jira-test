package org.example.testCases.Issue;

import org.example.LogIn;
import org.example.WebDriverProvider;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class CreateIssueTest {
    private WebDriver webDriver;
    private LogIn logIn;

    @BeforeEach
    void setUp() {
        webDriver = WebDriverProvider.setupWebDriver();
        logIn = new LogIn(webDriver);
    }

    @AfterEach
    void tearDown() {
        webDriver.quit();
    }

    @Test
    // TODO: rename test to more accurate
    public void test() {
        // Given
        CreateIssue createIssue = new CreateIssue(webDriver);
        // When
        createIssue.run();
        WebElement header = webDriver.findElement(By.id("header"));
        String headerAttribute = header.getAttribute("aria-hidden");
        // Then
        Assertions.assertNull(headerAttribute);
    }
}
