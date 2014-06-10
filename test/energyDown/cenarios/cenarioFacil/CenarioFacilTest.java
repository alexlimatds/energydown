/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package energyDown.cenarios.cenarioFacil;

import energyDown.modelo.UsoAparelho;
import energyDown.modelo.Cenario;
import energyDown.modelo.unidade.Tempo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.junit.Test;

/**
 *
 * @author 201114040037
 */
public class CenarioFacilTest {

    @Test
    public void testCenario() {
        
        Cenario cenarioFacil = new Cenario(0, null, 0, 0, null);
        
               
        System.out.println("despesa: " + cenarioFacil.getUltimaDespesa());
        System.out.println("Fim de jogo: " + cenarioFacil.getFimDeJogo());

        UsoAparelho dvd = cenarioFacil.getAparelho("DVD");
        dvd.setTempoUso(2);
        dvd.setUnidadeDeTempo(Tempo.HORAS_SEMANA);
        cenarioFacil.avancar();
        System.out.println("despesa: " + cenarioFacil.getUltimaDespesa());
        System.out.println("Fim de jogo: " + cenarioFacil.getFimDeJogo());

        UsoAparelho chuveiro = cenarioFacil.getAparelho("Chuveiro Elétrico");
        chuveiro.setTempoUso(0);
        cenarioFacil.avancar();
        System.out.println("despesa: " + cenarioFacil.getUltimaDespesa());
        System.out.println("Fim de jogo: " + cenarioFacil.getFimDeJogo());

        UsoAparelho arcondicionado = cenarioFacil.getAparelho("Ar Condicionado - Janela 12.000btus");
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
