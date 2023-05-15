package nz.ac.auckland.se281.jarvises.strategies;

import java.util.ArrayList;

public class StrategyTop extends Strategy {

    private int[] fingerOccurences = new int[6];
    private int mostOccurence = 1;

    // predicts user will select most reaccuring finger
    @Override
    public int generateSum(ArrayList<Integer> userFingerInputs, int roundsDone, int finger) {
        for (int fingerInput : userFingerInputs) {
            fingerOccurences[fingerInput]++;

            if (fingerOccurences[mostOccurence] < fingerOccurences[fingerInput]) {
                mostOccurence = fingerInput;
            }
        }
        return (mostOccurence + finger);
    }
}
