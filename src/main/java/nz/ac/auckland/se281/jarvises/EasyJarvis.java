package nz.ac.auckland.se281.jarvises;

import java.util.ArrayList;
import nz.ac.auckland.se281.jarvises.strategies.Strategy;
import nz.ac.auckland.se281.jarvises.strategies.StrategyRandom;

public class EasyJarvis implements Jarvis {

  private Strategy strategy;

  // initialises strategy to random, this will not change
  public EasyJarvis() {
    this.strategy = new StrategyRandom();
  }

  @Override
  public int[] generateFingerAndSum(ArrayList<Integer> userFingerInputs, int roundsDone) {

    // creates array of finger and sum intputs
    action[0] = strategy.generateFinger();
    action[1] = strategy.generateSum(userFingerInputs, roundsDone, action[0]);

    return action;
  }

}