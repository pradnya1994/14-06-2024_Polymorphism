/*
 * This is dynamic polymorphism example . It is also called Override polymorphism
 */
package javaDynamicPloymorphism;

public class Department 
{
	
	private int departmentId;
	private String departmentName;
	
	public Department()
	{
		
	}

	public Department(int departmentId, String departmentName) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}

	
	public String getDetails() 
	{
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + "]";
	}	

}
