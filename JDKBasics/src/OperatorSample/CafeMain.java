package OperatorSample;

import java.util.Scanner;

public class CafeMain {

	public static void main(String[] args) {
	   System.out.println("Welcome to the cafe");
	   System.out.println("looking for the menu??");
	   System.out.println("1. Yes \t 2.No");
	   Scanner sc = new Scanner(System.in);
	   String ch=sc.next();
	   if(ch.equals("yes")) {
	   Cafe c1=new Cafe(5,"cappachino",400.00f);
	   Cafe c2=new Cafe(4,"dark",350.00f);
	   Cafe c3=new Cafe(4,"black",300.00f);
	   Cafe c4=new Cafe(3,"cold",200.00f);
	   System.out.println(c1);
	   System.out.println(c2);
	   System.out.println(c3);
	   System.out.println(c4);
	   System.out.println("will be pleased to take your oder");
	
	   System.out.println("enter your coffee choice:");
	   System.out.println("1.cappachino \n 2.dark \n 3.black \n 4.cold");
	   int choice=sc.nextInt();
		switch(choice) {
		case 1:System.out.println("your order for cappachino is here");
		break;
		case 2:System.out.println("your order for dark is here");
		break;
		case 3:System.out.println("your order for black is here");
		break;
		case 4:System.out.println("your order for cold is here");
		break;
		default:
			System.out.println("please enter a valid number");
		}
	   }else{
			System.out.println("thankyou for visiting.");
		}
	   }
	}

