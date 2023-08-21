package CodeWithHarry.Playground;
import java.util.Scanner;
public class PracSet6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Question 1
/*        float [] n= new float[5];
        float count=0;
        System.out.println("Enter Marks of 5 test");
        for (int i=0;i<5;i++)
        {
            n[i]=sc.nextFloat();
            count+=n[i];
        }
        System.out.printf("Sum of Marks of 5 test = %f",count);

 */
        //Question 2
/*        System.out.println("Enter the length of array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter array elements");
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the array element to search");
        int temp=sc.nextInt();
        for (int i=0;i<n;i++)
        {
            if(arr[i]==temp)
            {
                System.out.printf("Element found at Position %d",i+1);
                break;
            }
        }
*/
        //Question 3
/*        System.out.println("Enter the no of students");
        int n=sc.nextInt();
        float avg=0f;
        float [] marks=new float[n];
        System.out.println("Enter Marks of physics");
        for (int i=0;i<n;i++)
        {
            marks[i]=sc.nextFloat();
        }
        for (float element: marks) {
            avg+=element;
        }
        System.out.printf("Average Physics Marks: %f",avg/n);

 */

        //Question 4
/*        int [][] mat1=new int[2][3];
        int [][] mat2=new int[2][3];
        int [][] mat3=new int[2][3];

        System.out.println("Enter Data of matrix 1");
        for (int i=0;i< mat1.length;i++)
        {
            for (int j=0;j<mat1[i].length;j++)
            {
                mat1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter Data of matrix 2");
        for (int i=0;i< mat2.length;i++)
        {
            for (int j=0;j<mat2[i].length;j++)
            {
                mat2[i][j]=sc.nextInt();
            }
        }

        System.out.println("Matrix 1");
        for (int i=0;i< mat1.length;i++)
        {
            for (int j=0;j<mat1[i].length;j++)
            {
                System.out.printf("%d\t",mat1[i][j]);
            }
            System.out.println("");
        }

        System.out.println("Matrix 2");
        for (int i=0;i< mat2.length;i++)
        {
            for (int j=0;j<mat2[i].length;j++)
            {
                System.out.printf("%d\t",mat2[i][j]);
            }
            System.out.println("");
        }

        System.out.println("Added matrix");
        for (int i=0;i< mat3.length;i++)
        {
            for (int j=0;j<mat3[i].length;j++)
            {
                mat3[i][j]=mat1[i][j]+mat2[i][j];
                System.out.printf("%d\t",mat3[i][j]);
            }
            System.out.println("");
        }

 */
        //Question 5
/*        System.out.println("Enter length of array");
        int n=sc.nextInt();
        int temp;
        int [] ar=new int[n];

        System.out.println("Enter Data of array");
        for (int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }

        System.out.println("Array Before Reveresing");
        for (int i=0;i<n;i++)
        {
            System.out.printf("%d\t",ar[i]);
        }
        System.out.println("");
        for (int i=0;i<n/2;i++)
        {
            temp=ar[i];
            ar[i]=ar[n-1-i];
            ar[n-1-i]=temp;
        }

        System.out.println("Reversed Array");
        for (int i=0;i<n;i++)
        {
            System.out.printf("%d\t",ar[i]);
        }

 */
        //Question 6
/*        System.out.println("Enter length of array");
        int n=sc.nextInt();
        int max=-2147483648;//Min int possible
        int min=2147483647;//Max int possible
        int [] arrr=new int[n];

        System.out.println("Enter Data of array");
        for (int i=0;i<n;i++)
        {
            arrr[i]=sc.nextInt();
            if(arrr[i]>max)
            {
                max=arrr[i];
            }
            if(arrr[i]<min)
            {
                min=arrr[i];
            }
        }
        System.out.printf("Max Element= %d\n",max);
        System.out.printf("Min Element= %d",min);

 */
        //Question 8
        System.out.println("Enter length of array");
        int n=sc.nextInt();
        int [] arrrr=new int[n];
        int temp=0;
        System.out.println("Enter Data of array");
        for (int i=0;i<n;i++) {
            arrrr[i] = sc.nextInt();
            if(i>0) {
                if (arrrr[i] > arrrr[i - 1]) {
                    continue;
                } else {
                    System.out.println("Unsorted");
                    temp++;
                    break;
                }
            }
        }
        if(temp==0)
        {
            System.out.println("Sorted");
        }
    }
}
