package org.example.testCases.LoginLogout;

import org.example.LogIn;
import org.example.testCases.Runnable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SuccessfulLogOut implements Runnable {
    WebDriver webDriver;
    LogIn logIn;

    private final String URL = "https://jira-auto.codecool.metastage.net/secure/Dashboard.jspa";

    public SuccessfulLogOut(WebDriver webDriver, LogIn logIn) {
        this.webDriver = webDriver;
        this.logIn = logIn;
    }

    @Override
    public void run() {
        logIn.logIn();
        webDriver.navigate().to(URL);
        WebElement dropDown = webDriver.findElement(By.id("header-details-user-fullname"));
        dropDown.click();

        WebElement logOutButton = webDriver.findElement(By.id("log_out"));
        logOutButton.click();

    }
}
