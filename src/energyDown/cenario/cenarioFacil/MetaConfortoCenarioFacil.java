package energyDown.cenario.cenarioFacil;

import energyDown.modelo.UsoAparelho;
import energyDown.modelo.unidade.Conforto;
import energyDown.modelo.MetaConforto;
import energyDown.modelo.Personagem;
import java.util.List;

/**
 *
 * @author Ana Meireles
 */
public class MetaConfortoCenarioFacil extends MetaConforto {

    @Override
    public boolean atingida(List<UsoAparelho> aparelhosDoCenario) {
        for (Personagem p : getPersonagens()) {
            Conforto conforto = p.calcular(aparelhosDoCenario);
            if (conforto.getValor() < Conforto.BOM.getValor()) {
                return false;
            }
        }
        return true;
    }
}
