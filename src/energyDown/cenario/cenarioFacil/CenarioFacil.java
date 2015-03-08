package energyDown.cenario.cenarioFacil;

import energyDown.modelo.UsoAparelho;
import energyDown.modelo.Cenario;
import energyDown.modelo.MetaConforto;
import energyDown.modelo.unidade.Tempo;

/**
 *
 * @author Ana Meireles
 */
public class CenarioFacil {

    public static Cenario getCenario() {
        PersonagemAna personagem1 = new PersonagemAna("F", 30, "Ana");
        PersonagemAlexandre personagem2 = new PersonagemAlexandre("M", 36, "Alexandre");
        PersonagemRafael personagem3 = new PersonagemRafael("M", 25, "Rafael");
        
        MetaConforto metaCenario = new MetaConfortoCenarioFacil();
        metaCenario.addPersonagem(personagem1);
        metaCenario.addPersonagem(personagem2);
        metaCenario.addPersonagem(personagem3);
        
        Cenario cenarioFacil = new Cenario(1000, "CenarioFacil", 10, 340, metaCenario, 0.50);

       //Aparelhos da suíte 
        
        cenarioFacil.addUsoAparelho(new UsoAparelho(1125, "Ar Condicionado - Janela 12.000btus", 1000, 
                7, Tempo.HORAS_DIA, "quarto_casal"));
        cenarioFacil.addUsoAparelho(new UsoAparelho(140, "TV 32\"",780, 
                4, Tempo.HORAS_DIA, "quarto_casal"));
        cenarioFacil.addUsoAparelho(new UsoAparelho(60, "Lâmpada Fluorescente", 7,
                4, Tempo.HORAS_DIA, "quarto_casal"));
        cenarioFacil.addUsoAparelho(new UsoAparelho(90, "Abajur", 60,
                1, Tempo.HORAS_DIA, "quarto_casal"));
        cenarioFacil.addUsoAparelho(new UsoAparelho(8, "Carregador de Bateria Celular", 5,
                4, Tempo.HORAS_DIA, "quarto_casal"));
        cenarioFacil.addUsoAparelho(new UsoAparelho(4, "Rádio relógio", 59,
                24, Tempo.HORAS_DIA, "quarto_casal"));
       
        //Aparelhos do banheiro suíte
        
         cenarioFacil.addUsoAparelho(new UsoAparelho(4000, "Chuveiro Elétrico", 100, 
                25, Tempo.MINUTOS_DIA, "banheiroSuite"));
         cenarioFacil.addUsoAparelho(new UsoAparelho(60, "Lâmpada Fluorescente", 7, 
                6, Tempo.HORAS_DIA, "banheiroSuite"));
         cenarioFacil.addUsoAparelho(new UsoAparelho(60, "Lâmpada Dicróica do Espelho", 3, 
                6, Tempo.HORAS_SEMANA, "banheiroSuite"));
         cenarioFacil.addUsoAparelho(new UsoAparelho(30, "Barbeador Elétrico", 7, 
                1, Tempo.HORAS_DIA, "banheiroSuite"));
         cenarioFacil.addUsoAparelho(new UsoAparelho(1200, "Secador de cabelos", 180, 
                1, Tempo.HORAS_SEMANA, "banheiroSuite"));
       
        //Aparelhos do quarto
        
        cenarioFacil.addUsoAparelho(new UsoAparelho(1200, "VideoGame", 70, 
                4, Tempo.HORAS_DIA, "quarto_filho"));
        cenarioFacil.addUsoAparelho(new UsoAparelho(140, "TV 21\"", 780, 
                6, Tempo.HORAS_DIA, "quarto_filho"));
        cenarioFacil.addUsoAparelho(new UsoAparelho(60, "Lâmpada Fluorescente", 7, 
                5, Tempo.HORAS_DIA, "quarto_filho"));
        cenarioFacil.addUsoAparelho(new UsoAparelho(139, "Aparelho DVD", 50, 
                4, Tempo.HORAS_SEMANA, "quarto_filho"));
        
        //Aparelhos do banheiro social
        
        cenarioFacil.addUsoAparelho(new UsoAparelho(60, "Lâmpada Fluorescente", 7, 4, 
                Tempo.HORAS_DIA, "banheiroSocial"));
        cenarioFacil.addUsoAparelho(new UsoAparelho(60, "Lâmpada Dicróica do Espelho", 3, 
                6, Tempo.HORAS_SEMANA, "banheiroSocial"));
       
        
        //Aparelhos da sala
        
        cenarioFacil.addUsoAparelho(new UsoAparelho(140, "TV 42\"", 780, 
                6, Tempo.HORAS_SEMANA, "sala"));
        cenarioFacil.addUsoAparelho(new UsoAparelho(10, "DVD", 110, 
                2, Tempo.HORAS_SEMANA, "sala"));
        cenarioFacil.addUsoAparelho(new UsoAparelho(40, "MicroSystem", 250, 
                2, Tempo.HORAS_SEMANA, "sala"));
        cenarioFacil.addUsoAparelho(new UsoAparelho(60, "Lâmpada Fluorescente", 7, 
                8, Tempo.HORAS_DIA, "sala"));
        cenarioFacil.addUsoAparelho(new UsoAparelho(60, "Lâmpada Fluorescente", 7, 
                8, Tempo.HORAS_DIA, "sala"));
                
        //Aparelhos da cozinha
        
        cenarioFacil.addUsoAparelho(new UsoAparelho(220, "Máquina de Lavar", 900, 
                6, Tempo.HORAS_SEMANA, "cozinha"));
        cenarioFacil.addUsoAparelho(new UsoAparelho(1000, "Microondas 30L", 400, 
                40, Tempo.MINUTOS_DIA, "cozinha"));
        cenarioFacil.addUsoAparelho(new UsoAparelho(265, "Geladeira", 4300, 
                24, Tempo.HORAS_DIA, "cozinha"));
        cenarioFacil.addUsoAparelho(new UsoAparelho(600, "Liquidificador", 90, 
                1, Tempo.HORAS_SEMANA, "cozinha"));
        cenarioFacil.addUsoAparelho(new UsoAparelho(700, "Sanduicheira", 60, 
                1, Tempo.HORAS_SEMANA, "cozinha"));
        cenarioFacil.addUsoAparelho(new UsoAparelho(900, "Ferro de Passar", 60, 
                5, Tempo.HORAS_MES, "cozinha"));
             
        
        return cenarioFacil;
    }
}
