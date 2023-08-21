package CodeWithHarry.Playground;
//class Main111{
//    public static void main(String x[])
//    {
//        Ops o1=new Ops(2,3);
//        System.out.println(o1.Ops());
//        System.out.println(o1.Ops(4));
//        System.out.println(o1.Ops(4,5));
////        Ops o2=new Ops(5,6);
////        System.out.println(o1.Ops(2,2.3f));
//    }
//}
//class Ops{
//    int a;
//    float b;
//     Ops(int a,float b)
//     {
//        this.a=a;
//        this.b=b;
//     }
//    float Ops()
//    {
//        return a+b;
//    }
//    float Ops(int a)
//    {
//        return a+b;
//    }
//    float Ops(int a,float b)
//    {
//        return a+b;
//    }
//}


class T1{
    int real,img;
    T1(){

    }
    T1(int real, int img){
        this.real=real;
        this.img=img;
    }
}
class T2{
    int real,img;
    void add(T1 o1,T1 o2){
        this.real=o1.real+o2.real;
        this.img=o1.img+o2.img;
    }
}
class T3{
    public static void main(String[] args) {

        T1 o1 = new T1(30, 50);
        T1 o2 = new T1(50, 30);
        T2 o3 = new T2();
        o3.add(o1,o2);
        System.out.println("real: "+o3.real+" img: "+o3.img);
    }
}