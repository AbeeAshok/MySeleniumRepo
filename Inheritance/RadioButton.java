package week3.Inheritance;

public class RadioButton extends Button {

	void selectRadioButton() {
		System.out.println("RadioButton selected");
	}
	
	public static void main(String[] args) {
		
		RadioButton c=new RadioButton();
		c.click();
		c.setText("From RadioButton");
		
		c.selectRadioButton();
				
		
	}
	
}
