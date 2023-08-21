package CodeWithHarry.Playground;

import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        //Integer input
        //System.out.println("Enter the number 1");
        //int a = sc.nextInt();
        //System.out.println("Enter the number 2");
        //int b = sc.nextInt();
        //int sum=a+b;
        //System.out.println("Sum of the number is");
        //System.out.println(sum);

        //Float input
        //System.out.println("Enter floating point number 1");
        //float c=sc.nextFloat();
        //System.out.println("Enter floating point number 2");
        //float d=sc.nextFloat();
        //float sum1=c+d;
        //System.out.println("Sum of floating point no is:");
        //System.out.println(sum1);

        //To check taken input is integer or not
        //System.out.println("Enter a integer input");
        //boolean b1=sc.hasNextInt();
        //System.out.println(b1);

        //Reading a string or Line
        System.out.println("Enter a Word");
        String str=sc.next();//Won't take a line
        System.out.println(str);
        System.out.println("Enter a line");
        sc.nextLine();//to take the next line as input otherwise it will get stored in line
        String line = sc.nextLine();
        System.out.println(line);
    }
}
