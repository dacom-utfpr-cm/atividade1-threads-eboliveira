import java.io.FileNotFoundException;

public class Main{
    public static void main(String[] args){
        try {
            Thread t1 = new Thread(new MyThread("teste.txt"));
            t1.start();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}