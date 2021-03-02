package com.quinbay.cucumber;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CucumberHooks {
     @Before
    public void testBefore(){
         WebDriver driver;
         driver= new ChromeDriver();
         public void iAmOnFacebookLoginPage() {
             System.setProperty("webdriver.chrome.driver","src/main/resources/driver/chromedriver");
             driver= new ChromeDriver();
             driver.manage().window().maximize();
             driver.get("https://www.facebook.com");
             System.out.println("This is a demo for before hook");
         }
    }
    @After
    public void testAfter(){
         System.out.println("This is a demo after hook");
    }
}
