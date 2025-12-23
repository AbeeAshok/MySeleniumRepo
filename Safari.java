package week3.day2;

public class Safari extends Browser {

	public void readerMode() {
		System.out.println("reader mode opened - Safari class");
	}
	
	public void fullScreenMode() {
		System.out.println("fullscreen more opened - Safari class");
	}

	public static void main(String[] args) {
			
		Safari s=new Safari();
		
		s.browserName="Safari";
		s.browserVersion="SX123";
		
		System.out.println(s.browserName);
		System.out.println(s.browserVersion);
		
		//Calling its own method
		s.readerMode();
		s.fullScreenMode();
		
		//Inherited from Browser class
		s.closeBrowser();
		s.navigateBack();
		
		
	}

}
