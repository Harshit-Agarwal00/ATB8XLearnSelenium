package org.example.ex03_23122024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium19 {

    @Test
    public void testMethod01() {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--start-maximized");

        ChromeDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://vwo.com/free-trial/");

        WebElement email = driver.findElement(By.id("page-v1-step1-email"));
        email.sendKeys("987656789dasdasd");

        WebElement checkbox_policy = driver.findElement(By.name("gdpr_consent_checkbox"));
        checkbox_policy.click();

        List<WebElement> button_list = driver.findElements(By.tagName("button"));
        button_list.get(0).click();

        WebElement error_message = driver.findElement(By.className("invalid-reason"));
        Assert.assertEquals(error_message.getText(), "The email address you entered is incorrect.");
    }
}
