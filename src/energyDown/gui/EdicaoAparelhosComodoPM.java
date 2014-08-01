/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package energyDown.gui;

import energyDown.modelo.UsoAparelho;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;
import org.jdesktop.observablecollections.ObservableCollections;

/**
 *
 * @author ANA PRISCILA
 */
public class EdicaoAparelhosComodoPM {

    private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
    private List<UsoAparelho> usoAparelhosVisualizados;
    private UsoAparelho usoAparelhoSelecionado;

    public EdicaoAparelhosComodoPM(List<UsoAparelho> usoAparelhos) {
        usoAparelhosVisualizados = ObservableCollections.observableList(
                new ArrayList<UsoAparelho>(usoAparelhos));
    }

    public List<UsoAparelho> getUsoAparelhosVisualizados(){
        return usoAparelhosVisualizados;
    }
    
    public void setUsoAparelhoSelecionado(UsoAparelho novoUsoApareho){
        UsoAparelho antigo = this.usoAparelhoSelecionado;
        this.usoAparelhoSelecionado = novoUsoApareho;
        propertyChangeSupport.firePropertyChange("usoAparelhoSelecionado", 
                antigo, novoUsoApareho);
    }
    
    public UsoAparelho getUsoAparelhoSelecionado(){
        return usoAparelhoSelecionado;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener){
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener){
        propertyChangeSupport.removePropertyChangeListener(listener);
    }
}
