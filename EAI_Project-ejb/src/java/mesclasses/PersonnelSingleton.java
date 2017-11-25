/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mesclasses;

import java.util.HashMap;
import javax.ejb.Singleton;
import javax.ejb.LocalBean;
import metier.Personnel;

/**
 *
 * @author thiernoamadoudiallo
 */
@Singleton
@LocalBean
public class PersonnelSingleton {

   private final HashMap<Integer,Personnel> personnels;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public PersonnelSingleton(){
        personnels=new HashMap<>();
    }
    
    public HashMap<Integer,Personnel> getPersonnels(){
        return personnels;
    }
    
    public void ajouterPersonnel(Personnel lePersonnel){
        this.personnels.put(lePersonnel.getId(),lePersonnel);
    }
    
    public Personnel getPersonnel(int id){
        return personnels.get(id);
    }
    
    
}
