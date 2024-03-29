package energyDown.gui;

import energyDown.cenario.cenarioFacil.PnlCenarioFacil;
import energyDown.modelo.Cenario;
import java.awt.BorderLayout;
import java.text.DecimalFormat;
import javax.swing.JPanel;

/**
 *
 * @author Ana Meireles
 */
public class DialogResultDerrota extends javax.swing.JDialog {

    private Cenario cenario;
    private DecimalFormat fmt = new DecimalFormat("#,##0.00");
    private JPanel rootContainer;

    /**
     * Creates new form DialogEdicaoAparelho
     */
    public DialogResultDerrota(Cenario cenario, JPanel rootPanel) {
        super();
        setModal(true);
        this.cenario = cenario;
        this.rootContainer = rootPanel;
        
        initComponents();
        
                      
        jLabelResultado.setText("Você não atingiu as metas deste cenário! :\\(");
        jLabelMetaDespesa.setText("Meta de despesa do Cenário =  R$ " + fmt.format(cenario.getMetaDespesa()));
        jLabelUltimaDespesa.setText("Despesa atual do Cenário = R$ " + fmt.format(cenario.getUltimaDespesa()) );
        jLabelConsumo.setText("Consumo atual do Cenário =  " + fmt.format(cenario.calcularConsumoEmKWh()) + " KWh.\n");
            
    }
    
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelResultado = new javax.swing.JLabel();
        btnNão = new javax.swing.JButton();
        btnSim = new javax.swing.JButton();
        jLabelMetaDespesa = new javax.swing.JLabel();
        jLabelUltimaDespesa = new javax.swing.JLabel();
        jLabelConsumo = new javax.swing.JLabel();
        jLabelMensagem = new javax.swing.JLabel();
        jLabelLampada = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelResultado.setFont(new java.awt.Font("ChunkFive Ex", 0, 18)); // NOI18N
        jLabelResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelResultado.setText("resultado");
        jLabelResultado.setOpaque(true);

        btnNão.setFont(new java.awt.Font("ChunkFive Ex", 0, 18)); // NOI18N
        btnNão.setText("Não");
        btnNão.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNãoActionPerformed(evt);
            }
        });

        btnSim.setFont(new java.awt.Font("ChunkFive Ex", 0, 18)); // NOI18N
        btnSim.setText("Sim");
        btnSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimActionPerformed(evt);
            }
        });

        jLabelMetaDespesa.setFont(new java.awt.Font("ChunkFive Ex", 0, 18)); // NOI18N
        jLabelMetaDespesa.setText("meta");

        jLabelUltimaDespesa.setFont(new java.awt.Font("ChunkFive Ex", 0, 18)); // NOI18N
        jLabelUltimaDespesa.setText("despesa");

        jLabelConsumo.setFont(new java.awt.Font("ChunkFive Ex", 0, 18)); // NOI18N
        jLabelConsumo.setText("consumo");

        jLabelMensagem.setFont(new java.awt.Font("ChunkFive Ex", 0, 18)); // NOI18N
        jLabelMensagem.setText("Quer tentar novamente?");

        jLabelLampada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/energyDown/gui/imagens/LampadaApagada-GameOver.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabelLampada)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelMetaDespesa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelUltimaDespesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelConsumo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 33, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSim, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNão))
                            .addComponent(jLabelMensagem))
                        .addGap(133, 133, 133))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelLampada, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelMetaDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabelUltimaDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelMensagem)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSim)
                            .addComponent(btnNão))
                        .addGap(20, 20, 20))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNãoActionPerformed
        PnlInicio pnl = new PnlInicio(rootContainer);
        rootContainer.removeAll();
        rootContainer.add(pnl, BorderLayout.CENTER);
        rootContainer.revalidate();
        rootContainer.repaint();
        this.dispose();
    }//GEN-LAST:event_btnNãoActionPerformed

    private void btnSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimActionPerformed
        PnlCenarioFacil pnl = new PnlCenarioFacil(rootContainer);
        rootContainer.removeAll();
        rootContainer.add(pnl, BorderLayout.CENTER);
        rootContainer.revalidate();
        rootContainer.repaint();
        this.dispose();
    }//GEN-LAST:event_btnSimActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DialogResultDerrota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogResultDerrota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogResultDerrota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogResultDerrota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the dialog
         */
        /*java.awt.EventQueue.invokeLater(new Runnable() {

         public void run() {
         
         });*/
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNão;
    private javax.swing.JButton btnSim;
    private javax.swing.JLabel jLabelConsumo;
    private javax.swing.JLabel jLabelLampada;
    private javax.swing.JLabel jLabelMensagem;
    private javax.swing.JLabel jLabelMetaDespesa;
    private javax.swing.JLabel jLabelResultado;
    private javax.swing.JLabel jLabelUltimaDespesa;
    // End of variables declaration//GEN-END:variables

    

}

