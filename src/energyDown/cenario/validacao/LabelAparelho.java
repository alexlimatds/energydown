/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package energyDown.cenario.validacao;

import energyDown.modelo.UsoAparelho;
import javax.swing.JLabel;

/**
 *
 * @author Ana Meireles
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
