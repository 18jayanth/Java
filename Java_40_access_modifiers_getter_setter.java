class myemployee{
    private int id;
    private String name;
    public int getid()
    {
        return id;

    }
    public String getname()
    {
        return name;

    }
    public void  setid(int idno)
    {
        id=idno;

    }
    public void setname(String name1)
    {
        name=name1;

    }


}
public class Java_40_access_modifiers_getter_setter {
    public static void main(String[] args) {
        //usage of private access modifier
        myemployee e1=new myemployee();
//        e1.id=500;
//        e1.name="Jayanth";
        e1.setid(500);
        e1.setname("Jayanth");
        System.out.println("id of employee is "+e1.getid());
        System.out.println("name of employee is "+e1.getname());


    }
}
