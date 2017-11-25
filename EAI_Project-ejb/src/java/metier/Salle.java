/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author seba3
 */
public class Salle implements Serializable{
    
    private int id;
    private String nom;
    private Date laDate;
    
    public Salle(){
    
    }

    public Salle(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }
    public Salle(int id, String nom,Date laDate) {
        this.id = id;
        this.nom = nom;
        this.laDate=laDate;
    }

    public Date getLaDate() {
        return laDate;
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

    public void setLaDate(Date laDate) {
        this.laDate = laDate;
    }
    
}
