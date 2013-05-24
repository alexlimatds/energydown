package energyDownNow.cenario.cenarioFacil;

import energyDownNow.modelo.Aparelho;
import energyDownNow.modelo.unidade.Conforto;
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
            Conforto conforto = p.calcular(aparelhosDoCenario);
            if (conforto.getValor() < Conforto.BOM.getValor()) {
                return false;
            }
        }
        return true;
    }
}
