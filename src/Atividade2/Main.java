/*
 * Crie uma classe SharedFifoQueue e use Conditions para controlar se a fila 
 * esta vazia ou cheia. Teste usando threads produtoras e consumidoras
 */
package Atividade2;

/**
 *
 * @author rafael
 */
public class Main {

    public static void main(String[] args) {
        SharedFifoQueue sharedFifoQueue = new SharedFifoQueue(10);
        Thread_Consumidor tConsu = new Thread_Consumidor(sharedFifoQueue);
        Thread_Produtor tProdu = new Thread_Produtor(sharedFifoQueue);

        tConsu.start();
        tProdu.start();
    }

}
