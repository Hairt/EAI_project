/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mesclasses;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import javax.ejb.Singleton;
import javax.ejb.LocalBean;
import metier.Projet;
import metier.Salle;

/**
 *
 * @author thiernoamadoudiallo
 */
@Singleton
@LocalBean
public class ProjetSingleton {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
        private final HashMap<Integer,Projet> projets;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public ProjetSingleton(){
        projets=new HashMap<>();
    }
    
    public HashMap<Integer,Projet> getProjets(){
        return projets;
    }
    
    public void ajouterProjet(Projet leProjet){
        this.projets.put(leProjet.getId(),leProjet);
    }
    
     public HashMap<Integer, Projet> getProjet(){
        return projets;
    }
     public Projet getid(){
         return projets.get(this.getid());
     }
    
     public Date getDate(){
         return projets.get(this).getDateCreation();
     }
     
    public void setSalle(int s){
        projets.get(this).setLaSalle(s);
    }

    public int tailleHashMap(){
        return projets.size();
    }
    

}
