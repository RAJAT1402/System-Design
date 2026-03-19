package models;

public abstract class BoardItem {
    
    protected Integer start;
    protected Integer end;
    protected BoardItemType type; 

    public BoardItem(Integer start, Integer end){
        this.start = start;
        this.end = end;
    }

    public Integer getFinalPosition(){
        return this.end;
    }

    public Integer getStartingPosition(){
        return this.start;
    }

    public BoardItemType getType() {
        return type;
    }

    public void setType(BoardItemType type) {
        this.type = type;
    }
}
