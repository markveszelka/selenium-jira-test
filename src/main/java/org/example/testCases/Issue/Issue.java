package org.example.testCases.Issue;

import org.example.LogIn;
import org.openqa.selenium.WebDriver;

public abstract class Issue {
    protected final WebDriver webDriver;
    protected final LogIn logIn;

    protected Issue(WebDriver webDriver, LogIn logIn) {
        this.webDriver = webDriver;
        this.logIn = logIn;
    }
}
