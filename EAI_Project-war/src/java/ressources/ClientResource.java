/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ressources;

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
import metier.Client;
import services.ClientSessionBean;

/**
 * REST Web Service
 *
 * @author thiernoamadoudiallo
 */
@Path("client")
public class ClientResource {

    ClientSessionBean clientSessionBean = lookupClientSessionBeanBean();

    @Context
    private UriInfo context;
     private static final Logger LOG = Logger.getLogger(ClientResource.class.getName());
    /**
     * Creates a new instance of ClientResource
     */
    public ClientResource() {
    }

    /**
     * Retrieves representation of an instance of ressources.ClientResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        int id= 1;
        //TODO return proper representation object
       String formatJSon = "{\"nom\": \"" + clientSessionBean.getClient(id).getNom() + "\"}" ;
       System.out.println(formatJSon);
       return formatJSon;
       //throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of ClientResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Client postJson(Client content) {
       // LOG.info("Salut !!!!!!");
        return clientSessionBean.creerClient(content.getNom());
    }

    private ClientSessionBean lookupClientSessionBeanBean() {
        try {
            javax.naming.Context c = new InitialContext();
            return (ClientSessionBean) c.lookup("java:global/EAI_Project/EAI_Project-ejb/ClientSessionBean!services.ClientSessionBean");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
}
