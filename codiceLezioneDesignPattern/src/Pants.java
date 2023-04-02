public class Pants implements HangDress {

    //? la classe abstract non può essere istanziata e mi serve come generalizzazione di classi più specifiche 
    
    protected String pants;

    public Pants(String pants) {
        this.pants = pants;
    }

    @Override
    public void appendi(){
        System.out.println("Appendo i pantaloni a destra");
    }
    
}
