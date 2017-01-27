/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.logica.ubicacion;

import control.AnularRegistro;
import control.NextId;
import java.sql.Connection;
import modelo.conexion.Conexion;

/**
 *
 * @author ANALISTA_DESARROLLO
 */
public class GestionUbicacion {
    
    static Conexion conexion;
    static Connection conn;
    static NextId netxId;
    static AnularRegistro anularRegistro;

    public GestionUbicacion() {
        this.conexion = new Conexion();
        this.netxId = new NextId();
        this.anularRegistro = new AnularRegistro();
    }
    
}
