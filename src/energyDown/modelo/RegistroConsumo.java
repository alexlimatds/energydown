/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package energyDown.modelo;

/**
 *
 * @author ANA PRISCILA
 */
public class RegistroConsumo implements Comparable<RegistroConsumo>{
    private int mes;
    private Double consumoEmKWh;
    private Double consumoEmReais;

    public RegistroConsumo(int mes, Double consumoEmKWh, Double consumoEmReais) {
        this.mes = mes;
        this.consumoEmKWh = consumoEmKWh;
        this.consumoEmReais = consumoEmReais;
    }

    /**
     * @return the mes
     */
    public int getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * @return the consumoEmKWh
     */
    public Double getConsumoEmKWh() {
        return consumoEmKWh;
    }

    /**
     * @param consumoEmKWh the consumoEmKWh to set
     */
    public void setConsumoEmKWh(Double consumoEmKWh) {
        this.consumoEmKWh = consumoEmKWh;
    }

    /**
     * @return the consumoEmReais
     */
    public Double getConsumoEmReais() {
        return consumoEmReais;
    }

    /**
     * @param consumoEmReais the consumoEmReais to set
     */
    public void setConsumoEmReais(Double consumoEmReais) {
        this.consumoEmReais = consumoEmReais;
    }

    @Override
    public int compareTo(RegistroConsumo outroRegistro) {
        return Integer.compare(mes, outroRegistro.getMes());
    }
    
}
