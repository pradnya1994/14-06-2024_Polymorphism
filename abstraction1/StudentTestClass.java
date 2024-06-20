package abstraction1;


public class StudentTestClass 
{

	public static void main(String[] args) 
	{		
		
		Department department = new Student(101, "Pankaj", "B.E Final Year", 67.45f);
		System.out.println(department.getDetails());
		
		
	}

}
