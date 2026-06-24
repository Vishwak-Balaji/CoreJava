package CoreJava.DSA.Recursion;

import java.util.*;

public class Print1ToN {
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.print("Enter the total numbers should print : ");
       int n = scan.nextInt();
       System.out.println("Enter the number : ");
       int start =scan.nextInt();
       printnum(start,n);
   }
   private static void printnum(int start , int n){
       if(n ==0){
           return;
       }
       System.out.println(start);
       printnum(start+1,n-1);

   }
}
