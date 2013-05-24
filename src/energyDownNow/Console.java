package energyDownNow;

import energyDownNow.cenario.cenarioFacil.CenarioFacil;
import energyDownNow.modelo.UtilizacaoAparelho;
import energyDownNow.modelo.Cenario;
import energyDownNow.modelo.unidade.FimDeJogo;
import energyDownNow.modelo.unidade.Tempo;
import java.util.Scanner;

public class Console {

    public static void main(String[] args) {

        Cenario cenario = new Cenario(4000, "Casa", 3, 100, null);//TODO

        cenario.addAparelho(new UtilizacaoAparelho(1125, "Ar Condicionado - Janela 12.000btus", 1200));
        cenario.addAparelho(new UtilizacaoAparelho(140, "TV 21\"", 780));
        cenario.addAparelho(new UtilizacaoAparelho(10, "DVD", 110));
        cenario.addAparelho(new UtilizacaoAparelho(40, "MicroSystem", 250));
        cenario.addAparelho(new UtilizacaoAparelho(220, "Máquina de Lavar", 900));
        cenario.addAparelho(new UtilizacaoAparelho(1000, "Microondas 30L", 400));
        cenario.addAparelho(new UtilizacaoAparelho(4000, "Chuveiro Elétrico", 100));
        cenario.addAparelho(new UtilizacaoAparelho(265, "Geladeira Duplex", 4300));
        cenario.addAparelho(new UtilizacaoAparelho(1200, "Ferro à Vapor", 70));

        cenario.getAparelhosParaCompra().add(new UtilizacaoAparelho(1086, "Ar condicionado Split 12.000btus", 1000));
        cenario.getAparelhosParaCompra().add(new UtilizacaoAparelho(80, "TV 32\" LED", 1499));
        cenario.getAparelhosParaCompra().add(new UtilizacaoAparelho(15, "BLUE RAY", 550));
        cenario.getAparelhosParaCompra().add(new UtilizacaoAparelho(29, "Home Theater", 549));
        cenario.getAparelhosParaCompra().add(new UtilizacaoAparelho(55, "Ventilador 30cm", 135));
        cenario.getAparelhosParaCompra().add(new UtilizacaoAparelho(90, "Geladeira", 2000));
        cenario.getAparelhosParaCompra().add(new UtilizacaoAparelho(100, "Ferro à Seco", 39));

        cenario = CenarioFacil.getCenario();

        System.out.println("Consumo do cenário em KWh =  " + cenario.calcularConsumoEmKWh() + " KWh.");
        System.out.println("Consumo atual do cenário = R$ " + cenario.getUltimaDespesa());
        System.out.println("Meta de consumo a ser atingida no cenário = R$ " + cenario.getMetaDespesa());

        Scanner scan = new Scanner(System.in);
        int op = 9;

        while (op >= 0) {

            System.out.println();

            System.out.println("----------------------------------------------------------");
            System.out.println("1 – LISTAR APARELHOS DO CENÁRIO        -------------------");
            System.out.println("2 – ALTERAR TEMPO DE USO DE UM APARELHO-------------------");
            System.out.println("3 – TROCAR APARELHO --------------------------------------");
            System.out.println("4 – EXCLUIR APARELHO --------------------------------------");
            System.out.println("5 – COMPRAR APARELHO --------------------------------------");
            System.out.println("6 – AVANÇAR ----------------------------------------------");
            System.out.println("----------------------------------------------------------");
            op = scan.nextInt();

            switch (op) {
                case 1:
                    listarAparelhos(cenario);
                    break;
                case 2:
                    alterarTempoDeUso(cenario, scan);
                    break;
                case 3:
                    trocarAparelho(cenario, scan);
                    break;
                case 4:
                    excluirAparelho(cenario, scan);
                    break;
                case 5:
                    comprarAparelho(cenario, scan);
                    break;
                case 6:
                    op = avancarCenario(cenario);
                    break;
                default:
                    break;
            }
        }
    }

    /**
     * Lista todos os aparelhos cadastrados no cenario desejado.
     *
     * @param cenario Cenario a ser utilizado.
     */
    private static void listarAparelhos(Cenario cenario) {
        for (UtilizacaoAparelho a : cenario.getAparelhos()) {
            System.out.println("# " + a.getDescricao() + " - Valor = R$ " + a.getPreco() + " - Potência = " + a.getPotencia() + "kw" + " / Uso: " + a.getTempoUso() + "/" + a.getUnidadeDeTempo());
        }
        System.out.println("\n");
    }

    /**
     * Menu que gerencia a alteracao do tempo de uso e unidade de medida de
     * tempo de aparelhos em determinado cenario.
     *
     * @param cenario Cenario desejado.
     * @param scan Entrada de dados.
     */
    private static void alterarTempoDeUso(Cenario cenario, Scanner scan) {

        System.out.println(" ==>> META CENÁRIO ==>>> R$ " + cenario.getMetaDespesa() + "\n");
        System.out.println("Deseja alterar o tempo de uso de qual aparelho? \n");
        int i = 0;
        for (UtilizacaoAparelho a : cenario.getAparelhos()) {
            System.out.println(i++ + " - " + a.getDescricao());
        }
        System.out.println("\n");
        int posicao1 = scan.nextInt();

        UtilizacaoAparelho ap1 = cenario.getAparelhos().get(posicao1);

        System.out.println("Tempo de uso atual: " + ap1.getTempoUso() + " " + ap1.getUnidadeDeTempo());
        System.out.println("Digite o novo tempo de uso:");
        int tempoUso = scan.nextInt();
        ap1.setTempoUso(tempoUso);

        System.out.println("Escolha a unidade de tempo:");
        i = 0;
        for (Tempo unidade : Tempo.values()) {
            System.out.println("  " + i++ + ": " + unidade);
        }
        i = scan.nextInt();
        ap1.setUnidadeDeTempo(Tempo.values()[i]);
    }

    /**
     * Menu que gerencia a troca de aparelhos em determinado cenario.
     *
     * @param cenario Cenario desejado.
     * @param scan Entrada de dados.
     */
    private static void trocarAparelho(Cenario cenario, Scanner scan) {

        System.out.println("Qual aparelho deseja trocar? \n");
        int x = 0;
        for (UtilizacaoAparelho a : cenario.getAparelhos()) {
            System.out.println(x++ + " - " + a.getDescricao());
        }
        System.out.println("\n");

        int aparelhotroca1 = scan.nextInt();

        System.out.println("Por qual aparelho deseja trocar? \n");

        int j = 0;
        for (UtilizacaoAparelho b : cenario.getAparelhosParaCompra()) {
            System.out.println(j++ + " - " + b.getDescricao());
        }
        System.out.println("\n");

        int aparelhotroca2 = scan.nextInt();

        cenario.trocarAparelhos(cenario.getAparelhos().get(aparelhotroca1), cenario.getAparelhosParaCompra().get(
                aparelhotroca2));
    }

    /**
     * Avanca o periodo do cenario para descobrir se as metas foram atingidas.
     *
     * @param cenario Cenario desejado.
     * @return -1 caso o tempo tenha acabado ou as metas atingidas.
     */
    private static int avancarCenario(Cenario cenario) {
        int x = 9;
        cenario.avancar();
        if (cenario.getFimDeJogo() == FimDeJogo.METAS_ATINGIDAS) {
            System.out.println("Você venceu!!!");
            x = -1;
        } else if (cenario.getFimDeJogo() == FimDeJogo.FIM_DO_PRAZO) {
            System.out.println("Você Perdeu...");
            x = -1;
        }
        System.out.println("Consumo do cenário em KWh =  " + cenario.calcularConsumoEmKWh() + " KWh.");
        System.out.println("Consumo atual do cenário = R$ " + cenario.getUltimaDespesa());
        return x;
    }

    /**
     * Menu que gerencia a compra de um novo produto.
     *
     * @param cenario Cenario desejado.
     * @param scan Entrada de dados.
     */
    private static void comprarAparelho(Cenario cenario, Scanner scan) {
        System.out.println("Qual aparelho deseja comprar? \n");

        int k = 0;
        for (UtilizacaoAparelho b : cenario.getAparelhosParaCompra()) {
            System.out.println(k + " - " + b.getDescricao());
            k++;
        }
        System.out.println("\n");

        int aparelhocompra = scan.nextInt();

        cenario.comprarAparelho(cenario.getAparelhosParaCompra().get(aparelhocompra));

    }

    /**
     * Menu que gerencia a exclusao de um dos produtos do cenario.
     *
     * @param cenario Cenario desejado.
     * @param scan Entrada de dados.
     */
    private static void excluirAparelho(Cenario cenario, Scanner scan) {

        System.out.println("Qual aparelho deseja excluir? \n");
        int x = 0;
        for (UtilizacaoAparelho a : cenario.getAparelhos()) {
            System.out.println(x++ + " - " + a.getDescricao());
        }
        System.out.println("\n");

        int aparelhoExluir = scan.nextInt();

        cenario.removeAparelho(cenario.getAparelhos().get(aparelhoExluir));
    }
}
