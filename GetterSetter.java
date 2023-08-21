package CodeWithHarry.Playground;

class MyEmployee {

    private int id;
    private  String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
}

public class GetterSetter {
    public static void main(String[] args) {
        MyEmployee emp1 = new MyEmployee();

        emp1.setName("Shubham");
        System.out.println(emp1.getName());
        emp1.setId(1);
        System.out.println(emp1.getId());


        //Getter Setter to access private members of a class
    }
}

