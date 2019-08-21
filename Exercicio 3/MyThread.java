import java.io.*;

public class MyThread implements Runnable{
    private BufferedReader reader;
    @Override
    public void run(){
        String line;
        try {
            while((line = this.reader.readLine()) != null){
                System.out.println(line);
                Thread.sleep(10000);
            }
        } catch (IOException | InterruptedException e) {
            System.out.println("Ops, uma exceção ocorreu :(");
        }

    }
    MyThread(String filename) throws FileNotFoundException {
        this.reader = new BufferedReader(new FileReader(filename));
    }
}