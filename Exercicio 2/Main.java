/*
	Autor: Eduardo Barbosa de Oliveira RA: 1814559
	Repositório: https://github.com/dacom-utfpr-cm/atividade1-threads-eboliveira
	Data: 26/08/2019
	Problema: Faça uma thread Java que realize a leitura de um arquivo texto com frases e exiba as frases a cada 10 segundos.
*/

import java.io.FileNotFoundException;

public class Main{
    public static void main(String[] args){
        try {
            Thread t1 = new Thread(new MyThread("teste.txt"));
            t1.start();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}