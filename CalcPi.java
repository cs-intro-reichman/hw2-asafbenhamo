// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		int num = Integer.parseInt(args[0]);
		double p = Math.PI;
		double s = 1.0;
		double d = 3.0;
		int o = 1;
		while (num>0) {
		s = s - o * (1.0 / d);
		d = d +2.0;
		o = o * -1 ;
		num = num - 2;
		}
		s = s * 4.0;
		 System.out.println("pi according to Java: " + p);
		 System.out.println("pi, approximated:     " + s);


	}
}
