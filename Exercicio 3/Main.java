/*
	Autor: Eduardo Barbosa de Oliveira RA: 1814559
	Repositório: https://github.com/dacom-utfpr-cm/atividade1-threads-eboliveira
	Data: 26/08/2019
	Problema: Faça um programa Java que envia interrupções para as threads dos exercı́cios anteriores.
	As threads devem fazer o tratamento dessas interrupções e realizar uma finalização limpa.
*/

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