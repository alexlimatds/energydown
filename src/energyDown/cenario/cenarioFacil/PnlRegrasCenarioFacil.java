package energyDown.cenario.cenarioFacil;

import energyDown.cenario.cenarioAvancado.PnlCenarioAvancado;
import energyDown.cenario.cenarioFacil.PnlCenarioFacil;
import energyDown.cenario.cenarioIntermediario.PnlCenarioIntermediario;
import java.awt.BorderLayout;
import javax.swing.JPanel;
/**
 *
 * @author ANA PRISCILA
 */
public class PnlRegrasCenarioFacil extends javax.swing.JPanel {

    private JPanel rootContainer;
    
     public PnlRegrasCenarioFacil (JPanel rootPanel) {
        initComponents();
        this.rootContainer = rootPanel;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setMinimumSize(new java.awt.Dimension(1005, 410));
        setPreferredSize(new java.awt.Dimension(1005, 410));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("ChunkFive Ex", 0, 18)); // NOI18N
        jLabel2.setText("- Clique sobre os cômodos e faça as alterações que desejar no tempo de uso de cada um dos aparelhos;");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 950, -1));

        jLabel3.setFont(new java.awt.Font("ChunkFive Ex", 0, 18)); // NOI18N
        jLabel3.setText("- Consumo atual => total consumido atualmente pela residência;");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 690, -1));

        jLabel5.setFont(new java.awt.Font("ChunkFive Ex", 0, 18)); // NOI18N
        jLabel5.setText("- Você poderá clicar em HISTÓRICO para verificar o histórico de consumo da residência, mês a mês;");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 910, -1));

        jLabel6.setFont(new java.awt.Font("ChunkFive Ex", 0, 24)); // NOI18N
        jLabel6.setText("Cenário Fácil - Como jogar???");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        jLabel8.setFont(new java.awt.Font("ChunkFive Ex", 0, 18)); // NOI18N
        jLabel8.setText("- Mês atual => mês atual do jogo;");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 690, -1));

        jLabel9.setFont(new java.awt.Font("ChunkFive Ex", 0, 18)); // NOI18N
        jLabel9.setText("- Clique em AVANÇAR para que o consumo da residência seja recalculado e as metas verificadas;");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 900, -1));

        jLabel10.setFont(new java.awt.Font("ChunkFive Ex", 0, 18)); // NOI18N
        jLabel10.setText("- Você poderá avançar até 10 meses para tentar atingir as metas;");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 810, -1));

        jLabel7.setFont(new java.awt.Font("ChunkFive Ex", 0, 18)); // NOI18N
        jLabel7.setText("- Nesta residência moram 3 pessoas e você precisa reduzir o consumo mantendo o conforto delas;");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 880, -1));

        jLabel11.setFont(new java.awt.Font("ChunkFive Ex", 0, 18)); // NOI18N
        jLabel11.setText("- Despesa atual => total gasto atualmente pela residência;");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 690, -1));

        jLabel12.setFont(new java.awt.Font("ChunkFive Ex", 0, 18)); // NOI18N
        jLabel12.setText("- Meta despesa => meta a ser atingida pelo jogador;");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 690, -1));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/energyDown/gui/imagens/JogarLampadaApagada.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 130, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PnlCenarioFacil pnl = new PnlCenarioFacil(rootContainer);
        rootContainer.removeAll();
        rootContainer.add(pnl, BorderLayout.CENTER);
        rootContainer.revalidate();
        rootContainer.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/energyDown/gui/imagens/JogarLampadaAcesa.png")));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/energyDown/gui/imagens/JogarLampadaApagada.png")));
    }//GEN-LAST:event_jButton1MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
