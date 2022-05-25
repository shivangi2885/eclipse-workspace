package banking;

public class Bank {
    private int acc_no;
    private String acc_name;
    private int aadhar_num;
    private double acc_bal;
    
    Bank(){
   
    }
    Bank(int k){
    	acc_no = k;
    }
    Bank(String str,int i,double j){
    	acc_name=str;
    	aadhar_num = i;
    	acc_bal =j ;
    	
    }
	public int getAcc_no() {
		return acc_no;
	}
	public String getAcc_name() {
		return acc_name;
	}
	public int getAadhar_num() {
		return aadhar_num;
	}
	public double getAcc_bal() {
		return acc_bal;
	}
	
public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}
	public void setAcc_name(String acc_name) {
		this.acc_name = acc_name;
	}
	public void setAadhar_num(int aadhar_num) {
		this.aadhar_num = aadhar_num;
	}
	public void setAcc_bal(double acc_bal) {
		this.acc_bal = acc_bal;
	}
	//	String acc_name,int aadhar_num,double acc_bal
	void display() {
		System.out.println("the account holder name is :"+acc_name);
		System.out.println("the addhar no is :"+aadhar_num);
		System.out.println("the account balance is :"+acc_bal);
	}
    
}
