package week3.day2;

public class Chrome extends Browser {


		// TODO Auto-generated method stub
		
		public void openIcognito() {
			System.out.println("Incognito browser opened - Chrome class");
		}
		
		public void clearCache() {
			System.out.println("Cache cleared - Chrome class");
		}
	
	public static void main(String[] args) {
			
		Chrome c=new Chrome();
		
		c.browserName="Chrome";
		c.browserVersion="143.0.7499.169";
		
		System.out.println(c.browserName);
		System.out.println(c.browserVersion);
		
		//Calling its own method
		c.openIcognito();;
		c.clearCache();
		
		//Inherited from Browser class
		c.closeBrowser();
		c.navigateBack();
		
		
	}

}
