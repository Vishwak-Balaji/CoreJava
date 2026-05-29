package CoreJava.oops.staticExample;

public class Main {
    public static void main(String[] args) {
        Human vishwak = new Human(22,"vishwak balaji", 65000, false);
        Human rahul = new Human(23,"Rahul", 60000, false);
        Human ram = new Human(32,"ram", 100000, true);

        System.out.println(Human.population);
        fun();// no need object because fun() is a static method.

        Main funn = new Main();
        funn.fun2();
    }


     // this is not dependent on objects
    static void fun(){
        // System.out.println("Having fun");

        //greeting();//cant use this because it requires an instance
        //but the function is used here are using it in does not depend on instance

        
        // you cannot access non static stuff without referencing their instances in
        // a static context

         Main obj = new Main();
         obj.greeting();// hence here iam referencing it with an object .

    }
    void greeting(){
        //fun();
        System.out.println("Hello world");
    }

    void fun2(){
        greeting();
       // fun();// a static member is allowed inside a non static member.
    }
}
