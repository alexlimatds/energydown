package energyDownNow.cenario.cenarioIntermediario;

import energyDownNow.modelo.Aparelho;
import energyDownNow.modelo.unidade.Conforto;
import energyDownNow.modelo.MetaConforto;
import energyDownNow.modelo.Personagem;
import java.util.List;

/**
 *
 * @author Ana Meireles e Rafael
 */
public class MetaConfortoCenarioIntermediario extends MetaConforto {

    @Override
    public boolean atingida(List<Aparelho> aparelhosDoCenario) {
        for (Personagem p : getPersonagens()) {
            if (p.calcular(aparelhosDoCenario).getValor() < Conforto.BOM.getValor()) {
                return false;
            }
        }
        return true;
    }
}
