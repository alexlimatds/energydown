package energyDown.cenario.cenarioFacil;

import energyDown.modelo.UsoAparelho;
import energyDown.modelo.unidade.Conforto;
import energyDown.modelo.Personagem;
import java.util.List;

/**
 *
 * @author Ana Meireles
 */
public class PersonagemRafael extends Personagem {

    public PersonagemRafael(String sexo, int idade, String descricao) {
        super(sexo, idade, descricao);
    }

    @Override
    public Conforto calcular(List<UsoAparelho> aparelhosCenario) {
        for (UsoAparelho a : aparelhosCenario) {
            if ("VideoGame".equals(a.getDescricao())) {
                double tempoEmHorasNoMes = a.getUnidadeDeTempo().getFatorConversao() * a.getTempoUso();
                if (tempoEmHorasNoMes > (180.0 * 30.0 / 60.0)) {
                    //se tempo de uso maior que 180 min/dia (3 horas)
                    return Conforto.OTIMO;
                } else if (tempoEmHorasNoMes > (120.0 * 30.0 / 60.0)) {
                    //se tempo de uso maior que 120 min/dia (2 horas)
                    return Conforto.BOM;
                }
                return Conforto.PESSIMO;
            }
        }
        return Conforto.PESSIMO;
    }
}
