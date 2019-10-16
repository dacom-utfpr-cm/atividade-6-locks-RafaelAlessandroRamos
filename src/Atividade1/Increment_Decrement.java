/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade1;

import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author rafael
 */
public class Increment_Decrement {
    int contador;
    ReentrantLock lock;

    public Increment_Decrement() {
        this.contador = 0;
        this.lock = new ReentrantLock();
    }

    public void incrementDecrement(boolean increase) {
        this.lock.lock();
        try {
            if (increase) {
                this.contador++;
            } else {
                this.contador--;
            }
        } finally {
            this.lock.unlock();
        }
    }

    public void verValor() {
        System.out.println("Valor: " + this.contador + " " + Thread.currentThread().getName());
    }

}
