/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newnumberguessgame;

/**
 *
 * @author Alex
 */
public class GameHandlerService {

    private GameStrategy game;

    public final void setGame(GameStrategy game) {
        if (game == null) {
            throw new NullPointerException("Must enter a game!");//Use a class like GlobalVarsAndFinals to store a constant for the message.
        }
        this.game = game;
    }

    public final void startGame() {
        game.startGame();
    }

}
