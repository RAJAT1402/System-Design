package models;

import stratergy.ITurnStratergy;
import stratergy.IWinningStratergy;

public class Game {
    
    private Board board;
    private Dice dice;
    private IWinningStratergy winningStratergy;
    private ITurnStratergy turnStratergy;
    private boolean hasWon;

    public Game(Board board, Dice dice, IWinningStratergy iWinningStratergy, ITurnStratergy iTurnStratergy) {
        this.board = board;
        this.dice = dice;
        this.winningStratergy = iWinningStratergy;
        this.turnStratergy = iTurnStratergy;
        this.hasWon = false;
    }
    
    public void init(){
        Player currentPlayer = null;

        while(!hasWon){
            currentPlayer = turnStratergy.getNextPlayer();
            board.move(currentPlayer, dice);
            hasWon = winningStratergy.hasWon(currentPlayer, board.getBoardSize());
        }

        System.out.println("Player " + currentPlayer.getId() + " : " + currentPlayer.getName() + " has won the game");
    }
}
