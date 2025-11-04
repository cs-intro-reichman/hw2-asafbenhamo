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
            if (b==1){
             
            }
            while ( b>0) {
                 {
                        char c = a.charAt(a.length()- b);
                        c = Character.toUpperCase(c);
                        if ((c == 'A') || (c =='E') || (c =='F') || (c =='H') || (c =='I') || (c =='L') || (c =='M')
                        || (c =='N') || (c =='O') || (c =='R') || (c =='S') || (c =='X')) {
                         System.out.println("Give me an " + c + ": " + c + "!");
                        }
                        else System.out.println("Give me a  " + c + ": " + c + "!");
                        b = b - 1 ;
                        
                }
                
                }
                if (b==1){
                        char c = a.charAt(a.length()- b);
                        c = Character.toUpperCase(c);
                        if ((c == 'A') || (c =='E') || (c =='F') || (c =='H') || (c =='I') || (c =='L') || (c =='M')
                        || (c =='N') || (c =='O') || (c =='R') || (c =='S') || (c =='R')) {
                         System.out.println("Give me an " + c + ": " + c + "!");
                        }
                        else System.out.println("Give me a  " + c + ": " + c + "!");
                        b = b - 1 ;
                }
                
            
            System.out.println("What does that spell?");
            while (num>0) {
                a = a.toUpperCase();
                System.out.println(a + "!!!");
                num = num - 1;   
            }
        }
}
