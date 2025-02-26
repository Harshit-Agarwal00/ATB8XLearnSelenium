package org.example.ActionWindow_Frame;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Action3 {
    ChromeDriver driver;

    @BeforeTest
    public void openBrowser() {
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new ChromeDriver(options);
    }

    @Description("Verify actions p3")
    @Test
    public void test_actions_p3() throws InterruptedException {

        driver.manage().window().maximize();
        String URL = "https://www.makemytrip.com/";
        driver.get(URL);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy='closeModal']")));
        driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
        WebElement fromCity = driver.findElement(By.id("fromCity"));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Actions actions = new Actions(driver);
        actions.moveToElement(fromCity).click().sendKeys("del").build().perform();
        actions.moveToElement(fromCity).contextClick();

        List<WebElement> list_auto_complete = driver.findElements(By.xpath("//ul[@class=\"react-autosuggest__suggestions-list\"]/li"));
        for(WebElement e : list_auto_complete){
            if(e.getText().contains("New Delhi")){
                e.click();
                break;
            }
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//        actions.moveToElement(fromCity).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).perform();
    }

    @AfterTest
    public void closeBrowser() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
