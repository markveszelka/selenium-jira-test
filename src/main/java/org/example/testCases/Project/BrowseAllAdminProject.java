package org.example.testCases.Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrowseAllAdminProject implements Runnable{
    private final WebDriver webDriver;
    private final BrowseProject browseProject;
    public BrowseAllAdminProject(WebDriver webDriver) {
        this.webDriver = webDriver;
        browseProject = new BrowseProject(webDriver);
    }

    @Override
    public void run() {
        browseProject.run();

        WebElement searchBar = webDriver.findElement(By.xpath("//*[@id='project-filter-text']"));
        searchBar.sendKeys("Admin");

    }
}
