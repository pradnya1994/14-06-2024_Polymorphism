package javaStaticPloymorphism;

public class Customer
{

	//fields
	private int customerId;
	private String customerName;
	private String customerAddress;
	private long customerContactNo;

	//constructors	
	public Customer()//default constructor
	{
		this.customerId = 9999;
		this.customerName = "Pradnya";
		this.customerAddress = "Pune";
		this.customerContactNo = 987654322L;
		
	}

	//parameterized constructor
	public Customer(int customerId, String customerName, String customerAddress, long customerContactNo) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerContactNo = customerContactNo;
	}

	//method: having same method name but change in parameter list.
	public void getDetails()
	{
		System.out.println(customerId);
		System.out.println(customerName);
		System.out.println(customerAddress);
		System.out.println(customerContactNo);		
	}
	
	public void getDetails(int customerId, String customerName)
	{
		System.out.println(customerId);
		System.out.println(customerName);
		System.out.println(customerAddress);
		System.out.println(customerContactNo);		
	}
	
	public void getDetails(int customerId, String customerName, String customerAddress, long customerContactNo)
	{
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerContactNo = customerContactNo;
		
		System.out.println(this.customerId);
		System.out.println(this.customerName);
		System.out.println(this.customerAddress);
		System.out.println(this.customerContactNo);
		
	}

}
