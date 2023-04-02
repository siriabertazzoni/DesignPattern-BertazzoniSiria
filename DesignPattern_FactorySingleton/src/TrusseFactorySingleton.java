import java.util.HashMap;
import java.util.Map;

public class TrusseFactorySingleton {
    
    private Map<TrusseComponentType, Object> trucchi = new HashMap<>();

    
    public Object instance(TrusseComponentType componentType){
        switch(componentType){
            case Fondotinta:
            if(!trucchi.containsKey(componentType)){
                trucchi.put(componentType, new Fondotinta("Fondotinta studio fix Mac"));
            }
            break;

            case Cipria:
            if(!trucchi.containsKey(componentType)){
                trucchi.put(componentType, new Cipria("Cipria Mac"));
            }
            break;

            case Fard:
            if(!trucchi.containsKey(componentType)){
                trucchi.put(componentType, new Fard("Fard Mac"));
            }
            break;

            // case Pennelli:
            // if(!trucchi.containsKey(componentType)){
            //     trucchi.put(componentType, new Pennelli());
            // }
            // break;

            // case Spugnetta:
            // if(!trucchi.containsKey(componentType)){
            //     trucchi.put(componentType, new Spugnetta("Spugnetta"));
            // }
            // break;
        }
        return trucchi.get(componentType);
    }
}
