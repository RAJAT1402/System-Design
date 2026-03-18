package models;

public class Floor extends BaseModel{
    private int floor;
    private Panel panel;
    public int getFloor() {
        return floor;
    }
    public void setFloor(int floor) {
        this.floor = floor;
    }
    public Panel getPanel() {
        return panel;
    }
    public void setPanel(Panel panel) {
        this.panel = panel;
    }

    
}
