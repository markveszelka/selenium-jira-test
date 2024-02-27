package org.example.testCases.Issue;

import org.example.LogIn;
import org.example.testCases.Runnable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CreateIssue implements Runnable {
    private final LogIn logIn;
    private final WebDriver webDriver;

    public CreateIssue(LogIn logIn, WebDriver webDriver) {
        this.logIn = logIn;
        this.webDriver = webDriver;
    }

    @Override
    public void run() {
        logIn.logIn();

        WebElement createIssueButton = webDriver.findElement(By.id("create_link"));
        createIssueButton.click();

        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("create-issue-dialog")));

        WebElement summaryInputField = webDriver.findElement(By.id("summary"));
        summaryInputField.sendKeys("This is an automated created issue for testing purpose.");

        // IFRAME SWITCH:
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mce_0_ifr")));
        WebElement iframe = webDriver.findElement(By.id("mce_0_ifr"));
        webDriver.switchTo().frame(iframe);

        WebElement descriptionInputField = webDriver.findElement(By.id("tinymce"));
        descriptionInputField.sendKeys("This is for testing purpose!");

        webDriver.switchTo().defaultContent();

        // SUBMIT:
        WebElement submitButton = webDriver.findElement(By.id("create-issue-submit"));
        submitButton.click();
    }
}
