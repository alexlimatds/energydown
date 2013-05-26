package energyDownNow.modelo;

//import org.junit.AfterClass;
//import org.junit.BeforeClass;
//import energyDownNow.Tempo;
//import energyDownNow.UtilizacaoAparelho;
import energyDownNow.modelo.unidade.Tempo;
import static org.junit.Assert.*;
import org.junit.Test;


public class AparelhoTest {
    
    @Test
    public void testGetConsumoMensal() {
        UtilizacaoAparelho aparelhoA = new UtilizacaoAparelho(3,"telefone", 100);
        aparelhoA.setTempoUso(24);
        aparelhoA.setUnidadeDeTempo(Tempo.HORAS_DIA);
        double consumoA = aparelhoA.getConsumoMensal();
        assertEquals(2.16, consumoA, 0.02);
        
        aparelhoA = new UtilizacaoAparelho(5400, "chuveiro", 100);
        aparelhoA.setTempoUso(10);
        aparelhoA.setUnidadeDeTempo(Tempo.MINUTOS_DIA);
        double consumoB = aparelhoA.getConsumoMensal();
        assertEquals(27, consumoB, 0.02);
    }
    

    
}
