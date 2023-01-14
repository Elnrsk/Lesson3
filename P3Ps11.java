public class P3Ps11{
	public static void main(String[] args) {
		int n = 729;
		double a = n/100;
		double b = n/10%10;
		double c = n%10;

		double d = c*100;
		double d1= b*10;
		double m= d+d1+a;
	
		System.out.println(m);
	}
}