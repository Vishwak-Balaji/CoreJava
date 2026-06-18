// optimum way to print all the divisors
package CoreJava.DSA.basicMath;
import java.util.*;

import static java.lang.Math.sqrt;

public class PrintDivisors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i = 1 ; i<=sqrt(num) ; i++){
            if(num%i == 0){
                System.out.println(i);
                if(num%i !=i){
                    System.out.println(num/i);
                }
            }
        }
    }
}
