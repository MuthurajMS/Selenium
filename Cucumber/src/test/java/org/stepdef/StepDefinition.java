package org.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition{
	
	static WebDriver driver;
@Given("User Navigate to the url")
public void user_Navigate_to_the_url() {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\eclipse-workspace\\Cucumber\\driver\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("https://www.facebook.com/");
}

@When("User enter the email and password")
public void user_enter_the_email_and_password() {
    driver.findElement(By.id("email")).sendKeys("Muthuraj");
    driver.findElement(By.name("pass")).sendKeys("Muthuraj");
}

@Then("User click the login button")
public void user_click_the_login_button() {
    driver.findElement(By.name("login")).click();
}

}
