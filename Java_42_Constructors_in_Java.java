class myemployee1 {
    private int id;
    private String name;
//constructor overloading
   public myemployee1() {
       id = 45;
        name = "jayanth";
  }
public myemployee1(int id,String name) {
        this.id = id;
       this.name = name;
    }


    public int getid() {
        return id;

    }

    public String getname() {
        return name;

    }

    public void setid(int idno) {
        this.id = idno;

    }

    public void setname(String name1) {
        this.name = name1;

    }
}

    public class Java_42_Constructors_in_Java {
        public static void main(String[] args) {
            //myemployee1 e1=new myemployee1();
            myemployee1 e1=new myemployee1(5,"Pavan");
            System.out.println(e1.getname());
            myemployee1 e2=new myemployee1();
            System.out.println(e2.getname());

        }
    }
