package PeliElementit;

public class Nappula {
    private Pelaaja pelaaja;
    private int arvo;
    private boolean laudalla;
    private String vari;

    public Nappula(Pelaaja pelaaja, int arvo, String vari) {
        this.pelaaja = pelaaja;
        this.arvo = arvo;
        this.vari = vari;
        this.laudalla = false;
    }

    public Pelaaja getPelaaja() {
        return pelaaja;
    }

    public int getArvo() {
        return arvo;
    }

    public boolean isLaudalla() {
        return laudalla;
    }

    public void setLaudalla(boolean laudalla) {
        this.laudalla = laudalla;
    }
    
    
    
    
}
