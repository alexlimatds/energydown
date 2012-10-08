package energyDownNow.modelo;

//import org.junit.AfterClass;
//import org.junit.BeforeClass;
//import energyDownNow.Cenario;
//import energyDownNow.UnidadeDeTempo;
//import energyDownNow.EscalaConforto;
//import energyDownNow.FimDeJogo;
//import energyDownNow.Aparelho;
import energyDownNow.modelo.Personagem;
import energyDownNow.modelo.FimDeJogo;
import energyDownNow.modelo.Aparelho;
import energyDownNow.modelo.Cenario;
import energyDownNow.modelo.UnidadeDeTempo;
import energyDownNow.modelo.MetaConforto;
import energyDownNow.modelo.EscalaConforto;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;

public class CenarioTest {
    
    //Retorna uma meta conforto que é sempre atingida
    private MetaConforto getMetaAuxliar1(){
        MetaConforto metaConforto = new MetaConforto() {
            @Override
            public boolean atingida(List<Aparelho> l) {
                return true;
            }
        };
        
        return metaConforto;
    }
    
    //Retorna uma meta conforto que nunca é atingida
    private MetaConforto getMetaAuxliar2(){
        MetaConforto metaConforto = new MetaConforto() {
            @Override
            public boolean atingida(List<Aparelho> l) {
                return false;
            }
        };
        
        return metaConforto;
    }
    
    @Test
    public void testCalcularConsumoEmKWh() {
        Cenario cenarioA = new Cenario(1.200, "", 3, 1.100, getMetaAuxliar1());
        double totalConsumoKWh = cenarioA.calcularConsumoEmKWh();
        assertEquals(0.0, totalConsumoKWh, 0.0001);

        Aparelho aparelhoTeste1 = new Aparelho(3, "telefone", 100);
        aparelhoTeste1.setTempoUso(24);
        aparelhoTeste1.setUnidadeDeTempo(UnidadeDeTempo.HORAS_DIA);
        cenarioA.addAparelho(aparelhoTeste1);
        Aparelho aparelhoTeste2 = new Aparelho(5400, "chuveiro", 100);
        aparelhoTeste2.setTempoUso(10);
        aparelhoTeste2.setUnidadeDeTempo(UnidadeDeTempo.MINUTOS_DIA);
        cenarioA.addAparelho(aparelhoTeste2);

        totalConsumoKWh = cenarioA.calcularConsumoEmKWh();
        assertEquals(29.16, totalConsumoKWh, 0.0001);

    }

    @Test
    public void testCalcularDespesa() {

        Cenario cenarioB = new Cenario(1.200, "bbbbb", 3, 1.100, getMetaAuxliar1());
        double KWh = 2;
        double totalDespesa = cenarioB.calcularDespesa(KWh);
        assertEquals(KWh * cenarioB.getValorKwh(), totalDespesa, 0.0001);
    }

    @Test
    public void testAvancar() {
       
        Cenario cenarioC = new Cenario(1.200, "cccccc", 3, 1.100, getMetaAuxliar1());
        Aparelho aparelhoTeste2 = new Aparelho(3, "telefone", 100);
        aparelhoTeste2.setTempoUso(24);
        aparelhoTeste2.setUnidadeDeTempo(UnidadeDeTempo.HORAS_DIA);
        cenarioC.addAparelho(aparelhoTeste2);
        assertEquals(2.16, cenarioC.getUltimoConsumo(), 0.0001);
        assertEquals(2.16 * cenarioC.getValorKwh(), cenarioC.getUltimaDespesa(), 0.0001);
        
        cenarioC.avancar();
        
        assertEquals(2.16, cenarioC.getUltimoConsumo(), 0.0001);
        assertEquals(2.16 * cenarioC.getValorKwh() , cenarioC.getUltimaDespesa(), 0.0001);
        
    }

    @Test
    public void testMetaAtingida() {
        //meta deve ser atingida
        final List<Aparelho> aparelhos = new ArrayList<Aparelho>();
        Aparelho chuveiro = new Aparelho(3800, "Chuveiro Elétrico", 0.0);
        chuveiro.setTempoUso(30);
        chuveiro.setUnidadeDeTempo(UnidadeDeTempo.MINUTOS_DIA);
        aparelhos.add(chuveiro);
        Aparelho aparelhoTeste3 = new Aparelho(3, "telefone", 100);
        aparelhoTeste3.setTempoUso(24);
        aparelhoTeste3.setUnidadeDeTempo(UnidadeDeTempo.HORAS_DIA);
        aparelhos.add(aparelhoTeste3);
        
        final Personagem ana = new Personagem("F", 28, "") {
            @Override
            public EscalaConforto calcular(List<Aparelho> aparelhosCenario) {
                for(Aparelho a : aparelhosCenario){
                    if("Chuveiro Elétrico".equals(a.getDescricao())){
                        double tempoEmHoras = a.getUnidadeDeTempo().getFatorConversao() * a.getTempoUso();
                        if(tempoEmHoras > (20.0 / 60.0)){
                            //tempo de uso maior que 20 min
                            return EscalaConforto.OTIMO;
                        }
                        else if(tempoEmHoras * a.getTempoUso() > (10.0 / 60.0)){
                            return EscalaConforto.BOM;
                        }
                        return EscalaConforto.PESSIMO;
                    }
                }
                return EscalaConforto.PESSIMO;
            }
        };
        MetaConforto metaConforto = new MetaConforto() {
            @Override
            public boolean atingida(List<Aparelho> aparelhosDoCenario) {
                EscalaConforto conforto = ana.calcular(aparelhos);
                return (conforto == EscalaConforto.OTIMO || conforto == EscalaConforto.BOM);
            }
        };
        Cenario cenarioD = new Cenario(1200, "ddddd", 3, 1100, metaConforto);
        cenarioD.addAparelhos(aparelhos);
        cenarioD.avancar();
        assertEquals(true, cenarioD.metaAtingida());        
        
        //meta não deve ser atingida
        /*Cenario cenarioE = new Cenario(1200, "ddddd", 3, 4, EscalaConforto.OTIMO);
        cenarioE.addAparelho(aparelhoTeste3);       
        cenarioE.avancar();
        assertEquals(false, cenarioE.metaAtingida());        */
    }
    
    @Test
    public void testFimDoPrazo() {
        
        Cenario cenarioF = new Cenario(1200, "ddddd", 3, 1100, getMetaAuxliar2());
        Aparelho aparelhoTeste4 = new Aparelho(3, "telefone", 100);
        aparelhoTeste4.setTempoUso(24);
        aparelhoTeste4.setUnidadeDeTempo(UnidadeDeTempo.HORAS_DIA);
        cenarioF.addAparelho(aparelhoTeste4);
        //mes 1
        assertFalse(cenarioF.fimDoPrazo());
        cenarioF.avancar();
        //mes 2
        assertFalse(cenarioF.fimDoPrazo());
        cenarioF.avancar();
        //mes 3
        assertFalse(cenarioF.fimDoPrazo());
        cenarioF.avancar();
        //mes 4
        assertEquals(true, cenarioF.fimDoPrazo());               
    }
    
    @Test
    public void testGetFimDeJogo() {
        //teste 1 - fim do prazo
        
        // Cria um cenário
        Cenario cenarioG = new Cenario(1200, "ddddd", 3, 1, getMetaAuxliar2());
        // Cria um aparelho, e adiciona ele no cenário
        Aparelho aparelhoTeste5 = new Aparelho(300, "telefone", 100);
        aparelhoTeste5.setTempoUso(24);
        aparelhoTeste5.setUnidadeDeTempo(UnidadeDeTempo.HORAS_DIA);
        cenarioG.addAparelho(aparelhoTeste5);
        assertEquals(FimDeJogo.NAO_TERMINADO, cenarioG.getFimDeJogo());   //mes 1
        cenarioG.avancar();
        assertEquals(FimDeJogo.NAO_TERMINADO, cenarioG.getFimDeJogo());   //mes 2
        cenarioG.avancar();
        assertEquals(FimDeJogo.NAO_TERMINADO, cenarioG.getFimDeJogo());   //mes 3
        cenarioG.avancar();
        assertEquals(FimDeJogo.FIM_DO_PRAZO, cenarioG.getFimDeJogo());   //mes 4
        
        //teste 2 - meta atingida
        Cenario cenarioH = new Cenario(1200, "ddddd", 1, 1, getMetaAuxliar1());
        Aparelho aparelhoTeste6 = new Aparelho(3, "telefone", 100);
        aparelhoTeste6.setTempoUso(24);
        aparelhoTeste6.setUnidadeDeTempo(UnidadeDeTempo.HORAS_DIA);
        cenarioH.addAparelho(aparelhoTeste6);
        assertEquals(FimDeJogo.NAO_TERMINADO, cenarioH.getFimDeJogo());   //mes 1
        cenarioH.avancar();
        assertEquals(FimDeJogo.NAO_TERMINADO, cenarioH.getFimDeJogo());   //mes 2
        aparelhoTeste6.setTempoUso(5);
        cenarioH.avancar();
        assertEquals(FimDeJogo.METAS_ATINGIDAS, cenarioH.getFimDeJogo());   //mes 3
        
        //teste 3 - meta atingida - mudando aparelho
        Cenario cenarioI = new Cenario(1200, "novoTeste", 5, 1, getMetaAuxliar1());
        Aparelho aparelhoTeste7 = new Aparelho(115, "televisão", 1000);
        aparelhoTeste7.setTempoUso(20);
        aparelhoTeste7.setUnidadeDeTempo(UnidadeDeTempo.HORAS_DIA);
        cenarioI.addAparelho(aparelhoTeste7);
        //adicionando um novo aparelho no mesmo cenário
        
        Aparelho aparelhoTeste8=new Aparelho(60, "dvd", 200);
        aparelhoTeste8.setUnidadeDeTempo(UnidadeDeTempo.HORAS_MES);
        aparelhoTeste8.setTempoUso(10);
        cenarioI.addAparelho(aparelhoTeste8);
        
        assertEquals(FimDeJogo.NAO_TERMINADO, cenarioI.getFimDeJogo());   //mes 1
        aparelhoTeste7.setTempoUso(5);
        cenarioI.avancar();
        assertEquals(FimDeJogo.NAO_TERMINADO, cenarioI.getFimDeJogo());   //mes 2
        aparelhoTeste7.setTempoUso(0);
        cenarioI.avancar();
        assertEquals(FimDeJogo.METAS_ATINGIDAS, cenarioI.getFimDeJogo()); //mes 3
    }

    @Test
    public void testTrocaAparelho(){
        ArrayList<Aparelho> aparelhosParaCompra = new ArrayList<Aparelho>();
        Aparelho aparelho2 = new Aparelho(500, "Ar condicionado", 400);
        aparelho2.setUnidadeDeTempo(UnidadeDeTempo.HORAS_MES);
        aparelho2.setTempoUso(8);
        aparelhosParaCompra.add(aparelho2);
        
        Cenario cenario = new Cenario(1200, "Sei la", 3, 1, getMetaAuxliar1(), aparelhosParaCompra, 0.55);
        Aparelho aparelho1 = new Aparelho(100, "ventilador", 110);
        aparelho1.setUnidadeDeTempo(UnidadeDeTempo.HORAS_MES);
        aparelho1.setTempoUso(8);
        cenario.addAparelho(aparelho1);
        
        cenario.trocarAparelhos(aparelho1, aparelho2);
        
        cenario.avancar();
        
        assertEquals(1, cenario.getAparelhos().size());
        assertEquals(0, aparelhosParaCompra.size());
        assertTrue(cenario.getOrcamento() >= 0);
    }
}
