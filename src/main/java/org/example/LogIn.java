package org.example;

import io.github.cdimascio.dotenv.Dotenv;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogIn {

    private final Dotenv dotenv = Dotenv.load();
    private static final String URL = "https://jira-auto.codecool.metastage.net/login.jsp?os_destination=%2Fsecure%2FRapidBoard.jspa%3FrapidView%3D3%26projectKey%3DMTP";
    private final WebDriver webDriver;

    public LogIn(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void logIn() {
        webDriver.navigate().to(URL);
        WebElement userName = webDriver.findElement(By.id("login-form-username"));
        WebElement userPassword = webDriver.findElement(By.id("login-form-password"));
        WebElement button = webDriver.findElement(By.id("login-form-submit"));

        userName.sendKeys(dotenv.get("JIRA_USERNAME"));
        userPassword.sendKeys(dotenv.get("JIRA_PASSWORD"));
        button.click();
    }
}
