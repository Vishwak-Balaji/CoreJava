package CoreJava.DSA.Recursion;

public class IntroToRecursion {

    public static void main(String[] args) {
        int count = 0;
        rec(count);
        IntroToRecursion obj=new IntroToRecursion();
        int q=obj.r(4);
        System.out.print(q);
    }
    private static void rec(int n){
        if(n == 4){   // Base condition
            return;
        }
        System.out.println(n);
        n = n+1;
        rec(n);
    }
    static int r(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return r(n-1) + r(n-2);
    }
}

