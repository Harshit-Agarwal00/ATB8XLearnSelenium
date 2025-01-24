package org.example.ex06_JSExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Selenium240 {

    @Test
    public void testMethod01() throws Exception {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");

        String URL = "https://selectorshub.com/xpath-practice-page/";
        ChromeDriver driver = new ChromeDriver(chromeOptions);
        driver.get(URL);
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor)driver;

        WebElement div_to_scroll = driver.findElement(By.xpath("//div[@id='userName']"));
        js.executeScript("arguments[0].scrollIntoView(true);", div_to_scroll);
//        String html = js.executeScript("return arguments[0].style.display",div_to_scroll).toString();
//        System.out.println(html);
    }
}
