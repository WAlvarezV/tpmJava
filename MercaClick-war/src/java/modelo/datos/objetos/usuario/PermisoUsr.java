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
  * PermisoUsr Value Object.
  * This class is value object representing database table PERMISO_USR
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



public class PermisoUsr implements Cloneable, Serializable {

    /** 
     * Persistent Instance variables. This data is directly 
     * mapped to the columns of database table.
     */
    private int ID_PERMISO_USR;
    private int ID_PERMISO;
    private int ID_USUARIO;
    private double ENABLED;



    /** 
     * Constructors. DaoGen generates two constructors by default.
     * The first one takes no arguments and provides the most simple
     * way to create object instance. The another one takes one
     * argument, which is the primary key of the corresponding table.
     */

    public PermisoUsr () {

    }

    public PermisoUsr (int ID_PERMISO_USRIn) {

          this.ID_PERMISO_USR = ID_PERMISO_USRIn;

    }


    /** 
     * Get- and Set-methods for persistent variables. The default
     * behaviour does not make any checks against malformed data,
     * so these might require some manual additions.
     */

    public int getID_PERMISO_USR() {
          return this.ID_PERMISO_USR;
    }
    public void setID_PERMISO_USR(int ID_PERMISO_USRIn) {
          this.ID_PERMISO_USR = ID_PERMISO_USRIn;
    }

    public int getID_PERMISO() {
          return this.ID_PERMISO;
    }
    public void setID_PERMISO(int ID_PERMISOIn) {
          this.ID_PERMISO = ID_PERMISOIn;
    }

    public int getID_USUARIO() {
          return this.ID_USUARIO;
    }
    public void setID_USUARIO(int ID_USUARIOIn) {
          this.ID_USUARIO = ID_USUARIOIn;
    }

    public double getENABLED() {
          return this.ENABLED;
    }
    public void setENABLED(double ENABLEDIn) {
          this.ENABLED = ENABLEDIn;
    }



    /** 
     * setAll allows to set all persistent variables in one method call.
     * This is useful, when all data is available and it is needed to 
     * set the initial state of this object. Note that this method will
     * directly modify instance variales, without going trough the 
     * individual set-methods.
     */

    public void setAll(int ID_PERMISO_USRIn,
          int ID_PERMISOIn,
          int ID_USUARIOIn,
          double ENABLEDIn) {
          this.ID_PERMISO_USR = ID_PERMISO_USRIn;
          this.ID_PERMISO = ID_PERMISOIn;
          this.ID_USUARIO = ID_USUARIOIn;
          this.ENABLED = ENABLEDIn;
    }


    /** 
     * hasEqualMapping-method will compare two PermisoUsr instances
     * and return true if they contain same values in all persistent instance 
     * variables. If hasEqualMapping returns true, it does not mean the objects
     * are the same instance. However it does mean that in that moment, they 
     * are mapped to the same row in database.
     */
    public boolean hasEqualMapping(PermisoUsr valueObject) {

          if (valueObject.getID_PERMISO_USR() != this.ID_PERMISO_USR) {
                    return(false);
          }
          if (valueObject.getID_PERMISO() != this.ID_PERMISO) {
                    return(false);
          }
          if (valueObject.getID_USUARIO() != this.ID_USUARIO) {
                    return(false);
          }
          if (valueObject.getENABLED() != this.ENABLED) {
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
        out.append("\nclass PermisoUsr, mapping to table PERMISO_USR\n");
        out.append("Persistent attributes: \n"); 
        out.append("ID_PERMISO_USR = " + this.ID_PERMISO_USR + "\n"); 
        out.append("ID_PERMISO = " + this.ID_PERMISO + "\n"); 
        out.append("ID_USUARIO = " + this.ID_USUARIO + "\n"); 
        out.append("ENABLED = " + this.ENABLED + "\n"); 
        return out.toString();
    }


    /**
     * Clone will return identical deep copy of this valueObject.
     * Note, that this method is different than the clone() which
     * is defined in java.lang.Object. Here, the retuned cloned object
     * will also have all its attributes cloned.
     */
    public Object clone() {
        PermisoUsr cloned = new PermisoUsr();

        cloned.setID_PERMISO_USR(this.ID_PERMISO_USR); 
        cloned.setID_PERMISO(this.ID_PERMISO); 
        cloned.setID_USUARIO(this.ID_USUARIO); 
        cloned.setENABLED(this.ENABLED); 
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
