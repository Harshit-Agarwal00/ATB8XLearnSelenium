package org.example.ex07_Relative_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Selenium27 {

    @Test
    public void testMethod01() throws Exception {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");

        String URL = "https://codepen.io/AbdullahSajjad/full/LYGVRgK";
        ChromeDriver driver = new ChromeDriver(chromeOptions);
        driver.get(URL);
        driver.manage().window().maximize();

        driver.switchTo().frame("result");

        WebElement submit = driver.findElement(By.xpath("//form[@id=\"form\"]/button"));
        submit.click();

        WebElement username_element = driver.findElement(By.xpath("//input[@id='username']"));
        WebElement error_element = driver.findElement(with(By.tagName("small")).below(username_element));

        String errorText = error_element.getText();
        Assert.assertTrue(error_element.isDisplayed());
        Assert.assertEquals(errorText,"Username must be at least 3 characters");

        Thread.sleep(3000);
        driver.quit();
    }
}
