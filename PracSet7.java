package CodeWithHarry.Playground;
import javax.lang.model.type.NullType;
import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;
public class PracSet7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Question 1
      /*  System.out.println("Enter the number whose multiplication table has to be printed");
        int n= sc.nextInt();
        Multab(n);

       */
        //Question 2
      /*  System.out.println("Enter the Value of n for pyramid struct");
        int n1= sc.nextInt();
        Pyr1(n1);

       */
        //Question 3
/*        System.out.println("Enter the Value of n for Sum of first n natural no");
        int n2= sc.nextInt();
        System.out.println("Sum of first n natural no "+Sum(n2));

 */
        //Question 4
/*        System.out.println("Enter the Value of n for pyramid struct");
        int n2= sc.nextInt();
        Pyr2(n2);

 */
        //Question 5
/*        System.out.println("Enter the Value of n for Fibonacci series");
        int n3 = sc.nextInt();
        System.out.println(n3 + " fib no: " + Fib(n3));

 */
        //Question 6
/*        System.out.println("Find no of terms");
        int n4=sc.nextInt();
        float [] arr=new float[n4];
        System.out.println("Enter the numbers to find avg");
        for (int i = 0; i < n4; i++) {
            arr[i]=sc.nextFloat();
        }
        System.out.println("Avg:"+ avg(arr)/n4);

 */
        //Question 7:Question 4 in recursion
/*        System.out.println("Enter the Value of n for pyramid struct");
        int n5= sc.nextInt();
        Pyr3(n5);

 */
        //Question 8:Question 2 using recursion
        //Question9
        System.out.println("Enter the Temp(C)");
        float tc= sc.nextFloat();
        TcToTf(tc);
    }
    static void Multab(int n) {
        System.out.println("Mul table of "+n);
        for (int i = 1; i < 11; i++)
        {
            System.out.println(n+"X"+i+"="+n*i);
        }
    }
    static void Pyr1(int n)
    {
        for (int i=0;i<n;i++)
        {
            for (int j = i; j >=0 ; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    static int Sum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else
        {
            return n+Sum(n-1);
        }
    }
    static void Pyr2(int n)
    {
        for (int i=0;i<n;i++)
        {
            for (int j = n-i; j >0 ; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    static int Fib(int n)
    {
        if(n==0 || n==1)
        {
            return n-1;
        }
        else {
            return Fib(n-1)+Fib(n-2);
        }
    }
    static float avg(float ...arr){
        float sum = 0;
        for (float a : arr){
            sum = sum + a;
        }
        return sum;
    }
    static void Pyr3(int n)
    {
        if (n>0) {
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println("");
            Pyr3(n-1);
        }
    }
    static void TcToTf(float n)
    {
        float tf=n+273.15f;
        System.out.println("Temp(Frn):"+tf);
    }
}
