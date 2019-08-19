package singe.banana;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class RandomTestJUnit4 {

    WebDriver driver;
    WebDriverWait wait;

    @Before
    public void setUp(){
        try{
            driver = new FirefoxDriver();
            driver.get("https://www.google.com");
            
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver,30);
    }

    @Test
    public void randomTest(){
    	driver.findElement(By.xpath("//input[@title='Rechercher']")).sendKeys("selenium junit 4");
    	//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@title='Rechercher']"))));
        Assert.assertTrue("le texte n'a pas été inséré", driver.findElement(By.xpath("//input[@title='Rechercher']")).getText().equals("selenium junit 4"));
    }

    @After
    public void tearDown(){
        //driver.quit();
    }

}
