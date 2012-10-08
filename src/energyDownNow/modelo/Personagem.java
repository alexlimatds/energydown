package energyDownNow.modelo;

import java.util.List;

public abstract class Personagem {
    
    private String descricao;
    private String sexo;
    private int idade;
    
    public Personagem (String sexo, int idade, String descricao){
        this.sexo = sexo;
        this.idade = idade;
        this.descricao = descricao;
    }
    

    public abstract EscalaConforto calcular(List<Aparelho> aparelhosCenario);
    
}
