/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.io.Serializable;

/**
 *
 * @author seba3
 */
public class Personnel implements Serializable{
    
    private int id;
    private String nom;
    private String intitule;
    
    public Personnel(){
        
    }
    
    public Personnel(int id, String nom, String intitule) {
        this.id = id;
        this.nom = nom;
        this.intitule = intitule;
    }
    
    public void reservationRestaurant(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }    
}
