package CoreJava.DSA.basicMath;

import java.util.*;

public class GCD {
    public static void main(String [] args){
        Scanner scan = new Scanner (System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
/*

// Basic Brute force method
        int max=Integer.MIN_VALUE;

        for(int i =1 ;i<=Math.min(num1 , num2)  ; i++){
            int ref = 0;
            if(num1%i == 0 && num2%i==0){
                ref = i;
            }
            if(ref>=max){
                max = ref;
            }
        }
        System.out.println(max);
*/
        // Euclidean Algorithm (optimum way)
        while(num1 !=0){
            int temp = num1;
            num1 = num2%num1;
            num2=temp;
        }
        System.out.println(num2);
    }
}
