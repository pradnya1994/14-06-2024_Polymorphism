package javaDynamicPloymorphism;

public class TestClass 
{

	public static void main(String[] args) {
		
		Student student = new Student(101, "Pradnya", "B.E Final Year", 67.45f);
		System.out.println(student.getDetails());
		
		System.out.println("======================================================================");
		
		Department department = new Department(1111, "Computers");
		System.out.println(department.getDetails());
	}

}
