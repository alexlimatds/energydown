package energyDownNow.cenarios.cenarioFacil;

import energyDownNow.modelo.Aparelho;
import energyDownNow.modelo.EscalaConforto;
import energyDownNow.modelo.MetaConforto;
import energyDownNow.modelo.Personagem;
import java.util.List;

/**
 *
 * @author Ana Meireles e Rafael
 */
public class MetaConfortoCenarioFacil extends MetaConforto {

    @Override
    public boolean atingida(List<Aparelho> aparelhosDoCenario) {
        for (Personagem p : getPersonagens()) {
            EscalaConforto conforto = p.calcular(aparelhosDoCenario);
            if (conforto.getValor() < EscalaConforto.BOM.getValor()) {
                return false;
            }
        }
        return true;
    }
}
