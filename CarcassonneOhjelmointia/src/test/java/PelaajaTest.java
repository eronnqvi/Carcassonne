import PeliElementit.Pelaaja;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PelaajaTest {
    
    public PelaajaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void konstruktoriAsettaaNimenJaVarinOikein() { 
        Pelaaja pelaaja = new Pelaaja("Eva", "pinkki");
        assertEquals("Eva",  pelaaja.getNimi());
        assertEquals("pinkki", pelaaja.getVari());
    }
    
    @Test
    public void pisteetAlussaOikein() { 
        Pelaaja pelaaja = new Pelaaja("Eva", "pinkki");
        assertEquals(0,  pelaaja.getPisteet());
    }
    
    @Test
    public void pisteidenLisaaminenToimii() { 
        Pelaaja pelaaja = new Pelaaja("Eva", "pinkki");
        pelaaja.lisaaPistemaaraa(5);
        pelaaja.lisaaPistemaaraa(1);
        pelaaja.lisaaPistemaaraa(-2);
        pelaaja.lisaaPistemaaraa(0);
        assertEquals(4, pelaaja.getPisteet());
    }
    
    @Test
    public void nappulatAlussaOikein() { 
        Pelaaja pelaaja = new Pelaaja("Eva", "pinkki");
        assertEquals(7,  pelaaja.getNappulat().size());
    }
    
    @Test
    public void eiPystyAsettamaanRajattomastiNappulaita() { 
        Pelaaja pelaaja = new Pelaaja("Eva", "pinkki");
        pelaaja.asetaNappula(null);
        pelaaja.asetaNappula(null);
        pelaaja.asetaNappula(null);
        pelaaja.asetaNappula(null);
        pelaaja.asetaNappula(null);
        pelaaja.asetaNappula(null);
        pelaaja.asetaNappula(null);
        pelaaja.asetaNappula(null);
        
        assertEquals(0,  pelaaja.getNappulat().size());
    }
    
    
    
    
}
