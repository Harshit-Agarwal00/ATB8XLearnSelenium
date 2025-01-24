package org.example.ex02_20122024;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium14 {

    @Test
    public void test_Method() {
        ChromeDriver driver = new ChromeDriver();
        //driver.get("sdet.live");
        driver.get("http://sdet.live");
    }
}
