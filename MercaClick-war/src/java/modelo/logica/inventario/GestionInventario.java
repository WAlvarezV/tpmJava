/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.logica.inventario;

import control.AnularRegistro;
import control.Constantes;
import control.NextId;
import java.sql.Connection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import modelo.conexion.Conexion;
import modelo.datos.dao.inventario.ProductoDao;
import modelo.datos.dao.inventario.TipoDatoDao;
import modelo.datos.objetos.inventario.Producto;
import modelo.datos.objetos.inventario.TipoDato;

/**
 *
 * @author ANALISTA_DESARROLLO
 */
public class GestionInventario {

    static Conexion conexion;
    static Connection conn;
    static NextId netxId;
    static AnularRegistro anularRegistro;

    public GestionInventario() {
        this.conexion = new Conexion();
        this.netxId = new NextId();
        this.anularRegistro = new AnularRegistro();
    }

    // <editor-fold defaultstate="collapsed" desc="Métodos Gestión Producto">
    public Producto crearProducto(Producto obj) {
        try {
            conn = conexion.conectar();
            obj.setID_PRODUCTO(netxId.next(conn, Constantes.PRODUCTO));
            ProductoDao objDao = new ProductoDao();
            objDao.create(conn, obj);
            return objDao.getObject(conn, obj.getID_PRODUCTO());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexion.cerrarConexion();
        }
        return null;
    }

    public String editarProducto(Producto obj) {
        String msj = Constantes.OK;
        try {
            conn = conexion.conectar();
            ProductoDao objDao = new ProductoDao();
            objDao.save(conn, obj);
        } catch (Exception e) {
            e.printStackTrace();
            msj = "ERROR editarProducto: " + e.getMessage();
        } finally {
            conexion.cerrarConexion();
        }
        return msj;
    }

    public Producto buscarProducto(Producto obj) {
        try {
            conn = conexion.conectar();
            ProductoDao objDao = new ProductoDao();
            return (Producto) objDao.searchMatching(conn, obj).get(0);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexion.cerrarConexion();
        }
        return null;
    }

    public static String anularProducto(int idObj) {
        String msj = Constantes.OK;
        try {
            conn = conexion.conectar();
            anularRegistro.anular(conn, Constantes.PRODUCTO, idObj);
        } catch (Exception e) {
            msj = "ERROR anularProducto: " + e.getMessage();
            conexion.cerrarConexion();
        }
        return msj;
    }

    public List listarProductos() {
        List mylista;
        try {
            conn = conexion.conectar();
            ProductoDao objDao = new ProductoDao();
            mylista = objDao.loadAll(conn);
        } catch (Exception e) {
            e.printStackTrace();
            mylista = null;
        } finally {
            conexion.cerrarConexion();
        }
        return mylista;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Métodos Gestión TipoDato">
//    public TipoDato crearTipoDato(TipoDato obj) {
//        try {
//            conn = conexion.conectar();
//            //obj.setID_PRODUCTO(netxId.next(conn,Constantes.PRODUCTO));
//            TipoDatoDao objDao = new TipoDatoDao();
//            objDao.create(conn, obj);
//            return objDao.getObject(conn, obj.getID_PRODUCTO());
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            conexion.cerrarConexion();
//        }
//        return null;
//    }
    public String editarTipoDato(TipoDato obj) {
        String msj = Constantes.OK;
        try {
            conn = conexion.conectar();
            TipoDatoDao objDao = new TipoDatoDao();
            objDao.save(conn, obj);
        } catch (Exception e) {
            e.printStackTrace();
            msj = "ERROR editarTipoDato: " + e.getMessage();
        } finally {
            conexion.cerrarConexion();
        }
        return msj;
    }

    public TipoDato buscarTipoDato(TipoDato obj) {
        try {
            conn = conexion.conectar();
            TipoDatoDao objDao = new TipoDatoDao();
            return (TipoDato) objDao.searchMatching(conn, obj).get(0);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexion.cerrarConexion();
        }
        return null;
    }

    public static String anularTipoDato(int idObj) {
        String msj = Constantes.OK;
        try {
            conn = conexion.conectar();
            anularRegistro.anular(conn, Constantes.TIPO_DATO, idObj);
        } catch (Exception e) {
            msj = "ERROR anularTipoDato: " + e.getMessage();
            conexion.cerrarConexion();
        }
        return msj;
    }

    public List listarTiposDato() {
        List mylista;
        mylista = null;
        try {
            conn = conexion.conectar();
            TipoDatoDao objDao = new TipoDatoDao();
            mylista = objDao.loadAll(conn);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexion.cerrarConexion();
        }
        return mylista;
    }

    public List listarTipoDato(String str) {
        List mylista;
        TipoDato obj = new TipoDato();
        obj.setNOMBRE_TIPO(str);
        try {
            conn = conexion.conectar();
            TipoDatoDao objDao = new TipoDatoDao();
            mylista = objDao.searchMatching(conn, obj);
        } catch (Exception e) {
            e.printStackTrace();
            mylista = null;
        } finally {
            conexion.cerrarConexion();
        }
        return mylista;
    }
    // </editor-fold>

}
