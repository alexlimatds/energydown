package energyDownNow.modelo;

import energyDownNow.modelo.unidade.FimDeJogo;
import java.util.ArrayList;
import java.util.List;

public class Cenario {

    private double orcamento;
    private String descricao;
    private int prazo;
    private int mesAtual;
    private double metaDespesa;
    private List<Double> historicoDespesa = new ArrayList<Double>();
    private List<Double> historicoConsumo = new ArrayList<Double>();
    private MetaConforto metaConforto;
    private double valorKwh = 0.55;
    private List<Personagem> personagens;
    private List<UtilizacaoAparelho> aparelhos = new ArrayList<UtilizacaoAparelho>();
    private List<UtilizacaoAparelho> aparelhosParaCompra = new ArrayList<UtilizacaoAparelho>();

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
            MetaConforto metaConforto, List<UtilizacaoAparelho> aparelhosParaCompra, double valorKwh) {
        this(orcamento, descricao, prazo, metaDespesa, metaConforto, valorKwh);
        this.aparelhosParaCompra = aparelhosParaCompra;
    }

    public void addAparelho(UtilizacaoAparelho aparelho) {
        getAparelhos().add(aparelho);
    }

    public void addAparelhos(List<UtilizacaoAparelho> lista) {
        aparelhos.addAll(lista);
    }

    public void removeAparelho(UtilizacaoAparelho aparelho) {
        getAparelhos().remove(aparelho);
    }

    public void removeAparelhoDeCompra(UtilizacaoAparelho aparelho) {
        getAparelhosParaCompra().remove(aparelho);
    }

    public double custoAparelhos() {
        double totalCusto = 0;
        for (UtilizacaoAparelho aparelho : aparelhos) {
            totalCusto += aparelho.getPreco();
        }
        return totalCusto;
    }

    public double calcularConsumoEmKWh() {

        double total = 0;

        for (UtilizacaoAparelho a : aparelhos) {

            total += a.getConsumoMensal();
        }
        return total;
    }

    public double calcularDespesa(double consumoEmKWh) {
        return getValorKwh() * consumoEmKWh;
    }

    public void avancar() {

        int indiceMesAtual = mesAtual - 1;

        double ultimoConsumo = calcularConsumoEmKWh();
        historicoConsumo.add(indiceMesAtual, ultimoConsumo);

        double ultimaDespesa = calcularDespesa(ultimoConsumo);
        historicoDespesa.add(indiceMesAtual, ultimaDespesa);

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

    public List<UtilizacaoAparelho> getAparelhos() {
        return aparelhos;
    }

    public MetaConforto getMetaConforto() {
        return metaConforto;
    }

    public double getUltimaDespesa() {
        double consumo = getUltimoConsumo();
        return calcularDespesa(consumo);
    }

    public double getUltimoConsumo() {
        return calcularConsumoEmKWh();
    }

    public int getUltimoMes() {
        return prazo + 1;
    }

    public List<UtilizacaoAparelho> getAparelhosParaCompra() {
        return aparelhosParaCompra;
    }

    public void trocarAparelhos(UtilizacaoAparelho antigo, UtilizacaoAparelho novo) {
        // Remove o antigo, e adiciona o novo aparelho no cenário

        if (orcamento > novo.getPreco()) {
            removeAparelho(antigo);
            addAparelho(novo);

            // Remove o aparelho da lista de compra
            removeAparelhoDeCompra(novo);

            // Atualiza o orçamento
            orcamento -= novo.getPreco();
        }
    }

    public void comprarAparelho(UtilizacaoAparelho novo) {

        if (orcamento > novo.getPreco()) {
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

    public UtilizacaoAparelho getAparelho(String descricaoAparelho) {
        for (UtilizacaoAparelho ap : aparelhos) {
            if (descricaoAparelho.equals(ap.getDescricao())) {
                return ap;
            }
        }

        return null;
    }
}