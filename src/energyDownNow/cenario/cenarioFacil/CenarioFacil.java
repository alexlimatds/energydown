package energyDownNow.cenario.cenarioFacil;

import energyDownNow.modelo.UtilizacaoAparelho;
import energyDownNow.modelo.Cenario;
import energyDownNow.modelo.MetaConforto;
import energyDownNow.modelo.unidade.Tempo;

/**
 *
 * @author Ana Meireles e Rafael
 */
public class CenarioFacil {

    public static Cenario getCenario() {
        PersonagemAna personagem = new PersonagemAna("F", 28, "Ana");
        MetaConforto metaAna = new MetaConfortoCenarioFacil();
        metaAna.addPersonagem(personagem);
        Cenario cenario = new Cenario(1000, "CenarioFacil", 10, 150, metaAna, 0.50);

        cenario.addAparelhoUtilizado(new UtilizacaoAparelho(1125, "Ar Condicionado - Janela 12.000btus", 1200, 5, Tempo.HORAS_DIA));
        cenario.addAparelhoUtilizado(new UtilizacaoAparelho(140, "TV 21\"", 780, 10, Tempo.HORAS_DIA));
        cenario.addAparelhoUtilizado(new UtilizacaoAparelho(10, "DVD", 110, 2, Tempo.HORAS_SEMANA));
        cenario.addAparelhoUtilizado(new UtilizacaoAparelho(40, "MicroSystem", 250, 1, Tempo.HORAS_MES));
        cenario.addAparelhoUtilizado(new UtilizacaoAparelho(220, "Máquina de Lavar", 900, 6, Tempo.HORAS_SEMANA));
        cenario.addAparelhoUtilizado(new UtilizacaoAparelho(1000, "Microondas 30L", 400, 20, Tempo.MINUTOS_DIA));
        cenario.addAparelhoUtilizado(new UtilizacaoAparelho(4000, "Chuveiro Elétrico", 100, 25, Tempo.MINUTOS_DIA));
        cenario.addAparelhoUtilizado(new UtilizacaoAparelho(265, "Geladeira Duplex", 4300, 10, Tempo.HORAS_DIA));
        cenario.addAparelhoUtilizado(new UtilizacaoAparelho(1200, "Ferro à Vapor", 70, 4, Tempo.HORAS_SEMANA));

        return cenario;
    }
}
