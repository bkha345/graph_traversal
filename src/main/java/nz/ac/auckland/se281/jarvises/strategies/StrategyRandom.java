package nz.ac.auckland.se281.jarvises.strategies;

import java.util.ArrayList;
import nz.ac.auckland.se281.Utils;

public class StrategyRandom extends Strategy {

  // predicts user will select random finger
  @Override
  public int generateSum(ArrayList<Integer> userFingerInputs, int roundNumber, int finger) {
    int sum = Utils.getRandomNumber((finger + 1), (finger + 5));
    return sum;
  }
}
