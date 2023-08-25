package test.java;
import main.java.Relogio;
import org.junit.*;

public class RelogioTest {


    @Test
    public void testHorasMinutosSegundos() {
        Relogio relogio = new Relogio();
        relogio.configHorasMinutosSegundos(10, 30, 45);

        Assert.assertEquals(10, relogio.getHoras());
        Assert.assertEquals(30, relogio.getMinutos());
        Assert.assertEquals(45, relogio.getSegundos());
    }


    @Test
    public void testMeiaNoite() {
        Relogio relogio = new Relogio();
        relogio.meiaNoite();
        Assert.assertEquals(0, relogio.getHoras());
        Assert.assertEquals(0, relogio.getMinutos());
        Assert.assertEquals(0, relogio.getSegundos());
    }
    
    @Test
    public void testCronometro() {
        Relogio relogio = new Relogio();
        relogio.inicioIntervalo(12, 0, 0);
        relogio.fimIntervalo(12, 30, 0);
        Assert.assertEquals(1800, relogio.tempoDecorrido());
    }
    
    @Test
    public void testAMPM() {
        Relogio relogio = new Relogio();
        relogio.configHorasMinutosSegundos(15, 30, 0);
        Assert.assertEquals("03:30:00 PM", relogio.displayAMPM());
    }

    

    @Test
    public void test24H() {
        Relogio relogio = new Relogio();
        relogio.configHorasMinutosSegundos(15, 30, 0);
        Assert.assertEquals("15:30:00", relogio.display24H());
    }

}
