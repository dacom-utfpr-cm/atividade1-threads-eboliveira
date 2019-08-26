/*
	Autor: Eduardo Barbosa de Oliveira RA: 1814559
	Repositório: https://github.com/dacom-utfpr-cm/atividade1-threads-eboliveira
	Data: 26/08/2019
	Problema: Faça uma thread Java que fica aguardando uma sequência numérica de tamanho arbitrário digitado por usuário para realizar uma soma. Use o join().
*/


public class Main{
    public static void main(String[] args) throws InterruptedException {
        MyThread myT = new MyThread();
        Thread t1 = new Thread(myT);
        t1.start();
        t1.join();
        System.out.println(myT.getSum());
    }
}