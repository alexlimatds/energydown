package energyDownNow;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        
        
           
        Cenario cenario = new Cenario(4000, "Casa", 3, 100, null);//TODO
       
               
        Aparelho aparelho1 = new Aparelho(1125, "Ar Condicionado - Janela 12.000btus", 1200);
        Aparelho aparelho2 = new Aparelho(140, "TV 21\"", 780);
        Aparelho aparelho3 = new Aparelho(10, "DVD", 110);
        Aparelho aparelho4 = new Aparelho(40, "MicroSystem", 250);
        Aparelho aparelho5 = new Aparelho(220, "Máquina de Lavar", 900);
        Aparelho aparelho6 = new Aparelho(1000, "Microondas 30L", 400);
        Aparelho aparelho7 = new Aparelho(4000, "Chuveiro Elétrico", 100);
        Aparelho aparelho8 = new Aparelho(265, "Geladeira Duplex", 4300);
        Aparelho aparelho9 = new Aparelho(1200, "Ferro à Vapor", 70);
        
        cenario.addAparelho(aparelho1);
        cenario.addAparelho(aparelho2);
        cenario.addAparelho(aparelho3);
        cenario.addAparelho(aparelho4);
        cenario.addAparelho(aparelho5);
        cenario.addAparelho(aparelho6);
        cenario.addAparelho(aparelho7);
        cenario.addAparelho(aparelho8);
        cenario.addAparelho(aparelho9);
        
        Aparelho aparelhoCompra1 = new Aparelho(1086, "Ar condicionado Split 12.000btus", 1000);
        Aparelho aparelhoCompra2 = new Aparelho(80, "TV 32\" LED", 1499);
        Aparelho aparelhoCompra3 = new Aparelho(15, "BLUE RAY", 550);
        Aparelho aparelhoCompra4 = new Aparelho(29, "Home Theater", 549);
        Aparelho aparelhoCompra5 = new Aparelho(55, "Ventilador 30cm", 135);
        Aparelho aparelhoCompra6 = new Aparelho(90, "Geladeira", 2000);
        Aparelho aparelhoCompra7 = new Aparelho(100, "Ferro à Seco", 39);
        
        cenario.getAparelhosParaCompra().add(aparelhoCompra1);
        cenario.getAparelhosParaCompra().add(aparelhoCompra2);
        cenario.getAparelhosParaCompra().add(aparelhoCompra3);
        cenario.getAparelhosParaCompra().add(aparelhoCompra4);
        cenario.getAparelhosParaCompra().add(aparelhoCompra5);
        cenario.getAparelhosParaCompra().add(aparelhoCompra6);
        cenario.getAparelhosParaCompra().add(aparelhoCompra7);
        
        System.out.println("Consumo do cenário em KWh =  " + cenario.calcularConsumoEmKWh() + " KWh.");
        System.out.println("Consumo atual do cenário = R$ " + cenario.getUltimaDespesa());
        System.out.println("Meta de consumo a ser atingida no cenário = R$ " + cenario.getMetaDespesa());
                
        Scanner scan = new Scanner(System.in); 
        int op = 9; 
           
        while(op  >= 0){
           
           System.out.println("\n");
           
           System.out.println ("----------------------------------------------------------");
           System.out.println ("1 – LISTAR APARELHOS DO CENÁRIO        -------------------");
           System.out.println ("2 – ALTERAR TEMPO DE USO DE UM APARELHO-------------------");
           System.out.println ("3 – TROCAR APARELHO --------------------------------------");
           System.out.println ("4 – EXCLUIR APARELHO --------------------------------------");
           System.out.println ("5 – COMPRAR APARELHO --------------------------------------");
           System.out.println ("6 – AVANÇAR ----------------------------------------------");
           System.out.println ("----------------------------------------------------------");
           System.out.println("\n");
           op = scan.nextInt(); 
           
        switch(op)
                {
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
            }
        }
    }
    
    private static void listarAparelhos(Cenario cenario){
        int i = 0;
        for (Aparelho a : cenario.getAparelhos()){
            System.out.println("# " + a.getDescricao() + " - Valor = R$ " + a.getPreco() + " - Potência = " + a.getPotencia() + "kw" + " / Uso: " + a.getTempoUso() + "/" + a.getUnidadeDeTempo());
            i++;
        }
        System.out.println("\n");
        }
    
    private static void alterarTempoDeUso(Cenario cenario, Scanner scan){
        
        System.out.println(" ==>> META CENÁRIO ==>>> R$ " + cenario.getMetaDespesa() + "\n");
        System.out.println("Deseja alterar o tempo de uso de qual aparelho? \n");
        int i = 0;
        for (Aparelho a : cenario.getAparelhos()){
            System.out.println(i + " - " + a.getDescricao());
            i++;
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
        for(UnidadeDeTempo unidade : UnidadeDeTempo.values()){
            System.out.println("  "+ i + ": " + unidade);
            i++;
        }
        i = scan.nextInt();
        ap1.setUnidadeDeTempo(UnidadeDeTempo.values()[i]);      
    }
    
    private static void trocarAparelho(Cenario cenario, Scanner scan){
                                 
        System.out.println("Qual aparelho deseja trocar? \n");
        int x = 0;
        for (Aparelho a : cenario.getAparelhos()){
            System.out.println(x + " - " + a.getDescricao());
            x++;
        }
        System.out.println("\n");

        int aparelhotroca1 = scan.nextInt();

        System.out.println("Por qual aparelho deseja trocar? \n");

        int j = 0;
        for (Aparelho b : cenario.getAparelhosParaCompra()){
            System.out.println(j + " - " + b.getDescricao());
            j++;
        }
        System.out.println("\n");

        int aparelhotroca2 = scan.nextInt();

        cenario.trocarAparelhos(cenario.getAparelhos().get(aparelhotroca1), cenario.getAparelhosParaCompra().get(
                aparelhotroca2));
    }
    
    private static int avancarCenario(Cenario cenario){
        int x = 9;
        cenario.avancar();
        if (cenario.getFimDeJogo()==FimDeJogo.METAS_ATINGIDAS){
            System.out.println("Você venceu!!!");
            x = -1;
        }
        else if(cenario.getFimDeJogo()==FimDeJogo.FIM_DO_PRAZO){
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
                
    private static void comprarAparelho(Cenario cenario, Scanner scan){
        System.out.println("Qual aparelho deseja comprar? \n");
                        
            int k = 0;
            for (Aparelho b : cenario.getAparelhosParaCompra()){
                System.out.println(k + " - " + b.getDescricao());
                k++;
            }
            System.out.println("\n");

            int aparelhocompra = scan.nextInt();

            cenario.comprarAparelho(cenario.getAparelhosParaCompra().get(aparelhocompra));
        
    }
    private static void excluirAparelho(Cenario cenario, Scanner scan){
                                 
        System.out.println("Qual aparelho deseja excluir? \n");
        int x = 0;
        for (Aparelho a : cenario.getAparelhos()){
            System.out.println(x + " - " + a.getDescricao());
            x++;
        }
        System.out.println("\n");

        int aparelhoExluir = scan.nextInt();

        cenario.removeAparelho(cenario.getAparelhos().get(aparelhoExluir));
    }
    
}
    