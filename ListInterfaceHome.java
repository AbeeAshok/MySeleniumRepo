package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListInterfaceHome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		
		//load the url. maximize and print the title
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));		
		
		
		WebElement inputField = driver.findElement(By.className("desktop-searchBar"));
		inputField.sendKeys("DailyObjects Laptop bag for men");
		inputField.sendKeys(Keys.RETURN);
		
		List<WebElement> products = driver.findElements(By.xpath("//li[@class='product-base']"));
		System.out.println("Total products: " + products.size());

		List<String>productnames = new  ArrayList<String>();
		
		for (WebElement product : products) {
		    String name = product.findElement(By.xpath(".//h4[@class='product-product']")).getText();
		    //System.out.println(name);
		    productnames.add(name);

		}
		
	    System.out.println(productnames);
		
	}

}
