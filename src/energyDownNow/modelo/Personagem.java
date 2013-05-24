package energyDownNow.modelo;

import energyDownNow.modelo.unidade.Conforto;
import java.util.List;

public abstract class Personagem {

    private String descricao;
    private String sexo;
    private int idade;

    public Personagem(String sexo, int idade, String descricao) {
        this.sexo = sexo;
        this.idade = idade;
        this.descricao = descricao;
    }

    public Aparelho getAparelho(List<Aparelho> lista, String nomeAparelho) {
        for (Aparelho a : lista) {
            if (nomeAparelho.equals(a.getDescricao())) {
                return a;
            }
        }
        return null;
    }

    public abstract Conforto calcular(List<Aparelho> aparelhosCenario);
}
