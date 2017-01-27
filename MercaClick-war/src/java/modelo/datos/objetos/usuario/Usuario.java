/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.datos.objetos.usuario;

import java.io.*;
import java.sql.*;
import java.util.*;
import java.math.*;

 /**
  * Usuario Value Object.
  * This class is value object representing database table USUARIO
  * This class is intented to be used together with associated Dao object.
  */

 /**
  * This sourcecode has been generated by FREE DaoGen generator version 2.4.1.
  * The usage of generated code is restricted to OpenSource software projects
  * only. DaoGen is available in http://titaniclinux.net/daogen/
  * It has been programmed by Tuomo Lukka, Tuomo.Lukka@iki.fi
  *
  * DaoGen license: The following DaoGen generated source code is licensed
  * under the terms of GNU GPL license. The full text for license is available
  * in GNU project's pages: http://www.gnu.org/copyleft/gpl.html
  *
  * If you wish to use the DaoGen generator to produce code for closed-source
  * commercial applications, you must pay the lisence fee. The price is
  * 5 USD or 5 Eur for each database table, you are generating code for.
  * (That includes unlimited amount of iterations with all supported languages
  * for each database table you are paying for.) Send mail to
  * "Tuomo.Lukka@iki.fi" for more information. Thank you!
  */



public class Usuario implements Cloneable, Serializable {

    /** 
     * Persistent Instance variables. This data is directly 
     * mapped to the columns of database table.
     */
    private int ID_USUARIO;
    private int ID_ROL;
    private int ID_ESTADO;
    private int ID_PERSONA;
    private double USUARIO;
    private double CLAVE;
    private java.sql.Date ULTIMA_SESION;
    private int ANULADO;



    /** 
     * Constructors. DaoGen generates two constructors by default.
     * The first one takes no arguments and provides the most simple
     * way to create object instance. The another one takes one
     * argument, which is the primary key of the corresponding table.
     */

    public Usuario () {

    }

    public Usuario (int ID_USUARIOIn) {

          this.ID_USUARIO = ID_USUARIOIn;

    }


    /** 
     * Get- and Set-methods for persistent variables. The default
     * behaviour does not make any checks against malformed data,
     * so these might require some manual additions.
     */

    public int getID_USUARIO() {
          return this.ID_USUARIO;
    }
    public void setID_USUARIO(int ID_USUARIOIn) {
          this.ID_USUARIO = ID_USUARIOIn;
    }

    public int getID_ROL() {
          return this.ID_ROL;
    }
    public void setID_ROL(int ID_ROLIn) {
          this.ID_ROL = ID_ROLIn;
    }

    public int getID_ESTADO() {
          return this.ID_ESTADO;
    }
    public void setID_ESTADO(int ID_ESTADOIn) {
          this.ID_ESTADO = ID_ESTADOIn;
    }

    public int getID_PERSONA() {
          return this.ID_PERSONA;
    }
    public void setID_PERSONA(int ID_PERSONAIn) {
          this.ID_PERSONA = ID_PERSONAIn;
    }

    public double getUSUARIO() {
          return this.USUARIO;
    }
    public void setUSUARIO(double USUARIOIn) {
          this.USUARIO = USUARIOIn;
    }

    public double getCLAVE() {
          return this.CLAVE;
    }
    public void setCLAVE(double CLAVEIn) {
          this.CLAVE = CLAVEIn;
    }

    public java.sql.Date getULTIMA_SESION() {
          return this.ULTIMA_SESION;
    }
    public void setULTIMA_SESION(java.sql.Date ULTIMA_SESIONIn) {
          this.ULTIMA_SESION = ULTIMA_SESIONIn;
    }

    public int getANULADO() {
          return this.ANULADO;
    }
    public void setANULADO(int ANULADOIn) {
          this.ANULADO = ANULADOIn;
    }



    /** 
     * setAll allows to set all persistent variables in one method call.
     * This is useful, when all data is available and it is needed to 
     * set the initial state of this object. Note that this method will
     * directly modify instance variales, without going trough the 
     * individual set-methods.
     */

    public void setAll(int ID_USUARIOIn,
          int ID_ROLIn,
          int ID_ESTADOIn,
          int ID_PERSONAIn,
          double USUARIOIn,
          double CLAVEIn,
          java.sql.Date ULTIMA_SESIONIn,
          int ANULADOIn) {
          this.ID_USUARIO = ID_USUARIOIn;
          this.ID_ROL = ID_ROLIn;
          this.ID_ESTADO = ID_ESTADOIn;
          this.ID_PERSONA = ID_PERSONAIn;
          this.USUARIO = USUARIOIn;
          this.CLAVE = CLAVEIn;
          this.ULTIMA_SESION = ULTIMA_SESIONIn;
          this.ANULADO = ANULADOIn;
    }


    /** 
     * hasEqualMapping-method will compare two Usuario instances
     * and return true if they contain same values in all persistent instance 
     * variables. If hasEqualMapping returns true, it does not mean the objects
     * are the same instance. However it does mean that in that moment, they 
     * are mapped to the same row in database.
     */
    public boolean hasEqualMapping(Usuario valueObject) {

          if (valueObject.getID_USUARIO() != this.ID_USUARIO) {
                    return(false);
          }
          if (valueObject.getID_ROL() != this.ID_ROL) {
                    return(false);
          }
          if (valueObject.getID_ESTADO() != this.ID_ESTADO) {
                    return(false);
          }
          if (valueObject.getID_PERSONA() != this.ID_PERSONA) {
                    return(false);
          }
          if (valueObject.getUSUARIO() != this.USUARIO) {
                    return(false);
          }
          if (valueObject.getCLAVE() != this.CLAVE) {
                    return(false);
          }
          if (this.ULTIMA_SESION == null) {
                    if (valueObject.getULTIMA_SESION() != null)
                           return(false);
          } else if (!this.ULTIMA_SESION.equals(valueObject.getULTIMA_SESION())) {
                    return(false);
          }
          if (valueObject.getANULADO() != this.ANULADO) {
                    return(false);
          }

          return true;
    }



    /**
     * toString will return String object representing the state of this 
     * valueObject. This is useful during application development, and 
     * possibly when application is writing object states in textlog.
     */
    public String toString() {
        StringBuffer out = new StringBuffer(this.getDaogenVersion());
        out.append("\nclass Usuario, mapping to table USUARIO\n");
        out.append("Persistent attributes: \n"); 
        out.append("ID_USUARIO = " + this.ID_USUARIO + "\n"); 
        out.append("ID_ROL = " + this.ID_ROL + "\n"); 
        out.append("ID_ESTADO = " + this.ID_ESTADO + "\n"); 
        out.append("ID_PERSONA = " + this.ID_PERSONA + "\n"); 
        out.append("USUARIO = " + this.USUARIO + "\n"); 
        out.append("CLAVE = " + this.CLAVE + "\n"); 
        out.append("ULTIMA_SESION = " + this.ULTIMA_SESION + "\n"); 
        out.append("ANULADO = " + this.ANULADO + "\n"); 
        return out.toString();
    }


    /**
     * Clone will return identical deep copy of this valueObject.
     * Note, that this method is different than the clone() which
     * is defined in java.lang.Object. Here, the retuned cloned object
     * will also have all its attributes cloned.
     */
    public Object clone() {
        Usuario cloned = new Usuario();

        cloned.setID_USUARIO(this.ID_USUARIO); 
        cloned.setID_ROL(this.ID_ROL); 
        cloned.setID_ESTADO(this.ID_ESTADO); 
        cloned.setID_PERSONA(this.ID_PERSONA); 
        cloned.setUSUARIO(this.USUARIO); 
        cloned.setCLAVE(this.CLAVE); 
        if (this.ULTIMA_SESION != null)
             cloned.setULTIMA_SESION((java.sql.Date)this.ULTIMA_SESION.clone()); 
        cloned.setANULADO(this.ANULADO); 
        return cloned;
    }



    /** 
     * getDaogenVersion will return information about
     * generator which created these sources.
     */
    public String getDaogenVersion() {
        return "DaoGen version 2.4.1";
    }

}
