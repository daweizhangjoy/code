/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface1.supply.supplyDataAnalyseRole;

import Business.Total_UserAccount.UserAccount;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import java.awt.CardLayout;
import keeptoo.KGradientPanel;

/**
 *
 * @author 15142087777的AW
 */
public class SupplyDataAnalysisJPanel extends keeptoo.KGradientPanel {

    /**
     * Creates new form SupplyOutcomeJPanel
     */
    private KGradientPanel userProcessContainer;
    private Network network;
    private Enterprise enterprise;
    private UserAccount account;
    private Organization organization;
    private EcoSystem business;

    public SupplyDataAnalysisJPanel(KGradientPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.network = network;
        this.enterprise = enterprise;
        this.account = account;
        this.organization = organization;
        this.business = business;
        
        valueLabel.setText(enterprise.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        supplyButton = new javax.swing.JButton();
        enterpriseButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Purchase Request Analysis");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        kGradientPanel1.add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 130, 30));

        valueLabel.setText("<value>");
        kGradientPanel1.add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 130, -1));

        supplyButton.setText("Analysis Supply");
        supplyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplyButtonActionPerformed(evt);
            }
        });
        kGradientPanel1.add(supplyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 180, 90));

        enterpriseButton.setText("Analysis Enterprise");
        enterpriseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseButtonActionPerformed(evt);
            }
        });
        kGradientPanel1.add(enterpriseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 180, 90));

        add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 700));
    }// </editor-fold>//GEN-END:initComponents

    private void supplyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplyButtonActionPerformed
        // TODO add your handling code here:
        SupplyRequireAnalysisJPanel supplyRequireAnalysisJPanel = new SupplyRequireAnalysisJPanel(userProcessContainer, account, organization, enterprise, network, business);
        userProcessContainer.add("supplyRequireAnalysisJPanel", supplyRequireAnalysisJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_supplyButtonActionPerformed

    private void enterpriseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseButtonActionPerformed
        // TODO add your handling code here:
        EnterpriseAnalysisJPanel enterpriseAnalysisJPanel = new EnterpriseAnalysisJPanel(userProcessContainer, account, organization, enterprise, network, business);
        userProcessContainer.add("enterpriseAnalysisJPanel", enterpriseAnalysisJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_enterpriseButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton enterpriseButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JButton supplyButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}