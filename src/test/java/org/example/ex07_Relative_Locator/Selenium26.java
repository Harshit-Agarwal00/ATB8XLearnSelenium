package org.example.ex07_Relative_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import java.util.List;


import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Selenium26 {

    @Test
    public void testMethod01() throws Exception {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");

        String URL = "https://www.aqi.in/real-time-most-polluted-city-ranking";
        ChromeDriver driver = new ChromeDriver(chromeOptions);
        driver.get(URL);
        driver.manage().window().maximize();

        List<WebElement> searchBox = driver.findElements(By.xpath("//input[@type=\"search\"]"));
        searchBox.get(1).sendKeys("India" + Keys.ENTER);


        List<WebElement> locations = driver.findElements(By.cssSelector("div.location-name > p"));
        for (WebElement e : locations) {

            String s1 = driver.findElement(with(By.tagName("p")).toLeftOf(e)).getText();
            String s2 = driver.findElement(with(By.tagName("span")).toRightOf(e)).getText();
            String s3 = driver.findElement(with(By.tagName("p")).above(e)).getText();
            String s4 = driver.findElement(with(By.tagName("p")).below(e)).getText();
            System.out.println(s1);
            System.out.println(s2);
            System.out.println("| +" + s1 +" | " + e.getText() + " | " + s2 + " | ");
        }

        Thread.sleep(3000);
        driver.quit();
    }
}
