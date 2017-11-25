/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import mesclasses.RestaurantSingleton;
import metier.Restaurant;

/**
 *
 * @author thiernoamadoudiallo
 */
@Stateless
@LocalBean
public class RestaurantSessionBean {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    @EJB
    RestaurantSingleton restaurants;
    
    public int creerRestaurant() {
        
        Restaurant s = new Restaurant(1,"u3-210",null);
        Restaurant s1 = new Restaurant(2,"u4-300",null);
        Restaurant s2 = new Restaurant(3,"u3-109",null);
        
        restaurants.ajouterRestaurant(s);
        restaurants.ajouterRestaurant(s1);
        restaurants.ajouterRestaurant(s2);
        
        return 0;
    }
}
