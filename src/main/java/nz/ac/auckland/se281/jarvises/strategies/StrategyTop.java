package nz.ac.auckland.se281.jarvises.strategies;

import java.util.ArrayList;
import nz.ac.auckland.se281.Utils;

public class StrategyTop extends Strategy {

    int[] fingerOccurences = new int[6];
    int mostOccurence = 1;

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
