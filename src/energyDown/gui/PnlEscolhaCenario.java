package energyDown.gui;

import energyDown.cenario.cenarioFacil.PnlCenarioFacil;
import java.awt.BorderLayout;
import javax.swing.JPanel;
/**
 *
 * @author ANA PRISCILA
 */
public class PnlEscolhaCenario extends javax.swing.JPanel {

    private JPanel rootContainer;
    
     public PnlEscolhaCenario (JPanel rootPanel) {
        initComponents();
        this.rootContainer = rootPanel;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_Facil = new javax.swing.JButton();
        jButton_Intermediario = new javax.swing.JButton();
        jButton_Avancado = new javax.swing.JButton();
        jLabel_Background = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setMinimumSize(new java.awt.Dimension(1005, 410));
        setPreferredSize(new java.awt.Dimension(1005, 410));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_Facil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/energyDown/gui/imagens/CenFácilLampadaApagada.png"))); // NOI18N
        jButton_Facil.setBorder(null);
        jButton_Facil.setBorderPainted(false);
        jButton_Facil.setContentAreaFilled(false);
        jButton_Facil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Facil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_FacilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_FacilMouseExited(evt);
            }
        });
        jButton_Facil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_FacilActionPerformed(evt);
            }
        });
        add(jButton_Facil, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 191, 62));

        jButton_Intermediario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/energyDown/gui/imagens/CenIntermediárioLampadaApagada.png"))); // NOI18N
        jButton_Intermediario.setBorder(null);
        jButton_Intermediario.setBorderPainted(false);
        jButton_Intermediario.setContentAreaFilled(false);
        jButton_Intermediario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Intermediario.setOpaque(false);
        add(jButton_Intermediario, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 191, 62));

        jButton_Avancado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/energyDown/gui/imagens/CenAvançadoLampadaApagada.png"))); // NOI18N
        jButton_Avancado.setBorderPainted(false);
        jButton_Avancado.setContentAreaFilled(false);
        jButton_Avancado.setMaximumSize(new java.awt.Dimension(191, 63));
        jButton_Avancado.setMinimumSize(new java.awt.Dimension(191, 63));
        jButton_Avancado.setPreferredSize(new java.awt.Dimension(191, 63));
        add(jButton_Avancado, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 191, 62));

        jLabel_Background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/energyDown/gui/imagens/energydownEscolhaNivel.png"))); // NOI18N
        jLabel_Background.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(jLabel_Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 410));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_FacilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_FacilActionPerformed
        PnlCenarioFacil pnl = new PnlCenarioFacil(rootContainer);
        rootContainer.removeAll();
        rootContainer.add(pnl, BorderLayout.CENTER);
        rootContainer.revalidate();
        rootContainer.repaint();
    }//GEN-LAST:event_jButton_FacilActionPerformed

    private void jButton_FacilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_FacilMouseEntered
        jButton_Facil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/energyDown/gui/imagens/CenFácilLampadaAcesa.png")));
    }//GEN-LAST:event_jButton_FacilMouseEntered

    private void jButton_FacilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_FacilMouseExited
        jButton_Facil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/energyDown/gui/imagens/CenFácilLampadaApagada.png")));
    }//GEN-LAST:event_jButton_FacilMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Avancado;
    private javax.swing.JButton jButton_Facil;
    private javax.swing.JButton jButton_Intermediario;
    private javax.swing.JLabel jLabel_Background;
    // End of variables declaration//GEN-END:variables
}