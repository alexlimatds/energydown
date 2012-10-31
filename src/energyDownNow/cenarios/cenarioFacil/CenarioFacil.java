
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
   public static Cenario getCenario(){
        PersonagemAna personagem = new PersonagemAna("F", 28, "Ana");
        MetaConforto metaAna = new MetaConfortoCenarioFacil();
        metaAna.addPersonagem(personagem);
        Cenario cenario = new Cenario(1000, "CenarioFacil", 10, 150, metaAna, 0.50);
        
        Aparelho aparelho1 = new Aparelho(1125, "Ar Condicionado - Janela 12.000btus", 1200, 5, UnidadeDeTempo.HORAS_DIA);
        Aparelho aparelho2 = new Aparelho(140, "TV 21\"", 780, 10, UnidadeDeTempo.HORAS_DIA);
        Aparelho aparelho3 = new Aparelho(10, "DVD", 110, 2, UnidadeDeTempo.HORAS_SEMANA);
        Aparelho aparelho4 = new Aparelho(40, "MicroSystem", 250, 1, UnidadeDeTempo.HORAS_MES);
        Aparelho aparelho5 = new Aparelho(220, "Máquina de Lavar", 900, 6, UnidadeDeTempo.HORAS_SEMANA);
        Aparelho aparelho6 = new Aparelho(1000, "Microondas 30L", 400, 20, UnidadeDeTempo.MINUTOS_DIA);
        Aparelho aparelho7 = new Aparelho(4000, "Chuveiro Elétrico", 100, 25,  UnidadeDeTempo.MINUTOS_DIA);
        Aparelho aparelho8 = new Aparelho(265, "Geladeira Duplex", 4300, 10, UnidadeDeTempo.HORAS_DIA);
        Aparelho aparelho9 = new Aparelho(1200, "Ferro à Vapor", 70, 4, UnidadeDeTempo.HORAS_SEMANA);
        
        cenario.addAparelho(aparelho1);
        cenario.addAparelho(aparelho2);
        cenario.addAparelho(aparelho3);
        cenario.addAparelho(aparelho4);
        cenario.addAparelho(aparelho5);
        cenario.addAparelho(aparelho6);
        cenario.addAparelho(aparelho7);
        cenario.addAparelho(aparelho8);
        cenario.addAparelho(aparelho9);
        
        return cenario;
    }
}
