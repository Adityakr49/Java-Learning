package CodeWithHarry.Playground;

public class PracSet3 {
    public static void main(String X[]) {
        //Problem 1
        String name = "Jack Parker";
        name = name.toLowerCase();
        System.out.println(name);

        //Problem 2
        String text="To lower Case";
        text=text.replace(" ","_");
        System.out.println(text);

        //Problem 3
        String letter="Dear <|name|>, Thanks a lot!";
        letter=letter.replace("<|name|>", "Aditya");
        System.out.println(letter);

        //Problem 5
        String myString="This string contains  double and   triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        //Problrm 5
        String myLetter="Dear Harry,\n \t This Java Course is Nice.\n\t Thanks!";
        System.out.println(myLetter);
    }
}
