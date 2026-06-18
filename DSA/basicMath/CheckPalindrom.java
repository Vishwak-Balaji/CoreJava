package CoreJava.DSA.basicMath;

import java.util.Scanner;

public class CheckPalindrom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        if(num == palindrom(num)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

    }
    public static  int palindrom(int n){
        int rev = 0;
        while(n !=0){
            rev = rev * 10 +(n%10);
            n/=10;
        }
        return rev;
    }
}
