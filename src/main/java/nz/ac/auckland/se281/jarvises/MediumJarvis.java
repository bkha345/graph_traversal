package nz.ac.auckland.se281.jarvises;

import java.util.ArrayList;

import nz.ac.auckland.se281.jarvises.strategies.*;

public class MediumJarvis implements Jarvis {

    int action[] = new int[2];

    private Strategy strategy;

    public MediumJarvis() {
        this.strategy = new StrategyRandom();
    }

    @Override
    public int[] generateFingerAndSum(ArrayList<Integer> userFingerInputs, int roundsDone) {

        if (roundsDone >= 3) {
            this.strategy = new StrategyAverage();
        }

        action[0] = strategy.generateFinger();
        action[1] = strategy.generateSum(userFingerInputs, roundsDone, action[0]);
        return action;
    }

}
