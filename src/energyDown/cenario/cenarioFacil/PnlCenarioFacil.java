package energyDown.cenario.cenarioFacil;

import energyDown.gui.DialogEdicaoAparelho;
import energyDown.gui.DialogEdicaoAparelhosComodo;
import energyDown.gui.LabelAparelho;
import energyDown.gui.PainelStatusCenarios;
import energyDown.modelo.Cenario;
import energyDown.modelo.unidade.Conforto;
import energyDown.modelo.unidade.FimDeJogo;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Ana Meireles
 */
public class PnlCenarioFacil extends javax.swing.JPanel implements MouseListener {

    private Cenario cenario;
    private JFrame rootFrame;
    private HashMap<Conforto, ImageIcon> mapaConfortoIcone = new HashMap<Conforto, ImageIcon>();

    /**
     * Creates new form PnlCenarioFacil
     */
    public PnlCenarioFacil(JFrame rootFrame) {
        iniciarInterface();
        initComponents();
        iniciarMouseListeners();
        this.rootFrame = rootFrame;
        
        ImageIcon imgOtimo = new ImageIcon(getClass().getResource("/energyDown/gui/iconOtimo.png"));
        mapaConfortoIcone.put(Conforto.OTIMO, imgOtimo);
        ImageIcon imgBom = new ImageIcon(getClass().getResource("/energyDown/gui/iconBom.png"));
        mapaConfortoIcone.put(Conforto.BOM, imgBom);
        ImageIcon imgRegular = new ImageIcon(getClass().getResource("/energyDown/gui/iconRegular.png"));
        mapaConfortoIcone.put(Conforto.REGULAR, imgRegular);
        ImageIcon imgRuim = new ImageIcon(getClass().getResource("/energyDown/gui/iconRuim.png"));
        mapaConfortoIcone.put(Conforto.RUIM, imgRuim);
        ImageIcon imgPessimo = new ImageIcon(getClass().getResource("/energyDown/gui/iconPessimo.png"));
        mapaConfortoIcone.put(Conforto.PESSIMO, imgPessimo);
        atualizarLabelRosto();
    }

    private void iniciarInterface() {
        cenario = CenarioFacil.getCenario();
               
    }

    private void iniciarMouseListeners() {
        
    }
    
    private void atualizarLabelRosto(){
        Conforto confortoAna = cenario.getConfortoPersonagem("Ana");
        Conforto confortoRafael = cenario.getConfortoPersonagem("Rafael");
        Conforto confortoAlexandre = cenario.getConfortoPersonagem("Alexandre");
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("EnergyDownNow - Cenário Fácil");
        PnlCenarioFacil painel = new PnlCenarioFacil(frame);
        frame.add(painel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
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
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pnlStatusCenario = new energyDown.cenario.cenarioFacil.PnlStatusCenarioFacil();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 203, 140, 110));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("EnergyDown - Cenário Fácil");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 190, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/energyDown/gui/EnergyDownNow_cenarioFacil.jpg"))); // NOI18N
        jLabel1.setText("EnergyDown");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 690, 400));

        pnlStatusCenario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlStatusCenario, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(pnlStatusCenario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DialogEdicaoAparelhosComodo dialog = new DialogEdicaoAparelhosComodo(cenario.getUsoAparelhos());
        dialog.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private energyDown.cenario.cenarioFacil.PnlStatusCenarioFacil pnlStatusCenario;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
        Object origem = e.getSource();
        if (origem instanceof LabelAparelho) {
            LabelAparelho label = (LabelAparelho) origem;
            DialogEdicaoAparelho dialog = new DialogEdicaoAparelho(rootFrame, label.getAparelho());
            dialog.setLocationRelativeTo(rootFrame);
            dialog.setVisible(true);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}