/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade2;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rafael
 */
public class Thread_Produtor extends Thread {

    SharedFifoQueue at2;
    Random gerador;

    public Thread_Produtor(SharedFifoQueue at2) {
        this.gerador = new Random();
        this.at2 = at2;
    }

    @Override
    public void run() {
        int valor;
        while (true) {
            try {
                valor = this.gerador.nextInt(9) + 1;
                at2.setValorLista(valor);
                System.out.println("Valor Inserido: " + valor);
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                Logger.getLogger(Thread_Produtor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
