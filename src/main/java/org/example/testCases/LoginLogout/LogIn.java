package org.example.testCases.LoginLogout;
import org.openqa.selenium.WebDriver;

public abstract class LogIn {
    protected final WebDriver webDriver;

    public LogIn(WebDriver webDriver) {
        this.webDriver = webDriver;
    }


}
