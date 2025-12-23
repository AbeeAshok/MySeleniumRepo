package week3.Inheritance;

public class Elements extends Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Methods from WebElement, Button classes accessed using inheritance
		Elements e=new Elements();
		
		e.submit();
		e.click();
		e.setText("Execution");
		
		//Methods from CheckBoxButton and RadioButton classes accessed using instantiation
		CheckBoxButton c=new CheckBoxButton();
		c.clickCheckButton();
		
		RadioButton r=new RadioButton();
		r.selectRadioButton();
		
		
	}

}
