 class Employee{
    int id;
    String name;
    public void set_details(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    public void print_details()
    {
        System.out.println("Employee Number is "+id);
        System.out.println("Employee Name is "+name);
    }


}
public class Java_38_Creating_our_own_Java_Class {

    public static void main(String[] args) {
        System.out.println("Custom Class");
        Employee e1=new Employee();//instansting a new Employee object
        Employee e2=new Employee();

        //setting the attributes
//        e1.id=15;
//        e1.name="Jayanth";
        e1.set_details(15,"Jayanth");
        e2.set_details(16,"Ajay");


        //printing the attributes
        e1.print_details();
        e2.print_details();

    }



}
