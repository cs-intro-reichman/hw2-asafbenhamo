// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		int num = Integer.parseInt(args[0]);
		double p = Math.PI;
		double s = 1;
		int d = 3;
		while (num>0) {
		s = s - (1 / d);
		d = d +2;
		s = s +(1 / d);
		d = d + 2 ;

		num = num - 1;
		}
		 System.out.println("pi according to Java: " + p);
		 System.out.println("pi, approximated:     " + s);


	}
}
