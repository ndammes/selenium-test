package org.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    WebDriver driver;

    @Test
    public void testGoogle(){
        driver = new ChromeDriver();
        driver.get("https://www.google.de");
        String title = driver.getTitle();
        Assertions.assertEquals("Google", title);
        driver.close();
    }

}
