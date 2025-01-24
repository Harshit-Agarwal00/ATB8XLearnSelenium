package org.example.ex03_23122024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Selenium16 {

    @Test
    public void testMethod01() throws Exception {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        // HTML element -> Web Element - Selenium
        // Web Element  Find - Interact with It

        // How to find the elements
        // Selenium
        // Selenium
        // Basic -> ID, NAME, CLASS NAME, TAGName,
        // Advance -> Css Selector, Xpath
        driver.quit();

    }
}
