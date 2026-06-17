package CoreJava.DSA;
import java.util.*;
public class Basicmath {
    public static void main(String [] args){
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        int rev = 0;
        while(n>0){
            int div = n%10;
            rev = rev * 10 + div;
            n/=10;
        }
        System.out.println(rev);
    }
}
