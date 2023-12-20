package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Brilliustech 
{
	public static WebDriver driver;
	@Given("^i open browser with url \"([^\"]*)\"$")
	public void launchapp(String url)  
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url); 
	}

	@Then("^i should see Login page$")
	public void i_should_see_Login_page() 
	{
		if(driver.findElement(By.xpath("//button[text()='Login']")).isDisplayed())
				{
			      System.out.println("System Displayed Login page");
				}
	}

	@When("^i enter username as \"([^\"]*)\"$")
	public void i_enter_username_as(String uname)  
	{
		driver.findElement(By.id("username")).sendKeys(uname);
	}

	@When("^i enter password as \"([^\"]*)\"$")
	public void i_enter_password_as(String pword) 
	{
		driver.findElement(By.id("password")).sendKeys(pword);
	}

	@When("^i click login$")
	public void i_click_login() 
	{
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	}

	@Then("^i should see admin module$")
	public void i_should_see_admin_module() 
	{
		if(driver.findElement(By.xpath("//button[text()='User Registration']")).isDisplayed())
		{
			System.out.println("System Displayed Admin module");
		}
	}

	@When("^i click logout$")
	public void i_click_logout() 
	{
		driver.findElement(By.xpath("//button[text()='Logout']")).click();
	}

	@When("^i close browser$")
	public void i_close_browser() 
	{
		driver.close();
	}
	  
	

	
}
