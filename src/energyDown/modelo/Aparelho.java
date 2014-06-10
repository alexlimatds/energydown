/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package energyDown.modelo;

/**
 *
 * @author lobao
 */
public class Aparelho {

    private int potencia;
    private String descricao;
    private double preco;

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
}
