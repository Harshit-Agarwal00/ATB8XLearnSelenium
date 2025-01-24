package org.example.ex05_Selenium_XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium23 {

    @Test
    public void testMethod01() throws Exception {


        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://cdpn.io/AbdullahSajjad/fullpage/LYGVRgK?anon=true&view=fullpage");

        driver.switchTo().frame("result");

        WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
        button.click();

        // Error will come
        String input_box_path = "//input[@id='username']";
        String small_path = input_box_path+"/following-sibling::small";
        String label_path = input_box_path+"/preceding-sibling::label";
        WebElement error_small_tag = driver.findElement(By.xpath(small_path));
        WebElement label_tag = driver.findElement(By.xpath(label_path));
        System.out.println(label_tag.getText());

        Assert.assertEquals(error_small_tag.getText(),"Username must be at least 3 characters");

        Thread.sleep(3000);
        driver.quit();
    }
}
