package nz.ac.auckland.se281.jarvises;

import java.util.ArrayList;

import nz.ac.auckland.se281.jarvises.strategies.Strategy;
import nz.ac.auckland.se281.jarvises.strategies.StrategyRandom;

public class EasyJarvis implements Jarvis {

    int action[] = new int[2];
    private Strategy strategy;

    public EasyJarvis() {
        this.strategy = new StrategyRandom();
    }

    @Override
    public int[] generateFingerAndSum(ArrayList<Integer> userFingerInputs, int roundsDone) {

        action[0] = strategy.generateFinger();
        action[1] = strategy.generateSum(userFingerInputs, roundsDone, action[0]);

        return action;
    }

}