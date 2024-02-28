package org.example.testCases.Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrowseAllAdminProject implements Runnable{
    private final WebDriver webDriver;
    public BrowseAllAdminProject(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    @Override
    public void run() {

        WebElement searchBar = webDriver.findElement(By.xpath("//*[@id='project-filter-text']"));
        searchBar.sendKeys("Admin");

    }
}
