/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package energyDownNow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author ANA MEIRELES
 */
public abstract class MetaConforto {
    
    private List<Personagem> personagensCenario = new ArrayList<Personagem>();
    
    public abstract boolean atingida(List<Aparelho> aparelhosDoCenario);
    
    public void addPersonagem(Personagem p){
        personagensCenario.add(p);
    }
    
    public List<Personagem> getPersonagens(){
        return Collections.unmodifiableList(personagensCenario);
    }
}
