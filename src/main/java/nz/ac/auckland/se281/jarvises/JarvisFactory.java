package nz.ac.auckland.se281.jarvises;

import nz.ac.auckland.se281.Main.Difficulty;

public class JarvisFactory {

  // uses switch case to create jarvis of that specific difficulty
  public static Jarvis createJarvis(Difficulty difficulty) {

    switch (difficulty) {

      // creates easy jarvis
      case EASY:
        return new EasyJarvis();

      // creates medium jarvis
      case MEDIUM:
        return new MediumJarvis();

      // creates hard jarvis
      case HARD:
        return new HardJarvis();

      // creates master jarvis
      default:
        return new MasterJarvis();

    }
  }
}