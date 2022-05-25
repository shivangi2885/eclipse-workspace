package inheritance;

public class Main {

	public static void main(String[] args) {
		Student s=new Student(1,"ABC","shivangi",21);
		System.out.println(s);
		Employee e=new Employee(s);
		System.out.println("employee id :"+e.empid);
		e.hobby();
		
		s.hobby();

	}

}
