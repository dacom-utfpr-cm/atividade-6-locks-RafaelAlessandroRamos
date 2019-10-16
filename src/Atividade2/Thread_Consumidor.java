/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rafael
 */
public class Thread_Consumidor extends Thread {

    SharedFifoQueue at2;

    public Thread_Consumidor(SharedFifoQueue at2) {
        this.at2 = at2;
    }

    @Override
    public void run() {
        int valor;
        while (true) {
            try {
                valor = this.at2.getValorLista();
                System.out.println("Valor Removido: " + valor);
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Thread_Consumidor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
