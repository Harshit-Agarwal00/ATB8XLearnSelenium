package org.example.ex02_20122024;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium13 {

    @Test
    public void testMethod01() throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://sdet.live");

        driver.navigate().to("https://www.thetestingacademy.com");
        Thread.sleep(2000);
        driver.navigate().back();
        driver.navigate().forward();
        System.out.println(driver.getTitle());
    }
}
