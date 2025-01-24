package org.example.ex01_18122024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Selenium07 {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
    }
}
