package pkg;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		Productprojo p1 = new Productprojo(1001,"Lakme",1599.8f,100);
		Productprojo p2 = new Productprojo(1002,"kakme",1699.8f,3);
		Productprojo p3 = new Productprojo(1003,"sakme",1799.8f,2);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		Scanner sc = new Scanner(System.in);
		String ch=sc.next();
		while(ch.equalsIgnoreCase(ch)) {
		System.out.println("enter your choice");
		System.out.println("1. Yes \t 2.No");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:System.out.println("you are in case 1");
		break;
		case 2:System.out.println("you are in case 2");
		break;
		}
		if(p1.quantity>50&&p1.price<1000) {
			System.out.println("announce offer");
		}else if(p1.getProductName()=="Lakme"){
			System.out.println("year end sale will start by november");
		}
		// nested if can also be used
		else {
			System.out.println("no idea of offers now");
		}
	}

}
}