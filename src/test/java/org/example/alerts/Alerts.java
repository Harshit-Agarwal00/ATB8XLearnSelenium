package org.example.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Alerts {

    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();

        // //button[text()='Click for JS Alert']
        // //button[@onclick='jsAlert()']
//        WebElement element = driver.findElement(By.cssSelector("button[onclick='jsAlert()']"));
//        WebElement elementConfirm = driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]"));
        WebElement elementPrompt= driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]"));

//        element.click();
//        elementConfirm.click();
        elementPrompt.click();

        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        alert.sendKeys("PRAMOD");
        alert.accept();
//        alert.dismiss();

        String result = driver.findElement(By.id("result")).getText();
//        Assert.assertEquals(result,"You successfully clicked an alert");
//        Assert.assertEquals(result,"You clicked: Ok");
//        Assert.assertEquals(result,"You clicked: Cancel");
        Assert.assertEquals(result,"You entered: PRAMOD");
    }
}
