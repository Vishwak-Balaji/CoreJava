package CoreJava.DSA.Recursion;

public class IntroToRecursion {

    public static void main(String[] args) {
        int count = 0;
        rec(count);
    }
    private static void rec(int n){
        if(n == 4){   // Base condition
            return;
        }
        System.out.println(n);
        n = n+1;
        rec(n);
    }
}
