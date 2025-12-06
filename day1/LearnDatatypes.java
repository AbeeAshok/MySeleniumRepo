package week1.day1;

public class LearnDatatypes {

	public static void main(String[] args) {
		/* Primitive DT - Size is pre-defined - Integer, Float, Character, Boolean - 
		 * These are all wrapper classes, Classes written on top of primitive DT to access the methods of the datatypes
		 * Integer - byte, short, int, long
		 * Float - float, double
		 * Character - char
		 * Boolean - boolean
		 * 
		 * Non primitive DT - String, Array
		 * 
		 */
		
		//whole number
		byte noOfLearners=40;
		short regNo=12345;
		long phNo= 9781814523L;
		
		//decimal digits
		float speed=0.15674892086f;
		double speed1=0.15674892086;
		System.out.println(speed); //float rounds off 7 decimal digits and store
		System.out.println(speed1); // double accepts 15 digits
		
		//char accepts single characters/digits
		char logo='S';
		char num='4';
		
		//non primitive
		String name="Abee Ashok";
		String learnerType="Selenium Course";
		System.out.println(noOfLearners+ " "+'\n'+learnerType);
				
		
		
		
		

	}

}
