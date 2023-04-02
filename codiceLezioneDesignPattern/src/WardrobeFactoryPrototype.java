public class WardrobeFactoryPrototype {

    @SuppressWarnings("unchecked")

    public <T> T instanceCasting(WardrobeComponentType componentType, Class<T> classType){
        Object component = null;
        switch(componentType){
            case Tshirt:
                component = new Tshirt("MAglietta bianca");
                break;
            case Pants:
                component = new Pants("Jeans");
                break;
        }
        return (T) component;
    }
}
