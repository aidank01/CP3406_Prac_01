package au.edu.jcu.cp3406.guessinggame;
import java.util.Random;
import java.lang.System;

public class Game {

    public static void main(String[] args) {
        System.out.println("Number guessing game!");
        System.out.println("Pick a number");
    }

    static int maxNumber = 10;
    static Random rand = new Random(maxNumber);
    static int number = rand.nextInt();

    static boolean check(int guess) {

        return (guess == number);
    }
    


}

