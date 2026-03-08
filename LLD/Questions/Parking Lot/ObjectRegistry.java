import java.util.HashMap;
import java.util.Map;

public class ObjectRegistry {
    
    private Map<String, Object> objectMap = new HashMap<>();

    public void registerObject(String objectName, Object object) {
        objectMap.put(objectName, object);
    }

    public Object getObject(String objectName) {
        return objectMap;
    }

}
