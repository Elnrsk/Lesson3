public class P3Ps9{
	public static void main(String[] args) {
		int n = 95;
		int tens = n / 10; //9
		int units = n % 10; //5
		double sum = tens + units ;
		double prod = tens * units ;
		System.out.println("Number of tens is :"+ tens);
		System.out.println("Number of units is :"+ units);
		System.out.println("Sum of digits is :"+ sum);
		System.out.println("Productof digits is:"+ prod);
	}
}