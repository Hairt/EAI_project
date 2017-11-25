/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.HashMap;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import mesclasses.ClientSingleton;
import metier.Client;

/**
 *
 * @author thiernoamadoudiallo
 */
@Stateless
@LocalBean
public class ClientSessionBean {
     @EJB
    ClientSingleton clients;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
   // private final HashMap<Integer,Client> clients=new HashMap<>();
    
    public ClientSessionBean(){
        //clients = new HashMap<>();
    }
    public Client creerClient(String nom) {
        
        Client c = new Client(clients.tailleHashMap()+1 ,nom);
        clients.ajouterClient(c);
        //clients.put(c.getId(),c);
        return c;
    }
    public void setAdresse(int id, String adresse) {
        Client c = clients.getClient(id);
        if (c != null) {
            c.setAdresse(adresse);
        }
    }
    
    
}
