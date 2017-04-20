package com.example.java.month;

import java.util.Scanner;

public class Month_display {

	public static void main(String[] args) {
		int monthNO;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The Month Number: ");
			monthNO = sc.nextInt();
		
		switch (monthNO) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("FEbuary");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("Apirl");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("Augst");
			break;
		case 9:
			System.out.println("septembr");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("Decmeber");
			break;

		default:
			System.out.println("Ivalid Month Option");
			break;
		}

	}

}
