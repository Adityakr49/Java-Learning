package CodeWithHarry.Playground;
import java.util.Scanner;
public class PracSet2 {
    public static void main(String[] args) {
        //Question 1
        float a = 7/4.0f * 9/2.0f;
        System.out.println(a);

        //Question 2
        char grade = 'B';
        //Encrypting
        grade = (char)(grade + 8);
        System.out.println(grade);
        //Decrypting
        grade = (char)(grade - 8);
        System.out.println(grade);


        //Question 3
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        System.out.println(c>8);
        System.out.println(7*49/7+35/7);
    }
}
