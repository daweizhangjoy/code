/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface1.hospital.hRAdminRole;

import Business.Total_UserAccount.UserAccount;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Hospital_Doctor.Doctor;
import Business.Hospital_Doctor.DoctorDirectory;
import Business.Network.Network;
import Business.Organization.Organization;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import keeptoo.KGradientPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 15142087777的AW
 */
public class HospitalHRAdminJPanel extends keeptoo.KGradientPanel {

    /**
     * Creates new form HospitalHRAdminJPanel
     */
    KGradientPanel userProcessContainer;
    UserAccount account;
    Organization organization;
    HospitalEnterprise hospitalEnterprise;
    Network network;
    EcoSystem business;

    public HospitalHRAdminJPanel(KGradientPanel userProcessContainer, UserAccount account, Organization organization, HospitalEnterprise hospitalEnterprise, Network network, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.hospitalEnterprise = hospitalEnterprise;
        this.network = network;
        this.business = business;
        valueLabel.setText(hospitalEnterprise.getName());
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
        doctorListTable = new javax.swing.JTable();
        doctorNameTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();

        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area -HR Role");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, 30));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        kGradientPanel1.add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 120, 30));

        valueLabel.setText("<value>");
        kGradientPanel1.add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 130, 30));

        doctorListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Doctor ID", "DoctorName"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(doctorListTable);

        kGradientPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 520, 250));

        doctorNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorNameTextFieldActionPerformed(evt);
            }
        });
        kGradientPanel1.add(doctorNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 480, 100, 20));

        jLabel2.setText("Docotor Name");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 480, 110, 20));

        deleteButton.setText("delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        kGradientPanel1.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 550, 90, 30));

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        kGradientPanel1.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 550, 90, 30));

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

    private void doctorNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctorNameTextFieldActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        String name = doctorNameTextField.getText();

        Doctor doctor = hospitalEnterprise.getHospitalDoctorDirectory().createEmployee(name);
        
        populateTable();
    }//GEN-LAST:event_addButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = doctorListTable.getSelectedRow();
        if(selectedRow<0)
        {
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
        else
        { 
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete??","Warning",selectionButton);
            
            if(selectionResult == JOptionPane.YES_OPTION)
            {
                Doctor doctor = (Doctor)doctorListTable.getValueAt(selectedRow, 0);
                DoctorDirectory doctorDirectory = hospitalEnterprise.getHospitalDoctorDirectory();
                doctorDirectory.deleteDoctor(doctor);
                
                populateTable();
            }
            
            populateTable();
        }
    }//GEN-LAST:event_deleteButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTable doctorListTable;
    private javax.swing.JTextField doctorNameTextField;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) doctorListTable.getModel();
        
        model.setRowCount(0);
        
        for (Doctor doctor : hospitalEnterprise.getHospitalDoctorDirectory().getEmployeeList()){
            Object[] row = new Object[2];
//            row[0] = doctor.getId();
            row[0] = doctor;
            row[1] = doctor.getName();
            
            model.addRow(row);
        }
    }
}
