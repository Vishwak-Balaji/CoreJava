package CoreJava.DSA.basicMath;
import java.util.*;

import static java.lang.Math.sqrt;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int count=0;
        for(int i=1;i<=sqrt(n);i++){
            if(n%i==0){
                count+=1;
            }
        }
        if(count>1){
            System.out.println("It is not a prime");
        }
        else{
            System.out.println("It is a prime");
        }
    }
}
