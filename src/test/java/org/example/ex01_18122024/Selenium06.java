package org.example.ex01_18122024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Selenium06 {

    public static void main(String[] args) {
        WebDriver driver = new SafariDriver();
        driver.get("https://app.vwo.com");
    }
}
