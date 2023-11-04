package StepDefinition;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepClass {
	WebDriver driver;

	@Given("^Open ebay application$")
	public void open_ebay_application() throws Throwable {
		System.setProperty("Webdriver.chrome.driver","C:\\chrome driver\\chrome-win64\\chrome.exe");
		ChromeOptions run = new ChromeOptions();
		run.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		
		
	}
	@Then("^mouse hover on MyeBay$")
	public void mouse_hover_on_MyeBay() throws Throwable {
	 Actions ac = new Actions(driver);
	 ac.moveToElement(driver.findElement(By.xpath("//a[text()='My eBay']"))).build().perform();
	 Thread.sleep(2000);
	 
	 
		
		
	}

	@Then("^click summary$")
	public void click_summary() throws Throwable {
	   WebElement element = driver.findElement(By.linkText("Summary"));
	   
	   element.click();
	   
	   driver.close();
	}
	@Then("^select motors from  shop by category dropdown$")
	public void select_motors_from_shop_by_category_dropdown() throws Throwable {
	 
	WebElement run	=driver.findElement(By.id("gh-shop-ei"));
		run.click();
		Thread.sleep(1000);
		
	}

	@Then("^click search$")
	public void click_search() throws Throwable {
	   WebElement sear = driver.findElement(By.linkText("Motors")) ;
	   sear.click();
	   Thread.sleep(2000);
	   driver.close();
	}

	@Then("^count all the links$")
	public void count_all_the_links() throws Throwable {
   List<WebElement> run = driver.findElements(By.tagName("a")); 
   System.out.println("All links "+run.size());
   
   for(int i = 0; i<run.size();i++) {
	 System.out.println(run.get(i).getAttribute("href"));  
	   
   }
   driver.close();
	}


}
