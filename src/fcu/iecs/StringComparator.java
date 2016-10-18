package fcu.iecs;

import java.util.Scanner;

public class StringComparator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a;
		do{
			String str1,str2;
			System.out.println("Enter a string 1¡G");
			str1=scanner.next();
			System.out.println("Enter a string 2¡G");
			str2=scanner.next();
			
			a=str1.compareToIgnoreCase(str2);
			if(a==0){
				System.out.println("The two strings are the same");
			}
			else{
				System.out.println("The two strings are not the same");
			}
		}while(a!=0);
	}

}
