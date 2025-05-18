import mypkg.hello;
import mypkg.subpkg.nestedhello;
public class main {
    public static void main (String[] args) {
        hello h = new hello();
        h.sayHello();
        nestedhello nh = new nestedhello();
        nh.sayNestedHello();
    
       
        
    }
}