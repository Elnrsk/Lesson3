public class P3Ps13{
	public static void main(String[] args) {
		int n = 1234;
		int m1= n/1000;//1
		int m2= n/100%10;//2
		int m3= n/10%10;//3
		int m4= n%10;//4
		double sum = m1+m2+m3+m4;
		double prod = m1*m2*m3*m4;
		System.out.println("The num of thousans:"+m1);
		System.out.println("The num of hundreds:"+m2);
		System.out.println("The num of tens :"+m3);
		System.out.println("The num of units:"+m4);
		System.out.println("The sum is:"+sum);
		System.out.println("The prod:"+prod);
	}
}