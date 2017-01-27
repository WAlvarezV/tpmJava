/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.logica.facturacion;

import control.AnularRegistro;
import control.Constantes;
import control.NextId;
import java.sql.Connection;
import java.util.List;
import modelo.conexion.Conexion;
import modelo.datos.dao.facturacion.ConvenioDao;
import modelo.datos.objetos.facturacion.Convenio;

/**
 *
 * @author ANALISTA_DESARROLLO
 */
public class GestionFacturacion {

    static Conexion conexion;
    static Connection conn;
    static NextId netxId;
    static AnularRegistro anularRegistro;

    public GestionFacturacion() {
        this.conexion = new Conexion();
        this.netxId = new NextId();
        this.anularRegistro = new AnularRegistro();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Métodos Gestión Convenio">
    public Convenio crearConvenio(Convenio obj) {
        try {
            conn = conexion.conectar();
            obj.setID_CONVENIO(netxId.next(conn, Constantes.CONVENIO));
            ConvenioDao objDao = new ConvenioDao();
            objDao.create(conn, obj);
            return objDao.getObject(conn, obj.getID_CONVENIO());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexion.cerrarConexion();
        }
        return null;
    }

    public String editarConvenio(Convenio obj) {
        String msj = Constantes.OK;
        try {
            conn = conexion.conectar();
            ConvenioDao objDao = new ConvenioDao();
            objDao.save(conn, obj);
        } catch (Exception e) {
            e.printStackTrace();
            msj = "ERROR editarConvenio: " + e.getMessage();
        } finally {
            conexion.cerrarConexion();
        }
        return msj;
    }

    public Convenio buscarConvenio(Convenio obj) {
        try {
            conn = conexion.conectar();
            ConvenioDao objDao = new ConvenioDao();
            return (Convenio) objDao.searchMatching(conn, obj).get(0);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexion.cerrarConexion();
        }
        return null;
    }

    public static String anularConvenio(int id_producto) {
        String msj = Constantes.OK;
        try {
            conn = conexion.conectar();
            AnularRegistro anularRegistro = new AnularRegistro();
            anularRegistro.anular(conn, Constantes.CONVENIO, id_producto);
        } catch (Exception e) {
            msj = "ERROR anularConvenio: " + e.getMessage();
            conexion.cerrarConexion();
        }
        return msj;
    }

    public List listarConvenios() {
        List mylista;
        mylista = null;
        try {
            conn = conexion.conectar();
            ConvenioDao objDao = new ConvenioDao();
            mylista = objDao.loadAll(conn);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexion.cerrarConexion();
        }
        return mylista;
    }
    // </editor-fold>

}
