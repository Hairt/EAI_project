/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author seba3
 */
public class Restaurant implements Serializable{
   
    private int id;
    
    private String nom;
    
    private ArrayList<String> menu= new ArrayList<>();
    
    public Restaurant(){
        
    }
    
    public Restaurant(int id, String nom, ArrayList<String> menu) {
        this.id = id;
        this.nom = nom;
        this.menu = menu;
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

    public ArrayList<String> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<String> menu) {
        this.menu = menu;
    }
}
