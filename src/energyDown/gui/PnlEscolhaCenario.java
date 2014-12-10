package energyDown.gui;

import energyDown.cenario.cenarioFacil.PnlCenarioFacil;
import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

/**
 *
 * @author ANA PRISCILA
 */
public class PnlEscolhaCenario extends javax.swing.JPanel implements MouseListener {
    
    private JPanel rootContainer;
    
     public PnlEscolhaCenario(JPanel rootPanel) {
        initComponents();
        this.rootContainer = rootPanel;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Logo = new javax.swing.JLabel();
        jLabel_EscolhaNivel = new javax.swing.JLabel();
        jButtonCenarioFacil = new javax.swing.JButton();
        jButtonCenarioIntermediario = new javax.swing.JButton();
        jButtonCenarioAvancado = new javax.swing.JButton();
        jLabel_Logo1 = new javax.swing.JLabel();

        jLabel_Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/energyDown/gui/energyDownLogo.jpg"))); // NOI18N
        jLabel_Logo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        setMinimumSize(new java.awt.Dimension(1005, 410));
        setPreferredSize(new java.awt.Dimension(1005, 410));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_EscolhaNivel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_EscolhaNivel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_EscolhaNivel.setText("Escolha um nível de dificuldade");
        add(jLabel_EscolhaNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, -1, 30));

        jButtonCenarioFacil.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonCenarioFacil.setText("Fácil");
        jButtonCenarioFacil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCenarioFacilActionPerformed(evt);
            }
        });
        add(jButtonCenarioFacil, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 210, 60));

        jButtonCenarioIntermediario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonCenarioIntermediario.setText("Intermediário");
        jButtonCenarioIntermediario.setPreferredSize(new java.awt.Dimension(57, 23));
        jButtonCenarioIntermediario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCenarioIntermediarioActionPerformed(evt);
            }
        });
        add(jButtonCenarioIntermediario, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 210, 70));

        jButtonCenarioAvancado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonCenarioAvancado.setText("Avançado");
        jButtonCenarioAvancado.setPreferredSize(new java.awt.Dimension(57, 23));
        jButtonCenarioAvancado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCenarioAvancadoActionPerformed(evt);
            }
        });
        add(jButtonCenarioAvancado, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 210, 70));

        jLabel_Logo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/energyDown/gui/energyDownLogo.jpg"))); // NOI18N
        jLabel_Logo1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(jLabel_Logo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCenarioFacilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCenarioFacilActionPerformed
        PnlCenarioFacil pnl = new PnlCenarioFacil(rootContainer);
        rootContainer.removeAll();
        rootContainer.add(pnl, BorderLayout.CENTER);
        rootContainer.revalidate();
        rootContainer.repaint();
    }//GEN-LAST:event_jButtonCenarioFacilActionPerformed

    private void jButtonCenarioIntermediarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCenarioIntermediarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCenarioIntermediarioActionPerformed

    private void jButtonCenarioAvancadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCenarioAvancadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCenarioAvancadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCenarioAvancado;
    private javax.swing.JButton jButtonCenarioFacil;
    private javax.swing.JButton jButtonCenarioIntermediario;
    private javax.swing.JLabel jLabel_EscolhaNivel;
    private javax.swing.JLabel jLabel_Logo;
    private javax.swing.JLabel jLabel_Logo1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
