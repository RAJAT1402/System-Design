package models;

import java.util.Objects;

public class Cell {

    private final int postion;

    // Snakes , Ladders , null
    private BoardItem boardItem;

    public Cell(int postion, BoardItem boardItem) {
        this.postion = postion;
        this.boardItem = boardItem;
    }

    public void setBoardItem(BoardItem boardItem){
        this.boardItem = boardItem;
    }

    public int getFinalPosition(){
        if(Objects.nonNull(boardItem)){
            System.out.println("Player encountered a " + boardItem.getType() + " at " + boardItem.getStartingPosition());
            return boardItem.getFinalPosition();
        }

        return postion;
    }
}
