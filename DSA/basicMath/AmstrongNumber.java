package CoreJava.DSA.basicMath;

import java.util.*;

import static java.lang.Math.*;

public class AmstrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int original = num;

        int count = (int)(log10(num)+1); // count the number of digits
        int sum = 0;
        while(num>0){
            int digit = num%10;
            sum+= Math.pow(digit,count);
            num/=10;
        }
        if(sum==original){
            System.out.println(original + " is a Amstrong number");
        }
        else{
            System.out.println(original + " is not a Amstrong number");
        }
    }
}
