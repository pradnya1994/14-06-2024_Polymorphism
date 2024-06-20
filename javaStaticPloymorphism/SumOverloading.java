package javaStaticPloymorphism;

public class SumOverloading 
{
	//method overloading
	public static int sum(int a, int b)
	{
		return a+b;
	}
	
	public static int sum(int a, int b, int c)
	{
		return a+b+c;
	}

	public static int sum(int a, int b, int c, int d)
	{
		return a+b+c+d;
	}
	
	public static void main(String[] args) {

		System.out.println(SumOverloading.sum(200, 100));
		System.out.println(SumOverloading.sum(200, 100, 400));
		System.out.println(SumOverloading.sum(200, 100, 400, 500));;
	}

}
