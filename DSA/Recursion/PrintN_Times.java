package CoreJava.DSA.Recursion;
import java.util.*;
public class PrintN_Times {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int N = scan.nextInt();
        System.out.print("Enter the name : ");
        String name = scan.next();

        print(0,N , name);

    }
    private static void print(int count ,int n , String name){
        if(count == n){
            System.out.println("The name is printed "+n+" Times");
            return;
        }
        count++;
        System.out.println(name);
        print(count,n,name);
    }
}
