package CoreJava.oops.staticExample;

// this is a demo to show initialisation of static variables
public class StaticBlock {
   public static void main(String[] args) {
    
    StaticBlock obj = new StaticBlock();
    System.out.println(StaticBlock.a +" "+ StaticBlock.b);

    StaticBlock.b += 2;

    System.out.println(StaticBlock.a +" "+ StaticBlock.b);

    StaticBlock obj2 = new StaticBlock();
    System.out.println(StaticBlock.a +" "+ StaticBlock.b);


   }

   static int a = 5;
   static int b;
// will only run once, when the first obj is create i.e. when the class is loaded for the first time
   static{
    System.out.println("Hello world");
    b=a*5;
   }
}
