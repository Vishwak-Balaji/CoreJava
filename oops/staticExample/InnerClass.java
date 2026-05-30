package CoreJava.oops.staticExample;

public class InnerClass {
    static class Test{
        String name ;
        public Test(String name){
            this.name=name;
        }
    }
    public static void main(String[] args) {
        Test a = new Test("vishwak");
        Test b = new Test("Balaji");

        System.out.println(a.name);
        System.out.println(b.name);

    }
    

}
