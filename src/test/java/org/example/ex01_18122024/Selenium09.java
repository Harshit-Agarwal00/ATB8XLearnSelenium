package org.example.ex01_18122024;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium09 {

    public static void main(String[] args) {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-size=1920,1080");
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--headless");

        ChromeDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());
    }
}
