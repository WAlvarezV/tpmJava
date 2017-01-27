/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.datos.objetos.general;

import java.io.*;
import java.sql.*;
import java.util.*;
import java.math.*;

 /**
  * Empresa Value Object.
  * This class is value object representing database table EMPRESA
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



public class Empresa implements Cloneable, Serializable {

    /** 
     * Persistent Instance variables. This data is directly 
     * mapped to the columns of database table.
     */
    private int ID_EMPRESA;
    private int ID_RELACION_COMERCIAL;
    private double NIT;
    private double RAZON_SOCIAL;
    private double TELEFONO1;
    private double TELEFONO2;
    private double CELULAR1;
    private double CELULAR2;
    private double EMAIL;
    private int ANULADO;



    /** 
     * Constructors. DaoGen generates two constructors by default.
     * The first one takes no arguments and provides the most simple
     * way to create object instance. The another one takes one
     * argument, which is the primary key of the corresponding table.
     */

    public Empresa () {

    }

    public Empresa (int ID_EMPRESAIn) {

          this.ID_EMPRESA = ID_EMPRESAIn;

    }


    /** 
     * Get- and Set-methods for persistent variables. The default
     * behaviour does not make any checks against malformed data,
     * so these might require some manual additions.
     */

    public int getID_EMPRESA() {
          return this.ID_EMPRESA;
    }
    public void setID_EMPRESA(int ID_EMPRESAIn) {
          this.ID_EMPRESA = ID_EMPRESAIn;
    }

    public int getID_RELACION_COMERCIAL() {
          return this.ID_RELACION_COMERCIAL;
    }
    public void setID_RELACION_COMERCIAL(int ID_RELACION_COMERCIALIn) {
          this.ID_RELACION_COMERCIAL = ID_RELACION_COMERCIALIn;
    }

    public double getNIT() {
          return this.NIT;
    }
    public void setNIT(double NITIn) {
          this.NIT = NITIn;
    }

    public double getRAZON_SOCIAL() {
          return this.RAZON_SOCIAL;
    }
    public void setRAZON_SOCIAL(double RAZON_SOCIALIn) {
          this.RAZON_SOCIAL = RAZON_SOCIALIn;
    }

    public double getTELEFONO1() {
          return this.TELEFONO1;
    }
    public void setTELEFONO1(double TELEFONO1In) {
          this.TELEFONO1 = TELEFONO1In;
    }

    public double getTELEFONO2() {
          return this.TELEFONO2;
    }
    public void setTELEFONO2(double TELEFONO2In) {
          this.TELEFONO2 = TELEFONO2In;
    }

    public double getCELULAR1() {
          return this.CELULAR1;
    }
    public void setCELULAR1(double CELULAR1In) {
          this.CELULAR1 = CELULAR1In;
    }

    public double getCELULAR2() {
          return this.CELULAR2;
    }
    public void setCELULAR2(double CELULAR2In) {
          this.CELULAR2 = CELULAR2In;
    }

    public double getEMAIL() {
          return this.EMAIL;
    }
    public void setEMAIL(double EMAILIn) {
          this.EMAIL = EMAILIn;
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

    public void setAll(int ID_EMPRESAIn,
          int ID_RELACION_COMERCIALIn,
          double NITIn,
          double RAZON_SOCIALIn,
          double TELEFONO1In,
          double TELEFONO2In,
          double CELULAR1In,
          double CELULAR2In,
          double EMAILIn,
          int ANULADOIn) {
          this.ID_EMPRESA = ID_EMPRESAIn;
          this.ID_RELACION_COMERCIAL = ID_RELACION_COMERCIALIn;
          this.NIT = NITIn;
          this.RAZON_SOCIAL = RAZON_SOCIALIn;
          this.TELEFONO1 = TELEFONO1In;
          this.TELEFONO2 = TELEFONO2In;
          this.CELULAR1 = CELULAR1In;
          this.CELULAR2 = CELULAR2In;
          this.EMAIL = EMAILIn;
          this.ANULADO = ANULADOIn;
    }


    /** 
     * hasEqualMapping-method will compare two Empresa instances
     * and return true if they contain same values in all persistent instance 
     * variables. If hasEqualMapping returns true, it does not mean the objects
     * are the same instance. However it does mean that in that moment, they 
     * are mapped to the same row in database.
     */
    public boolean hasEqualMapping(Empresa valueObject) {

          if (valueObject.getID_EMPRESA() != this.ID_EMPRESA) {
                    return(false);
          }
          if (valueObject.getID_RELACION_COMERCIAL() != this.ID_RELACION_COMERCIAL) {
                    return(false);
          }
          if (valueObject.getNIT() != this.NIT) {
                    return(false);
          }
          if (valueObject.getRAZON_SOCIAL() != this.RAZON_SOCIAL) {
                    return(false);
          }
          if (valueObject.getTELEFONO1() != this.TELEFONO1) {
                    return(false);
          }
          if (valueObject.getTELEFONO2() != this.TELEFONO2) {
                    return(false);
          }
          if (valueObject.getCELULAR1() != this.CELULAR1) {
                    return(false);
          }
          if (valueObject.getCELULAR2() != this.CELULAR2) {
                    return(false);
          }
          if (valueObject.getEMAIL() != this.EMAIL) {
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
        out.append("\nclass Empresa, mapping to table EMPRESA\n");
        out.append("Persistent attributes: \n"); 
        out.append("ID_EMPRESA = " + this.ID_EMPRESA + "\n"); 
        out.append("ID_RELACION_COMERCIAL = " + this.ID_RELACION_COMERCIAL + "\n"); 
        out.append("NIT = " + this.NIT + "\n"); 
        out.append("RAZON_SOCIAL = " + this.RAZON_SOCIAL + "\n"); 
        out.append("TELEFONO1 = " + this.TELEFONO1 + "\n"); 
        out.append("TELEFONO2 = " + this.TELEFONO2 + "\n"); 
        out.append("CELULAR1 = " + this.CELULAR1 + "\n"); 
        out.append("CELULAR2 = " + this.CELULAR2 + "\n"); 
        out.append("EMAIL = " + this.EMAIL + "\n"); 
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
        Empresa cloned = new Empresa();

        cloned.setID_EMPRESA(this.ID_EMPRESA); 
        cloned.setID_RELACION_COMERCIAL(this.ID_RELACION_COMERCIAL); 
        cloned.setNIT(this.NIT); 
        cloned.setRAZON_SOCIAL(this.RAZON_SOCIAL); 
        cloned.setTELEFONO1(this.TELEFONO1); 
        cloned.setTELEFONO2(this.TELEFONO2); 
        cloned.setCELULAR1(this.CELULAR1); 
        cloned.setCELULAR2(this.CELULAR2); 
        cloned.setEMAIL(this.EMAIL); 
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

