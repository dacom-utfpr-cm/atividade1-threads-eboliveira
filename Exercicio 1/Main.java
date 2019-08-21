public class Main{
    public static void main(String[] args){
        System.out.println("Thread 0 iniciou");
        Thread t1 = new Thread(new MyThread(0));
        System.out.println("Thread 1 iniciou");
        Thread t2 = new Thread(new MyThread(1));
        System.out.println("Thread 2 iniciou");
        Thread t3 = new Thread(new MyThread(2));
        t1.start();
        t2.start();
        t3.start();
    }
}