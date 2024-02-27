package org.example.testCases.Issue;

import org.example.LogIn;
import org.example.testCases.Runnable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EditIssue implements Runnable {
    private final WebDriver webDriver;
    private final SearchIssue searchIssue;
    private final LogIn logIn;

    public EditIssue(WebDriver webDriver, SearchIssue searchIssue, LogIn logIn) {
        this.webDriver = webDriver;
        this.searchIssue = searchIssue;
        this.logIn = logIn;
    }

    @Override
    public void run() {
        searchIssue.run();

        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        WebElement editButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("edit-issue")));
        editButton.click();

        WebElement summary = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("summary")));
        String text = summary.getText();
        summary.sendKeys(text + "EDITED.");

        WebElement submitButton = webDriver.findElement(By.id("edit-issue-submit"));
        submitButton.click();
    }
}
