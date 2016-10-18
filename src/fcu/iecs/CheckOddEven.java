package fcu.iecs;

import java.util.Scanner;

public class CheckOddEven {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num;
		System.out.println("Enter a integer¡G");
		num=scanner.nextInt();
		if(num%2==0){
			System.out.println("The input integer is Even Number");
		}
		else{
			System.out.println("The input integer is Odd Number");
		}
	}

}
