package energyDown.cenario.cenarioFacil;

import energyDown.modelo.UsoAparelho;
import energyDown.modelo.unidade.Conforto;
import energyDown.modelo.Personagem;
import java.util.List;

/**
 *
 * @author Ana Meireles
 */
public class PersonagemAlexandre extends Personagem {

    public PersonagemAlexandre(String sexo, int idade, String descricao) {
        super(sexo, idade, descricao);
    }

    @Override
    public Conforto calcular(List<UsoAparelho> aparelhosCenario) {
        for (UsoAparelho a : aparelhosCenario) {
            if ("TV 32\"".equals(a.getDescricao())) {
                double tempoEmHorasNoMes = a.getUnidadeDeTempo().getFatorConversao() * a.getTempoUso();
                if (tempoEmHorasNoMes > (60.0 * 30.0 / 60.0)) {
                    //se tempo de uso maior que 180 min/dia
                    return Conforto.OTIMO;
                } else if (tempoEmHorasNoMes > (30.0 * 30.0 / 60.0)) {
                    //se tempo de uso maior que 100 min/dia
                    return Conforto.BOM;
                }
                return Conforto.PESSIMO;
            }
        }
        return Conforto.PESSIMO;
    }
}
