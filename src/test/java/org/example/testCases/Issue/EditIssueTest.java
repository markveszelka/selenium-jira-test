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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

class EditIssueTest {
    private WebDriver webDriver;
    private LogIn logIn;
    private SearchIssue searchIssue;
    private CreateIssue createIssue;

    @BeforeEach
    void setUp() {
        webDriver = WebDriverProvider.setupWebDriver();
        logIn = new LogIn(webDriver);
        createIssue = new CreateIssue(logIn, webDriver);
        searchIssue = new SearchIssue(webDriver, createIssue);
    }

    @AfterEach
    void tearDown() {
        webDriver.quit();
    }

    @Test
    // TODO: rename test to more accurate
    public void test() {
        // Given
        EditIssue editIssue = new EditIssue(webDriver, searchIssue, logIn);
        // When
        editIssue.run();
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        WebElement popUpWindow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".aui-message.closeable.aui-message-success.aui-will-close")));
        // Then
        Assertions.assertNotNull(popUpWindow);
    }
}
