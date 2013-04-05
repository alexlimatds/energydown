package energyDownNow;

import energyDownNow.cenarios.cenarioFacil.CenarioFacil;
import energyDownNow.modelo.Aparelho;
import energyDownNow.modelo.Cenario;
import energyDownNow.modelo.FimDeJogo;
import energyDownNow.modelo.UnidadeDeTempo;
import java.util.Scanner;

public class Console {

    public static void main(String[] args) {



        Cenario cenario = new Cenario(4000, "Casa", 3, 100, null);//TODO

        cenario.addAparelho(new Aparelho(1125, "Ar Condicionado - Janela 12.000btus", 1200));
        cenario.addAparelho(new Aparelho(140, "TV 21\"", 780));
        cenario.addAparelho(new Aparelho(10, "DVD", 110));
        cenario.addAparelho(new Aparelho(40, "MicroSystem", 250));
        cenario.addAparelho(new Aparelho(220, "Máquina de Lavar", 900));
        cenario.addAparelho(new Aparelho(1000, "Microondas 30L", 400));
        cenario.addAparelho(new Aparelho(4000, "Chuveiro Elétrico", 100));
        cenario.addAparelho(new Aparelho(265, "Geladeira Duplex", 4300));
        cenario.addAparelho(new Aparelho(1200, "Ferro à Vapor", 70));

        cenario.getAparelhosParaCompra().add(new Aparelho(1086, "Ar condicionado Split 12.000btus", 1000));
        cenario.getAparelhosParaCompra().add(new Aparelho(80, "TV 32\" LED", 1499));
        cenario.getAparelhosParaCompra().add(new Aparelho(15, "BLUE RAY", 550));
        cenario.getAparelhosParaCompra().add(new Aparelho(29, "Home Theater", 549));
        cenario.getAparelhosParaCompra().add(new Aparelho(55, "Ventilador 30cm", 135));
        cenario.getAparelhosParaCompra().add(new Aparelho(90, "Geladeira", 2000));
        cenario.getAparelhosParaCompra().add(new Aparelho(100, "Ferro à Seco", 39));

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

    private static void listarAparelhos(Cenario cenario) {
        for (Aparelho a : cenario.getAparelhos()) {
            System.out.println("# " + a.getDescricao() + " - Valor = R$ " + a.getPreco() + " - Potência = " + a.getPotencia() + "kw" + " / Uso: " + a.getTempoUso() + "/" + a.getUnidadeDeTempo());
        }
        System.out.println("\n");
    }

    private static void alterarTempoDeUso(Cenario cenario, Scanner scan) {

        System.out.println(" ==>> META CENÁRIO ==>>> R$ " + cenario.getMetaDespesa() + "\n");
        System.out.println("Deseja alterar o tempo de uso de qual aparelho? \n");
        int i = 0;
        for (Aparelho a : cenario.getAparelhos()) {
            System.out.println(i++ + " - " + a.getDescricao());
        }
        System.out.println("\n");
        int posicao1 = scan.nextInt();

        Aparelho ap1 = cenario.getAparelhos().get(posicao1);

        System.out.println("Tempo de uso atual: " + ap1.getTempoUso() + " " + ap1.getUnidadeDeTempo());
        System.out.println("Digite o novo tempo de uso:");
        int tempoUso = scan.nextInt();
        ap1.setTempoUso(tempoUso);

        System.out.println("Escolha a unidade de tempo:");
        i = 0;
        for (UnidadeDeTempo unidade : UnidadeDeTempo.values()) {
            System.out.println("  " + i++ + ": " + unidade);
        }
        i = scan.nextInt();
        ap1.setUnidadeDeTempo(UnidadeDeTempo.values()[i]);
    }

    private static void trocarAparelho(Cenario cenario, Scanner scan) {

        System.out.println("Qual aparelho deseja trocar? \n");
        int x = 0;
        for (Aparelho a : cenario.getAparelhos()) {
            System.out.println(x++ + " - " + a.getDescricao());
        }
        System.out.println("\n");

        int aparelhotroca1 = scan.nextInt();

        System.out.println("Por qual aparelho deseja trocar? \n");

        int j = 0;
        for (Aparelho b : cenario.getAparelhosParaCompra()) {
            System.out.println(j++ + " - " + b.getDescricao());
        }
        System.out.println("\n");

        int aparelhotroca2 = scan.nextInt();

        cenario.trocarAparelhos(cenario.getAparelhos().get(aparelhotroca1), cenario.getAparelhosParaCompra().get(
                aparelhotroca2));
    }

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
    //ESSE TAMBEM FUNCIONA!!!
        /*cenario.avancar();
     if (cenario.getFimDeJogo()!=FimDeJogo.NAO_TERMINADO){
     if (cenario.getFimDeJogo() == FimDeJogo.METAS_ATINGIDAS) {
     System.out.println("Você venceu");
     }
     else{
     System.out.println("Loooser");
     }
     op=-1;//Jogo terminou, sair do loop
     }*/

    private static void comprarAparelho(Cenario cenario, Scanner scan) {
        System.out.println("Qual aparelho deseja comprar? \n");

        int k = 0;
        for (Aparelho b : cenario.getAparelhosParaCompra()) {
            System.out.println(k + " - " + b.getDescricao());
            k++;
        }
        System.out.println("\n");

        int aparelhocompra = scan.nextInt();

        cenario.comprarAparelho(cenario.getAparelhosParaCompra().get(aparelhocompra));

    }

    private static void excluirAparelho(Cenario cenario, Scanner scan) {

        System.out.println("Qual aparelho deseja excluir? \n");
        int x = 0;
        for (Aparelho a : cenario.getAparelhos()) {
            System.out.println(x++ + " - " + a.getDescricao());
        }
        System.out.println("\n");

        int aparelhoExluir = scan.nextInt();

        cenario.removeAparelho(cenario.getAparelhos().get(aparelhoExluir));
    }
}
