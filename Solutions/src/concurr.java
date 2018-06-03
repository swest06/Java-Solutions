/**
 * Created by swest06 on 03/06/2018.
 */
public class concurr extends Thread {
    public String name;

    public concurr(String name){
        this.name = name;
    }

    public  void go(){
        int i = 0;
        for (;i < 50; i++) {
            System.out.println(i);
        }

    }
    public void run(){
         this.go();
    }

    public static void main(String[] args) {
        concurr obj1 = new concurr("1");
        concurr obj2 = new concurr("2");
        concurr obj3 = new concurr("3");

        obj1.start();
        obj2.start();
        obj3.start();

    }
}
