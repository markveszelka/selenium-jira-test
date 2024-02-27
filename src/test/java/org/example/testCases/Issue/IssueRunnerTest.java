package org.example.testCases.Issue;

import org.example.LogIn;
import org.example.WebDriverProvider;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.*;

class IssueRunnerTest {
    private WebDriver webDriver;
    private LogIn logIn;
    private CreateIssue createIssue;
    private SearchIssue searchIssue;
    private EditIssue editIssue;
    private DeleteIssue deleteIssue;
    
    private IssueRunner issueRunner;

    @BeforeEach
    void setUp() {
        webDriver = WebDriverProvider.setupWebDriver();

        logIn = new LogIn(webDriver);
        createIssue = new CreateIssue(webDriver);
        searchIssue = new SearchIssue(webDriver);
        editIssue = new EditIssue(webDriver);
        deleteIssue = new DeleteIssue(webDriver);

        issueRunner = new IssueRunner(logIn, createIssue, searchIssue, editIssue, deleteIssue);
    }

    @AfterEach
    void tearDown() {
        webDriver.quit();
    }

    @Test
    void creatIssue() {
        issueRunner.creatIssue();
    }

    @Test
    void searchIssue() {
        issueRunner.searchIssue();
    }

    @Test
    void editIssue() {
        issueRunner.editIssue();
    }

    @Test
    void deleteIssue() {
        issueRunner.deleteIssue();
    }
}
