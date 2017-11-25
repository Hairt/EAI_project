/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mesclasses;

import java.util.HashMap;
import javax.ejb.Singleton;
import javax.ejb.LocalBean;
import metier.PersonnelComplementaire;

/**
 *
 * @author thiernoamadoudiallo
 */
@Singleton
@LocalBean
public class PersonnelComplementaireSingleton {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    private final HashMap<Integer,PersonnelComplementaire> personnelComplementaires;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public PersonnelComplementaireSingleton(){
        personnelComplementaires=new HashMap<>();
    }
    
    public HashMap<Integer,PersonnelComplementaire> getPersonnelComplementaires(){
        return personnelComplementaires;
    }
    
    public void ajouterPersonnelComplementaire(PersonnelComplementaire lePersonnelComplementaire){
        this.personnelComplementaires.put(lePersonnelComplementaire.getId(),lePersonnelComplementaire);
    }
    
    public PersonnelComplementaire getPersonnelComplementaire(int id){
        return personnelComplementaires.get(id);
    }
    
    
}
