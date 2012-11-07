/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package energyDownNow.gui;

import energyDownNow.modelo.Aparelho;
import javax.swing.JLabel;

/**
 *
 * @author 201114040290
 */
public class LabelAparelho extends JLabel{
    private Aparelho aparelho;

    public LabelAparelho() {
    }

    public LabelAparelho(Aparelho aparelho) {
        this.aparelho = aparelho;
    }
    
    public Aparelho getAparelho(){
        return aparelho;
    }
    
    public void setAparelho(Aparelho aparelho){
        this.aparelho = aparelho;
        setText(aparelho.getDescricao());
    }
}
