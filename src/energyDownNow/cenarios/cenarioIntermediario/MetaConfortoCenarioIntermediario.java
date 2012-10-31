package energyDownNow.cenarios.cenarioIntermediario;

import energyDownNow.modelo.Aparelho;
import energyDownNow.modelo.EscalaConforto;
import energyDownNow.modelo.MetaConforto;
import energyDownNow.modelo.Personagem;
import java.util.List;

/**
 *
 * @author Ana Meireles e Rafael
 */
public class MetaConfortoCenarioIntermediario extends MetaConforto{
    
    @Override
    public boolean atingida(List<Aparelho> aparelhosDoCenario) {
        for(Personagem p : getPersonagens()){
            if(p.calcular(aparelhosDoCenario).getValor() < EscalaConforto.BOM.getValor()){
                return false;
            }
        }
        return true;
    }
    
}
