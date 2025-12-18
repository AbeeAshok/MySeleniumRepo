package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class BasicLocators {

	public static void main(String[] args) {

		//Instantiate the browser driver
		//shortcut for running - ctrl+fn+f11
		//ChromeDriver driver=new ChromeDriver();
		
		 //Use Chrome options to handle it using Guest Mode

		 ChromeOptions option = new ChromeOptions();

		 // Add argument to open Chrome in Guest Mode
		 option.addArguments("--guest");

		 // Instantiate the Chrome browser with the specified options
		 ChromeDriver driver = new ChromeDriver(option);
		
		//FirefoxDriver driver=new FirefoxDriver();
		 
		 
		 //Absolute xpath    /html/body/div[2]/div[2]/div/form/p[1]/input
		 //Reltaive xpath -  
		 //attribute based   	//tagname[@attribute='attribute value']     	//input[@id='username']
		 //text based   		//tagname[text()='text value in DOM']		 //input[text()='Create Lead']
		 //Partial match		//tagName[contains(@attribute, 'Partial value of the attribute']
		 //Partial match		//tagName[contains(@attribute, 'Partial value of the attribute']
		
		//load the url. maximize and print the title
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("username")).sendKeys("democsr2");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//Partiallinktext as the linktext has extra spaces
		driver.findElement(By.partialLinkText("CRM")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
	
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Abee");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ashok");
		
		WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sel=new Select(sourceDD);
		sel.selectByIndex(4);
		
		WebElement industryDD = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select sel1=new Select(industryDD);
		sel1.selectByVisibleText("Insurance");
		
		WebElement marketingCampaignDD = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select sel2=new Select(marketingCampaignDD);
		sel2.selectByVisibleText("Automobile");
		
		WebElement ownershipDD = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select sel3=new Select(ownershipDD);
		sel3.selectByValue("OWN_CCORP");
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		System.out.println(driver.getTitle());
		
		//quit is advisable compared to close method to kill all associated browser sessions and avoid memory leaks
		driver.quit();
		
	}

}



