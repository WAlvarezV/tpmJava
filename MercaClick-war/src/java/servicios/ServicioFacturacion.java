/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import modelo.datos.objetos.facturacion.Convenio;
import modelo.logica.facturacion.GestionFacturacion;

/**
 *
 * @author ANALISTA_DESARROLLO
 */
@WebService(serviceName = "ServicioFacturacion")
public class ServicioFacturacion {

    GestionFacturacion gtnFacturacion;

    public ServicioFacturacion() {
        this.gtnFacturacion = new GestionFacturacion();
    }
        // <editor-fold defaultstate="collapsed" desc="Métodos Servicio Convenio">
    @WebMethod(operationName = "crearConvenio")
    public Convenio crearConvenio(@WebParam(name = "Convenio") Convenio obj) {
        return gtnFacturacion.crearConvenio(obj);
    }

    @WebMethod(operationName = "editarConvenio")
    public String editarConvenio(@WebParam(name = "Convenio") Convenio obj) {
        return gtnFacturacion.editarConvenio(obj);
    }

    @WebMethod(operationName = "buscarConvenio")
    public Convenio buscarConvenio(@WebParam(name = "Convenio") Convenio obj) {
        return gtnFacturacion.buscarConvenio(obj);
    }
    
    @WebMethod(operationName = "anularConvenio")
    public String anularConvenio(@WebParam(name = "idObj") int idObj) {
        return gtnFacturacion.anularConvenio(idObj);
    }

    @WebMethod(operationName = "listarConvenios")
    public List listarConvenios() {
        return gtnFacturacion.listarConvenios();
    }
    // </editor-fold>

}
