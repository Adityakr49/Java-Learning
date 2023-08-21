package CodeWithHarry.Playground;
class Cons_Over
{
    public static void main(String X[]){
        Complex o1=new Complex(2,7);
        Complex o2=new Complex(3,2,o1);
        System.out.println("Real: "+o2.real+"  Complex:"+o2.img);
    }
}
class Complex
{
    double real,img;
    Complex(double real,double img)
    {
        this.real=real;
        this.img=img;
    }
    Complex(double real,double img,Complex o)
    {
        this.real=real;
        this.img=img;
        this.real+=o.real;
        this.img+=o.img;
    }
}
