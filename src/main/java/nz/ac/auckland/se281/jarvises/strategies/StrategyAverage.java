package nz.ac.auckland.se281.jarvises.strategies;

import java.util.ArrayList;

import nz.ac.auckland.se281.Utils;

public class StrategyAverage extends Strategy {

    @Override
    public int generateSum(ArrayList<Integer> userFingerInputs, int roundsDone, int finger) {
        int total = 0;

        for (int fingerInput : userFingerInputs) {
            total += fingerInput;
        }

        return (Math.round(total / roundsDone) + finger);
    }

}
