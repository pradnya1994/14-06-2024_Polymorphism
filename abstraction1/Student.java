package abstraction1;

public class Student implements Department
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

	public String getDetails() 
	{
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentClass=" + studentClass
				+ ", studentMarks=" + studentMarks + "]";
	}	
	
}
