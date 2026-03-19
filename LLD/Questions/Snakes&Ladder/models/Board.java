package models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    
    private List<Cell> cells;

    public Board(int size){
        this.cells = new ArrayList<>(size);

        for(int i = 0 ; i < size ; ++i){
            this.cells.add(new Cell(i , null));
        }
    }

    public int getBoardSize(){
        return this.cells.size();
    }

    public List<Cell> getBoardCells(){
        return this.cells;
    }

    public void move(Player player, Dice dice){
        int roll = player.roll(dice);

        int currentPosition = player.getCurrentPosition();

        if(isValidMove(currentPosition, roll)){
            int finalPosition = currentPosition + roll;

            if(finalPosition < this.cells.size()){
                Cell cell = this.cells.get(finalPosition);
                finalPosition = cell.getFinalPosition();
            }

            System.out.println("Player " + player.getId() + " : " + player.getName() + " moving from " + currentPosition + " to " + finalPosition);

            player.setCurrentPosition(finalPosition);
        }else{
            System.out.println("Player " + player.getId() + " : " + player.getName() + " cannot move");
        }

        player.setTurns(player.getTurns() + 1);
        player.setLastDiceRoll(roll);
    }

    public boolean isValidMove(int currentPosition, int roll){
        // Validation logic to verify the move

        // return this.cells.size() <= currentPosition + roll;
        return true;
    }
}
