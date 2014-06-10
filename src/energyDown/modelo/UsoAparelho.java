package energyDown.modelo;

import energyDown.modelo.unidade.Tempo;

public class UsoAparelho {

    private Personagem personagem;
    private Aparelho aparelho;
    private int tempoUso = 1;
    private Tempo unidadeDeTempo = Tempo.HORAS_DIA;

    /**
     *
     * @param aparelho
     * @param tempoDeUso
     * @param unidade
     * @param personagem
     */
    public UsoAparelho(Aparelho aparelho, int tempoDeUso,
            Tempo unidade, Personagem personagem) {
        this.aparelho = aparelho;
        this.tempoUso = tempoDeUso;
        this.unidadeDeTempo = unidade;
        this.personagem = personagem;
    }

    /**
     *
     * @param potencia
     * @param descricao
     * @param preco
     * @param tempoDeUso
     * @param unidade
     * @param personagem
     */
    public UsoAparelho(int potencia, String descricao, double preco, int tempoDeUso,
            Tempo unidade, Personagem personagem) {
        this.aparelho = new Aparelho(potencia, descricao, preco);
        this.tempoUso = tempoDeUso;
        this.unidadeDeTempo = unidade;
        this.personagem = personagem;
    }

    /**
     *
     * @param potencia
     * @param descricao
     * @param preco
     * @param tempoDeUso
     * @param unidade
     */
    public UsoAparelho(int potencia, String descricao, double preco, int tempoDeUso,
            Tempo unidade) {
        this.aparelho = new Aparelho(potencia, descricao, preco);
        this.tempoUso = tempoDeUso;
        this.unidadeDeTempo = unidade;
    }

    /**
     *
     * @param potencia
     * @param descricao
     * @param preco
     */
    public UsoAparelho(int potencia, String descricao, double preco) {
        this.aparelho = new Aparelho(potencia, descricao, preco);
    }

    public Aparelho getAparelho() {
        return aparelho;
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

    public void setAparelho(Aparelho aparelho) {
        this.aparelho = aparelho;
    }

    public Tempo getUnidadeDeTempo() {
        return unidadeDeTempo;
    }
}
