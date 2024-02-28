package org.example.testCases.Issue;

import org.example.LogIn;
import org.openqa.selenium.WebDriver;

public abstract class Issue {
    protected final WebDriver webDriver;

    protected Issue(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
}
