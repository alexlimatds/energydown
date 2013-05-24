package energyDownNow.cenario.cenarioFacil;

import energyDownNow.modelo.UtilizacaoAparelho;
import energyDownNow.modelo.unidade.Conforto;
import energyDownNow.modelo.Personagem;
import java.util.List;

/**
 *
 * @author Ana Meireles e Rafael
 */
public class PersonagemAna extends Personagem {

    public PersonagemAna(String sexo, int idade, String descricao) {
        super(sexo, idade, descricao);
    }

    @Override
    public Conforto calcular(List<UtilizacaoAparelho> aparelhosCenario) {
        for (UtilizacaoAparelho a : aparelhosCenario) {
            if ("Chuveiro Elétrico".equals(a.getDescricao())) {
                double tempoEmHoras = a.getUnidadeDeTempo().getFatorConversao() * a.getTempoUso();
                if (tempoEmHoras > (20.0 / 60.0)) {
                    //se tempo de uso maior que 20 min
                    return Conforto.OTIMO;
                } else if (tempoEmHoras * a.getTempoUso() > (10.0 / 60.0)) {
                    //se tempo de uso maior que 10 min
                    return Conforto.BOM;
                }
                return Conforto.PESSIMO;
            }
        }
        return Conforto.PESSIMO;
    }
}
