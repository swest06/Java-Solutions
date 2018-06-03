import java.util.ArrayList;
import java.util.List;

/**
 * Created by swest06 on 03/06/2018.
 */
public class Person {
    String lname;
    String fname;

    Person(String a, String b){
        this.fname = a;
        this.lname = b;
    }




    public static void main(String[] args) {
        Person a = new Person("sean", "west");
        Person b = new Person("sean", "wes");
        System.out.println(a.equals(b));

       // List<> p = new ArrayList<Integer>();
    }
}
