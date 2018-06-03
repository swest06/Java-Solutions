import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class Univ2 {
    public static void main(String[] args) {
        new Univ2().run();
    }

    class Course {
        private String name;
        private int id;

        Course(String name, int id) {
            this.name = name;
            this.id = id;
        }
    }

    public void run(){
        HashMap<Univ2.Course, String> courses = new HashMap<>();
        courses.put(new Course("Computing", 600), "Computer Science");
        courses.put(new Course("Information System", 300), "Computer Science");
        courses.put(new Course("Mechanical", 100), "Engineering");
        courses.put(new Course("Civil", 150), "Engineering");
        courses.put(new Course("Management", 800), "Business");

        System.out.println(courses.size());
        System.out.println(courses.keySet());
    }
}