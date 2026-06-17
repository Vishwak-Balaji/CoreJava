package CoreJava.oops.properties.inheritance;

public class Main {
    public static void main(String[] args) {
        // Box box1 = new Box();
        // Box box2 = new Box(box1);
        // Box box3 = new Box(2);
        // Box box4 = new Box(6,4,2);

        // System.out.println(box1.length +" | "+ box1.height +" | "+box1.width);
        // System.out.println(box2.length +" | "+ box2.height +" | "+box2.width);
        // System.out.println(box3.length +" | "+ box3.height +" | "+box3.width);
        // System.out.println(box4.length +" | "+ box4.height +" | "+box4.width);

        BoxWeight box = new BoxWeight();
        System.out.println(box.length +","+box.height +","+box.width);

        BoxWeight box1 = new BoxWeight(10, 20, 30, 40);

        System.out.println(box1.length +","+box1.height +","+box1.width+","+box1.weight);

    }
}
