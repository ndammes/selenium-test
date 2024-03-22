package testcases;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firsttestcase {
    WebDriver driver;
    public void setup(){
        driver = new ChromeDriver();
    }

    @Test
    public void firstTest(){
        setup();
        driver.get("https://www.google.de");
        String title = driver.getTitle();
        Assertions.assertEquals("Google", title);
        driver.close();

    }

}
