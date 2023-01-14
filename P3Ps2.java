public class P3Ps2{
	public static void main (String [] args){
		int a = 2;

		int number=a;
		int pow = 2;
		double powRes = Math.pow(number,pow);
		double sqrtRes = Math.sqrt(powRes+1);


		double y = (powRes+10) / sqrtRes;
		System.out.println(y);

	}
}