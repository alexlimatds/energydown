package energyDown.cenario.validacao;

import energyDown.modelo.UsoAparelho;
import energyDown.modelo.Cenario;
import energyDown.modelo.MetaConforto;
import energyDown.modelo.unidade.Tempo;

/**
 *
 * @author Ana Meireles
 */
public class CenarioValidacao {

    public static Cenario getCenario() {
        PersonagemAna personagem = new PersonagemAna("F", 28, "Ana");
        MetaConforto metaCenario = new MetaConfortoCenarioValidacao();
        metaCenario.addPersonagem(personagem);
        Cenario cenario = new Cenario(1000, "CenarioValidacao", 10, 150, metaCenario, 0.50);

        cenario.addUsoAparelho(new UsoAparelho(1125, "Ar Condicionado - Janela 12.000btus", 1200, 5, Tempo.HORAS_DIA));
        cenario.addUsoAparelho(new UsoAparelho(140, "TV 21\"", 780, 10, Tempo.HORAS_DIA));
        cenario.addUsoAparelho(new UsoAparelho(10, "DVD", 110, 2, Tempo.HORAS_SEMANA));
        cenario.addUsoAparelho(new UsoAparelho(40, "MicroSystem", 250, 1, Tempo.HORAS_MES));
        cenario.addUsoAparelho(new UsoAparelho(220, "Máquina de Lavar", 900, 6, Tempo.HORAS_SEMANA));
        cenario.addUsoAparelho(new UsoAparelho(1000, "Microondas 30L", 400, 20, Tempo.MINUTOS_DIA));
        cenario.addUsoAparelho(new UsoAparelho(4000, "Chuveiro Elétrico", 100, 25, Tempo.MINUTOS_DIA));
        cenario.addUsoAparelho(new UsoAparelho(265, "Geladeira Duplex", 4300, 10, Tempo.HORAS_DIA));
        cenario.addUsoAparelho(new UsoAparelho(1200, "Ferro à Vapor", 70, 4, Tempo.HORAS_SEMANA));
        
        return cenario;
    }
}
