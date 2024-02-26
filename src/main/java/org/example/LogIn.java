package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogIn {

    private final WebDriver webDriver;
    private static final String URL = "https://jira-auto.codecool.metastage.net/login.jsp?os_destination=%2Fsecure%2FRapidBoard.jspa%3FrapidView%3D3%26projectKey%3DMTP";
    public static final String USER_NAME = "automation74";
    public static final String USER_PASSWORD = "CCAutoTest19.";

    public LogIn(WebDriver webDriver) {
        this.webDriver = webDriver;
    }


    public void logIn() {

        webDriver.navigate().to(URL);
        WebElement userName = webDriver.findElement(By.id("login-form-username"));
        WebElement userPassword = webDriver.findElement(By.id("login-form-password"));
        WebElement button = webDriver.findElement(By.id("login-form-submit"));


        userName.sendKeys(USER_NAME);
        userPassword.sendKeys(USER_PASSWORD);
        button.click();


    }
}
