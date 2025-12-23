package week3.polymorphism;

public class loginPage extends BasePage {
	
	@Override
	void performCommonTasks() {
		System.out.println("perform common tasks done --> sub class");
	}
	
	void accessSuperMethod() {
		
		super.performCommonTasks();
	}
	
	public static void main(String[] args) {
		
		loginPage l=new loginPage();
		l.performCommonTasks();
		
		l.accessSuperMethod();
		
		BasePage b=new BasePage();
		b.performCommonTasks();
		
	}

}
