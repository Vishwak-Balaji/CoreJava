package CoreJava.oops.properties.inheritance;

public class Box {
    double length;
    double height;
    double width;

    Box(){
        this.length=1;
        this.height=2;
        this.width=3;
    }
    //cube
    Box(double side){
        this.length=side;
        this.height=side;
        this.width=side;
    }
    Box(double l, double h, double  w){
        this.length=l;
        this.height=h;
        this.width=w;
    }

    Box(Box obj){
        this.height=obj.height;
        this.length = obj.length;
        this.width=obj.width;
    }

    public void information(){
        System.out.println("making the box");
    }
}
