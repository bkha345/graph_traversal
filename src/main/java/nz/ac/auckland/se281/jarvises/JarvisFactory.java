package nz.ac.auckland.se281.jarvises;

import nz.ac.auckland.se281.Main.Difficulty;
import nz.ac.auckland.se281.jarvises.strategies.Strategy;

public class JarvisFactory {

    public static Jarvis createJarvis(Difficulty difficulty) {
        switch (difficulty) {
            case EASY:
                return new EasyJarvis();

            case MEDIUM:
                return new MediumJarvis();

            case HARD:
                return new HardJarvis();

            default:
                return new MasterJarvis();

        }
    }
}