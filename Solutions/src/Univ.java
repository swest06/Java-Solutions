/**
 * Created by swest06 on 03/06/2018.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Univ {

    public static void main(String[] args) {
        new Univ().run();
    }

    class Course {
        private String name;
        private int id;

        Course(String name, int id) {
            this.name = name;
            this.id = id;
        }
    }

    public void run() {
        Map <String, Integer> cs = new HashMap<>();
        Course computing = new Course("Computing", 600);
        Course is = new Course("Information Systems", 300);
        Course dm = new Course("Data Management", 100);
        cs.put(computing.name, computing.id);
        cs.put(is.name, is.id);
        cs.put(dm.name, dm.id);



        Map <String, Integer> eng = new HashMap<>();
        Course mech = new Course("Mechanical", 100);
        Course civi = new Course("Civil", 150);
        eng.put(mech.name, mech.id);
        eng.put(civi.name, civi.id);

        Map<String, Integer> bus = new HashMap<>();
        Course manag = new Course("Management", 800);

        Map<String, Map> courses = new HashMap<>();
        courses.put("Computer Science", cs);
        courses.put("Engineering", eng);
        courses.put("Business", bus);

        System.out.println("There are "+courses.size()+" departments.");
        System.out.println("There are " +courses.get("Computer Science").size() +" programmes in computer science");
        System.out.println(courses.get("Engineering").get("Civil") + " students enrolled in civil engineering");



    }
}
