/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ressources;

import static com.oracle.jrockit.jfr.DataType.INTEGER;
import static java.sql.JDBCType.INTEGER;
import static java.sql.Types.INTEGER;
import java.text.ParseException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import mesclasses.ProjetSingleton;
import metier.Projet;
import services.ProjetSessionBean;

/**
 * REST Web Service
 *
 * @author thiernoamadoudiallo
 */
@Path("projet")
public class ProjetResource {

    ProjetSessionBean projetSessionBean = lookupProjetSessionBeanBean();

    @Context
    private UriInfo context;
     private static final Logger LOG = Logger.getLogger(ProjetResource.class.getName());
    /**
     * Creates a new instance of ProjetResource
     */
    public ProjetResource() {
    }

    /**
     * Retrieves representation of an instance of ressources.ProjetResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public HashMap<Integer,Projet> getJson() {
        //TODO return proper representation object
        //throw new UnsupportedOperationException();
        return projetSessionBean.getLesProjets();
    }

    /**
     * PUT method for updating or creating an instance of ProjetResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Projet postJson(Projet content) throws ParseException {
       // LOG.info("Salut !!!!!!");
    
       
    return projetSessionBean.creerProjet(content.getIntitule(),content.getId(),content.getId(),content.getDateCreation(),content.getDuree(),content.getTypePrestation());
    }

    private ProjetSessionBean lookupProjetSessionBeanBean() {
        try {
            javax.naming.Context c = new InitialContext();
            return (ProjetSessionBean) c.lookup("java:global/EAI_Project/EAI_Project-ejb/ProjetSessionBean!services.ProjetSessionBean");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
}
