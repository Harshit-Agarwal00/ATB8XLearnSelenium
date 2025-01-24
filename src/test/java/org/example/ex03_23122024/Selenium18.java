package org.example.ex03_23122024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Selenium18 {

    @Test
    public void testMethod01()
    {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--start-maximized");

        ChromeDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://app.vwo.com");

        WebElement btn = driver.findElement(By.partialLinkText("Start a free trial"));
        btn.click();
    }
}
