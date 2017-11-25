/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mesclasses;

import java.util.HashMap;
import javax.ejb.Singleton;
import javax.ejb.LocalBean;
import metier.Client;

/**
 *
 * @author thiernoamadoudiallo
 */
@Singleton
@LocalBean
public class ClientSingleton {
    private final HashMap<Integer,Client> clients;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public ClientSingleton(){
        clients=new HashMap<>();
    }
    
    public HashMap<Integer,Client> getClients(){
        return clients;
    }
    
    public void ajouterClient(Client leClient){
        this.clients.put(leClient.getId(),leClient);
    }
    
    public Client getClient(int id){
        return clients.get(id);
    }
    public int tailleHashMap(){
        return clients.size();
    }
}

