package javacoreconcepts.constructor;

public class Student {
	int id;
	String name;
    String school;

	// Parameterize Constructor
	Student(int stud_id, String stud_name) {
		this.id = stud_id;
		this.name = stud_name;
	}

	// Default Constructor
	Student() {
		System.out.println("I'm default constructor");
	}
	
	//Constructor overloading
	Student(int stud_id1, String stud_name1, String stud_school)
	{
		this.id = stud_id1;
		this.name = stud_name1;
		this.school = stud_school;
	}

	//displaying constructor parameterize
	public void display() {
		System.out.println("values of constructor:" + name + " " + id);
		
	}
	
	//displaying constructor overloading 
	public void display2() {
		System.out.println("values of constructor:" + name + " " + id+ " " +school);
	}
	
	//Main Method
	public static void main(String[] args) {
		Student c1 = new Student(1, "Sarita");
		Student c2 = new Student();
		Student c3 = new Student(2, "Yogeshwari", "HP");
		c1.display();
		c3.display2();
		System.out.println(c3.id);
		System.out.println(c3.name);
		System.out.println(c3.school);
	}
}