package energyDownNow.modelo;

import energyDownNow.modelo.unidade.Conforto;
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

    public UtilizacaoAparelho getAparelho(List<UtilizacaoAparelho> lista, String nomeAparelho) {
        for (UtilizacaoAparelho a : lista) {
            if (nomeAparelho.equals(a.getDescricao())) {
                return a;
            }
        }
        return null;
    }

    public abstract Conforto calcular(List<UtilizacaoAparelho> aparelhosCenario);
}
