package com.hdm.monopoly;

import com.hdm.monopoly.backened.board.street_test.Map;
import com.hdm.monopoly.backened.player_money.Spieler;

import java.util.ArrayList;

/**
 * Class that starts and manages the game, is implemented as a singleton
 */
public class Game {

    private static Game game;
    public static int playerCount; // helper for constructor
    private static boolean isInitialized = false;

    // These two attributes enable a connection between a map and players
    private ArrayList<Spieler> players; /*we assume the game knows on its creation how many players there are.
    That could be achieved by a controller class that manages the network communication*/
    private Map board;

    private Game(){
        if(isInitialized) {
            //based on the playerCount the "Spielers" are created and gets put into the players ArrayList
        }
    }

    /**
     * This function is the only method to obtain a reference to the game that is currently running.
     * If there is no game running it creates a new one and makes it accessible.
     * @return Game that is currently running or the new created one.
     */
    public static Game getInstance(){
        if(game == null) {
            game = new Game();
        }
        return game;
    }

    /**
     * This method has to be called before creating a new game. This method sets the player count for the game.
     * @param initialPlayerCount An Integer with the player count.
     */
    public static void initialize(int initialPlayerCount){
        if(!isInitialized){
            playerCount = initialPlayerCount;
            isInitialized = true;
        }
    }

    /**
     * Standard getter for the board.
     * @return Board of the running game.
     */
    public Map getBoard(){
        return board;
    }
}
