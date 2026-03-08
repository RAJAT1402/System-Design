package services;

import models.Gate;
import repositories.GateRepository;

public class GateService {
    
    private GateRepository gateRepository;
    
    public GateService(GateRepository gateRepository){
        this.gateRepository = gateRepository;
    }

    public Gate getGateByID(Long gateId){
        
        Gate gate = gateRepository.getGate(gateId);

        // db call
        return gate;
    }
}
