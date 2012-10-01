package energyDownNow;


public class Aparelho {
    
    private int potencia;
    private String descricao;
    private double preco;
    private int tempoUso = 1;
    private int confortoDesejavel;
    private UnidadeDeTempo unidadeDeTempo = UnidadeDeTempo.HORAS_DIA;
    
    public Aparelho (int potencia, String descricao, double preco){
        
        this.potencia = potencia;
        this.descricao = descricao;
        this.preco = preco;
    }
    
    public Aparelho (int potencia, String descricao, double preco, int confortoDesejavel){
        
        this(potencia, descricao, preco);
        this.confortoDesejavel = confortoDesejavel; // esse conforto seria em horas equivalente a 100%
    }
    
    public void setconfortoDesejavel(int novoConforto)
    {
        this.setconfortoDesejavel(novoConforto);
    }
    
    public int getconfortoDesejavel() {
        return confortoDesejavel;
    }
    
    
    public double getConsumoMensal()
    {
        return getPotencia() * getTempoUso() * getUnidadeDeTempo().getFatorConversao() / 1000.0;
    }
    
    public void settempoUso(int tempo)
    {
        this.setTempoUso(tempo);
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

    public void setUnidadeDeTempo(UnidadeDeTempo unidadeDeTempo) {
        this.unidadeDeTempo = unidadeDeTempo;
    }
    
    public UnidadeDeTempo getUnidadeDeTempo() {
        return unidadeDeTempo;
    }
}
