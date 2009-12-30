
package teamsC;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "Teams", targetNamespace = "http://richer.basics.jws.johnragan.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Teams {


    /**
     * 
     * @param arg0
     * @return
     *     returns teamsC.Team
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTeam", targetNamespace = "http://richer.basics.jws.johnragan.org/", className = "teamsC.GetTeam")
    @ResponseWrapper(localName = "getTeamResponse", targetNamespace = "http://richer.basics.jws.johnragan.org/", className = "teamsC.GetTeamResponse")
    public Team getTeam(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @return
     *     returns java.util.List<teamsC.Team>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTeams", targetNamespace = "http://richer.basics.jws.johnragan.org/", className = "teamsC.GetTeams")
    @ResponseWrapper(localName = "getTeamsResponse", targetNamespace = "http://richer.basics.jws.johnragan.org/", className = "teamsC.GetTeamsResponse")
    public List<Team> getTeams();

}