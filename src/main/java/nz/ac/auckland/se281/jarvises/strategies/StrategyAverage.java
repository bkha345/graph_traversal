package nz.ac.auckland.se281.jarvises.strategies;

import java.util.ArrayList;

public class StrategyAverage extends Strategy {

    // predicts that user will put the average of previosu fingers as new finger
    @Override
    public int generateSum(ArrayList<Integer> userFingerInputs, int roundsDone, int finger) {
        int total = 0;

        for (int fingerInput : userFingerInputs) {
            total += fingerInput;
        }

        int jarvisFinger = Math.round((float) total / roundsDone);

        // returns sum of jarvis finger and the user's predicted finger
        return (jarvisFinger + finger);
    }

}
