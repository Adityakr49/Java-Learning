package CodeWithHarry.Playground;
import java.util.Scanner;
public class PracSet5 {
    public static void main(String X[]) {
        Scanner sc=new Scanner(System.in);
        //Question 1
   /*   for (int i = 4; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.printf("%c", '*');
            }
            System.out.println();
        }
*/
        //Question 2
 /*     System.out.println("Enter The value of n");
        int n=sc.nextInt();
        int i=0;
        int count=0;
        while (i<=n)
        {
            if (i%2 == 0)
            {
                count=count+i;
            }
            i++;
        }
        System.out.printf("Sum of Even Number till %d is %d\n",n,count);
  */
        //Question 3
 /*     System.out.println("Enter n for multiplication Table");
        int n1=sc.nextInt();
        int i=1;
        System.out.println("Multiplication Table");
        while(i<=10)
        {
            System.out.printf("%d X %d = %d\n",n1,i,n1*i);
            i++;
        }
  */
        //Question 4
/*      System.out.println("Multiplication Table of 10 in reverse order");
        int i=10;
        while(i>=1)
        {
            System.out.printf("10 X %d = %d\n",i,10*i);
            i--;
        }
 */
        //Question 5
/*        System.out.println("Enter the no to find factorial");
        int n3=sc.nextInt();
        int fact=1;
        if(n3>=0) {
            for (int i = n3; i > 0; i--) {
                fact = fact * i;
            }
            System.out.printf("Fact of %d is %d", n3, fact);
        }
        else{
            System.out.println("Caution! Negetive Number");
        }

 */
        //Question 6
        //Repeat problem 5 using a while loop

        //Question 7
        //Repeat problem 1 using for/while loop

        //Question 9
        System.out.println("Sum of the numbers occurring in the multiplication table of 8");
        int c=0;
        for (int i=0;i<11;i++)
        {
            c=c+(8*i);
        }
        System.out.printf("%d",c);
    }
}