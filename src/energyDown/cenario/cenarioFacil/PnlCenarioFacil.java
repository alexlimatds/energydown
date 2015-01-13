/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package energyDown.cenario.cenarioFacil;

import energyDown.gui.DialogEdicaoAparelhosComodo;
import energyDown.modelo.Cenario;
import javax.swing.JPanel;

/**
 *
 * @author ANA PRISCILA
 */
public class PnlCenarioFacil extends javax.swing.JPanel {
    
    private JPanel rootContainer;
    private Cenario cenario;
    
    /**
     * Creates new form PnlCenarioIntermediario
     */
    public PnlCenarioFacil(JPanel root) {
        iniciarInterface();
        initComponents();
        pnlStatusCenario.setCenario(cenario, root);
        this.rootContainer = root;
        atualizarLabelRosto();   
    }
    
    private void iniciarInterface() {
        cenario = CenarioFacil.getCenario();
               
    }
     
    private void atualizarLabelRosto(){
        pnlStatusCenario.atualizar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        botao_quarto = new javax.swing.JButton();
        botao_suite = new javax.swing.JButton();
        botao_sala_ = new javax.swing.JButton();
        botao_cozinha_ = new javax.swing.JButton();
        botao_banheiroSuite_ = new javax.swing.JButton();
        botao_banheiroSocial_ = new javax.swing.JButton();
        labelTitulol = new javax.swing.JLabel();
        jLabelCenarioIcon = new javax.swing.JLabel();
        pnlStatusCenario = new energyDown.cenario.cenarioFacil.PnlStatusCenarioFacil();

        setBackground(java.awt.Color.lightGray);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1005, 415));

        jPanel2.setBackground(java.awt.Color.lightGray);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botao_quarto.setToolTipText("Clique para alterar o tempo de uso dos aparelhos deste cômodo.");
        botao_quarto.setBorderPainted(false);
        botao_quarto.setContentAreaFilled(false);
        botao_quarto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botao_quarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_quartoActionPerformed(evt);
            }
        });
        jPanel2.add(botao_quarto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 190, 140));

        botao_suite.setToolTipText("Clique para alterar o tempo de uso dos aparelhos deste cômodo.");
        botao_suite.setBorder(null);
        botao_suite.setBorderPainted(false);
        botao_suite.setContentAreaFilled(false);
        botao_suite.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botao_suite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_suiteActionPerformed(evt);
            }
        });
        jPanel2.add(botao_suite, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 170, 130));

        botao_sala_.setToolTipText("Clique para alterar o tempo de uso dos aparelhos deste cômodo.");
        botao_sala_.setBorderPainted(false);
        botao_sala_.setContentAreaFilled(false);
        botao_sala_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botao_sala_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_sala_ActionPerformed(evt);
            }
        });
        jPanel2.add(botao_sala_, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 220, 70));

        botao_cozinha_.setToolTipText("Clique para alterar o tempo de uso dos aparelhos deste cômodo.");
        botao_cozinha_.setBorderPainted(false);
        botao_cozinha_.setContentAreaFilled(false);
        botao_cozinha_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botao_cozinha_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_cozinha_ActionPerformed(evt);
            }
        });
        jPanel2.add(botao_cozinha_, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 130, 80));

        botao_banheiroSuite_.setToolTipText("Clique para alterar o tempo de uso dos aparelhos deste cômodo.");
        botao_banheiroSuite_.setBorderPainted(false);
        botao_banheiroSuite_.setContentAreaFilled(false);
        botao_banheiroSuite_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botao_banheiroSuite_.setDefaultCapable(false);
        botao_banheiroSuite_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_banheiroSuite_ActionPerformed(evt);
            }
        });
        jPanel2.add(botao_banheiroSuite_, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 70, 120));

        botao_banheiroSocial_.setToolTipText("Clique para alterar o tempo de uso dos aparelhos deste cômodo.");
        botao_banheiroSocial_.setBorderPainted(false);
        botao_banheiroSocial_.setContentAreaFilled(false);
        botao_banheiroSocial_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botao_banheiroSocial_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_banheiroSocial_ActionPerformed(evt);
            }
        });
        jPanel2.add(botao_banheiroSocial_, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 70, 120));

        labelTitulol.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelTitulol.setText("EnergyDown - Cenário Fácil");
        jPanel2.add(labelTitulol, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, 30));

        jLabelCenarioIcon.setBackground(java.awt.Color.lightGray);
        jLabelCenarioIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/energyDown/gui/imagens/image_cenarioFacil.jpg"))); // NOI18N
        jLabelCenarioIcon.setText("EnergyDown");
        jLabelCenarioIcon.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabelCenarioIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 20, 710, 360));

        pnlStatusCenario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlStatusCenario, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlStatusCenario, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botao_quartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_quartoActionPerformed
        DialogEdicaoAparelhosComodo dialog = new DialogEdicaoAparelhosComodo(
            cenario.getUsoAparelhos("quarto_filho"));
        dialog.setTitle("Quarto");
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }//GEN-LAST:event_botao_quartoActionPerformed

    private void botao_suiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_suiteActionPerformed
        DialogEdicaoAparelhosComodo dialog = new DialogEdicaoAparelhosComodo(
            cenario.getUsoAparelhos("quarto_casal"));
        dialog.setTitle("Suíte");
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }//GEN-LAST:event_botao_suiteActionPerformed

    private void botao_sala_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_sala_ActionPerformed
        DialogEdicaoAparelhosComodo dialog = new DialogEdicaoAparelhosComodo(
            cenario.getUsoAparelhos("sala"));
        dialog.setTitle("Sala de Estar / Jantar");
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }//GEN-LAST:event_botao_sala_ActionPerformed

    private void botao_cozinha_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_cozinha_ActionPerformed
        DialogEdicaoAparelhosComodo dialog = new DialogEdicaoAparelhosComodo(
            cenario.getUsoAparelhos("cozinha"));
        dialog.setTitle("Cozinha");
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }//GEN-LAST:event_botao_cozinha_ActionPerformed

    private void botao_banheiroSuite_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_banheiroSuite_ActionPerformed
        DialogEdicaoAparelhosComodo dialog = new DialogEdicaoAparelhosComodo(
            cenario.getUsoAparelhos("banheiroSuite"));
        dialog.setTitle("Banheiro Suíte");
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }//GEN-LAST:event_botao_banheiroSuite_ActionPerformed

    private void botao_banheiroSocial_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_banheiroSocial_ActionPerformed
        DialogEdicaoAparelhosComodo dialog = new DialogEdicaoAparelhosComodo(
            cenario.getUsoAparelhos("banheiroSocial"));
        dialog.setTitle("Banheiro Social");
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }//GEN-LAST:event_botao_banheiroSocial_ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_banheiroSocial_;
    private javax.swing.JButton botao_banheiroSuite_;
    private javax.swing.JButton botao_cozinha_;
    private javax.swing.JButton botao_quarto;
    private javax.swing.JButton botao_sala_;
    private javax.swing.JButton botao_suite;
    private javax.swing.JLabel jLabelCenarioIcon;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelTitulol;
    private energyDown.cenario.cenarioFacil.PnlStatusCenarioFacil pnlStatusCenario;
    // End of variables declaration//GEN-END:variables
}
