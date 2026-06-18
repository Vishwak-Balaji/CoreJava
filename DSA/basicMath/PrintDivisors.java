// optimum way to print all the divisors
package CoreJava.DSA.basicMath;
import java.util.*;

import static java.lang.Math.sqrt;

public class PrintDivisors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList<>();
        int num = scan.nextInt();
        for(int i = 1 ; i<=sqrt(num) ; i++){
            if(num%i == 0){
                list.add(i);
                if(num/i!= i){
                    list.add(num/i);
                }

            }
        }
        Collections.sort(list);
        System.out.println(list);
    }
}
