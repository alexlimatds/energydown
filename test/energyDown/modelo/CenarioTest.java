package energyDown.modelo;

//import org.junit.AfterClass;
//import org.junit.BeforeClass;
//import energyDownNow.Cenario;
//import energyDownNow.Tempo;
//import energyDownNow.Conforto;
//import energyDownNow.FimDeJogo;
//import energyDownNow.UsoAparelho;
import energyDown.modelo.MetaConforto;
import energyDown.modelo.Aparelho;
import energyDown.modelo.Personagem;
import energyDown.modelo.Cenario;
import energyDown.modelo.UsoAparelho;
import energyDown.modelo.unidade.FimDeJogo;
import energyDown.modelo.unidade.Conforto;
import energyDown.modelo.unidade.Tempo;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;

public class CenarioTest {

    //Retorna uma meta conforto que é sempre atingida
    private MetaConforto getMetaAuxliar1() {
        MetaConforto metaConforto = new MetaConforto() {
            @Override
            public boolean atingida(List<UsoAparelho> l) {
                return true;
            }
        };

        return metaConforto;
    }

    //Retorna uma meta conforto que nunca é atingida
    private MetaConforto getMetaAuxliar2() {
        MetaConforto metaConforto = new MetaConforto() {
            @Override
            public boolean atingida(List<UsoAparelho> l) {
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

        UsoAparelho aparelhoTeste1 = new UsoAparelho(3, "telefone", 100);
        aparelhoTeste1.setTempoUso(24);
        aparelhoTeste1.setUnidadeDeTempo(Tempo.HORAS_DIA);
        cenarioA.addUsoAparelho(aparelhoTeste1);
        UsoAparelho aparelhoTeste2 = new UsoAparelho(5400, "chuveiro", 100);
        aparelhoTeste2.setTempoUso(10);
        aparelhoTeste2.setUnidadeDeTempo(Tempo.MINUTOS_DIA);
        cenarioA.addUsoAparelho(aparelhoTeste2);

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
        UsoAparelho aparelhoTeste2 = new UsoAparelho(3, "telefone", 100);
        aparelhoTeste2.setTempoUso(24);
        aparelhoTeste2.setUnidadeDeTempo(Tempo.HORAS_DIA);
        cenarioC.addUsoAparelho(aparelhoTeste2);
        assertEquals(2.16, cenarioC.getUltimoConsumo(), 0.0001);
        assertEquals(2.16 * cenarioC.getValorKwh(), cenarioC.getUltimaDespesa(), 0.0001);

        cenarioC.avancar();

        assertEquals(2.16, cenarioC.getUltimoConsumo(), 0.0001);
        assertEquals(2.16 * cenarioC.getValorKwh(), cenarioC.getUltimaDespesa(), 0.0001);

    }

    @Test
    public void testMetaAtingida() {
        //meta deve ser atingida
        final List<UsoAparelho> aparelhos = new ArrayList<UsoAparelho>();
        UsoAparelho chuveiro = new UsoAparelho(3800, "Chuveiro Elétrico", 0.0);
        chuveiro.setTempoUso(30);
        chuveiro.setUnidadeDeTempo(Tempo.MINUTOS_DIA);
        aparelhos.add(chuveiro);
        UsoAparelho aparelhoTeste3 = new UsoAparelho(3, "telefone", 100);
        aparelhoTeste3.setTempoUso(24);
        aparelhoTeste3.setUnidadeDeTempo(Tempo.HORAS_DIA);
        aparelhos.add(aparelhoTeste3);

        final Personagem ana = new Personagem("F", 28, "") {
            @Override
            public Conforto calcular(List<UsoAparelho> aparelhosCenario) {
                for (UsoAparelho a : aparelhosCenario) {
                    if ("Chuveiro Elétrico".equals(a.getDescricao())) {
                        double tempoEmHoras = a.getUnidadeDeTempo().getFatorConversao() * a.getTempoUso();
                        if (tempoEmHoras > (20.0 / 60.0)) {
                            //tempo de uso maior que 20 min
                            return Conforto.OTIMO;
                        } else if (tempoEmHoras * a.getTempoUso() > (10.0 / 60.0)) {
                            return Conforto.BOM;
                        }
                        return Conforto.PESSIMO;
                    }
                }
                return Conforto.PESSIMO;
            }
        };
        MetaConforto metaConforto = new MetaConforto() {
            @Override
            public boolean atingida(List<UsoAparelho> aparelhosDoCenario) {
                Conforto conforto = ana.calcular(aparelhos);
                return (conforto == Conforto.OTIMO || conforto == Conforto.BOM);
            }
        };
        Cenario cenarioD = new Cenario(1200, "ddddd", 3, 1100, metaConforto);
        cenarioD.addUsoAparelhos(aparelhos);
        cenarioD.avancar();
        assertEquals(true, cenarioD.metaAtingida());

        //meta não deve ser atingida
        /*Cenario cenarioE = new Cenario(1200, "ddddd", 3, 4, Conforto.OTIMO);
         cenarioE.addUsoAparelho(aparelhoTeste3);       
         cenarioE.avancar();
         assertEquals(false, cenarioE.metaAtingida());        */
    }

    @Test
    public void testMetaAtingida2() {
        //meta deve ser atingida
        final List<UsoAparelho> aparelhos = new ArrayList<UsoAparelho>();
        UsoAparelho chuveiro = new UsoAparelho(3800, "Chuveiro Elétrico", 0.0);
        chuveiro.setTempoUso(30);
        chuveiro.setUnidadeDeTempo(Tempo.MINUTOS_DIA);
        aparelhos.add(chuveiro);
        UsoAparelho aparelhoTeste3 = new UsoAparelho(3, "telefone", 100);
        aparelhoTeste3.setTempoUso(2);
        aparelhoTeste3.setUnidadeDeTempo(Tempo.MINUTOS_DIA);
        aparelhos.add(aparelhoTeste3);

        final Personagem ana = new Personagem("F", 28, "") {
            @Override
            public Conforto calcular(List<UsoAparelho> aparelhosCenario) {
                for (UsoAparelho a : aparelhosCenario) {
                    if ("Chuveiro Elétrico".equals(a.getDescricao())) {
                        double tempoEmHorasMes = a.getUnidadeDeTempo().getFatorConversao() * a.getTempoUso();
                        if (tempoEmHorasMes > (20.0 / 60.0) * 30.0) {
                            //tempo de uso maior que 20 min
                            return Conforto.OTIMO;
                        } else if (tempoEmHorasMes > (10.0 / 60.0) * 30.0) {
                            return Conforto.BOM;
                        }
                        return Conforto.PESSIMO;
                    }
                }
                return Conforto.PESSIMO;
            }
        };
        final Personagem rafael = new Personagem("M", 26, "") {
            @Override
            public Conforto calcular(List<UsoAparelho> aparelhosCenario) {
                UsoAparelho chuveiro = getAparelho(aparelhosCenario, "Chuveiro Elétrico");
                UsoAparelho telefone = getAparelho(aparelhosCenario, "telefone");

                double tempoEmHoraschuveiro = chuveiro.getUnidadeDeTempo().getFatorConversao() * chuveiro.getTempoUso();
                double tempoEmHorastelefone = telefone.getUnidadeDeTempo().getFatorConversao() * telefone.getTempoUso();
                if (tempoEmHorastelefone > 20.0 / 60.0 * 30.0) {
                    if (tempoEmHoraschuveiro > (10.0 / 60.0 * 30.0)) {
                        return Conforto.OTIMO;
                    }
                    return Conforto.BOM;
                } else {
                    return Conforto.PESSIMO;
                }
            }
        };

        MetaConforto metaConforto = new MetaConforto() {
            @Override
            public boolean atingida(List<UsoAparelho> aparelhosDoCenario) {
                Conforto confortoAna = ana.calcular(aparelhos);
                Conforto confortoRafael = rafael.calcular(aparelhos);
                return (confortoAna.getValor() >= Conforto.BOM.getValor()
                        && confortoRafael.getValor() >= Conforto.BOM.getValor());
            }
        };
        Cenario cenarioD = new Cenario(1200, "ddddd", 3, 1100, metaConforto);
        cenarioD.addUsoAparelhos(aparelhos);

        cenarioD.avancar();
        assertEquals(false, cenarioD.metaAtingida());

        aparelhoTeste3.setTempoUso(30);
        chuveiro.setTempoUso(5);
        cenarioD.avancar();
        assertEquals(false, cenarioD.metaAtingida());

        chuveiro.setTempoUso(11);
        cenarioD.avancar();
        assertEquals(true, cenarioD.metaAtingida());
    }

    @Test
    public void testFimDoPrazo() {
        Cenario cenarioF = new Cenario(1200, "ddddd", 3, 1100, getMetaAuxliar2());
        UsoAparelho aparelhoTeste4 = new UsoAparelho(3, "telefone", 100);
        aparelhoTeste4.setTempoUso(24);
        aparelhoTeste4.setUnidadeDeTempo(Tempo.HORAS_DIA);
        cenarioF.addUsoAparelho(aparelhoTeste4);
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
        UsoAparelho aparelhoTeste5 = new UsoAparelho(300, "telefone", 100);
        aparelhoTeste5.setTempoUso(24);
        aparelhoTeste5.setUnidadeDeTempo(Tempo.HORAS_DIA);
        cenarioG.addUsoAparelho(aparelhoTeste5);
        assertEquals(FimDeJogo.NAO_TERMINADO, cenarioG.getFimDeJogo());   //mes 1
        cenarioG.avancar();
        assertEquals(FimDeJogo.NAO_TERMINADO, cenarioG.getFimDeJogo());   //mes 2
        cenarioG.avancar();
        assertEquals(FimDeJogo.NAO_TERMINADO, cenarioG.getFimDeJogo());   //mes 3
        cenarioG.avancar();
        assertEquals(FimDeJogo.FIM_DO_PRAZO, cenarioG.getFimDeJogo());   //mes 4

        //teste 2 - meta atingida
        Cenario cenarioH = new Cenario(1200, "ddddd", 5, 1, getMetaAuxliar1());
        UsoAparelho aparelhoTeste6 = new UsoAparelho(3, "telefone", 100);
        aparelhoTeste6.setTempoUso(24);
        aparelhoTeste6.setUnidadeDeTempo(Tempo.HORAS_DIA);
        cenarioH.addUsoAparelho(aparelhoTeste6);
        assertEquals(FimDeJogo.NAO_TERMINADO, cenarioH.getFimDeJogo());   //mes 1
        cenarioH.avancar();
        assertEquals(FimDeJogo.NAO_TERMINADO, cenarioH.getFimDeJogo());   //mes 2
        aparelhoTeste6.setTempoUso(5);
        cenarioH.avancar();
        assertEquals(FimDeJogo.METAS_ATINGIDAS, cenarioH.getFimDeJogo());   //mes 3

        //teste 3 - meta atingida - mudando aparelho
        Cenario cenarioI = new Cenario(1200, "novoTeste", 5, 1, getMetaAuxliar1());
        UsoAparelho aparelhoTeste7 = new UsoAparelho(115, "televisão", 1000);
        aparelhoTeste7.setTempoUso(20);
        aparelhoTeste7.setUnidadeDeTempo(Tempo.HORAS_DIA);
        cenarioI.addUsoAparelho(aparelhoTeste7);
        //adicionando um novo aparelho no mesmo cenário

        UsoAparelho aparelhoTeste8 = new UsoAparelho(60, "dvd", 200);
        aparelhoTeste8.setUnidadeDeTempo(Tempo.HORAS_MES);
        aparelhoTeste8.setTempoUso(10);
        cenarioI.addUsoAparelho(aparelhoTeste8);

        assertEquals(FimDeJogo.NAO_TERMINADO, cenarioI.getFimDeJogo());   //mes 1
        aparelhoTeste7.setTempoUso(5);
        cenarioI.avancar();
        assertEquals(FimDeJogo.NAO_TERMINADO, cenarioI.getFimDeJogo());   //mes 2
        aparelhoTeste7.setTempoUso(0);
        cenarioI.avancar();
        assertEquals(FimDeJogo.METAS_ATINGIDAS, cenarioI.getFimDeJogo()); //mes 3
    }

    @Test
    public void testTrocaAparelho() {
        ArrayList<Aparelho> aparelhosParaCompra = new ArrayList<Aparelho>();
        Aparelho aparelho2 = new Aparelho(500, "Ar condicionado", 400);

        Cenario cenario = new Cenario(1200, "Sei la", 3, 1, getMetaAuxliar1(), aparelhosParaCompra, 0.55);
        UsoAparelho aparelho1 = new UsoAparelho(100, "ventilador", 110);
        aparelho1.setUnidadeDeTempo(Tempo.HORAS_MES);
        aparelho1.setTempoUso(8);
        cenario.addUsoAparelho(aparelho1);

        cenario.trocarAparelhos(aparelho1, aparelho2);

        cenario.avancar();

        assertEquals(1, cenario.getUsoAparelhos().size());
        assertEquals(0, aparelhosParaCompra.size());
        assertTrue(cenario.getOrcamento() >= 0);
    }
}
