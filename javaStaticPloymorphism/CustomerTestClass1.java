package javaStaticPloymorphism;

public class CustomerTestClass1 {

	public static void main(String[] args) {
		
		
		Customer customer1 = new Customer();
		Customer customer2 = new Customer();
		
		customer1.getDetails();
		System.out.println();
		customer2.getDetails();
				
		System.out.println("----------------------------------------");		

		Customer customer3 = new Customer(101, "MUkund", "Pune", 9090909090L);
		Customer customer4 = new Customer(102, "Raghav", "Mumbai", 9089898989L);
		
		customer3.getDetails();
		System.out.println();
		customer4.getDetails();
		
	}

}
