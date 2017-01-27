/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.datos.objetos.facturacion;

import java.io.*;
import java.sql.*;
import java.util.*;
import java.math.*;

 /**
  * Factura Value Object.
  * This class is value object representing database table FACTURA
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



public class Factura implements Cloneable, Serializable {

    /** 
     * Persistent Instance variables. This data is directly 
     * mapped to the columns of database table.
     */
    private int ID_FACTURA;
    private int ID_PERSONA;
    private int ID_TIPO_FACTURA;
    private int ID_EMPRESA;
    private double NUMERO;
    private java.sql.Date FECHA;
    private int TOTAL;
    private int ANULADO;



    /** 
     * Constructors. DaoGen generates two constructors by default.
     * The first one takes no arguments and provides the most simple
     * way to create object instance. The another one takes one
     * argument, which is the primary key of the corresponding table.
     */

    public Factura () {

    }

    public Factura (int ID_FACTURAIn) {

          this.ID_FACTURA = ID_FACTURAIn;

    }


    /** 
     * Get- and Set-methods for persistent variables. The default
     * behaviour does not make any checks against malformed data,
     * so these might require some manual additions.
     */

    public int getID_FACTURA() {
          return this.ID_FACTURA;
    }
    public void setID_FACTURA(int ID_FACTURAIn) {
          this.ID_FACTURA = ID_FACTURAIn;
    }

    public int getID_PERSONA() {
          return this.ID_PERSONA;
    }
    public void setID_PERSONA(int ID_PERSONAIn) {
          this.ID_PERSONA = ID_PERSONAIn;
    }

    public int getID_TIPO_FACTURA() {
          return this.ID_TIPO_FACTURA;
    }
    public void setID_TIPO_FACTURA(int ID_TIPO_FACTURAIn) {
          this.ID_TIPO_FACTURA = ID_TIPO_FACTURAIn;
    }

    public int getID_EMPRESA() {
          return this.ID_EMPRESA;
    }
    public void setID_EMPRESA(int ID_EMPRESAIn) {
          this.ID_EMPRESA = ID_EMPRESAIn;
    }

    public double getNUMERO() {
          return this.NUMERO;
    }
    public void setNUMERO(double NUMEROIn) {
          this.NUMERO = NUMEROIn;
    }

    public java.sql.Date getFECHA() {
          return this.FECHA;
    }
    public void setFECHA(java.sql.Date FECHAIn) {
          this.FECHA = FECHAIn;
    }

    public int getTOTAL() {
          return this.TOTAL;
    }
    public void setTOTAL(int TOTALIn) {
          this.TOTAL = TOTALIn;
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

    public void setAll(int ID_FACTURAIn,
          int ID_PERSONAIn,
          int ID_TIPO_FACTURAIn,
          int ID_EMPRESAIn,
          double NUMEROIn,
          java.sql.Date FECHAIn,
          int TOTALIn,
          int ANULADOIn) {
          this.ID_FACTURA = ID_FACTURAIn;
          this.ID_PERSONA = ID_PERSONAIn;
          this.ID_TIPO_FACTURA = ID_TIPO_FACTURAIn;
          this.ID_EMPRESA = ID_EMPRESAIn;
          this.NUMERO = NUMEROIn;
          this.FECHA = FECHAIn;
          this.TOTAL = TOTALIn;
          this.ANULADO = ANULADOIn;
    }


    /** 
     * hasEqualMapping-method will compare two Factura instances
     * and return true if they contain same values in all persistent instance 
     * variables. If hasEqualMapping returns true, it does not mean the objects
     * are the same instance. However it does mean that in that moment, they 
     * are mapped to the same row in database.
     */
    public boolean hasEqualMapping(Factura valueObject) {

          if (valueObject.getID_FACTURA() != this.ID_FACTURA) {
                    return(false);
          }
          if (valueObject.getID_PERSONA() != this.ID_PERSONA) {
                    return(false);
          }
          if (valueObject.getID_TIPO_FACTURA() != this.ID_TIPO_FACTURA) {
                    return(false);
          }
          if (valueObject.getID_EMPRESA() != this.ID_EMPRESA) {
                    return(false);
          }
          if (valueObject.getNUMERO() != this.NUMERO) {
                    return(false);
          }
          if (this.FECHA == null) {
                    if (valueObject.getFECHA() != null)
                           return(false);
          } else if (!this.FECHA.equals(valueObject.getFECHA())) {
                    return(false);
          }
          if (valueObject.getTOTAL() != this.TOTAL) {
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
        out.append("\nclass Factura, mapping to table FACTURA\n");
        out.append("Persistent attributes: \n"); 
        out.append("ID_FACTURA = " + this.ID_FACTURA + "\n"); 
        out.append("ID_PERSONA = " + this.ID_PERSONA + "\n"); 
        out.append("ID_TIPO_FACTURA = " + this.ID_TIPO_FACTURA + "\n"); 
        out.append("ID_EMPRESA = " + this.ID_EMPRESA + "\n"); 
        out.append("NUMERO = " + this.NUMERO + "\n"); 
        out.append("FECHA = " + this.FECHA + "\n"); 
        out.append("TOTAL = " + this.TOTAL + "\n"); 
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
        Factura cloned = new Factura();

        cloned.setID_FACTURA(this.ID_FACTURA); 
        cloned.setID_PERSONA(this.ID_PERSONA); 
        cloned.setID_TIPO_FACTURA(this.ID_TIPO_FACTURA); 
        cloned.setID_EMPRESA(this.ID_EMPRESA); 
        cloned.setNUMERO(this.NUMERO); 
        if (this.FECHA != null)
             cloned.setFECHA((java.sql.Date)this.FECHA.clone()); 
        cloned.setTOTAL(this.TOTAL); 
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