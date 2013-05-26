package energyDownNow.modelo.unidade;

public enum Conforto {

    OTIMO(5), BOM(4), REGULAR(3), RUIM(2), PESSIMO(1);
    private Integer valor;

    /**
     * 
     * @param valor 
     */
    Conforto(int valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}
