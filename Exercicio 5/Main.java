public class Main{
    public static void main(String[] args) throws InterruptedException {
        MyThread myT = new MyThread();
        Thread t1 = new Thread(myT);
        t1.start();
        t1.join();
        System.out.println(myT.getSum());
    }
}