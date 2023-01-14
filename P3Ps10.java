public class P3Ps10{
	public static void main(String[] args) {
		int n = 625;
		int m = n/100;//6
		int m1= n/10%10;//2
		int m2= n%10;//0
		double sum = m+m1+m2;
		double prod = m*m1*m2;
		System.out.println("Number of hundreds:"+m);
		System.out.println("Number of tens:"+m1);
		System.out.println("Number of units:"+m2);
		System.out.println("The sum of digits:"+sum);
		System.out.println("The prod of digits:"+prod);
	}
}