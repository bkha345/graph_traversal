package nz.ac.auckland.se281.jarvises.strategies;

import nz.ac.auckland.se281.Utils;

public class StrategyRandom implements Strategy {

    @Override
    public int generateFinger() {
        int finger = Utils.getRandomNumber(1, 5);
        return finger;
    }

    @Override
    public int generateSum(ArrayList<Integer> userFingerInputs, int roundNumber, int finger) {
        int sum = Utils.getRandomNumber((finger + 1), (finger + 5));
        return sum;
    }
}