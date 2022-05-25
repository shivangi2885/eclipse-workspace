package inheritance;

public class Student extends Person {
    protected int rollno;
    protected String dept;

	public Student(int rollno, String dept,String name,int age) {
		super(name,age);
		this.rollno = rollno;
		this.dept = dept;
	}
	
	
  @Override
	public void hobby() {
		super.hobby();
//		System.out.println("student:painting");
	}
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", dept=" + dept + ", name=" + name + ", age=" + age + "]";
	}
	
    
}
