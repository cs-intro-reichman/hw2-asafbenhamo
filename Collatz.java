// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int num = Integer.parseInt(args[0]);
		 String a = args[1];
		 if (a.equals("C")== true) {
			System.out.println( "Every one of the first " + num + " hailstone sequences reached 1.");
		 }
		else if (a.equals("V") == true)
		 {
			int i = 1;
			while (i <= num){
			if (i ==1) {
				System.out.println("1 4 2 1 (4)");
				
			}
			else if (i>1) {
				 int f = i ;
                 int y = 0;
				 String s = "";
					while (f!=1) {
						s = s + f + " ";
					if (f %2 == 0) {	
				    f = f / 2 ;
					}
				 else {
				f = f *3 +1 ;
				}
				y++;
			}
			s = s + "1 (" + y + ")" ;
			System.out.println(s);

			}
				i++;
			}
			System.out.println( "Every one of the first " + num + " hailstone sequences reached 1.");
		}
				
			
	}
}


	

