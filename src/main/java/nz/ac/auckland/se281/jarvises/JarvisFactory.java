package nz.ac.auckland.se281.jarvises;

import nz.ac.auckland.se281.Main.Difficulty;

public class JarvisFactory {

    // uses switch case to create jarvis of that specific difficulty
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