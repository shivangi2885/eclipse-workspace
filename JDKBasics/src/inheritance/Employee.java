package inheritance;

public class Employee extends Person {
	//protected Student s;
	private int empid;
	public Employee(Student s) {
		super();
		// this.s=s
		this.empid=s.rollno;
	}

//	public int getEmpid() {
//		return empid;
//	}
//
//	public void setEmpid(int empid) {
//		this.empid = empid;
//	}
	
}
