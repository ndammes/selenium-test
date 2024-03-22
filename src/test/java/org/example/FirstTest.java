package org.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstTest {
    WebDriver driver;

    @Test
    public void testGoogle(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        driver = new ChromeDriver(options);
        driver.get("https://www.google.de");
        String title = driver.getTitle();
        Assertions.assertEquals("Google", title);
        driver.close();
    }

    @Test
    public void testFalse(){
        Assertions.fail();
    }



}
