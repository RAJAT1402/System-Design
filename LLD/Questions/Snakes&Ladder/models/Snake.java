package models;

public class Snake extends BoardItem{

    public Snake(Integer start, Integer end) {
        super(start, end);
        this.type = BoardItemType.SNAKE;

        if(start < end){
            throw new IllegalArgumentException("Snake start cannot be less than end");
        }
    }

}
