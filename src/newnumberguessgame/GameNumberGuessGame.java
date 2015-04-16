/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newnumberguessgame;

import java.awt.EventQueue;
import java.util.Random;

/**
 *
 * @author Alex
 */
public class GameNumberGuessGame implements GameStrategy {

    private InputStrategy rangeInput = new InputRangeGui();
    private InputStrategy guessInput = new InputGuessGui();
    
    public final String HIGH_GUESS_MESSAGE = "Your Guess Was To High!";
    public final String LOW_GUESS_MESSAGE = "Your Guess Was To Low!";
    public final String CORRECT_GUESS_MESSAGE = "Your Guess Was Correct!";
    public final String MIN_GUESS_GREATER_THAN_OR_EQUAL_TO_MAX_GUESS_ERROR_MESSAGE = "Min Range is greater than Max Range!";
    public final String MIN_RANGE_ILLEGAL_ERR = "Min Range Is Not Legal";

    private int minRange;
    private int maxRange;
    private int correctGuess;

    public GameNumberGuessGame() {
    }

    public final void checkGuess(int guess) throws UserFeedback {
        String output = "";
        if (guess > correctGuess) {
            output = HIGH_GUESS_MESSAGE;
        } else if (guess < correctGuess) {
            output = LOW_GUESS_MESSAGE;
        } else {
            output = CORRECT_GUESS_MESSAGE;
        }
        throw new UserFeedback(output);
    }

    private void setCorrectGuess(int minRange, int maxRange) throws RuntimeException {
        if (minRange <= -1) {
            throw new IllegalArgumentException(MIN_RANGE_ILLEGAL_ERR);
        } else if (minRange >= maxRange) {
            throw new IllegalArgumentException(MIN_GUESS_GREATER_THAN_OR_EQUAL_TO_MAX_GUESS_ERROR_MESSAGE);
        }
        this.minRange = minRange;
        this.maxRange = maxRange;
        //Break this method up into more methods!
        //online code for random number generation between two numbers
        Random random = new Random();
        int randomNumBetweenRanges = random.nextInt((maxRange - minRange) + 1) + minRange;
        System.out.println(randomNumBetweenRanges);
        correctGuess = randomNumBetweenRanges;
    }

    @Override
    public void startGame() {
        
    }
}
