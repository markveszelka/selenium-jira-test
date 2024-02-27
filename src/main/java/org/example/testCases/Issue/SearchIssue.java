package org.example.testCases.Issue;

import io.github.cdimascio.dotenv.Dotenv;
import org.example.testCases.Runnable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchIssue implements Runnable {
    private final WebDriver webDriver;
    private final Dotenv dotenv = Dotenv.load();
    private final CreateIssue createIssue;

    public SearchIssue(WebDriver webDriver, CreateIssue createIssue) {
        this.webDriver = webDriver;
        this.createIssue = createIssue;
    }

    @Override
    public void run() {
        createIssue.run();

        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(3));

        WebElement issuesButton = webDriver.findElement(By.id("find_link"));
        issuesButton.click();

        WebElement searchForIssues = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("issues_new_search_link_lnk")));
        searchForIssues.click();

        WebElement searchInputField = webDriver.findElement(By.id("searcher-query"));
        searchInputField.sendKeys(dotenv.get("JIRA_USERNAME"));

        WebElement searchButton = webDriver.findElement(
                By.cssSelector("button[type='button'][original-title='Search for issues']"));
        searchButton.click();
    }
}
