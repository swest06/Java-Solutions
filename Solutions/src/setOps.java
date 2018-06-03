import java.util.Scanner;

/**
 * Created by swest06 on 03/06/2018.
 */
public class setOps {

    public static void main(String[] args) {




        Scanner input = new Scanner(System.in);

        String x = input.nextLine();

        String[] y = x.split("[\\[\\]]");


        for (int i = 0; i < y.length ; i++) {
            System.out.println(y[i]);

        }

    }

}
