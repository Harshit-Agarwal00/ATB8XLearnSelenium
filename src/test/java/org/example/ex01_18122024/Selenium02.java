package org.example.ex01_18122024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class Selenium02 {

    @Test
    public void test_selenium()
    {
        WebDriver driver = new SafariDriver();
        driver.get("https://app.vwo.com");
    }
}
