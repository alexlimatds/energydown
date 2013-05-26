/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package energyDownNow.gui;

import energyDownNow.modelo.UsoAparelho;
import javax.swing.JLabel;

/**
 *
 * @author 201114040290
 */
public class LabelAparelho extends JLabel {

    private UsoAparelho aparelho;

    public LabelAparelho() {
    }

    public LabelAparelho(UsoAparelho aparelho) {
        this.aparelho = aparelho;
        setText(aparelho.getDescricao());
    }

    public UsoAparelho getAparelho() {
        return aparelho;
    }

    public void setAparelho(UsoAparelho aparelho) {
        this.aparelho = aparelho;
        setText(aparelho.getDescricao());
    }
}
