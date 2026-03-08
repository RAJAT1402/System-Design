package models;

public class ElectricMeter extends BaseModel {
    private int consumption;

    public ElectricMeter() {
    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }
}
