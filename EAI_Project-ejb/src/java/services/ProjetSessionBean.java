/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static java.util.Date.parse;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.ObjectMessage;
import javax.jms.Session;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import mesclasses.ClientSingleton;
import mesclasses.ProjetSingleton;
import mesclasses.SalleSingleton;
import metier.Client;
import metier.Projet;
import metier.Salle;
import org.apache.taglibs.standard.tag.common.fmt.ParseDateSupport;

/**
 *
 * @author thiernoamadoudiallo
 */
@Stateless
@LocalBean
public class ProjetSessionBean {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    @EJB
    ProjetSingleton projets;
    @EJB
    ClientSingleton clients;
    
    @EJB
    SalleSessionBean salles;
    
    
    //public ProjetSessionBean(){
        Context context = null;
        ConnectionFactory factory = null;
        Connection connection = null;
        String factoryName = "jms/ConnectionFactory";
        String destName = "ProjetsCrees";
        Destination dest = null;
        int count = 1;
        Session session = null;
        MessageProducer sender = null;
        String text = "Message ";
    //}
    
   
        
       //Date  da = new Date(2017,04,01);
       //Date da= new Date("01/01/2018");
      // Date hh=new Date();
       
       

        
     
        
    public Projet creerProjet (String intitule, int leClient,int laSalle,Date dateCreation, double duree, String typePrestation) throws ParseException {
        //Client c=clients.getClient(leClient);
       
        /*Date d=new Date(2021,9,11);
        
        Projet p=new Projet(50, "proj1", 12, 2, d, 10, "tr");
        Projet p1=new Projet(60, "proj1", 12, 2,d, 10, "tr");
        projets.ajouterProjet(p);
         projets.ajouterProjet(p1);*/
        
        
        /*SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        Date d = sdf.parse(dateCreation);*/
        
        
        Projet proj = new Projet(projets.tailleHashMap(),intitule,leClient,laSalle,dateCreation,duree,typePrestation);
        projets.ajouterProjet(proj);
        
        //Date d=projets.getDate();
        //salles.reservationSalle(d);
        
        
        try {
            
            //Properties prop=new Properties();
            System.setProperty(context.PROVIDER_URL,"mq:localhost:7676");
            
            // create the JNDI initial context.
            context = new InitialContext();

            // look up the ConnectionFactory
            factory = (ConnectionFactory) context.lookup(factoryName);

            // look up the Destination
            dest = (Destination) context.lookup(destName);

            // create the connection
            connection = factory.createConnection();

            // create the session
            session = connection.createSession(
                false, Session.AUTO_ACKNOWLEDGE);

            // create the sender
            sender = session.createProducer(dest);

            // start the connection, to enable message sends
            connection.start();

            for (int i = 0; i < count; ++i) {
                ObjectMessage message = session.createObjectMessage(proj);
               
                sender.send(message);
                System.out.println("Sent: " + proj.toString());
            }
        } catch (JMSException exception) {
            exception.printStackTrace();
        } catch (NamingException ex) {
            Logger.getLogger(ProjetSessionBean.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            // close the context
            if (context != null) {
                try {
                    context.close();
                } catch (NamingException exception) {
                    exception.printStackTrace();
                }
            }

            // close the connection
            if (connection != null) {
                try {
                    connection.close();
                } catch (JMSException exception) {
                    exception.printStackTrace();
                }
            }
        }
        
        
        return proj;
    }
    
    public Projet getIde(){
        return projets.getid();
    }

    
    public HashMap<Integer, Projet> getLesProjets(){
        return projets.getProjets();
    }
}
