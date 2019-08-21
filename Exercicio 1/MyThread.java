import java.util.Random;

public class MyThread implements Runnable{
    private int id;
    @Override
    public void run(){
        Random random = new Random();
        try {
            Thread.sleep(random.nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread " + this.id + " encerrou");
    }
    MyThread(int id){
        this.id = id;
    }
}