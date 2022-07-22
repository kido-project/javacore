package javacore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello world");

		int firstVar = 5;
		int secondVar = 5;
		System.out.println("First variable: " + ++firstVar);
		System.out.println("Second variable: " + secondVar++);

		// kiểu số nguyên: range byte < range short < range int < range long
		byte byteNumber = 120; // 1byte ~ 8bit
		short shortNumber = (short) (byteNumber / 13); // 2byte ~ 16bit
		int intNumber = byteNumber / 23; // 4byte ~ 32bit
		long longNumber = 4L + byteNumber * shortNumber / intNumber; // 8byte ~ 64bit

		// thêm f hoặc d để phân biệt float và double. độ chính xác đơn
		float floatNumber = .4f;
		// nếu không thêm nó sẽ tự hiểu là double. độ chính xác kép
		double doubleNumber = 12.12d + longNumber * floatNumber;

		// Kiểu char: 2byte
		char charValue = 'I'; // chỉ chứa 1 kí tự duy nhất.
		char secondCharValue = '\u0040'; // vị trí trên bảng mã ASCII

		boolean gender = true;
		boolean isExist = false;
		// trên là các đối tượng nguyên thuỷ.

		// String: đối tượng chuỗi kí tự   việt nam dân chủ cộng hoà.
		String fisrtString = "Nguyen Duc Viet";
		String secondString = " Ha Thuy Linh";

		System.out.println("Long number variable: " + longNumber);
		System.out.println("Double number variable: " + doubleNumber);
		System.out.println(charValue);
		System.out.println(secondCharValue);
		System.out.println(fisrtString + secondString + " " + gender + isExist);

		ArrayList<Integer> listNumber = new ArrayList<>();
		listNumber.add(12);
		listNumber.add(24);
		listNumber.add(15);
		System.out.println("Smallest number is: " + findSmallestNumber(listNumber));
		
	}

	// tìm số nhỏ nhất trong mảng 
	public static int findSmallestNumber(ArrayList<Integer> listNumber) {
//		Collections.sort(listNumber);
//		System.out.println(listNumber);
//		return listNumber.get(0);
		//or
		Collections.sort(listNumber, Collections.reverseOrder());
		return listNumber.get(listNumber.size() - 1);
	}
	
	// kiểm tra năm nhuận 
	public static void checkYear() {
		// Keyword JAVA
		// Check year function
		// khai bao doi tuong doc du lieu tu ban phim
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		CheckYear checkYear = new CheckYear();
		String resultCheckYear = checkYear.checkFunction(year) ? "Year valid" : "Year invalid";
		System.out.println(resultCheckYear);
	}
}
