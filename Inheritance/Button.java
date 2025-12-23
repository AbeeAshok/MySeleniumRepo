package week3.Inheritance;

public class Button extends WebElement {
	
	void submit() {
		System.out.println("submitted");
	}
	
	public static void main(String[] args) {
		
		Button b=new Button();
		b.click();
		b.setText("Hello World");
		
		b.submit();
		
	}
	
}
