package CoreJava.oops;

public class ObjectAndClass {
    public static void main(String[] args) {
        Student vishwak = new Student();
        Student venket = new Student(01, "Venket", 97.30);
        Student random = new Student(venket);

        vishwak.mark = 85.4; 
        System.out.println(random.name);//venket


        vishwak.mark = 85.4; 

        System.out.println(vishwak.name);
        System.out.println(vishwak.roll);
        System.out.println(vishwak.mark);

        vishwak.changeName("Vishwak_Balaji");
        vishwak.greeting();


        

    }
}

//creating a class.
class Student{
    int roll;
    String name;
    double  mark;

    //function for greet
    void greeting (){
        System.out.println("Hello "+this.name +" welcome");
    }

    //function to change the name
    void changeName(String name){
        this.name = name;
    }

    // Student venkat = new Student(01, "Venket", 97.30);
    Student(int roll , String name , double mark){
        this.roll = roll;
        this.name=name;
        this.mark = mark;
    }

    //passing an another objectas a paramater for the constructor
    Student(Student other){
        this.name = other.name;
        this.roll = other.roll;
        this.mark = other.mark;
    }

    //set as default value
    Student(){
        roll = 23;
        name = "Vishwak";
        mark = 98.5;
    }
}
