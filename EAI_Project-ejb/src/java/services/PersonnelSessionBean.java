/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import mesclasses.PersonnelSingleton;
import metier.Personnel;

/**
 *
 * @author thiernoamadoudiallo
 */
@Stateless
@LocalBean
public class PersonnelSessionBean {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @EJB
    PersonnelSingleton personnels;
    
    public int creerPersonnel() {
        
        Personnel p = new Personnel(1,"Paul","chef cuisinier");
        Personnel p1 = new Personnel(2,"Mari","serveuse");
        Personnel p2 = new Personnel(3,"Eve","Gerant");
        
        personnels.ajouterPersonnel(p);
        personnels.ajouterPersonnel(p1);
        personnels.ajouterPersonnel(p2);
        
        return 0;
    }
}
