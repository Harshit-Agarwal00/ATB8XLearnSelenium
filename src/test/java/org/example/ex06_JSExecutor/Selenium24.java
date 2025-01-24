package org.example.ex06_JSExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Selenium24 {

    @Test
    public void testMethod01() throws Exception {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");

        String URL = "https://selectorshub.com/xpath-practice-page/";
        ChromeDriver driver = new ChromeDriver(chromeOptions);
        driver.get(URL);
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500);");

        String url = js.executeScript("return document.URL").toString();
        System.out.println(url);

        String title = js.executeScript("return document.title;").toString();
        System.out.println(title);

        Thread.sleep(3000);
        driver.quit();
    }
}
