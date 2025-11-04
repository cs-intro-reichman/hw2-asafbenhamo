//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // Replace this comment with your code

            String a = args [0];
            int num = Integer.parseInt(args[1]);
            int b =  (int) a.length();
            while ( b>1) {
                 {
                        char c = a.charAt(a.length()- b); 
                System.out.println("Give ma an " + c + ": " + c + "!");
                 b = b - 1 ;
                }
                
                }
                if (b==1){
                        char c = a.charAt(a.length()- 1);
                System.out.println("Give ma an " + c + ": " + c + "!");
                }
                
            
            System.out.println("What does it spell?");
            while (num>0) {
                System.out.println(a + "!!!");
                num = num - 1;   
            }
        }
}
