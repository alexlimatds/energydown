package energyDownNow;

//import org.junit.AfterClass;
//import org.junit.BeforeClass;
//import energyDownNow.UnidadeDeTempo;
//import energyDownNow.Aparelho;
import static org.junit.Assert.*;
import org.junit.Test;


public class AparelhoTest {
    
    @Test
    public void testGetConsumoMensal() {
        Aparelho aparelhoA = new Aparelho(3,"telefone", 100);
        aparelhoA.setTempoUso(24);
        aparelhoA.setUnidadeDeTempo(UnidadeDeTempo.HORAS_DIA);
        double consumoA = aparelhoA.getConsumoMensal();
        assertEquals(2.16, consumoA, 0.02);
        
        aparelhoA = new Aparelho(5400, "chuveiro", 100);
        aparelhoA.setTempoUso(10);
        aparelhoA.setUnidadeDeTempo(UnidadeDeTempo.MINUTOS_DIA);
        double consumoB = aparelhoA.getConsumoMensal();
        assertEquals(27, consumoB, 0.02);
    }
    

    
}
