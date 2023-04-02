public class Trusse {
    private String fondotinta;
    private String cipria;
    private String fard;
    private Pennelli pennelli;
    private Spugnetta spugnetta;
    
    public Trusse(String fondotinta, String cipria, String fard, Pennelli pennelli, Spugnetta spugnetta) {
        this.fondotinta = fondotinta;
        this.cipria = cipria;
        this.fard = fard;
        this.pennelli = pennelli;
        this.spugnetta = spugnetta;
    }

    public String getFondotinta() {
        return fondotinta;
    }

    public void setFondotinta(String fondotinta) {
        this.fondotinta = fondotinta;
    }

    public String getCipria() {
        return cipria;
    }

    public void setCipria(String cipria) {
        this.cipria = cipria;
    }

    public String getFard() {
        return fard;
    }

    public void setFard(String fard) {
        this.fard = fard;
    }

    public Pennelli getPennelli() {
        return pennelli;
    }

    public void setPennelli(Pennelli pennelli) {
        this.pennelli = pennelli;
    }

    public Spugnetta getSpugnetta() {
        return spugnetta;
    }

    public void setSpugnetta(Spugnetta spugnetta) {
        this.spugnetta = spugnetta;
    }

    // public void spalma(){
    //     this.fondotinta.spalma();
    //     // if(this.spugnetta instanceof Fondotinta){
    //     //     Fondotinta f = (Fondotinta) spugnetta;
    //     //     f.spalma();
    //     // }
    // }

    // public void spolvera(){
    //     this.cipria.spolvera();
    //     this.fard.spolvera();
    // }

}
