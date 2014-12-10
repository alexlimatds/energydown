package energyDown.modelo;

/**
 *
 * @author Ana Meireles
 */
public class Aparelho {

    private int potencia;
    private String descricao;
    private double preco;
    private String comodo;

    /**
     *
     * @param potencia
     * @param descricao
     * @param preco
     */
    public Aparelho(int potencia, String descricao, double preco) {
        this.potencia = potencia;
        this.descricao = descricao;
        this.preco = preco;
    }
    
    public Aparelho(int potencia, String descricao, double preco, String comodo) {
        this.potencia = potencia;
        this.descricao = descricao;
        this.preco = preco;
        this.comodo = comodo;
    }

    public int getPotencia() {
        return potencia;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * @return the comodo
     */
    public String getComodo() {
        return comodo;
    }

    /**
     * @param comodo the comodo to set
     */
    public void setComodo(String comodo) {
        this.comodo = comodo;
    }
}
