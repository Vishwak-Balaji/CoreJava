//258. Add Digits - leetcode

package CoreJava.DSA.basicMath;

import java.util.Scanner;

public class AddDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        num = Math.abs(num); // Handle negative number
        while(num>10) {
            num = add(num);
        }

        System.out.println("The single digit number is :" + num);

        }
        public static int add(int n){
        int sum = 0;
        while ( n!=0){
            int div = n %10;
            sum +=div;
            n/=10;
        }
        return sum;
    }
}
