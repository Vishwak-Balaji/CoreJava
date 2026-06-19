package CoreJava.DSA.basicMath;
import java.util.*;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int count = 0;
        for(int i=1 ; i*i<=num ; i++){
            if(num%i==0){
                count++;
                if(i != num/i){
                    count ++;
                }
            }
        }
        if(count==2){
            System.out.println(num +" is prime");
        }
        else{
            System.out.println(num +" Is not a prime");
        }
    }
}
