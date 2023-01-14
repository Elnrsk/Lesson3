public class P3Ps3{
	public static void main(String[] args){
		int x = 2;
		int y = 7;
		double powRes = Math.pow(x,3);
		double powRes1 = Math.pow(x,2);
		double z = (powRes) - 2.5*x*y+ 1.78*powRes1-2.5*y+1;

        System.out.println(z);


        int a = 5;
        int b = 4;
        double powRes2 = Math.pow(b,3);
        double powRes3 = Math.pow(b,2);
        double q= 3.56 * a + powRes2 - 5.8 *powRes3 +3.8*a - 1.5;
        System.out.println(q); 
	}
}