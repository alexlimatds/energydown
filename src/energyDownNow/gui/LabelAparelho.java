/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package energyDownNow.gui;

import energyDownNow.modelo.UtilizacaoAparelho;
import javax.swing.JLabel;

/**
 *
 * @author 201114040290
 */
public class LabelAparelho extends JLabel {

    private UtilizacaoAparelho aparelho;

    public LabelAparelho() {
    }

    public LabelAparelho(UtilizacaoAparelho aparelho) {
        this.aparelho = aparelho;
        setText(aparelho.getDescricao());
    }

    public UtilizacaoAparelho getAparelho() {
        return aparelho;
    }

    public void setAparelho(UtilizacaoAparelho aparelho) {
        this.aparelho = aparelho;
        setText(aparelho.getDescricao());
    }
}
