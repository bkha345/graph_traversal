package nz.ac.auckland.se281.jarvises.strategies;

import java.util.ArrayList;

public interface Strategy {

    public int generateFinger();

    public int generateSum(ArrayList<Integer> userFingerInputs, int roundNumber, int fingers);
}