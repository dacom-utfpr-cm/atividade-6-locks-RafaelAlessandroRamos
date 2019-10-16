package Atividade1;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;

/**
 *
 * @author rafael
 */
public class tThread extends Thread {

    Increment_Decrement at1;
    boolean increase;

    public tThread(Increment_Decrement at1, boolean increase) {
        this.at1 = at1;
        this.increase = increase;
    }

    @Override
    public void run() {
        while (true) {
            this.at1.incrementDecrement(this.increase);
            this.at1.verValor();
            //sleep(2000);
        }
    }
}