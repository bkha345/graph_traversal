package nz.ac.auckland.se281.jarvises;

import java.util.ArrayList;

import nz.ac.auckland.se281.jarvises.strategies.StrategyRandom;

public class EasyJarvis implements Jarvis {

    int action[] = new int[2];

    @Override
    public int[] generateFingerAndSum(ArrayList<Integer> userFingerInputs, int roundsDone) {

        action[0] = new StrategyRandom().generateFinger();
        action[1] = new StrategyRandom().generateSum(userFingerInputs, roundsDone, action[0]);

        return action;
    }

}