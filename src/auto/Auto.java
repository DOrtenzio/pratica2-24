package auto;

public class Auto {

    //Attributi
    private String marca;
    private String modello;
    private double prezzo;

    //Set
    public void setMarca( String marcaNew ){ marca=marcaNew; }
    public void setModello( String modelloNew ){ modello=modelloNew; }
    public void setPrezzo( double prezzoNew ){ prezzo=Math.max(prezzoNew,0.0); }

    //Get
    public String getMarca() { return marca; }
    public String getModello() { return modello; }
    public double getPrezzo() { return prezzo; }
    public String getAuto(){ return marca+" ; "+modello+" ; "+prezzo; }

    //Costruttori
    public Auto(){
        this.marca=null; //Default
        this.modello=null; //Default
        this.prezzo=0.0; //Default
    }
    public Auto(String marca, String modello, double prezzo){
        this.marca=marca;
        this.modello = modello;
        setPrezzo(prezzo);
    }
    public Auto(String marca){
        this.marca=marca;
        this.modello=null;//Default
        this.prezzo=0.0;//Default
    }
    public Auto(double prezzo){
        this.marca=null;//Default
        this.modello=null;//Default
        setPrezzo(prezzo);
    }
    public Auto(String marca, double prezzo){
        this.marca=marca;
        this.modello=null;//Default
        setPrezzo(prezzo);
    }
}
