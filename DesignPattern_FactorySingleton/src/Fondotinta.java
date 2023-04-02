public class Fondotinta implements Spugnetta {
    protected String fondotinta;

    public Fondotinta(String fondotinta) {
        this.fondotinta = fondotinta;
    }

    public void spalma(){
        System.out.println("Stendo il fondotinta con la spugnetta");
    }
}
