package org.example.ex02_20122024;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class Selenium10 {

    @Test
    public void test_Method01() {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addExtensions(new File("src/test/java/org/example/ex02_20122024/AdBlock-—-block-ads-across-the-web-Chrome-Web-Store.crx"));

        ChromeDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.youtube.com");
    }

}
