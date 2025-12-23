package week3.day2;

public class Browser {

	
	String browserName;
	String browserVersion;
	
	public void openURL() {
		System.out.println("URL opened --> Super class");
	}
	
	public void closeBrowser() {
		System.out.println("Browser closed --> Super class ");
	}
	
	
	public void navigateBack() {
		System.out.println("Navigated back --> Super class");
		
	}
}
