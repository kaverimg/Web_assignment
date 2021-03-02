package com.quinbay.cucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {
    WebDriver driver;


    @When("I enter username as \"([^\"]*)\"$")
    public void userName(String username){
        driver.findElement(By.id("email")).sendKeys(username);
        System.out.println("Username : "+username);
        // Write code here that turns the phrase above into concrete actions
    }
    @And("^I enter password as \"([^\"]*)\"$")
    public void enterPassword(String password)
    {
        driver.findElement(By.id("pass")).sendKeys(password);
        System.out.println("Password : "+password);

    }

    @Then("^Login should fail$")
    public void login()
    {
        driver.findElement(By.name("login")).click();
        System.out.println("Trying to Login");

    }




    @Given("I am on Facebook login page")
    public void iAmOnFacebookLoginPage() {
        System.setProperty("webdriver.chrome.driver","src/main/resources/driver/chromedriver");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
    }

    @Then("I should be able to login inside the facebook")
    public void iShouldBeAbleToLoginInsideTheFacebook() {

    }

    @And("The title of web page should be facebook main page")
    public void theTitleOfWebPageShouldBeFacebookMainPage() {
    }
}
