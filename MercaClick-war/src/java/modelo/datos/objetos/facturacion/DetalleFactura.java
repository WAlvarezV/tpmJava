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
  * DetalleFactura Value Object.
  * This class is value object representing database table DETALLE_FACTURA
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



public class DetalleFactura implements Cloneable, Serializable {

    /** 
     * Persistent Instance variables. This data is directly 
     * mapped to the columns of database table.
     */
    private int ID_DETALLE_FACTURA;
    private int ID_FACTURA;
    private int ID_PRODUCTO;
    private double CANTIDAD;
    private double VALOR_VENTA;
    private double IMPUESTO;
    private double SUBTOTAL;
    private int ANULADO;



    /** 
     * Constructors. DaoGen generates two constructors by default.
     * The first one takes no arguments and provides the most simple
     * way to create object instance. The another one takes one
     * argument, which is the primary key of the corresponding table.
     */

    public DetalleFactura () {

    }

    public DetalleFactura (int ID_DETALLE_FACTURAIn) {

          this.ID_DETALLE_FACTURA = ID_DETALLE_FACTURAIn;

    }


    /** 
     * Get- and Set-methods for persistent variables. The default
     * behaviour does not make any checks against malformed data,
     * so these might require some manual additions.
     */

    public int getID_DETALLE_FACTURA() {
          return this.ID_DETALLE_FACTURA;
    }
    public void setID_DETALLE_FACTURA(int ID_DETALLE_FACTURAIn) {
          this.ID_DETALLE_FACTURA = ID_DETALLE_FACTURAIn;
    }

    public int getID_FACTURA() {
          return this.ID_FACTURA;
    }
    public void setID_FACTURA(int ID_FACTURAIn) {
          this.ID_FACTURA = ID_FACTURAIn;
    }

    public int getID_PRODUCTO() {
          return this.ID_PRODUCTO;
    }
    public void setID_PRODUCTO(int ID_PRODUCTOIn) {
          this.ID_PRODUCTO = ID_PRODUCTOIn;
    }

    public double getCANTIDAD() {
          return this.CANTIDAD;
    }
    public void setCANTIDAD(double CANTIDADIn) {
          this.CANTIDAD = CANTIDADIn;
    }

    public double getVALOR_VENTA() {
          return this.VALOR_VENTA;
    }
    public void setVALOR_VENTA(double VALOR_VENTAIn) {
          this.VALOR_VENTA = VALOR_VENTAIn;
    }

    public double getIMPUESTO() {
          return this.IMPUESTO;
    }
    public void setIMPUESTO(double IMPUESTOIn) {
          this.IMPUESTO = IMPUESTOIn;
    }

    public double getSUBTOTAL() {
          return this.SUBTOTAL;
    }
    public void setSUBTOTAL(double SUBTOTALIn) {
          this.SUBTOTAL = SUBTOTALIn;
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

    public void setAll(int ID_DETALLE_FACTURAIn,
          int ID_FACTURAIn,
          int ID_PRODUCTOIn,
          double CANTIDADIn,
          double VALOR_VENTAIn,
          double IMPUESTOIn,
          double SUBTOTALIn,
          int ANULADOIn) {
          this.ID_DETALLE_FACTURA = ID_DETALLE_FACTURAIn;
          this.ID_FACTURA = ID_FACTURAIn;
          this.ID_PRODUCTO = ID_PRODUCTOIn;
          this.CANTIDAD = CANTIDADIn;
          this.VALOR_VENTA = VALOR_VENTAIn;
          this.IMPUESTO = IMPUESTOIn;
          this.SUBTOTAL = SUBTOTALIn;
          this.ANULADO = ANULADOIn;
    }


    /** 
     * hasEqualMapping-method will compare two DetalleFactura instances
     * and return true if they contain same values in all persistent instance 
     * variables. If hasEqualMapping returns true, it does not mean the objects
     * are the same instance. However it does mean that in that moment, they 
     * are mapped to the same row in database.
     */
    public boolean hasEqualMapping(DetalleFactura valueObject) {

          if (valueObject.getID_DETALLE_FACTURA() != this.ID_DETALLE_FACTURA) {
                    return(false);
          }
          if (valueObject.getID_FACTURA() != this.ID_FACTURA) {
                    return(false);
          }
          if (valueObject.getID_PRODUCTO() != this.ID_PRODUCTO) {
                    return(false);
          }
          if (valueObject.getCANTIDAD() != this.CANTIDAD) {
                    return(false);
          }
          if (valueObject.getVALOR_VENTA() != this.VALOR_VENTA) {
                    return(false);
          }
          if (valueObject.getIMPUESTO() != this.IMPUESTO) {
                    return(false);
          }
          if (valueObject.getSUBTOTAL() != this.SUBTOTAL) {
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
        out.append("\nclass DetalleFactura, mapping to table DETALLE_FACTURA\n");
        out.append("Persistent attributes: \n"); 
        out.append("ID_DETALLE_FACTURA = " + this.ID_DETALLE_FACTURA + "\n"); 
        out.append("ID_FACTURA = " + this.ID_FACTURA + "\n"); 
        out.append("ID_PRODUCTO = " + this.ID_PRODUCTO + "\n"); 
        out.append("CANTIDAD = " + this.CANTIDAD + "\n"); 
        out.append("VALOR_VENTA = " + this.VALOR_VENTA + "\n"); 
        out.append("IMPUESTO = " + this.IMPUESTO + "\n"); 
        out.append("SUBTOTAL = " + this.SUBTOTAL + "\n"); 
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
        DetalleFactura cloned = new DetalleFactura();

        cloned.setID_DETALLE_FACTURA(this.ID_DETALLE_FACTURA); 
        cloned.setID_FACTURA(this.ID_FACTURA); 
        cloned.setID_PRODUCTO(this.ID_PRODUCTO); 
        cloned.setCANTIDAD(this.CANTIDAD); 
        cloned.setVALOR_VENTA(this.VALOR_VENTA); 
        cloned.setIMPUESTO(this.IMPUESTO); 
        cloned.setSUBTOTAL(this.SUBTOTAL); 
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

