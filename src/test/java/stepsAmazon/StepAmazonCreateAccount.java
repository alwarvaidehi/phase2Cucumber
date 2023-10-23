package stepsAmazon;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepAmazonCreateAccount {
	WebDriver driver;
@Given("User in Amazon page")
public void User_in_Amazon_page() throws InterruptedException {
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.get("https://www.amazon.com/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3F_encoding%3DUTF8%26tag%3Dhpga1-ubpl-pczz-pzz-in-21%26ref_%3Dnav_custrec_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	//driver.get("https://www.amazon.com/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3F_encoding%3DUTF8%26tag%3Dhpga1-ubpl-pczz-pzz-in-21%26ref_%3Dnav_custrec_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
    String title=driver.getTitle();	
    System.out.println(title);
    Thread.sleep(1500);
}

@Then("enter the following data")
public void  DataBaseDemoMaps(DataTable datatable) throws InterruptedException {
      List<Map<String,String>> UserList = datatable.asMaps(String.class,String.class);      
      for(Map<String,String> e : UserList ) {
    	  // | Username |    Email ID               |    password  |  ReType Password |
    	 Thread.sleep(1500);
    	  driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys(e.get("Username"));
    	 driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(e.get("Email ID"));
    	 driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys(e.get("password"));
    	 driver.findElement(By.xpath("//input[@id='ap_password_check']")).sendKeys(e.get("ReType Password"));
    	// driver.findElement(By.xpath("//input[@id='continue']")).click();
    	   }
}


@Then("user click on login button")
public void user_click_on_login_button() throws InterruptedException {
	driver.navigate().to("https://www.amazon.com/?tag=hpga1-ubpl-pczz-pzz-in-21");
	
	driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
	
}

@When("User Enter the Username and password")
public void user_enter_the_username_and_password() {
	driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("vaidehi.a2000@gmail.com");
    driver.findElement(By.xpath("//input[@id='continue']")).click();
    driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Harrystyles_01&");
    driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
}

@Then("user Enter the input in search box")
public void user_enter_the_input_in_search_box() {
   driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("redmi note 13 pro plus");
   
}

@And("User click on the search button")
public void user_click_on_the_search_button() {
    driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
}

@Then("User click on the first option")
public void user_click_on_the_first_option() {
    System.out.println("click on the first option");
}

@Then("I close browser")
public void I_close_browser() {
	driver.close();
    System.out.println("click on the first option");
}


}
