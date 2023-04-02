public class App {
    public static void main(String[] args) throws Exception {
        
        WardrobeFactoryPrototype wardrobeFactoryPrototype = new WardrobeFactoryPrototype();
        Tshirt t = wardrobeFactoryPrototype.instanceCasting(WardrobeComponentType.Tshirt, Tshirt.class);

        Pants p = wardrobeFactoryPrototype.instanceCasting(WardrobeComponentType.Pants, Pants.class);

        Wardrobe w1 = new Wardrobe(t, p, p);
        System.out.println(w1.getTshirt().tshirt);

    }
}
