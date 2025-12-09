package week1.day2;

public class Browser {

	
	public void launchBrowser(String browserName) {
		System.out.println("Step 1: Launch");
		System.out.println(browserName);
		
	}
	
	public String loadUrl() {
		System.out.println("Step 2: Load");
		String strUrl = "Url loaded successfully";
		return strUrl;
				
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Browser browser1=new Browser();
		browser1.launchBrowser("Chrome");
		browser1.loadUrl();

	}

}
