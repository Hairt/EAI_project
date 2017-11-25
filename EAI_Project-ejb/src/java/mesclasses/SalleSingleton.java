/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mesclasses;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import javax.ejb.Singleton;
import javax.ejb.LocalBean;
import metier.Salle;

/**
 *
 * @author thiernoamadoudiallo
 */
@Singleton
@LocalBean
public class SalleSingleton {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    private final HashMap<Integer,Salle> salles;
    private final HashMap<Date,String> lesDates;
    
    public SalleSingleton(){
        salles=new HashMap<>();
        lesDates=new HashMap<>();
    }
    
    public void ajouterSalle(Salle laSalle){
        this.salles.put(laSalle.getId(),laSalle);
    }
    public Salle getSalle(int id){
        return salles.get(id);
    }
    
    public Date getDate(){
        return salles.get(this).getLaDate();
    }
    
    public void setDate(Date laDate){
        salles.get(this).setLaDate(laDate);
    }
    
    public Salle reservationSalle(Date laDate){
        Iterator iterator = salles.entrySet().iterator();
        Salle salleTrouve = new Salle();
        Boolean trouve = false;
        while (iterator.hasNext() && !trouve){
            Salle it=(Salle) iterator.next();
            if(siSalleDispo(it, laDate)){
                trouve = true;
                salleTrouve = it;
            } 
        }
        return salleTrouve;
    }
    
    public Boolean siSalleDispo(Salle s,Date laDate){
       // Date d= salles.get(this).getLaDate();
        Boolean dispo = false;
        if(!lesDates.containsKey(s.getLaDate())){
            lesDates.put(laDate, "la date");
            //s.setLaDate(laDate);
            dispo = true;
        } else {
            
        }
        return dispo;
        
    }
    

    
}
