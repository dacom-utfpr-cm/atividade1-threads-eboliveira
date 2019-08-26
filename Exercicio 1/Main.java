/*
	Autor: Eduardo Barbosa de Oliveira RA: 1814559
	Repositório: https://github.com/dacom-utfpr-cm/atividade1-threads-eboliveira
	Data: 26/08/2019
	Problema: Faça um programa em Java que inicie três threads e, cada
	thread, espere um tempo aleatório para terminar.
*/
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