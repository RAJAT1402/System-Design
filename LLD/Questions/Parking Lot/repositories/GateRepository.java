package repositories;

import models.Gate;
import models.GateType;
import models.Operator;

public class GateRepository {
    
    public Gate getGate(Long id){
        Operator operator = new Operator();
        operator.setId(1L);
        operator.setName("ABC");

        Gate gate = new Gate();
        gate.setGateType(GateType.EntryGate);
        gate.setId(id);
        gate.setOperator(operator);

        return gate;
    }
}
