package CodeWithHarry.Playground;
class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is: "+id);
        System.out.println("My name is: "+name);
    }
    public int getSalary(){
        return salary;
    }
}
public class FirstCusClass {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee harry = new Employee(); //Instantiating a new Employee object

        Employee john = new Employee();
        //Setting Attributs
        harry.id=12;
        harry.salary=34000;
        harry.name="CodeWithHarry";

        john.id=13;
        john.salary=26000;
        john.name="Johm Tripathi";

        harry.printDetails();
        john.printDetails();
        int salary=john.getSalary();
        System.out.println(salary);
        //Printing the Attributes
        //System.out.println(harry.id);
        //System.out.println(harry.name);
    }
}
