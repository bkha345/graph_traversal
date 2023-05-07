package nz.ac.auckland.se281;

import nz.ac.auckland.se281.Main.Difficulty;

public class Morra {

  int roundNumber = 0;
  int fingers;
  int sum;
  int pointsToWin = 0;
  int userPoints = 0;
  int jarvisPoints = 0;
  String name;

  public Morra() {
  }

  public void newGame(Difficulty difficulty, int pointsToWin, String[] options) {
    name = options[0];
    MessageCli.WELCOME_PLAYER.printMessage(name);
    pointsToWin = this.pointsToWin;
  }

  public void play() {
    roundNumber++;
    boolean invalid = false;

    while ((userPoints < pointsToWin) & (jarvisPoints < pointsToWin)) {
      MessageCli.START_ROUND.printMessage(Integer.toString(roundNumber));

      // will ask for input until user inputs numbers that fit conditions
      do {

        if (invalid) {
          MessageCli.INVALID_INPUT.printMessage();
        }

        MessageCli.ASK_INPUT.printMessage();
        String input = Utils.scanner.nextLine();
        String[] numbers = input.split(" ");
        fingers = Integer.parseInt(numbers[0]);
        sum = Integer.parseInt(numbers[1]);

        invalid = true;
      } while ((fingers < 1) | (fingers > 5) | (sum < 1) | (sum > 10));

      // once numbers that fit conditions are inputted print out hand message
      MessageCli.PRINT_INFO_HAND.printMessage(name, Integer.toString(fingers), Integer.toString(sum));

      // generates computers input

    }
  }

  public void showStats() {
  }
}
