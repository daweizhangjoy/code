/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface1.supply.supplyIncomeRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Total_UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import keeptoo.KGradientPanel;

/**
 *
 * @author 15142087777的AW
 */
public class ManageJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageJPanel
     */
    private KGradientPanel userProcessContainer;
    private Network network;
    private Enterprise enterprise;
    private UserAccount account;
    private Organization organization;
    private EcoSystem business;

    ManageJPanel(KGradientPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.network = network;
        this.enterprise = enterprise;
        this.account = account;
        this.organization = organization;
        this.business = business;
        
        valueLabel.setText(enterprise.getName());
        
        populateTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        pRTable = new javax.swing.JTable();
        addButton = new javax.swing.JButton();
        manageDetailButton = new javax.swing.JButton();
        backJButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Manage the Supply");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 260, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        kGradientPanel1.add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 120, 30));

        valueLabel.setText("<value>");
        kGradientPanel1.add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 130, -1));

        pRTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "supply id", "supply name", "supply quantity", "Category"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(pRTable);

        kGradientPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 560, 180));

        addButton.setText("Add more");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        kGradientPanel1.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 493, 100, 40));

        manageDetailButton.setText("Manage Supply");
        manageDetailButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageDetailButtonActionPerformed(evt);
            }
        });
        kGradientPanel1.add(manageDetailButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 493, 120, 40));

        backJButton2.setText("<< Back");
        backJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton2ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(backJButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel2.setText("Amount");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 435, 70, 30));
        kGradientPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 100, -1));

        add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 700));
    }// </editor-fold>//GEN-END:initComponents

    private void manageDetailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageDetailButtonActionPerformed
        // TODO add your handling code here:
        ManageDetailJPanel manageDetailJPanel = new ManageDetailJPanel(userProcessContainer, account, organization, enterprise, network, business);
        userProcessContainer.add("manageDetailJPanel", manageDetailJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageDetailButtonActionPerformed

    private void backJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton2ActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButton2ActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = pRTable.getSelectedRow();
        
        
        if(selectedRow<0)
        {
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
        else
        {
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to add??","Warning",selectionButton);
            
            if(selectionResult == JOptionPane.YES_OPTION)
            {
                try
                {
                    int delta = Integer.parseInt(jTextField1.getText());
                    
                    Business.Communal_TotalSupply.TotalSupply totalSupply = (Business.Communal_TotalSupply.TotalSupply)pRTable.getValueAt(selectedRow, 0);
                    totalSupply.setSupplyQuantity(totalSupply.getSupplyQuantity() + delta);
                
                    populateTable();
                }
                catch(NumberFormatException e)
                {
                    JOptionPane.showMessageDialog(null, "Please insert a number!!");
                }
            }
        }
        
        populateTable();
    }//GEN-LAST:event_addButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backJButton2;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JButton manageDetailButton;
    private javax.swing.JTable pRTable;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) pRTable.getModel();
        
        model.setRowCount(0);
        
        for (Business.Communal_TotalSupply.TotalSupply totalSupply : network.getTotalSupplyDirectory().getTotalSupplyList())
        {
            
                Object[] row = new Object[4];
                row[0] = totalSupply;
                row[1] = totalSupply.getSupplyQuantity();
                row[2] = totalSupply.getSupplyName();
                row[3] = totalSupply.getCategory().toString();
            
                model.addRow(row);
        }
    }
}