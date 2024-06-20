package abstarction2;

public class Employee extends Organization
{

	private int employeeId;
	private String employeeName;
	
	public Employee()
	{
		
	}

	public Employee(int employeeId, String employeeName) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}


	public String getInfo() 
	{
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
	}

	
	
		
}
