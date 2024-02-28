package org.example.testCases.Project;

import org.openqa.selenium.WebDriver;

public abstract class Project {
    protected final WebDriver webDriver;

    public Project(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
}
