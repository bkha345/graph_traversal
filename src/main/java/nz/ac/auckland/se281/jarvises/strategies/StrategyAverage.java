package nz.ac.auckland.se281.jarvises.strategies;

import java.util.ArrayList;

public abstract class StrategyAverage implements Strategy {
    @Override
    public int generateSum(ArrayList<Integer> userFingerInputs, int roundsDone, int finger) {
        int total = 0;

        for (int fingerInput : userFingerInputs) {
            total += fingerInput;
        }

        return (total / roundsDone + finger);
    }
}
