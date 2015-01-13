package energyDown.modelo;

import energyDown.modelo.unidade.Conforto;
import energyDown.modelo.unidade.FimDeJogo;
import java.util.ArrayList;
import java.util.List;

public class Cenario {

    private double orcamento;
    private String descricao;
    private int prazo;
    private int mesAtual;
    private double metaDespesa;
    private MetaConforto metaConforto;
    private double valorKwh = 0.55;
    private List<RegistroConsumo> historicoConsumo = new ArrayList<RegistroConsumo>();
    private List<Aparelho> aparelhosAtuais = new ArrayList<Aparelho>();
    private List<UsoAparelho> usoAparelhos = new ArrayList<UsoAparelho>();
    private List<Aparelho> aparelhosParaCompra = new ArrayList<Aparelho>();
    
    /**
     *
     * @param orcamento
     * @param descricao
     * @param prazo
     * @param metaDespesa
     * @param metaConforto
     */
    public Cenario(double orcamento, String descricao, int prazo, double metaDespesa,
            MetaConforto metaConforto) {
        this.orcamento = orcamento;
        this.descricao = descricao;
        this.prazo = prazo;
        this.mesAtual = 1;
        this.metaDespesa = metaDespesa;
        this.metaConforto = metaConforto;
    }

    /**
     *
     * @param orcamento
     * @param descricao
     * @param prazo
     * @param metaDespesa
     * @param metaConforto
     * @param valorKwh
     */
    public Cenario(double orcamento, String descricao, int prazo, double metaDespesa,
            MetaConforto metaConforto, double valorKwh) {
        this(orcamento, descricao, prazo, metaDespesa, metaConforto);
        this.valorKwh = valorKwh;
    }

    /**
     *
     * @param orcamento
     * @param descricao
     * @param prazo
     * @param metaDespesa
     * @param metaConforto
     * @param aparelhosParaCompra
     * @param valorKwh
     */
    public Cenario(double orcamento, String descricao, int prazo, double metaDespesa,
            MetaConforto metaConforto, List<Aparelho> aparelhosParaCompra, double valorKwh) {
        this(orcamento, descricao, prazo, metaDespesa, metaConforto, valorKwh);
        this.aparelhosParaCompra = aparelhosParaCompra;
    }

    public List<Aparelho> getAparelhosAtuais() {
        return aparelhosAtuais;
    }

    public void addAparelhoAtual(Aparelho aparelho) {
        getAparelhosAtuais().add(aparelho);
    }

    public void removeAparelhoAtual(Aparelho aparelho) {
        getAparelhosAtuais().remove(aparelho);
    }

    public void addUsoAparelho(UsoAparelho aparelhoUtilizado) {
        getAparelhosAtuais().add(aparelhoUtilizado.getAparelho());
        getUsoAparelhos().add(aparelhoUtilizado);
    }

    public void addUsoAparelhos(List<UsoAparelho> lista) {
        for (UsoAparelho utilizacaoAparelho : lista) {
            addAparelhoAtual(utilizacaoAparelho.getAparelho());
        }
        usoAparelhos.addAll(lista);
    }

    public void removeUsoAparelho(UsoAparelho utilizacaoAparelho) {
        getAparelhosAtuais().remove(utilizacaoAparelho.getAparelho());
        getUsoAparelhos().remove(utilizacaoAparelho);
    }

    public void removeAparelhoDeCompra(Aparelho aparelho) {
        getAparelhosParaCompra().remove(aparelho);
    }

    public double custoAparelhosUtilizados() {
        double totalCusto = 0;

        for (UsoAparelho aparelhoUtilizado : usoAparelhos) {
            totalCusto += aparelhoUtilizado.getPreco();
        }
        return totalCusto;
    }

    public double calcularConsumoEmKWh() {

        double total = 0;

        for (UsoAparelho aparelhoUtilizado : usoAparelhos) {

            total += aparelhoUtilizado.getConsumoMensal();
        }
        return total;
    }

    public double calcularDespesa(double consumoEmKWh) {
        return getValorKwh() * consumoEmKWh;
    }

    public void avancar() {
        double ultimoConsumo = calcularConsumoEmKWh();
        double ultimaDespesa = calcularDespesa(ultimoConsumo);
        RegistroConsumo registro = new RegistroConsumo(mesAtual, ultimoConsumo, 
                ultimaDespesa);
        getHistoricoConsumo().add(registro);

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
        if (getUltimaDespesa() <= metaDespesa && metaConforto.atingida(usoAparelhos)) {
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

    public List<UsoAparelho> getUsoAparelhos() {
        return usoAparelhos;
    }

    public MetaConforto getMetaConforto() {
        return metaConforto;
    }

    public double getUltimaDespesa() {
        if (mesAtual == 1) {
            double consumo = getUltimoConsumo();
            return calcularDespesa(consumo);
        }
        return getHistoricoConsumo().get(mesAtual - 2).getConsumoEmReais();
    }

    public double getUltimoConsumo() {
        if (mesAtual == 1) {
            return calcularConsumoEmKWh();
        }
        return getHistoricoConsumo().get(mesAtual - 2).getConsumoEmKWh();
    }

    public int getUltimoMes() {
        return prazo + 1;
    }

    public List<Aparelho> getAparelhosParaCompra() {
        return aparelhosParaCompra;
    }

    public void trocarAparelhos(UsoAparelho antigo, Aparelho novo) {
        // Remove o antigo, e adiciona o novo aparelho no cenário

        if (orcamento > novo.getPreco()) {

            int indiceAparelhoAntigo = getAparelhosAtuais().indexOf(antigo.getAparelho());

            addAparelhoAtual(novo);
            int indiceAparelhoNovo = getAparelhosAtuais().indexOf(novo);
            novo = getAparelhosAtuais().get(indiceAparelhoNovo);

            int indiceAparelhoUtilizado = getUsoAparelhos().indexOf(antigo);
            getUsoAparelhos().get(indiceAparelhoUtilizado).setAparelho(novo);

            removeAparelhoAtual(getAparelhosAtuais().get(indiceAparelhoAntigo));

            // Remove o aparelho da lista de compra
            removeAparelhoDeCompra(novo);

            // Atualiza o orçamento
            orcamento -= novo.getPreco();
        }
    }

    public void comprarAparelho(Aparelho novo) {

        if (orcamento > novo.getPreco()) {
            // Adiciona o aparelho comprado no cenário
            addAparelhoAtual(novo);

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

    public UsoAparelho getAparelho(String descricaoAparelho) {
        for (UsoAparelho ap : usoAparelhos) {
            if (descricaoAparelho.equals(ap.getDescricao())) {
                return ap;
            }
        }

        return null;
    }
    
    /**
     * Retorna o conoforto atual de um personagem.
     * @param nomePersonagem nome do personagem que se deseja obter o conforto.
     * @return 
     */
    public Conforto getConfortoPersonagem(String nomePersonagem){
        for(Personagem p : metaConforto.getPersonagens()){
            if(nomePersonagem.equalsIgnoreCase(p.getDescricao())){
                return p.calcular( usoAparelhos );
            }
        }
        return null;
    }
    
    public List<UsoAparelho> getUsoAparelhos(String comodo){
        ArrayList<UsoAparelho> encontrados = new ArrayList<UsoAparelho>();
        for(UsoAparelho u : usoAparelhos){
            if(comodo.equals(u.getAparelho().getComodo())){
                encontrados.add(u);
            }
        }
        
        return encontrados;
    }

    /**
     * @return the historicoConsumo
     */
    public List<RegistroConsumo> getHistoricoConsumo() {
        return historicoConsumo;
    }
}