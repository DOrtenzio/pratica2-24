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

    //Costruttori
    public Auto(){
        marca=null; //Default
        modello=null; //Default
        prezzo=0.0; //Default
    }
    public Auto(String marcaNew,String modelloNew, double prezzoNew){
        marca=marcaNew;
        modello=modelloNew;
        prezzo=Math.max(prezzoNew,0.0);
    }
    public Auto(String marcaNew){
        marca=marcaNew;
        modello=null;
        prezzo=0.0;
    }
    public Auto(double prezzoNew){
        marca=null;
        modello=null;
        prezzo=Math.max(prezzoNew,0.0);
    }
    public Auto(String marcaNew, double prezzoNew){
        marca=marcaNew;
        modello=null;
        prezzo=Math.max(prezzoNew,0.0);
    }
    //Inutile e confusionario questo sotto
    public Auto(double prezzoNew, String modelloNew){
        marca=null;
        modello=modelloNew;
        prezzo=Math.max(prezzoNew,0.0);
    }
}
