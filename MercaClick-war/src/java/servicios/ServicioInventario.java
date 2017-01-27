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
import modelo.datos.objetos.inventario.Producto;
import modelo.datos.objetos.inventario.TipoDato;
import modelo.logica.inventario.GestionInventario;

/**
 *
 * @author ANALISTA_DESARROLLO
 */
@WebService(serviceName = "ServicioInventario")
public class ServicioInventario {

    GestionInventario gtnInventario;

    public ServicioInventario() {
        this.gtnInventario = new GestionInventario();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Métodos Servicio Producto">
    @WebMethod(operationName = "crearProducto")
    public Producto crearProducto(@WebParam(name = "Producto") Producto obj) {
        return gtnInventario.crearProducto(obj);
    }

    @WebMethod(operationName = "editarProducto")
    public String editarProducto(@WebParam(name = "Producto") Producto obj) {
        return gtnInventario.editarProducto(obj);
    }

    @WebMethod(operationName = "buscarProducto")
    public Producto buscarProducto(@WebParam(name = "Producto") Producto obj) {
        return gtnInventario.buscarProducto(obj);
    }

    @WebMethod(operationName = "anularProducto")
    public String anularProducto(@WebParam(name = "idObj") int idObj){
        return gtnInventario.anularProducto(idObj);
    }

    @WebMethod(operationName = "listarProductos")
    public List listarProductos() {
        return gtnInventario.listarProductos();
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Métodos Servicio TipoDato">
//    @WebMethod(operationName = "crearTipoDato")
//    public TipoDato crearTipoDato(@WebParam(name = "TipoDato") TipoDato obj) {
//        return gtnInventario.crearTipoDato(obj);
//    }

    @WebMethod(operationName = "editarTipoDato")
    public String editarTipoDato(@WebParam(name = "TipoDato") TipoDato obj) {
        return gtnInventario.editarTipoDato(obj);
    }

    @WebMethod(operationName = "buscarTipoDato")
    public TipoDato buscarTipoDato(@WebParam(name = "TipoDato") TipoDato obj) {
        return gtnInventario.buscarTipoDato(obj);
    }

    @WebMethod(operationName = "anularTipoDato")
    public String anularTipoDato(@WebParam(name = "idObj") int idObj) {
        return gtnInventario.anularTipoDato(idObj);
    }

    @WebMethod(operationName = "listarTiposDato")
    public List listarTiposDato() {
        return gtnInventario.listarTiposDato();
    }
    
    @WebMethod(operationName = "listarTipoDato")
    public List listarTipoDato(@WebParam(name = "str") String str) {
        return gtnInventario.listarTipoDato(str);
    }

    // </editor-fold>


}
