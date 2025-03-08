package com.edubridge;
import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		int num1 ,num2, result, choice;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two number for calculation");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.println("Enter your choice:");
		choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			result = num1 + num2;
			System.out.println("Addition:" +result);
			break;
		
		case 2:
			result = num1 - num2;
			System.out.println("Subtraction:" +result);
			break;
			
		case 3:
			result = num1 * num2;
			System.out.println("Multiplication:" +result);
			break;
			
		case 4:
			result = num1 / num2;
			System.out.println("Division:" +result);
			break;
		default:
			System.out.println("Inavlid choice");
		}
		

	}	
		
}
