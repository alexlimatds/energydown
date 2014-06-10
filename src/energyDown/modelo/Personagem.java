package energyDown.modelo;

import energyDown.modelo.unidade.Conforto;
import java.util.List;

public abstract class Personagem {

    private String descricao;
    private String sexo;
    private int idade;

    /**
     *
     * @param sexo
     * @param idade
     * @param descricao
     */
    public Personagem(String sexo, int idade, String descricao) {
        this.sexo = sexo;
        this.idade = idade;
        this.descricao = descricao;
    }

    public UsoAparelho getAparelho(List<UsoAparelho> lista, String nomeAparelho) {
        for (UsoAparelho aparelho : lista) {
            if (nomeAparelho.equals(aparelho.getDescricao())) {
                return aparelho;
            }
        }
        return null;
    }
    
    public String getDescricao(){
        return descricao;
    }

    public abstract Conforto calcular(List<UsoAparelho> aparelhosCenario);
}
