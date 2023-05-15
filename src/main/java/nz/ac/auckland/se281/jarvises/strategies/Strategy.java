package nz.ac.auckland.se281.jarvises.strategies;

import java.util.ArrayList;
import nz.ac.auckland.se281.Utils;

public abstract class Strategy {

    // all strategies return random finger
    public int generateFinger() {
        int finger = Utils.getRandomNumber(1, 5);
        return finger;
    }

    public abstract int generateSum(ArrayList<Integer> userFingerInputs, int roundNumber, int fingers);
}
