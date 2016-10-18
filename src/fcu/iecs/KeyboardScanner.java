package fcu.iecs;

import java.util.Scanner;

public class KeyboardScanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num1;
		float num2,num3;
		String name;
		System.out.println("Enter a integer¡G");
		num1=scanner.nextInt();
		System.out.println("Enter a float point number¡G");
		num2=scanner.nextFloat();
		System.out.println("Enter a you name¡G");
		name=scanner.next();
		num3=num1*num2;
		System.out.printf("Hi %s,the multiplication of %d and %f is %.2e",name,num1,num2,num3);
	}

}
