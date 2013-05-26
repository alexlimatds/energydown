/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package energyDownNow.cenarios.cenarioFacil;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import energyDownNow.modelo.UtilizacaoAparelho;
import energyDownNow.modelo.Cenario;
import energyDownNow.modelo.unidade.Tempo;
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
        
        XStream xs = new XStream(new StaxDriver());
        
        try {
            FileInputStream fis = new FileInputStream("src/energyDownNow/cenario/cenarioFacil.xml");
            xs.fromXML(fis, cenarioFacil);

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        
        System.out.println("despesa: " + cenarioFacil.getUltimaDespesa());
        System.out.println("Fim de jogo: " + cenarioFacil.getFimDeJogo());

        UtilizacaoAparelho dvd = cenarioFacil.getAparelho("DVD");
        dvd.setTempoUso(2);
        dvd.setUnidadeDeTempo(Tempo.HORAS_SEMANA);
        cenarioFacil.avancar();
        System.out.println("despesa: " + cenarioFacil.getUltimaDespesa());
        System.out.println("Fim de jogo: " + cenarioFacil.getFimDeJogo());

        UtilizacaoAparelho chuveiro = cenarioFacil.getAparelho("Chuveiro Elétrico");
        chuveiro.setTempoUso(0);
        cenarioFacil.avancar();
        System.out.println("despesa: " + cenarioFacil.getUltimaDespesa());
        System.out.println("Fim de jogo: " + cenarioFacil.getFimDeJogo());

        UtilizacaoAparelho arcondicionado = cenarioFacil.getAparelho("Ar Condicionado - Janela 12.000btus");
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
