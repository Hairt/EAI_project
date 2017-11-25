/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import static com.oracle.wls.shaded.org.apache.xalan.lib.ExsltDynamic.map;
import static com.sun.faces.util.CollectionsUtils.map;
import static com.sun.org.apache.xalan.internal.lib.ExsltDynamic.map;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import static jdk.nashorn.internal.objects.NativeArray.map;
import static jdk.nashorn.internal.objects.NativeDebug.map;
import mesclasses.SalleSingleton;
import metier.Salle;
import static org.apache.jasper.compiler.ELFunctionMapper.map;

/**
 *
 * @author thiernoamadoudiallo
 */
@Stateless
@LocalBean
public class SalleSessionBean {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @EJB
    SalleSingleton salles;
    
    public int SalleSessionBean() {
        
        Salle s = new Salle(1,"u3-210");
        Salle s1 = new Salle(2,"u4-300");
        Salle s2 = new Salle(3,"u3-109");
        
        salles.ajouterSalle(s);
        salles.ajouterSalle(s1);
        salles.ajouterSalle(s2);
        return 0;
    }

    
    public Salle reservationSalle(Date laDate){
        Salle s=reservationSalle(laDate);
        
        return s;
    }

    
    public void setLaDate(int id, Date d) {
        Salle s =salles.getSalle(id); //clients.get(id);
        if (s != null) {
            s.setLaDate(d);
        }
    }
}
