package singe.banana;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class RandomTestJUnit5 {

    WebDriver driver;
    WebDriverWait wait;
    static final String LOGIN = "skf";
    static final String FIRST_NAME = "skf";
    static final String LAST_NAME = "skf";
    static final String EMAIL = "skf@skf.skf";

    @BeforeEach
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
    public void randomTest() throws InterruptedException {
    	driver.findElement(By.xpath("//input[@title='Rechercher']")).sendKeys("selenium junit 5");
		String value = driver.findElement(By.xpath("//input[@aria-label='Recherche Google'][@type='submit']")).getAttribute("value");
        Assert.assertTrue("Le bouton Recherche Google n'existe pas", value.equals("Recherche Google"));
    }

    @AfterEach
    public void tearDown(){
        //driver.quit();
    }

}
