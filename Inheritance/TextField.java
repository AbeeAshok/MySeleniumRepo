package week3.Inheritance;

public class TextField extends WebElement {

	void getText() {
		System.out.println("Text obtained");
	}
	
	public static void main(String[] args) {
		
		TextField b=new TextField();
		b.click();
		b.setText("Hello World");
		
		b.getText();
		
	}
}
