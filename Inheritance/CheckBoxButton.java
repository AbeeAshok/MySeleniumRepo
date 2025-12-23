package week3.Inheritance;

public class CheckBoxButton extends Button {

	void clickCheckButton() {
		System.out.println("checkbox checked");
	}
	
	public static void main(String[] args) {
		
		CheckBoxButton c=new CheckBoxButton();
		c.click();
		c.setText("From CheckBoxButton");
		
		c.clickCheckButton();
				
		
	}
	
}
