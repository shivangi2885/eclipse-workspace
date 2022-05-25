package banking;

import java.util.Scanner;

public class Bankmain {

	public static void main(String[] args) {
		Bank l = new Bank();
		
		Bank b = new Bank(2043);
		System.out.println("the account no.is :"+b.getAcc_no());
		Scanner s = new Scanner(System.in);
		System.out.println("enter the account holder name :");
		String a=s.nextLine();
		System.out.println("enter the aadhar number: ");
		int c =s.nextInt();
		System.out.println("enter total balance :");
		double d=s.nextDouble();
		
		l.setAcc_name(a);
		l.setAadhar_num(c);
		l.setAcc_bal(d);
//		Bank k= new Bank(a,c,d);
//		System.out.println("the account holder name is :"+k.getAcc_name());
//		Bank l=new Bank();
		l.display();
//		l.getAcc_name(),l.getAadhar_num(),l.getAcc_bal()
	}

}
