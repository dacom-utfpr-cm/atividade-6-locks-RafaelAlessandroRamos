/*
 * Faca uma classe ArrayListThreadSafe usando ReadWriteLock. Teste usando threads
 * que realizam leitura e escrita para essa estrutura.
 */
package Atividade3;

import java.util.Random;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rafael
 */
public class ArrayListThreadSafe {

    String texto;
    ReentrantReadWriteLock readWriteLock;

    public ArrayListThreadSafe() {
        this.texto = "";
        this.readWriteLock = new ReentrantReadWriteLock();
    }

    public void escrever(String texto) {
        this.readWriteLock.writeLock().lock();
        try {
            this.texto += texto;
        } finally {
            this.readWriteLock.writeLock().unlock();
        }
    }

    public String ler() {
        this.readWriteLock.readLock().lock();
        try {
            return this.texto;
        } finally {
            this.readWriteLock.readLock().unlock();
        }
    }
}
