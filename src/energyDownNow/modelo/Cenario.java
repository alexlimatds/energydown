package energyDownNow.modelo;

import java.util.ArrayList;
import java.util.List;

public class Cenario {

    private double orcamento;
    private String descricao;
    private int prazo;
    private int mesAtual;
    private double metaDespesa;
    private double ultimaDespesa;
    private double ultimoConsumo;
    private MetaConforto metaConforto;
    private double valorKwh = 0.55;
    private List<Aparelho> aparelhos = new ArrayList<Aparelho>();
    private List<Aparelho> aparelhosParaCompra = new ArrayList<Aparelho>();
    
    public Cenario(double orcamento, String descricao, int prazo, double metaDespesa, 
            MetaConforto metaConforto) {
        this.orcamento = orcamento;
        this.descricao = descricao;
        this.prazo = prazo;
        this.mesAtual = 1;
        this.metaDespesa = metaDespesa;
        this.metaConforto = metaConforto;
    }
    
    public Cenario(double orcamento, String descricao, int prazo, double metaDespesa, 
            MetaConforto metaConforto, double valorKwh) {
        this(orcamento, descricao, prazo, metaDespesa, metaConforto);
        this.valorKwh = valorKwh;
    }
      
    public Cenario(double orcamento, String descricao, int prazo, double metaDespesa, 
            MetaConforto metaConforto, List<Aparelho> aparelhosParaCompra, double valorKwh){
        this(orcamento, descricao, prazo, metaDespesa, metaConforto, valorKwh);
        this.aparelhosParaCompra = aparelhosParaCompra;
    }
    
    public void addAparelho(Aparelho aparelho) {
       getAparelhos().add(aparelho); 
    }
    
    public void addAparelhos(List<Aparelho> lista){
        aparelhos.addAll(lista);
    }
    
    public void removeAparelho(Aparelho aparelho){
        getAparelhos().remove(aparelho);
    }
    
    public void removeAparelhoDeCompra(Aparelho aparelho){
        getAparelhosParaCompra().remove(aparelho);
    }
    
    public double custoAparelhos(){
        double totalCusto=0;
        for(Aparelho aparelho:aparelhos){
            totalCusto+=aparelho.getPreco();
        }
        return totalCusto;
    }
    
    public double calcularConsumoEmKWh() {

        double total = 0;

        for (Aparelho a : aparelhos) {

            total += a.getConsumoMensal();
        }
        return total;
    }

    public double calcularDespesa(double consumoEmKWh) {
        return getValorKwh() * consumoEmKWh;
    }

    public void avancar() {
        ultimoConsumo = calcularConsumoEmKWh();
        ultimaDespesa = calcularDespesa(ultimoConsumo);

        mesAtual++;
    }

    public FimDeJogo getFimDeJogo() {

        if (metaAtingida()) {
            return FimDeJogo.METAS_ATINGIDAS;
        } else if (fimDoPrazo()) {
            return FimDeJogo.FIM_DO_PRAZO;
        }

        return FimDeJogo.NAO_TERMINADO;
    }

    public boolean metaAtingida() {
        if (getUltimaDespesa() <= metaDespesa && metaConforto.atingida(aparelhos)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean fimDoPrazo() {

        if (getUltimoMes() == mesAtual) {
            return true;
        } else {
            return false;
        }
    }

    public double getOrcamento() {
        return orcamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getPrazo() {
        return prazo;
    }

    public int getMesAtual() {
        return mesAtual;
    }

    public double getMetaDespesa() {
        return metaDespesa;
    }

    public List<Aparelho> getAparelhos() {
        return aparelhos;
    }

    public MetaConforto getMetaConforto() {
        return metaConforto;
    }

    public double getUltimaDespesa() {
        if (mesAtual == 1){
            double consumo = getUltimoConsumo();
            return calcularDespesa(consumo); 
        }
        return ultimaDespesa;
    }

    public double getUltimoConsumo() {
        if(mesAtual == 1){
            ultimoConsumo = calcularConsumoEmKWh();
        }
        return ultimoConsumo;
    }
    
    public int getUltimoMes(){
        return prazo + 1;        
    }

    public List<Aparelho> getAparelhosParaCompra(){
        return aparelhosParaCompra;
    }
    
    public void trocarAparelhos(Aparelho antigo, Aparelho novo){
        // Remove o antigo, e adiciona o novo aparelho no cenário
        
        if (orcamento>novo.getPreco()){
            removeAparelho(antigo);
            addAparelho(novo);
            
        // Remove o aparelho da lista de compra
            removeAparelhoDeCompra(novo);
        
        // Atualiza o orçamento
            orcamento -= novo.getPreco();
        }
    }
    
    public void comprarAparelho(Aparelho novo){
        
        if (orcamento>novo.getPreco()){
            // Adiciona o aparelho comprado no cenário
            addAparelho(novo);

            // Remove o aparelho da lista de compra
            removeAparelhoDeCompra(novo);

            // Atualiza o orçamento
            orcamento -= novo.getPreco();
        }
    }

    /**
     * @return the valorKwh
     */
    public double getValorKwh() {
        return valorKwh;
    }
    
    public Aparelho getAparelho(String descricaoAparelho){
        for(Aparelho ap : aparelhos){
            if(descricaoAparelho.equals(ap.getDescricao())){
                return ap;
            }
        }
        
        return null;
    }
}