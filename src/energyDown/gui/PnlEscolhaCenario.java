package energyDown.gui;

import energyDown.cenario.cenarioAvancado.PnlCenarioAvancado;
import energyDown.cenario.cenarioFacil.PnlRegrasCenarioFacil;
import energyDown.cenario.cenarioIntermediario.PnlCenarioIntermediario;
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
        jButton_Intermediario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_IntermediarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_IntermediarioMouseExited(evt);
            }
        });
        jButton_Intermediario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_IntermediarioActionPerformed(evt);
            }
        });
        add(jButton_Intermediario, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 191, 62));

        jButton_Avancado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/energyDown/gui/imagens/CenAvançadoLampadaApagada.png"))); // NOI18N
        jButton_Avancado.setBorderPainted(false);
        jButton_Avancado.setContentAreaFilled(false);
        jButton_Avancado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Avancado.setMaximumSize(new java.awt.Dimension(191, 63));
        jButton_Avancado.setMinimumSize(new java.awt.Dimension(191, 63));
        jButton_Avancado.setPreferredSize(new java.awt.Dimension(191, 63));
        jButton_Avancado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_AvancadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_AvancadoMouseExited(evt);
            }
        });
        jButton_Avancado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AvancadoActionPerformed(evt);
            }
        });
        add(jButton_Avancado, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 191, 62));

        jLabel_Background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/energyDown/gui/imagens/energydownEscolhaNivel.png"))); // NOI18N
        jLabel_Background.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(jLabel_Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 410));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_FacilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_FacilActionPerformed
        PnlRegrasCenarioFacil pnl = new PnlRegrasCenarioFacil(rootContainer);
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

    private void jButton_IntermediarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_IntermediarioActionPerformed
        PnlCenarioIntermediario pnl = new PnlCenarioIntermediario(rootContainer);
        rootContainer.removeAll();
        rootContainer.add(pnl, BorderLayout.CENTER);
        rootContainer.revalidate();
        rootContainer.repaint();
    }//GEN-LAST:event_jButton_IntermediarioActionPerformed

    private void jButton_IntermediarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_IntermediarioMouseEntered
        jButton_Intermediario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/energyDown/gui/imagens/CenIntermediárioLampadaAcesa.png")));
    }//GEN-LAST:event_jButton_IntermediarioMouseEntered

    private void jButton_IntermediarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_IntermediarioMouseExited
        jButton_Intermediario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/energyDown/gui/imagens/CenIntermediárioLampadaApagada.png")));
    }//GEN-LAST:event_jButton_IntermediarioMouseExited

    private void jButton_AvancadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AvancadoActionPerformed
        PnlCenarioAvancado pnl = new PnlCenarioAvancado(rootContainer);
        rootContainer.removeAll();
        rootContainer.add(pnl, BorderLayout.CENTER);
        rootContainer.revalidate();
        rootContainer.repaint();
    }//GEN-LAST:event_jButton_AvancadoActionPerformed

    private void jButton_AvancadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_AvancadoMouseEntered
        jButton_Avancado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/energyDown/gui/imagens/CenAvançadoLampadaAcesa.png")));
    }//GEN-LAST:event_jButton_AvancadoMouseEntered

    private void jButton_AvancadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_AvancadoMouseExited
        jButton_Avancado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/energyDown/gui/imagens/CenAvançadoLampadaApagada.png")));
    }//GEN-LAST:event_jButton_AvancadoMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Avancado;
    private javax.swing.JButton jButton_Facil;
    private javax.swing.JButton jButton_Intermediario;
    private javax.swing.JLabel jLabel_Background;
    // End of variables declaration//GEN-END:variables
}
