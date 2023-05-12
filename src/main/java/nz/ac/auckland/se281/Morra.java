package nz.ac.auckland.se281;

import java.util.ArrayList;

import nz.ac.auckland.se281.Main.Difficulty;
import nz.ac.auckland.se281.jarvises.*;;

public class Morra {

  int roundNumber;
  int fingers;
  int sum;
  int pointsToWin;
  int userPoints = 0;
  int jarvisPoints = 0;
  String name;
  Difficulty difficulty;
  Jarvis jarvis;

  ArrayList<Integer> userFingerInputs;

  public Morra() {
  }

  public void newGame(Difficulty difficulty, int pointsToWin, String[] options) {
    name = options[0];
    MessageCli.WELCOME_PLAYER.printMessage(name);
    this.pointsToWin = pointsToWin;
    this.difficulty = difficulty;
    jarvis = JarvisFactory.createJarvis(difficulty);
    roundNumber = 0;
    userFingerInputs = new ArrayList<Integer>();
  }

  public void play() {
    String[] numbers;

    boolean invalid = false;
    roundNumber++;
    MessageCli.START_ROUND.printMessage(Integer.toString(roundNumber));

    // will ask for input until user inputs numbers that fit conditions
    do {

      if (invalid) {
        MessageCli.INVALID_INPUT.printMessage();
      }

      MessageCli.ASK_INPUT.printMessage();
      String input = Utils.scanner.nextLine();
      numbers = input.split(" ");
      fingers = Integer.parseInt(numbers[0]);
      sum = Integer.parseInt(numbers[1]);

      invalid = true;
    } while ((fingers < 1) | (fingers > 5) | (sum < 1) | (sum > 10));

    // once numbers that fit conditions are inputted print out hand message
    MessageCli.PRINT_INFO_HAND.printMessage(name, Integer.toString(fingers), Integer.toString(sum));

    // generates computers input and turns to string

    int[] jarvisInputs = jarvis.generateFingerAndSum(userFingerInputs, (roundNumber - 1));

    int jarvisFingers = jarvisInputs[0];
    int jarvisSum = jarvisInputs[1];

    // adds current user input after jarvis plays current round
    userFingerInputs.add(fingers);

    MessageCli.PRINT_INFO_HAND.printMessage("Jarvis", Integer.toString(jarvisFingers), Integer.toString(jarvisSum));

    // prints result
    if ((jarvisFingers + fingers == jarvisSum) && (jarvisFingers + fingers != sum)) {
      MessageCli.PRINT_OUTCOME_ROUND.printMessage("AI_WINS");
      jarvisPoints++;
    } else if ((jarvisFingers + fingers == sum) && (jarvisFingers + fingers != jarvisSum)) {
      MessageCli.PRINT_OUTCOME_ROUND.printMessage("HUMAN_WINS");
      userPoints++;
    } else {
      MessageCli.PRINT_OUTCOME_ROUND.printMessage("DRAW");
    }

    if (userPoints == pointsToWin) {

    }
  }

  public void showStats() {
  }
}
