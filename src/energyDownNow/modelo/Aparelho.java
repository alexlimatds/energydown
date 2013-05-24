package energyDownNow.modelo;

import energyDownNow.modelo.unidade.Tempo;

public class Aparelho {

    private int potencia;
    private String descricao;
    private double preco;
    private int tempoUso = 1;
    private Tempo unidadeDeTempo = Tempo.HORAS_DIA;

    public Aparelho(int potencia, String descricao, double preco, int tempoDeUso,
            Tempo unidade) {
        this(potencia, descricao, preco);
        this.tempoUso = tempoDeUso;
        this.unidadeDeTempo = unidade;
    }

    public Aparelho(int potencia, String descricao, double preco) {
        this.potencia = potencia;
        this.descricao = descricao;
        this.preco = preco;
    }

    public double getConsumoMensal() {
        return getPotencia() * getTempoUso() * getUnidadeDeTempo().getFatorConversao() / 1000.0;
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

    public int getTempoUso() {
        return tempoUso;
    }

    public void setTempoUso(int tempoUso) {
        this.tempoUso = tempoUso;
    }

    public void setUnidadeDeTempo(Tempo unidadeDeTempo) {
        this.unidadeDeTempo = unidadeDeTempo;
    }

    public Tempo getUnidadeDeTempo() {
        return unidadeDeTempo;
    }
}
