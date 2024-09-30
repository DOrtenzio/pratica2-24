package auto;

public class Auto {

    //Attributi
    private String marca;
    private String modello;
    private double prezzo;

    //Set
    public void setMarca( String marcaNew ){ marca=marcaNew; }
    public void setModello( String modelloNew ){ modello=modelloNew; }
    public void setPrezzo( double prezzoNew ){ prezzo=prezzoNew; }

    //Get
    public String getMarca() { return marca; }
    public String getModello() { return modello; }
    public double getPrezzo() { return prezzo; }

    //Costruttore
    public Auto(){
        marca=null;
        modello=null;
        prezzo=0.0;
    }
    public Auto(String marcaNew,String modelloNew, double prezzoNew){
        marca=marcaNew;
        modello=modelloNew;
        prezzo=prezzoNew;
    }
}
