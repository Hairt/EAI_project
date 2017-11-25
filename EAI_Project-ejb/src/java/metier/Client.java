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

public class Client implements Serializable {
    
    private int id;
    
    private String nom;
    
    private String adresse = "";
    private String iban;
    
    public Client(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Client(int id, String nom, String adresse, String iban) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.iban=iban;
    }

    public Client() {
        
    }   
    
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
        

    /**
     * Get the value of Iban
     *
     * @return the value of Iban
     */
    public String getIban() {
        return iban;
    }

    /**
     * Set the value of Iban
     *
     * @param Iban new value of Iban
     */
    public void setIban(String iban) {
        this.iban = iban;
    }


    @Override
    public String toString() {
        return "Client{" + "id=" + id + ", nom=" + nom + ", adresse=" + adresse + '}';
    }

}
