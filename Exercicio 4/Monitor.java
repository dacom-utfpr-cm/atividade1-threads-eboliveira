import java.util.ArrayList;

public class Monitor implements Runnable{
    private ArrayList<Thread> threads = new ArrayList<Thread>();
    private ArrayList<Thread> interruptedThreads = new ArrayList<Thread>();


    @Override
    public void run() {
        while(true){
            for(Thread t:this.threads){
                if(t.isInterrupted()){
                    this.threads.remove(t);
                    this.interruptedThreads.add(t);
                    break;
                }
            }
        }
    }

    public ArrayList<Thread> getInterruptedThreads() {
        return interruptedThreads;
    }
    public void addThread(Thread t){
        this.threads.add(t);
    }
}
