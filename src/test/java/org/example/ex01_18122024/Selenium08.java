package org.example.ex01_18122024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium08 {

    @Test
    public void test_Method01()
    {

        // EdgeOptions -> It will help you set the browser
        // options to browsers
        // window - size
        // headless mode - there is not UI -> advantage - Fast Execution
        // full UI mode - default - UI browser
        // incognito mode - switch
        // start Max
        // add extensions - browsers
        // 100 + others , https , http
        // localstorage, download ?

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-size=1920,1080");
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--headless");

        ChromeDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());
    }
}
