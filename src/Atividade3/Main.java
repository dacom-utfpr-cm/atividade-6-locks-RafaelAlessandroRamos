/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade3;

/**
 *
 * @author rafael
 */
public class Main {
    public static void main(String[] args) {
        ArrayListThreadSafe ativ = new ArrayListThreadSafe();
        
        int numLeitores = 3;
        int numEscritores = 5;
        
        for (int i = 0; i < numLeitores; i++) {
            Thread_Leitor threadLeitores = new Thread_Leitor(ativ);
            threadLeitores.start();
        }

        for (int i = 0; i < numEscritores; i++) {
            Thread_Escritor threadEscritores = new Thread_Escritor(ativ);
            threadEscritores.start();
        }
    
    }
}
