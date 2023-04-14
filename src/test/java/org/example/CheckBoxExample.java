package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckBoxExample {
    ChromeDriver driver;
    @BeforeClass
    void setupDriver(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();//in order to open window in maximized screen
    }
    @Test
    void checkboxMethod()throws InterruptedException{
        JavascriptExecutor javascriptExecutor=(JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0,360)","");
        WebElement e=driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']"));
        e.click();

        Thread.sleep(1000);

    }

    @AfterClass
    void close(){
        driver.close();
    }
}
