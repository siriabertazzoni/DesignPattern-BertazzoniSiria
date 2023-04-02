public class Wardrobe{
    private Tshirt tshirt;
    private Pants pants;
    private HangDress hankDress;
    
    public Wardrobe(Tshirt tshirt, Pants pants, HangDress hankDress) {
        this.tshirt = tshirt;
        this.pants = pants;
        this.hankDress = hankDress;
    }

    public Tshirt getTshirt() {
        return tshirt;
    }

    public void setTshirt(Tshirt tshirt) {
        this.tshirt = tshirt;
    }

    public Pants getPants() {
        return pants;
    }

    public void setPants(Pants pants) {
        this.pants = pants;
    }

    public HangDress getHankDress() {
        return hankDress;
    }

    public void setHankDress(HangDress hankDress) {
        this.hankDress = hankDress;
    }

    public void appendi(){
        this.tshirt.appendi();
        this.pants.appendi();
    }

    

    
}