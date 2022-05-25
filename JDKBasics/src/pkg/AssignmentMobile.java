package pkg;

public class AssignmentMobile {
      static String pid;
      static String pname;
      static String pmodel;
      static double cost;
      
	AssignmentMobile(){
    	  
      }
          AssignmentMobile(String name){
    	  System.out.println("the product name is :"+name);
      }
      AssignmentMobile(String str,String st,double h){
    	  pname=str;
    	  pmodel=st;
    	  cost=h;
      }
      void display() {
    	  System.out.println("welcome to our mobile shop");
    	  System.out.println("the product id is :"+pid);
      }
      static void show() {
    	  System.out.println("the product name is " +pname);
    	  System.out.println("the product model is "+pmodel+"\n the total cost is : "+cost);
      }
}
