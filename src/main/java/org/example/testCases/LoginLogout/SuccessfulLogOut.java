package org.example.testCases.LoginLogout;

import org.example.LogIn;
import org.example.testCases.Runnable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SuccessfulLogOut implements Runnable {
    private static final String URL = "https://jira-auto.codecool.metastage.net/secure/Dashboard.jspa";
    private final WebDriver webDriver;

    public SuccessfulLogOut(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    @Override
    public void run() {
        webDriver.navigate().to(URL);
        WebElement dropDown = webDriver.findElement(By.id("header-details-user-fullname"));
        dropDown.click();

        WebElement logOutButton = webDriver.findElement(By.id("log_out"));
        logOutButton.click();
    }
}
