package javaStaticPloymorphism;

public class CustomerTestClass2 {

	public static void main(String[] args) {
		
		
		Customer customer1 = new Customer();
		Customer customer2 = new Customer();
		
		customer1.getDetails();
		
		System.out.println("----------------------------------------");	

		customer2.getDetails(2567, "Renuka", "Delhi", 9876598765L);
				
	}

}
