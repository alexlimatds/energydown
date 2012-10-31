/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package energyDownNow.cenarios.cenarioFacil;

import energyDownNow.modelo.Aparelho;
import energyDownNow.modelo.Cenario;
import energyDownNow.modelo.UnidadeDeTempo;
import org.junit.Test;

/**
 *
 * @author 201114040037
 */
public class CenarioTest {
    
    @Test
    public void testCenario(){
        Cenario cenarioFacil = CenarioFacil.getCenario();
        System.out.println("despesa: " + cenarioFacil.getUltimaDespesa());
        System.out.println("Fim de jogo: " + cenarioFacil.getFimDeJogo());
        
        Aparelho dvd = cenarioFacil.getAparelho("DVD");
        dvd.setTempoUso(2);
        dvd.setUnidadeDeTempo(UnidadeDeTempo.HORAS_SEMANA);
        cenarioFacil.avancar();        
        System.out.println("despesa: " + cenarioFacil.getUltimaDespesa());
        System.out.println("Fim de jogo: " + cenarioFacil.getFimDeJogo());
        
        Aparelho chuveiro = cenarioFacil.getAparelho("Chuveiro Elétrico");
        chuveiro.setTempoUso(0);
        cenarioFacil.avancar();        
        System.out.println("despesa: " + cenarioFacil.getUltimaDespesa());
        System.out.println("Fim de jogo: " + cenarioFacil.getFimDeJogo());
        
        Aparelho arcondicionado = cenarioFacil.getAparelho("Ar Condicionado - Janela 12.000btus");
        arcondicionado.setTempoUso(0);
        cenarioFacil.avancar();        
        System.out.println("despesa: " + cenarioFacil.getUltimaDespesa());
        System.out.println("Fim de jogo: " + cenarioFacil.getFimDeJogo());
        
        chuveiro.setTempoUso(20);
        System.out.println("despesa: " + cenarioFacil.getUltimaDespesa());
        System.out.println("Fim de jogo: " + cenarioFacil.getFimDeJogo());
        System.out.println("Conforto: " + cenarioFacil.getMetaConforto());
    }
}
