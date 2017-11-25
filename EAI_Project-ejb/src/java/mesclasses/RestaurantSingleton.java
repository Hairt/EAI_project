/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mesclasses;

import java.util.HashMap;
import javax.ejb.Singleton;
import javax.ejb.LocalBean;
import metier.Restaurant;

/**
 *
 * @author thiernoamadoudiallo
 */
@Singleton
@LocalBean
public class RestaurantSingleton {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    private final HashMap<Integer,Restaurant> restaurants;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public RestaurantSingleton(){
        restaurants=new HashMap<>();
    }
    
    public HashMap<Integer,Restaurant> getRestaurants(){
        return restaurants;
    }
    public void ajouterRestaurant(Restaurant leRestaurant){
        this.restaurants.put(leRestaurant.getId(),leRestaurant);
    } 
    
    public Restaurant getRestaurant(int id){
        return restaurants.get(id);
    }
    
    
    
    
}
