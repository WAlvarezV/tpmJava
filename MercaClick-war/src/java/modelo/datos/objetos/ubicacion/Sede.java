/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.datos.objetos.ubicacion;

import java.io.*;
import java.sql.*;
import java.util.*;
import java.math.*;

 /**
  * Sede Value Object.
  * This class is value object representing database table SEDE
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



public class Sede implements Cloneable, Serializable {

    /** 
     * Persistent Instance variables. This data is directly 
     * mapped to the columns of database table.
     */
    private int ID_SEDE;
    private int ID_EMPRESA;
    private int ID_DIRECCION;
    private String SEDE;
    private int ANULADO;



    /** 
     * Constructors. DaoGen generates two constructors by default.
     * The first one takes no arguments and provides the most simple
     * way to create object instance. The another one takes one
     * argument, which is the primary key of the corresponding table.
     */

    public Sede () {

    }

    public Sede (int ID_SEDEIn) {

          this.ID_SEDE = ID_SEDEIn;

    }


    /** 
     * Get- and Set-methods for persistent variables. The default
     * behaviour does not make any checks against malformed data,
     * so these might require some manual additions.
     */

    public int getID_SEDE() {
          return this.ID_SEDE;
    }
    public void setID_SEDE(int ID_SEDEIn) {
          this.ID_SEDE = ID_SEDEIn;
    }

    public int getID_EMPRESA() {
          return this.ID_EMPRESA;
    }
    public void setID_EMPRESA(int ID_EMPRESAIn) {
          this.ID_EMPRESA = ID_EMPRESAIn;
    }

    public int getID_DIRECCION() {
          return this.ID_DIRECCION;
    }
    public void setID_DIRECCION(int ID_DIRECCIONIn) {
          this.ID_DIRECCION = ID_DIRECCIONIn;
    }

    public String getSEDE() {
          return this.SEDE;
    }
    public void setSEDE(String SEDEIn) {
          this.SEDE = SEDEIn;
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

    public void setAll(int ID_SEDEIn,
          int ID_EMPRESAIn,
          int ID_DIRECCIONIn,
          String SEDEIn,
          int ANULADOIn) {
          this.ID_SEDE = ID_SEDEIn;
          this.ID_EMPRESA = ID_EMPRESAIn;
          this.ID_DIRECCION = ID_DIRECCIONIn;
          this.SEDE = SEDEIn;
          this.ANULADO = ANULADOIn;
    }


    /** 
     * hasEqualMapping-method will compare two Sede instances
     * and return true if they contain same values in all persistent instance 
     * variables. If hasEqualMapping returns true, it does not mean the objects
     * are the same instance. However it does mean that in that moment, they 
     * are mapped to the same row in database.
     */
    public boolean hasEqualMapping(Sede valueObject) {

          if (valueObject.getID_SEDE() != this.ID_SEDE) {
                    return(false);
          }
          if (valueObject.getID_EMPRESA() != this.ID_EMPRESA) {
                    return(false);
          }
          if (valueObject.getID_DIRECCION() != this.ID_DIRECCION) {
                    return(false);
          }
          if (this.SEDE == null) {
                    if (valueObject.getSEDE() != null)
                           return(false);
          } else if (!this.SEDE.equals(valueObject.getSEDE())) {
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
        out.append("\nclass Sede, mapping to table SEDE\n");
        out.append("Persistent attributes: \n"); 
        out.append("ID_SEDE = " + this.ID_SEDE + "\n"); 
        out.append("ID_EMPRESA = " + this.ID_EMPRESA + "\n"); 
        out.append("ID_DIRECCION = " + this.ID_DIRECCION + "\n"); 
        out.append("SEDE = " + this.SEDE + "\n"); 
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
        Sede cloned = new Sede();

        cloned.setID_SEDE(this.ID_SEDE); 
        cloned.setID_EMPRESA(this.ID_EMPRESA); 
        cloned.setID_DIRECCION(this.ID_DIRECCION); 
        if (this.SEDE != null)
             cloned.setSEDE(new String(this.SEDE)); 
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
