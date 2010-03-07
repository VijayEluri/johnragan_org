
package brownbagclient;

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
@WebService(name = "TempConvert", targetNamespace = "http://provider.brownbag.jws.johnragan.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TempConvert {


    /**
     * 
     * @param arg0
     * @return
     *     returns float
     */
    @WebMethod(operationName = "c2f")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "c2f", targetNamespace = "http://provider.brownbag.jws.johnragan.org/", className = "brownbagclient.C2F")
    @ResponseWrapper(localName = "c2fResponse", targetNamespace = "http://provider.brownbag.jws.johnragan.org/", className = "brownbagclient.C2FResponse")
    public float c2F(
        @WebParam(name = "arg0", targetNamespace = "")
        float arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns float
     */
    @WebMethod(operationName = "f2c")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "f2c", targetNamespace = "http://provider.brownbag.jws.johnragan.org/", className = "brownbagclient.F2C")
    @ResponseWrapper(localName = "f2cResponse", targetNamespace = "http://provider.brownbag.jws.johnragan.org/", className = "brownbagclient.F2CResponse")
    public float f2C(
        @WebParam(name = "arg0", targetNamespace = "")
        float arg0);

}
