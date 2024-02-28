package org.example.testCases.Issue;

import org.openqa.selenium.WebDriver;

public abstract class Issue {
    protected final WebDriver webDriver;

    public Issue(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
}
