import java.io.FileNotFoundException;

public class Main{
    public static void main(String[] args){
        try {
            Thread t1 = new Thread(new MyThread("teste.txt"));
            t1.start();
            Thread.sleep(5000);
            t1.interrupt();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}