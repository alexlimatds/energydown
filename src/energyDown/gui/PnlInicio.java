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

        jLabel_Logo = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jButtonIniciar = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setMinimumSize(new java.awt.Dimension(995, 412));
        setPreferredSize(new java.awt.Dimension(995, 412));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/energyDown/gui/energyDownLogo.jpg"))); // NOI18N
        jLabel_Logo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(jLabel_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, -1));

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Aprendendo Física através de um jogo para controle de consumo elétrico");
        add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 670, 30));

        jButtonIniciar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonIniciar.setText("Iniciar");
        jButtonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarActionPerformed(evt);
            }
        });
        add(jButtonIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 130, 30));
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
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabel_Logo;
    // End of variables declaration//GEN-END:variables

}
