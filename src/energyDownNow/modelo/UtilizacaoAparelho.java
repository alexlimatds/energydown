package energyDownNow.modelo;

import energyDownNow.modelo.unidade.Tempo;

public class UtilizacaoAparelho {

    private Aparelho aparelho;
    private int tempoUso = 1;
    private Tempo unidadeDeTempo = Tempo.HORAS_DIA;

    public UtilizacaoAparelho(int potencia, String descricao, double preco, int tempoDeUso,
            Tempo unidade) {
        this.aparelho = new Aparelho(potencia, descricao, preco);
        this.tempoUso = tempoDeUso;
        this.unidadeDeTempo = unidade;
    }

    public UtilizacaoAparelho(int potencia, String descricao, double preco) {
        this.aparelho = new Aparelho(potencia, descricao, preco);
    }

    public double getConsumoMensal() {
        return aparelho.getPotencia() * getTempoUso() * getUnidadeDeTempo().getFatorConversao() / 1000.0;
    }

    public int getPotencia() {
        return aparelho.getPotencia();
    }

    public String getDescricao() {
        return aparelho.getDescricao();
    }

    public double getPreco() {
        return aparelho.getPreco();
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
