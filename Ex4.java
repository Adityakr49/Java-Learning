package CodeWithHarry.Playground;
class Circle{
    public int radius;
    Circle(int r){
        System.out.println("I'm circle parametrized constructor");
        this.radius=r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder extends Circle{
    public int height;
    Cylinder(int height,int radius){
        super(radius);
        System.out.println("I'm cylinder parametrized constructor");
        this.height=height;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*height;
    }
}
public class Ex4 {
    public static void main(String[] args) {
        //Circle obj1=new Circle(5);
        Cylinder obj=new Cylinder(5,10);
        System.out.println("Volume of Cyn:"+obj.volume());
    }
}
