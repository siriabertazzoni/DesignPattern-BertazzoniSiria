public class App {
    public static void main(String[] args) throws Exception {

        TrusseFactorySingleton factory = new TrusseFactorySingleton();

        Fondotinta ft = (Fondotinta)factory.instance(TrusseComponentType.Fondotinta);

        Cipria cp = (Cipria)factory.instance(TrusseComponentType.Cipria);

        Fard fd = (Fard)factory.instance(TrusseComponentType.Fard);

        Pennelli pll = (Pennelli)factory.instance(TrusseComponentType.Pennelli);

        Spugnetta sp = (Spugnetta)factory.instance(TrusseComponentType.Spugnetta);


        
       Trusse t = new Trusse("Fondotinda StudioFix", "Cipria Mac", "Fard", pll, sp);
       System.out.println(t.getFondotinta());

       Trusse t1 = new Trusse("Fondotinda StudioFix", "Cipria Mac", "Fard", pll, sp);
       System.out.println(t1.getCipria());

       Trusse t2 = new Trusse("Fondotinda StudioFix", "Cipria Mac", "Fard 2in1", pll, sp);
       System.out.println(t2.getFard());
    }
}
