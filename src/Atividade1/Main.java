/*
 * Faça um programa usando Lock para simular a atualizacao de um contador que e
 * acessado por multiplas threads. O contador pode diminuir e aumentar.
 */
package Atividade1;

/**
 *
 * @author rafael
 */
public class Main {
    
    public static void main(String[] args) {
        tThread thread1 = new tThread(new Increment_Decrement(), true);
        tThread thread2 = new tThread(new Increment_Decrement(), false);

        thread1.start();
        thread2.start();
    }

    
}


