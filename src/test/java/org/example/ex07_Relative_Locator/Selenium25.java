package org.example.ex07_Relative_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Selenium25 {

    @Test
    public void testMethod01() throws Exception {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");

        String URL = "https://awesomeqa.com/practice.html";
        ChromeDriver driver = new ChromeDriver(chromeOptions);
        driver.get(URL);
        driver.manage().window().maximize();

        WebElement span_element = driver.findElement(By.xpath("//span[normalize-space()='Years of Experience']"));
        driver.findElement(with(By.id("exp-2")).toRightOf(span_element)).click();

        Thread.sleep(3000);
        driver.quit();
    }
}
