public class P3Ps12{
	public static void main(String[] args) {
		
		int n = 625;

		double a = n /100;//6
		double b = n/10%10;//2
		double c = n%10;//5

		double d =a*100+c*10+b;
		double d1=c*100+a*10+b;
		double d2=c*100+b*10+a;
		double d3=b*100+c*10+a;
		double d4=b*100+a*10+c;

        System.out.println("Given number is:"+n);
        System.out.println("The number of hundred:"+a);
        System.out.println("The number of tens:"+b);
        System.out.println("The number of units:"+c);
		System.out.println(d);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);


	}
}