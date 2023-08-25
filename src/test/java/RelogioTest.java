package test.java;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RelogioTest {
    
    @Test
    public void testHorasMinutosSegundos() {
        Relogio relogio = new Relogio();
        relogio.configHorasMinutosSegundos(10, 30, 45);

        assertEquals(10, relogio.getHoras());
        assertEquals(30, relogio.getMinutos());
        assertEquals(45, relogio.getSegundos());
    }

    @Test
    public void testMeiaNoite() {
        Relogio relogio = new Relogio();
        relogio.meiaNoite();
        assertEquals(0, relogio.getHoras());
        assertEquals(0, relogio.getMinutos());
        assertEquals(0, relogio.getSegundos());
    }
    
    @Test
    public void testCronometro() {
        Relogio relogio = new Relogio();
        relogio.inicioIntervalo(12, 0, 0);
        relogio.fimIntervalo(12, 30, 0);
        assertEquals(1800, relogio.tempoDecorrido());
    }
    
    @Test
    public void testAMPM() {
        Relogio relogio = new Relogio();
        relogio.configHorasMinutosSegundos(15, 30, 0);
        assertEquals("3:30:00", relogio.displayAMPM());
    }

    @Test
    public void test24H() {
        Relogio relogio = new Relogio();
        relogio.configHorasMinutosSegundos(15, 30, 0);
        assertEquals("15:30:00", relogio.display24H());
    }

}
