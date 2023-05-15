package nz.ac.auckland.se281.jarvises;

import java.util.ArrayList;

public interface Jarvis {

    int action[] = new int[2];

    int[] generateFingerAndSum(ArrayList<Integer> userFingerInputs, int roundsDone);
}