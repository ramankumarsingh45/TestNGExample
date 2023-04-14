package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.AfterClass;
//import org.junit.Assert;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersExample {
    public class SeleniumExample {
        WebDriver driver;
        @BeforeClass
        @Parameters({"browser","url"})
        void setupDriver(String browser, String link){
            if(browser.equalsIgnoreCase("chrome")) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            }
            else if (browser.equalsIgnoreCase("edge")) {
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
            }
            driver.get("https://www.google.com/");
            driver.manage().window().maximize();//in order to open window in maximized screen
        }
        @Test
        void getTitleFromPage() throws InterruptedException{
            driver.findElement(By.name("q")).sendKeys("Mobile");
            Thread.sleep(1000);


            driver.findElement(By.name("btnK")).click();
            Thread.sleep(1000);


            Assert.assertEquals(driver.getTitle(), "Mobile - Google Search");
        }
        @AfterClass
        void closeDriver(){
            driver.close();
        }
    }

}
