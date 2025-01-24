package org.example.ex02_20122024;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class Selenium15{

    @Test
    public void test_Method() throws Exception{
        // Open the https://katalon-demo-cura.herokuapp.com/
        // Verify the title and search a string in pageSource
        // Add assertion that the Cura heatlh care Service is visible in the page source.

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://katalon-demo-cura.herokuapp.com");

        Assert.assertEquals(driver.getTitle(), "CURA Healthcare Service");
        assertThat(driver.getTitle()).isNotBlank().isNotEmpty().isEqualTo("CURA Healthcare Service");
        assertThat(driver.getCurrentUrl()).isEqualTo("https://katalon-demo-cura.herokuapp.com/");

        if (driver.getPageSource().contains("CURA Healthcare Service")) {
            Assert.assertTrue(true);
        } else {
            throw new Exception("Heading Not Found!!");
        }

        driver.quit();
    }
}
