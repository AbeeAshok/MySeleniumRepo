package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsFramesHome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		
		//load the url. maximize and print the title
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Nila");
		alert.accept();
		
        //Verify result text
        WebElement resultText = driver.findElement(By.id("demo"));
        String output = resultText.getText();

        if (output.contains("Nila")) {
            System.out.println("TEST PASSED: Name displayed correctly");
        } else {
            System.out.println("TEST FAILED");
        }

        driver.quit();
		
	}

}
