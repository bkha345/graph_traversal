package nz.ac.auckland.se281.jarvises;

import java.util.ArrayList;
import nz.ac.auckland.se281.jarvises.strategies.Strategy;
import nz.ac.auckland.se281.jarvises.strategies.StrategyRandom;
import nz.ac.auckland.se281.jarvises.strategies.StrategyTop;

public class HardJarvis implements Jarvis {

  private Strategy strategy;

  public HardJarvis() {
    this.strategy = new StrategyRandom();
  }

  @Override
  public int[] generateFingerAndSum(ArrayList<Integer> userFingerInputs, int roundsDone) {

    // switches to top strategy after 3 rounds
    if (roundsDone >= 3) {
      this.strategy = new StrategyTop();
    }

    // returns array of finger and sum
    action[0] = strategy.generateFinger();
    action[1] = strategy.generateSum(userFingerInputs, roundsDone, action[0]);
    return action;
  }
}