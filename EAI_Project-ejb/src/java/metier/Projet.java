/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import static com.oracle.wls.shaded.org.apache.xalan.lib.ExsltDatetime.date;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.ws.rs.client.Entity.form;

/**
 *
 * @author seba3
 */
public class Projet implements Serializable{
    
    private int id;    
    private String intitule;    
    private Date dateCreation;    
    private int leClient;    
    private Restaurant leRestaurant;
    private int laSalle;
    private Personnel lePersonnel;
    private PersonnelComplementaire lePersonnelComplementaire;
    private double duree;
    private double cout;
    private String typePrestation;
    
    private EtatProjet etat;
    

    
    public Projet(){
        
    }
    
    public Projet(int id,String intitule, int leClient,int laSalle,Date dateCreation, double duree, String typePrestation) {
    
        /*Date d = new Date();
        
        DateFormat formater=new SimpleDateFormat("MM/dd/yy");
        try {
            d=formater.parse(dateCreation.toString());
        } catch (ParseException ex) {
            Logger.getLogger(Projet.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        this.id = id;
        this.intitule = intitule;
        this.dateCreation = dateCreation;
        this.leClient = leClient;
        this.duree = duree;
        this.typePrestation = typePrestation;
        this.etat = EtatProjet.EN_COURS_DE_TRAITEMENT;
    }
    
    
   /* public Projet(int id,String intitule, Date dateCreation, int leClient, double duree, String typePrestation) {
        this.id = id;
        this.intitule = intitule;
        this.dateCreation = dateCreation;
        this.leClient = leClient;
        this.duree = duree;
        this.typePrestation = typePrestation;
        this.etat = EtatProjet.EN_COURS_DE_TRAITEMENT;
    }*/
    
    public Projet(String intitule, Date dateCreation, int leClient, Restaurant leRestaurant, int laSalle, Personnel lePersonnel, PersonnelComplementaire lePersonnelComplementaire, double duree, double cout, String typePrestation) {

         this.id = id;
        this.intitule = intitule;
        this.dateCreation = dateCreation;
        this.leClient = leClient;
        this.leRestaurant = leRestaurant;
        this.laSalle = laSalle;
        this.lePersonnel = lePersonnel;
        this.lePersonnelComplementaire = lePersonnelComplementaire;
        this.duree = duree;
        this.cout = cout;
        this.typePrestation = typePrestation;
        this.etat = EtatProjet.EN_COURS_DE_TRAITEMENT;
    }
    


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public Date getDateCreation() {
       
       //SimpleDateFormat dateformatyyyyMMdd = new SimpleDateFormat("dd/mm/yyyy");
       //String date_to_string = dateformatyyyyMMdd.format(dateCreation);
     

        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public int getLeClient() {
        //return leClient.getId();
        return leClient;
    }
    
  
    

    public void setLeClient(int leClient) {
        this.leClient = leClient;
    }

    public Restaurant getLeRestaurant() {
        return leRestaurant;
    }

    public void setLeRestaurant(Restaurant leRestaurant) {
        this.leRestaurant = leRestaurant;
    }

    public int getLaSalle() {
        return laSalle;
    }

    public void setLaSalle(int laSalle) {
        this.laSalle = laSalle;
    }

    public Personnel getLePersonnel() {
        return lePersonnel;
    }

    public void setLePersonnel(Personnel lePersonnel) {
        this.lePersonnel = lePersonnel;
    }

    public PersonnelComplementaire getLePersonnelComplementaire() {
        return lePersonnelComplementaire;
    }

    public void setLePersonnelComplementaire(PersonnelComplementaire lePersonnelComplementaire) {
        this.lePersonnelComplementaire = lePersonnelComplementaire;
    }

    public double getDuree() {
        return duree;
    }

    public void setDuree(double duree) {
        this.duree = duree;
    }

    public double getCout() {
        return cout;
    }

    public void setCout(double cout) {
        this.cout = cout;
    }

    public String getTypePrestation() {
        return typePrestation;
    }

    public void setTypePrestation(String typePrestation) {
        this.typePrestation = typePrestation;
    }   

    @Override
    public String toString() {
        return "Projet{" + "id=" + id + ", intitule=" + intitule + ", dateCreation=" + dateCreation + ", leClient=" + leClient + ", leRestaurant=" + leRestaurant + ", laSalle=" + laSalle + ", lePersonnel=" + lePersonnel + ", lePersonnelComplementaire=" + lePersonnelComplementaire + ", duree=" + duree + ", cout=" + cout + ", typePrestation=" + typePrestation + ", etat=" + etat + '}';
    }
    
}
