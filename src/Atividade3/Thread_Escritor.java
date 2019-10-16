/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade3;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rafael
 */
public class Thread_Escritor extends Thread {

    ArrayListThreadSafe at3;
    Random gerador;
    
    public Thread_Escritor(ArrayListThreadSafe at3) {
        this.at3 = at3;
        this.gerador = new Random();
    }

    @Override
    public void run() {
        while (true) {
            this.at3.escrever("a ");
            System.out.println("Escritor> a");
            try {
                Thread.sleep((gerador.nextInt(9)+1)*1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Thread_Escritor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}