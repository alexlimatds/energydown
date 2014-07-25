package energyDown.cenario.cenarioFacil;

import energyDown.modelo.Cenario;
import energyDown.modelo.unidade.Conforto;
import java.text.DecimalFormat; 
import java.util.HashMap;
import javax.swing.ImageIcon;

/**
 *
 * @author Ana Meireles
 */
public class PnlStatusCenarioFacil extends javax.swing.JPanel {

    private Cenario cenario;
    private DecimalFormat fmt = new DecimalFormat("#,##0.00");
    private HashMap<Conforto, ImageIcon> mapaConfortoIcone = new HashMap<Conforto, ImageIcon>();
    
    public PnlStatusCenarioFacil() {
        initComponents();
        
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
    }
    
    public void setCenario(Cenario cenario) {
        this.cenario = cenario;
        painelStatusCenarios.setCenario(cenario);
    }
       
    public void atualizar() { 
        Conforto confortoAna = cenario.getConfortoPersonagem("Ana");
        labelAna.setIcon(mapaConfortoIcone.get(confortoAna));
        Conforto confortoRafael = cenario.getConfortoPersonagem("Rafael");
        labelRafael.setIcon(mapaConfortoIcone.get(confortoRafael));
        Conforto confortoAlexandre = cenario.getConfortoPersonagem("Alexandre");
        labelAlexandre.setIcon(mapaConfortoIcone.get(confortoAlexandre));
        painelStatusCenarios.atualizar();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        labelAna = new javax.swing.JLabel();
        labelRafael = new javax.swing.JLabel();
        labelAlexandre = new javax.swing.JLabel();
        IconRostoAna = new javax.swing.JLabel();
        IconRostoRafael = new javax.swing.JLabel();
        IconRostoAlexandre = new javax.swing.JLabel();
        botaoAvancar = new javax.swing.JButton();
        botaoHistorico = new javax.swing.JButton();
        painelStatusCenarios = new energyDown.gui.PainelStatusCenarios();

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelAna.setText("Ana");

        labelRafael.setText("Rafael");

        labelAlexandre.setText("Alexandre");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(IconRostoAna)
                    .addComponent(IconRostoRafael))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelAlexandre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelRafael, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelAna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IconRostoAlexandre)
                .addContainerGap(164, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(IconRostoAna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelAna, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelRafael, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IconRostoRafael, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IconRostoAlexandre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelAlexandre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        botaoAvancar.setText("Avançar");
        botaoAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAvancarActionPerformed(evt);
            }
        });

        botaoHistorico.setText("Ver Histórico");

        painelStatusCenarios.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(botaoAvancar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoHistorico)
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(painelStatusCenarios, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(30, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelStatusCenarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoAvancar)
                    .addComponent(botaoHistorico))
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botaoAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAvancarActionPerformed
        cenario.avancar();
        atualizar();
        //TODO verificar se o jogo terminou
    }//GEN-LAST:event_botaoAvancarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IconRostoAlexandre;
    private javax.swing.JLabel IconRostoAna;
    private javax.swing.JLabel IconRostoRafael;
    private javax.swing.JButton botaoAvancar;
    private javax.swing.JButton botaoHistorico;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelAlexandre;
    private javax.swing.JLabel labelAna;
    private javax.swing.JLabel labelRafael;
    private energyDown.gui.PainelStatusCenarios painelStatusCenarios;
    // End of variables declaration//GEN-END:variables
}
