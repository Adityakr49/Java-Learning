package CodeWithHarry.Playground;
import java.util.Scanner;
public class StringIntro {
    public static void main(String[] args) {

        //Way of creating String
        String name = new String("Harry");  //using new
        System.out.print("The name is: ");
        System.out.print(name);

        String name1 = "Harry";    //Using String Literals
        System.out.print("The name is: ");
        System.out.print(name1);

        char[] str1 = {'H','A','R','R','Y'};
        String s = new String(str1);

        //Format specifier
        int a = 6;
        float b = 5.6454f;
        System.out.printf("The value of a is %d and value of b is %8.2f\n", a, b);
        System.out.format("The value of a is %d and value of b is %f", a, b);


        Scanner sc = new Scanner(System.in);
        String st = sc.next();            //for one word
        String st1 = sc.nextLine();        //For whole line
        System.out.println(st);
    }
}
