/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface1.shelter.PetkeepRole;

import Business.Communal_Pet.Pet;
import Business.Total_UserAccount.UserAccount;
import Business.EcoSystem;
import Business.Enterprise.ShelterEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import java.awt.CardLayout;
import static java.awt.Image.SCALE_DEFAULT;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import keeptoo.KGradientPanel;

/**
 *
 * @author 15142087777的AW
 */
public class ShelterPetKeepJPanel extends keeptoo.KGradientPanel {

    /**
     * Creates new form ShelterPetKeepJPanel
     */
    KGradientPanel userProcessContainer;
    UserAccount account;
    Organization organization;
    ShelterEnterprise shelterEnterprise;
    Network network;
    EcoSystem business;
    
    private static String path;
    private static String name;

    public ShelterPetKeepJPanel(KGradientPanel userProcessContainer, UserAccount account, Organization organization, ShelterEnterprise shelterEnterprise, Network network, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.shelterEnterprise = shelterEnterprise;
        this.network = network;
        this.business = business;
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

        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void insertPictureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertPictureActionPerformed
        // TODO add your handling code here:
        /*upload photo;*/
        JFileChooser chooser = new JFileChooser();
        
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int i = chooser.showOpenDialog(null);
        if(i == chooser.APPROVE_OPTION)
        {
            path = chooser.getSelectedFile().getAbsolutePath();
            name = chooser.getSelectedFile().getName();
            System.out.println("the_file_path_is\n"+path+"\nthe_file_name_is\n"+name);
        }
        else
        {
            System.out.println("No Selection");
        }

        pathTextField.setText(name);

        ImageIcon icon = new ImageIcon(path);
        icon.setImage(icon.getImage().getScaledInstance(100, 100, SCALE_DEFAULT));
        pictureJLabel.setIcon(icon);

    }//GEN-LAST:event_insertPictureActionPerformed

    private void createButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButton1ActionPerformed
        // TODO add your handling code here:
        if((addNameTextField.getText().equals("") || path.equals("")))
        {
            JOptionPane.showMessageDialog(null, "Please add the name and picture");
        }
        else
        {
            Pet pet = network.getPetDirectory().createPet(addNameTextField.getText());
            pet.setPetPicString(path);
            
            JOptionPane.showMessageDialog(null, "Add Successfully");
            
            userProcessContainer.remove(this);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.previous(userProcessContainer);
        }
        
    }//GEN-LAST:event_createButton1ActionPerformed

    private void pathTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pathTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pathTextFieldActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField addNameTextField;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton createButton1;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton insertPicture;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField pathTextField;
    private javax.swing.JLabel pictureJLabel;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
