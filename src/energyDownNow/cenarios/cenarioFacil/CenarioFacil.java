package energyDownNow.cenarios.cenarioFacil;

import energyDownNow.modelo.Aparelho;
import energyDownNow.modelo.Cenario;
import energyDownNow.modelo.MetaConforto;
import energyDownNow.modelo.UnidadeDeTempo;

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

        cenario.addAparelho(new Aparelho(1125, "Ar Condicionado - Janela 12.000btus", 1200, 5, UnidadeDeTempo.HORAS_DIA));
        cenario.addAparelho(new Aparelho(140, "TV 21\"", 780, 10, UnidadeDeTempo.HORAS_DIA));
        cenario.addAparelho(new Aparelho(10, "DVD", 110, 2, UnidadeDeTempo.HORAS_SEMANA));
        cenario.addAparelho(new Aparelho(40, "MicroSystem", 250, 1, UnidadeDeTempo.HORAS_MES));
        cenario.addAparelho(new Aparelho(220, "Máquina de Lavar", 900, 6, UnidadeDeTempo.HORAS_SEMANA));
        cenario.addAparelho(new Aparelho(1000, "Microondas 30L", 400, 20, UnidadeDeTempo.MINUTOS_DIA));
        cenario.addAparelho(new Aparelho(4000, "Chuveiro Elétrico", 100, 25, UnidadeDeTempo.MINUTOS_DIA));
        cenario.addAparelho(new Aparelho(265, "Geladeira Duplex", 4300, 10, UnidadeDeTempo.HORAS_DIA));
        cenario.addAparelho(new Aparelho(1200, "Ferro à Vapor", 70, 4, UnidadeDeTempo.HORAS_SEMANA));

        return cenario;
    }
}
