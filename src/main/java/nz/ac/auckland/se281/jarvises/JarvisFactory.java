package nz.ac.auckland.se281.jarvises;

import nz.ac.auckland.se281.Main.Difficulty;

public class JarvisFactory {

    public static Jarvis createJarvis(Difficulty difficulty) {
        switch (difficulty) {
            case EASY:
                return new EasyJarvis();
                break;

            case MEDIUM:
                return new MediumJarvis();
                break;

            case HARD:
                return new HardJarvis();
                break;

            case MASTER:
                return new MasterJarvis();
                break;

        }
    }
}