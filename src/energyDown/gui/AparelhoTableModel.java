/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package energyDown.gui;

import energyDown.modelo.UsoAparelho;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ANA PRISCILA
 */
public class AparelhoTableModel extends DefaultTableModel{
    
    private List<UsoAparelho> aparelhos = new ArrayList<UsoAparelho>();

    public AparelhoTableModel(List<UsoAparelho> aparelhos) {
        this.aparelhos = aparelhos;
    }
    
    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if(columnIndex == 0){
            return String.class;
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        if(column == 0){
            return "APARELHOS";
        }
        return null;
    }

    @Override
    public int getRowCount() {
        return aparelhos.size();
    }

    @Override
    public Object getValueAt(int row, int column) {
        UsoAparelho uso = aparelhos.get(row);
        return uso.getDescricao();
    }
    
    public UsoAparelho getUsoAparelho(int row){
        return aparelhos.get(row);
    }
}
