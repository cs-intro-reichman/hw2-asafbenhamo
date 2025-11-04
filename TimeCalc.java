public class TimeCalc {
    public static void main(String[] args) {

        // Replace this comment with your code
        int h = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int m = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
    
        int addm = Integer.parseInt(args[1]);
        int totalm = (h * 60) + (m) + (addm);
        int totalh = (int) totalm / 60 ;
        int newh = totalh % 24;
        int newm = (int) totalm - ( totalh * 60);
        if (( newm < 10) && (newh < 10)){
            System.err.println("0" + newh + ":" + "0" + newm);
        }
        else if (newm < 10) {
            System.err.println( + newh + ":" + "0" + newm);
        }
        else if ( newh < 10) {
            System.err.println("0" + newh + ":"  + newm);

        }
       else System.err.println( newh + ":" + newm);

    }

}
