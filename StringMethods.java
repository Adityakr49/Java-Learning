package CodeWithHarry.Playground;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String Function

        //https://www.codewithharry.com/videos/java-tutorials-for-beginners-14/


        //String is Immutable i.e on performing fn it doesnot
        //change in its original pos unless like
        //str=str.toLowerCase();

        //Length of string
        /*System.out.println("Enter a String to find its length");
        String str = sc.nextLine();
        int value=str.length();
        System.out.printf("Length of given String %d",value);*/


        //toLowerCase and toUpperCase
        /*System.out.println("Enter a String for toLowerCase and toUpperCase");
        String str1 = sc.nextLine();
        String lstring=str1.toLowerCase();
        System.out.println(lstring);

        String ustring=str1.toUpperCase();
        System.out.println(ustring);*/

        //trim(Removes leading and trailing spaces)
        /*System.out.println("Enter a string for trim ops");
        String str2=sc.nextLine();
        String trim=str2.trim();
        System.out.println(trim);*/

        //substring(index) (gives back string from mentioned index
        // to mentioned index(if mentioned))
        // start included, end excluded
        /*System.out.println("Enter a string for substring ops");
        String str3=sc.nextLine();
        System.out.println(str3.substring(3));
        System.out.println(str3.substring(0,6));*/


        //replace('r','p') replaces r with p
        /*System.out.println("Enter a string for replace ops");
        String str4=sc.nextLine();
        System.out.println("Enter Character to be replaced in string");
        char r= sc.next().charAt(0);
        System.out.println("Enter new Character for replaced character");
        char p= sc.next().charAt(0);
        System.out.println("After replacing string is " + str4.replace(r,p));
        //also
        System.out.println(str4.replace("rry","ppy"));*/


        //General checking-startsWith and endWith
        /*System.out.println("Enter string to be Checked");
        String str5=sc.nextLine();
        System.out.println(str5.startsWith("H"));
        System.out.println(str5.startsWith("Y"));*///Returns boolean

        //charAt(i)
        /*System.out.println("Enter the string");
        String str6=sc.nextLine();
        System.out.println("Enter the Index");
        int i=sc.nextInt();
        System.out.println("Char at given index:"+str6.charAt(i));*/

        //indexOf(str)
        /*System.out.println("Enter the string");
        String str7=sc.nextLine();
        System.out.println("Enter the character to Get its Index");
        char i=sc.nextLine().charAt(0);
        System.out.println("Char at given index:"+str7.indexOf(i));
        //Limitation:Only gives index of 1st pos of char if it repeats multiple times
        System.out.println(str7.indexOf("r",3));
        System.out.println(str7.indexOf("rry"));*/

        //lastindexof()
        /*System.out.println("Enter the string");
        String str8=sc.nextLine();
        System.out.println("Last index of the given string " + str8.lastIndexOf("r"));
        System.out.println("Last index of the given string " + str8.lastIndexOf("r",2));
        //return last index of a char before given index*/

        //equals and equalsIgnoreCase
        /*System.out.println("Enter the string");
        String str9=sc.nextLine();
        System.out.println(str9.equals("Harry"));
        System.out.println(str9.equalsIgnoreCase("harry"));*/

        //Escape sequence
        System.out.println("This is a escape sequence \" back slash");
        //to print backslash
        // \n \t
    }
}
