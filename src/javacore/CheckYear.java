package javacore;

public class CheckYear {
	public CheckYear() {
		// TODO Auto-generated constructor stub
	}
	
	public static Boolean checkFunction(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
			return true;
		return false;
	}
}
