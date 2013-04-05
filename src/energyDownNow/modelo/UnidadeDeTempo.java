package energyDownNow.modelo;

public enum UnidadeDeTempo {

    HORAS_DIA(30), HORAS_MES(1), HORAS_SEMANA(4), MINUTOS_DIA(0.5), MINUTOS_SEMANA(0.13);
    private double fatorConversao;

    UnidadeDeTempo(double fator) {

        this.fatorConversao = fator;
    }

    /**
     * Retorna o fator utilizado para conveter esta unidade de tempo para horas.
     *
     * @return the fatorConversao
     */
    public double getFatorConversao() {
        return fatorConversao;
    }
}
