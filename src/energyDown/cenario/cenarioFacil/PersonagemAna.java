package energyDown.cenario.cenarioFacil;

import energyDown.modelo.UsoAparelho;
import energyDown.modelo.unidade.Conforto;
import energyDown.modelo.Personagem;
import java.util.List;

/**
 *
 * @author Ana Meireles
 */
public class PersonagemAna extends Personagem {

    public PersonagemAna(String sexo, int idade, String descricao) {
        super(sexo, idade, descricao);
    }

    @Override
    public Conforto calcular(List<UsoAparelho> aparelhosCenario) {
        for (UsoAparelho a : aparelhosCenario) {
            if ("Chuveiro Elétrico".equals(a.getDescricao())) {
                double tempoEmHorasNoMes = a.getUnidadeDeTempo().getFatorConversao() * a.getTempoUso();
                if (tempoEmHorasNoMes > (20.0 * 30.0 / 60.0)) {
                    //se tempo de uso maior que 20 min/dia
                    return Conforto.OTIMO;
                } else if (tempoEmHorasNoMes > (10.0 * 30.0 / 60.0)) {
                    //se tempo de uso maior que 10 min/dia
                    return Conforto.BOM;
                }
                return Conforto.PESSIMO;
            }
        }
        return Conforto.PESSIMO;
    }
}
