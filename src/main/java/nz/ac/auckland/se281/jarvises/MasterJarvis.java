package nz.ac.auckland.se281.jarvises;

import java.util.ArrayList;
import nz.ac.auckland.se281.jarvises.strategies.Strategy;
import nz.ac.auckland.se281.jarvises.strategies.StrategyRandom;
import nz.ac.auckland.se281.jarvises.strategies.StrategyAverage;
import nz.ac.auckland.se281.jarvises.strategies.StrategyTop;

public class MasterJarvis implements Jarvis {

    private Strategy strategy;

    public MasterJarvis() {
        this.strategy = new StrategyRandom();
    }

    @Override
    public int[] generateFingerAndSum(ArrayList<Integer> userFingerInputs, int roundsDone) {

        // alternates between average and top after 3 rounds
        if (roundsDone >= 3) {
            if (roundsDone % 2 == 1) {
                this.strategy = new StrategyAverage();
            } else {
                this.strategy = new StrategyTop();
            }
        }

        // returns array of finger and sum
        action[0] = strategy.generateFinger();
        action[1] = strategy.generateSum(userFingerInputs, roundsDone, action[0]);
        return action;
    }
}