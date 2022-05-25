package inheritance;

public class Person { 
	protected String name;
	protected int age;
	
	public Person() {
		super();
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void hobby() {
		System.out.println("person:painting");
	}
	
}
