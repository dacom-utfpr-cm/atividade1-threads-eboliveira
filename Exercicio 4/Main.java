/*
	Autor: Eduardo Barbosa de Oliveira RA: 1814559
	Repositório: https://github.com/dacom-utfpr-cm/atividade1-threads-eboliveira
	Data: 26/08/2019
	Problema: Faça uma Thread que monitora um conjunto de threads e exiba quais threads receberam sinais de interrupção.
*/


import java.io.FileNotFoundException;

public class Main{
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new MyThread());
        Thread t2 = new Thread(new MyThread());
        Thread t3 = new Thread(new MyThread());
        t1.start();
        t2.start();
        t3.start();
        Monitor m = new Monitor();
        m.addThread(t1);
        m.addThread(t2);
        m.addThread(t3);
        Thread monitor = new Thread(m);
        monitor.start();
        System.out.println(m.getInterruptedThreads());
        t1.interrupt();
        Thread.sleep(1000);
        System.out.println(m.getInterruptedThreads());
        t2.interrupt();
        Thread.sleep(1000);
        System.out.println(m.getInterruptedThreads());
        t3.interrupt();
        Thread.sleep(1000);
        System.out.println(m.getInterruptedThreads());
    }
}