package auto;

public class Auto {

    //Variabili d'Istanza
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

}
