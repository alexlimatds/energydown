package energyDown.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author ANA PRISCILA
 */
public class PnlInicio extends javax.swing.JPanel{
    
    private JPanel rootContainer;
    
    public PnlInicio(JPanel rootPanel) {
        initComponents();
        this.rootContainer = rootPanel;
    }

    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                JPanel rootPanel = new JPanel();
                rootPanel.setLayout(new BorderLayout());
                PnlInicio inicio = new PnlInicio(rootPanel);
                rootPanel.add(inicio, BorderLayout.CENTER);
                JFrame frame = new JFrame("EnergyDown");
                frame.getContentPane().add(rootPanel);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLocationByPlatform(true);
                frame.setVisible(true);
                frame.pack();
            }
        });
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonIniciar = new javax.swing.JButton();
        jLabel_Background = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setMinimumSize(new java.awt.Dimension(1005, 410));
        setPreferredSize(new java.awt.Dimension(1005, 410));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonIniciar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/energyDown/gui/imagens/energyDownIniciar+porta.png"))); // NOI18N
        jButtonIniciar.setBorder(null);
        jButtonIniciar.setBorderPainted(false);
        jButtonIniciar.setContentAreaFilled(false);
        jButtonIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarActionPerformed(evt);
            }
        });
        add(jButtonIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 200, 190));

        jLabel_Background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/energyDown/gui/imagens/energydownInicial.png"))); // NOI18N
        jLabel_Background.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(jLabel_Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 410));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarActionPerformed
        PnlEscolhaCenario escolhaCenario = new PnlEscolhaCenario(rootContainer);
        rootContainer.removeAll();
        rootContainer.add(escolhaCenario, BorderLayout.CENTER);
        rootContainer.revalidate();
        rootContainer.repaint();
    }//GEN-LAST:event_jButtonIniciarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIniciar;
    private javax.swing.JLabel jLabel_Background;
    // End of variables declaration//GEN-END:variables

}
