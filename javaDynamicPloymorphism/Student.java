package javaDynamicPloymorphism;

public class Student extends Department
{

	private int studentId;
	private String studentName;
	private String studentClass;
	private float studentMarks;
	
	public Student()
	{
		
	}

	public Student(int studentId, String studentName, String studentClass, float studentMarks) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentClass = studentClass;
		this.studentMarks = studentMarks;
	}

	//overrides com.javaDynamicPloymorphism.Department.getDetails() method from Department class
	public String getDetails() 
	{
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentClass=" + studentClass
				+ ", studentMarks=" + studentMarks + "]";
	}
	
	
	
	
	
}
