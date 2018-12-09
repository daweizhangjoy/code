/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface1.hospital.patientRole;

import Business.Communal_Customer.Customer;
import Business.Total_UserAccount.UserAccount;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import interface1.hospital.adminRole.ManageUserAccountJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import keeptoo.KGradientPanel;

/**
 *
 * @author 15142087777的AW
 */
public class HospitalPatientJPanel extends keeptoo.KGradientPanel {

    /**
     * Creates new form HospitalPatientJPanel
     */
    KGradientPanel userProcessContainer;
    UserAccount account;
    Organization organization;
    HospitalEnterprise hospitalEnterprise;
    Network network;
    EcoSystem business;
    
    public HospitalPatientJPanel(KGradientPanel userProcessContainer, UserAccount account, Organization organization, HospitalEnterprise hospitalEnterprise, Network network, EcoSystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.hospitalEnterprise = hospitalEnterprise;
        this.network = network;
        this.business = business;
        
        valueLabel.setText(hospitalEnterprise.getName());
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
        jLabel2 = new javax.swing.JLabel();
        customerIdTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();

        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area -Hospital  Appointment");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 460, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        kGradientPanel1.add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 120, 30));

        valueLabel.setText("<value>");
        kGradientPanel1.add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 130, -1));

        jLabel2.setText("Customer Id");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 190, 80, 40));

        customerIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerIdTextFieldActionPerformed(evt);
            }
        });
        kGradientPanel1.add(customerIdTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 240, 30));

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        kGradientPanel1.add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 90, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void customerIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerIdTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerIdTextFieldActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        int customerId = Integer.parseInt(customerIdTextField.getText());
        
        Customer customer = network.getCustomerDirectory().searchCustomer(customerId);
        
        if(customer == null)
        {
            JOptionPane.showMessageDialog(null, "Cannot find this customer, please check it again");
        }
        else
        {
            RegisterJPanel muajp = new RegisterJPanel(userProcessContainer, account, organization, hospitalEnterprise, network, business, customer);
            userProcessContainer.add("RegisterJPanel", muajp);

            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_searchButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField customerIdTextField;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
