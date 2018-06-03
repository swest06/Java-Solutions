import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by swest06 on 03/06/2018.
 */
public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        Iterator<Integer> iter = list.descendingIterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

    }

    public static void reverse(LinkedList list){
        Iterator<Object> iter = list.descendingIterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
