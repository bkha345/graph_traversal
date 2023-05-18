package nz.ac.auckland.se281.jarvises;

import java.util.ArrayList;
import nz.ac.auckland.se281.jarvises.strategies.Strategy;
import nz.ac.auckland.se281.jarvises.strategies.StrategyAverage;
import nz.ac.auckland.se281.jarvises.strategies.StrategyRandom;

public class MediumJarvis implements Jarvis {

  private Strategy strategy;

  // does random strategy for first 3 rounds
  public MediumJarvis() {
    this.strategy = new StrategyRandom();
  }

  @Override
  public int[] generateFingerAndSum(ArrayList<Integer> userFingerInputs, int roundsDone) {

    // switches to average strategy after 3 rounds
    if (roundsDone >= 3) {
      this.strategy = new StrategyAverage();
    }

    // returns array of finger and sum
    action[0] = strategy.generateFinger();
    action[1] = strategy.generateSum(userFingerInputs, roundsDone, action[0]);
    return action;
  }

}
