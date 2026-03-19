package models;

public class Player {
    
    private int id;
    private int currentPosition;
    private String name;
    private int turns;
    private boolean isActive;
    private int lastDiceRoll;

    public Player(int id, String name) {
        this.id = id;
        this.currentPosition = 0;
        this.name = name;
        this.turns = 0;
        this.isActive = true;
    }

    // Give the player a dice to throw
    public int roll(Dice dice){
        return dice.getDiceThrow();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTurns() {
        return turns;
    }

    public void setTurns(int turns) {
        this.turns = turns;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public int getLastDiceRoll() {
        return lastDiceRoll;
    }

    public void setLastDiceRoll(int lastDiceRoll) {
        this.lastDiceRoll = lastDiceRoll;
    }
}
