package org.example.testCases.Project;

import org.example.testCases.Runnable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderProjectsByNameDescOrder implements Runnable {
   private final WebDriver webDriver;
   private final BrowseProject browseProject;

    public OrderProjectsByNameDescOrder(WebDriver webDriver) {
        this.webDriver = webDriver;
        browseProject = new BrowseProject(webDriver);
    }

    @Override
    public void run() {
        browseProject.run();

        WebElement orderButtonByName = webDriver.findElement(By.xpath("//*[@id=\"projects\"]/div/table/thead/tr/th[1]"));
        orderButtonByName.click();
    }
}