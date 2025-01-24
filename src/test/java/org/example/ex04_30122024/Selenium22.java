package org.example.ex04_30122024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium22 {

    @Test
    public void testMethod01() throws Exception {

        ChromeOptions edgeOptions = new ChromeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(edgeOptions);
        driver.get("https://www.ebay.com/b/Desktops-All-In-One-Computers/171957/bn_1643067");

        WebElement searchBox = driver.findElement(By.xpath("//input[@id='gh-ac']"));
        searchBox.sendKeys("macmini"); // Find the "macmini"

        WebElement searchButton = driver.findElement(By.xpath("//button[@value='Search']"));
        searchButton.click();

        List<WebElement> searchTitles = driver.findElements(By.xpath("//div[@class='s-item__title']"));
        List<WebElement> searchTitlesPrices = driver.findElements(By.xpath("//span[@class='s-item__price']"));

        int size = Math.min(searchTitlesPrices.size(), searchTitles.size());

        for (int i = 0; i < size; i++) {
            System.out.println("Title : " + searchTitles.get(i).getText() + " || " + "Price : " + searchTitlesPrices.get(i).getText());
        }

        Thread.sleep(3000);
        driver.quit();
    }
}
