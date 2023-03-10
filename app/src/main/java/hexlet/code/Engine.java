package hexlet.code;

import hexlet.code.games.*;

import static hexlet.code.App.GAME;

public class Engine {
    public static void eng() {
        switch (GAME) {
            case 1 -> {
                System.out.println("Your choice:" + GAME + "\n");
                Cli.run();
            }
            case 2 -> {
                System.out.println("Your choice:" + GAME + "\n");
                Even.parity();
            }
            case 3 -> {
                System.out.println("Your choice:" + GAME + "\n");
                Calculator.calc();
            }
            case 4 -> {
                System.out.println("Your choice:" + GAME + "\n");
                GCD.gcd();
            }
            case 5 -> {
                System.out.println("Your choice:" + GAME + "\n");
                Progression.progression();
            }
            case 6 -> {
                System.out.println("Your choice:" + GAME + "\n");
                Prime.prime();
            }
        }
    }
}
