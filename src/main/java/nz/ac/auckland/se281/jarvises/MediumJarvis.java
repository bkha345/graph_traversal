package nz.ac.auckland.se281.jarvises;

import java.util.ArrayList;

import nz.ac.auckland.se281.jarvises.strategies.*;

public class MediumJarvis implements Jarvis {

    int action[] = new int[2];

    @Override
    public int[] generateFingerAndSum(ArrayList<Integer> userFingerInputs, int roundsDone) {

        if (roundsDone > 5) {
            action[0] = new StrategyRandom().generateFinger();
            action[1] = new StrategyRandom().generateSum(userFingerInputs, roundsDone, action[0]);
        } else {
            action[0] = new StrategyRandom().generateFinger();
            action[1] = new StrategyAverage().generateSum(userFingerInputs, roundsDone, action[0]);
        }
        return action;
    }

}
