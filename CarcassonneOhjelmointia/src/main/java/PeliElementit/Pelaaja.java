package PeliElementit;

import Logiikka.RakennelmaPelilaudalla;
import java.util.*;

public class Pelaaja {
    private String nimi;
    private int pisteet;
    private ArrayList<Nappula> nappulat;
    private String vari;

    public Pelaaja(String nimi, String vari) {
        this.nimi = nimi;
        this.vari = vari;
        this.pisteet = 0;
        this.nappulat = new ArrayList<Nappula>();
        
        for (int i=0; i<7; i++) {
            this.nappulat.add(new Nappula(this, 1, vari));
        }
    }

    public String getNimi() {
        return nimi;
    }

    public int getPisteet() {
        return pisteet;
    }

    public void lisaaPistemaaraa(int pisteet) {
        this.pisteet += pisteet;
    }

    public String getVari() {
        return vari;
    }

    public ArrayList<Nappula> getNappulat() {
        return nappulat;
    }

    public void asetaNappula(RakennelmaPelilaudalla paikka) {
        if (nappulat.isEmpty()) {
            System.out.println("Sinulla ei ole nappuloita käytettävissä.");
        } else {
            //paikka.lisaaNappula(nappulat.get(0))//
            nappulat.remove(0);
        }
        
    }
    
    
    
   
}
