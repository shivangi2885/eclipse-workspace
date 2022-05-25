package pkg;

import java.util.Scanner;

public class AssignmentMobileMain {

	public static void main(String[] args) {
		AssignmentMobile a = new AssignmentMobile();
		a.pid="A001";
		
		
		a.display();
		AssignmentMobile b = new AssignmentMobile("Afaq HUAWEI");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter product name: ");
		String r = sc.nextLine();
		System.out.println("enter model :");
		String g = sc.nextLine();
		System.out.println("enter cost :");
		Double c = sc.nextDouble();
		AssignmentMobile k = new AssignmentMobile(r,g,c);
//		k.show();
		AssignmentMobile.show();
	}

}
