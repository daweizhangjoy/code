/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface1.shelter.adoptRole;

import Business.Communal_Customer.Customer;
import Business.Communal_Pet.Pet;
import Business.EcoSystem;
import Business.Enterprise.ShelterEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Total_UserAccount.UserAccount;
import java.awt.CardLayout;
import static java.awt.Image.SCALE_DEFAULT;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import keeptoo.KGradientPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 15142087777的AW
 */
public class SelectPetJPanel extends keeptoo.KGradientPanel {

    /**
     * Creates new form SelectPetJPanel
     */
    KGradientPanel userProcessContainer;
    UserAccount account;
    Organization organization;
    ShelterEnterprise shelterEnterprise;
    Network network;
    EcoSystem business;
    Customer customer;
    
    SelectPetJPanel(KGradientPanel userProcessContainer, UserAccount account, Organization organization, ShelterEnterprise shelterEnterprise, Network network, EcoSystem business, Customer customer) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.shelterEnterprise = shelterEnterprise;
        this.network = network;
        this.business = business;
        this.customer = customer;
        
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
        backJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        petUnadoptedTable1 = new javax.swing.JTable();
        viewPicturejLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        viewPictureButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(700, 700));
        setLayout(new java.awt.CardLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 204, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(204, 255, 255));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(700, 700));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area - Select Pet");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 430, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        kGradientPanel1.add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 120, 30));

        valueLabel.setText("<value>");
        kGradientPanel1.add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 130, -1));

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        kGradientPanel1.add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        petUnadoptedTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "PetId", "Title 2"
            }
        ));
        jScrollPane1.setViewportView(petUnadoptedTable1);

        kGradientPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 500, 180));
        kGradientPanel1.add(viewPicturejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 100, 100));

        jButton1.setText("Adopt");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, 120, -1));

        viewPictureButton.setText("View Picture");
        viewPictureButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPictureButtonActionPerformed(evt);
            }
        });
        kGradientPanel1.add(viewPictureButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 120, -1));

        add(kGradientPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void viewPictureButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPictureButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = petUnadoptedTable1.getSelectedRow();
        if(selectedRow<0)
        {
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
            populateTable();
        }
        else
        { 
            Pet pet = (Pet)petUnadoptedTable1.getValueAt(selectedRow, 0);
            
            ImageIcon icon = new ImageIcon(pet.getPetPicString());
            icon.setImage(icon.getImage().getScaledInstance(100, 100, SCALE_DEFAULT));
            viewPicturejLabel.setIcon(icon);
                
            populateTable();
        }
    }//GEN-LAST:event_viewPictureButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = petUnadoptedTable1.getSelectedRow();
        if(selectedRow<0)
        {
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
            populateTable();
        }
        else
        { 
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to adopt??","Warning",selectionButton);
            
            if(selectionResult == JOptionPane.YES_OPTION)
            {
                Pet pet = (Pet)petUnadoptedTable1.getValueAt(selectedRow, 0);
                
                customer.getPetDirectory().createPet(pet.getPetName());
                
                pet.setAdoptFlag(true);
            }
        }
        
        populateTable();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTable petUnadoptedTable1;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JButton viewPictureButton;
    private javax.swing.JLabel viewPicturejLabel;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) petUnadoptedTable1.getModel();
        
        model.setRowCount(0);
        
        for (Pet pet : network.getPetDirectory().getPetList())
        {
            if(false == pet.isAdoptFlag())
            {       
                Object[] row = new Object[2];
                row[0] = pet;
                row[1] = pet.getPetName();
            
                model.addRow(row);
            }
        }
    }
}
