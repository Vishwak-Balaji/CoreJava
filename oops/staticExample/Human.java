package CoreJava.oops.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    static void message(){
        System.out.println("welcome world");
       // System.out.println(this.age);// not allowed because this.age need an object stuff which is not allowed in static. 
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population +=1;
        
    }

    
}
