/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Hospital;

import Business.Role.HospitalPatientRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author 15142087777的AW
 */
public class HospitalPatientAdminOrganization extends HospitalOrganization{

    public HospitalPatientAdminOrganization() {
        super(Type.HospitalPatient.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HospitalPatientRole());
        return roles;
    }
    
}
