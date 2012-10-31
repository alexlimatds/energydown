package energyDownNow.cenarios.cenarioFacil;

import energyDownNow.modelo.Aparelho;
import energyDownNow.modelo.EscalaConforto;
import energyDownNow.modelo.Personagem;
import java.util.List;

/**
 *
 * @author Ana Meireles e Rafael
 */
public class PersonagemAna extends Personagem{

    public PersonagemAna(String sexo, int idade, String descricao) {
        super(sexo, idade, descricao);
    }
    
    @Override
    public EscalaConforto calcular(List<Aparelho> aparelhosCenario) {        
       for(Aparelho a : aparelhosCenario){
                    if("Chuveiro Elétrico".equals(a.getDescricao())){
                        double tempoEmHoras = a.getUnidadeDeTempo().getFatorConversao() * a.getTempoUso();
                        if(tempoEmHoras > (20.0 / 60.0)){
                            //se tempo de uso maior que 20 min
                            return EscalaConforto.OTIMO;
                        }
                        else if(tempoEmHoras * a.getTempoUso() > (10.0 / 60.0)){
                            //se tempo de uso maior que 10 min
                            return EscalaConforto.BOM;
                        }
                        return EscalaConforto.PESSIMO;
                    }
                }
                return EscalaConforto.PESSIMO;
    }    
}
