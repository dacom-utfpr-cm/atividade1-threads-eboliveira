import java.util.Scanner;

public class MyThread implements Runnable {
    private int sum = 0;

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de valores da sequencia: ");
        int lenSeq = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < lenSeq; i++) {
            System.out.println("Digite um valor:");
            sum += Integer.parseInt(scanner.nextLine());
        }
    }

    public int getSum() {
        return sum;
    }
}