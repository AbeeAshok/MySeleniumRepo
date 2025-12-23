package week3.day2;

public class Edge extends Browser {

	// TODO Auto-generated method stub
	
	public void takeSnap() {
		System.out.println("Snapshot taken - Edge class");
	}
	
	public void clearCookies() {
		System.out.println("cookies cleared - Edge class");
	}

	public static void main(String[] args) {
			
		Edge e=new Edge();

		
		e.browserName="Edge";
		e.browserVersion="143.0.3650.96";
		
		System.out.println(e.browserName);
		System.out.println(e.browserVersion);
		
		//Calling its own method
		e.takeSnap();
		e.clearCookies();
		
		//Inherited from Browser class
		e.closeBrowser();
		e.navigateBack();
		
		
	}

}
