package DTO;

import models.VehicleType;

public class GenerateTicketRequestDto{
    private String vehicleNumber;
    private Long gateId;
    private VehicleType vechicleType;
    
    public String getVehicleNumber() {
        return vehicleNumber;
    }
    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
    public Long getGateId() {
        return gateId;
    }
    public void setGateId(Long gateId) {
        this.gateId = gateId;
    }
    public VehicleType getVechicleType() {
        return vechicleType;
    }
    public void setVechicleType(VehicleType vechicleType) {
        this.vechicleType = vechicleType;
    }
    
}