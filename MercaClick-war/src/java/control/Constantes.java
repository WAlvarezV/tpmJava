/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

public class Constantes {

    /**
     * Valores constantes de tipo_dato
     */
    public static final int ANULAR = 1;
    public static final int ACTIVO = 0;

    /**
     * Formato para las consultas de SerachMatching
     */
    public static final String FFECHA = "DD/MM/YYYY";
    public static final String FVALOR = "$999,999,999";
    /**
     * Constantes de validaciones
     */
    public static final String OK = "OK";
    public static final String ER = "ERROR";

    /**
     * Nombre de tablas que tienen SECUENCIAS
     */
    public static final String CIUDAD = "CIUDAD";
    public static final String CUENTA_COBRO = "CUENTA_COBRO";
    public static final String DEPARTAMENTO = "DEPARTAMENTO";
    public static final String DESCUENTO = "DESCUENTO";
    public static final String DETALLE_FACTURA = "DETALLE_FACTURA";
    public static final String DIRECCION = "DIRECCION";
    public static final String DIRECCION_PERSONA = "DIRECCION_PERSONA";
    public static final String EMPRESA = "EMPRESA";
    public static final String FACTURA = "FACTURA";
    public static final String MEDIO_PAGO = "MEDIO_PAGO";
    public static final String ORDEN_PAGO = "ORDEN_PAGO";
    public static final String PERSONA = "PERSONA";
    public static final String PRODUCTO = "PRODUCTO";
    public static final String PROMOCION = "PROMOCION";
    public static final String SEDE = "SEDE";
    public static final String STOCK = "STOCK";
    public static final String TIPO_DATO = "TIPO_DATO";
    public static final String USUARIO = "USUARIO";
    public static final String VINCULO_EMPRESA_PERSONA = "VINCULO_EMPRESA_PERSONA";

    /**
     * Signo
     */
    public static final int SIGNO_POSITIVO = 1;
    public static final int SIGNO_NEGATIVO = -1;


    /*
     * Persona
     */
    public static int PERSONA_TIPO_ID_CC = 11;
    public static int PERSONA_TIPO_ID_NIT = 12;
    public static int PERSONA_TIPO_ID_CE = 13;
    public static int PERSONA_GENERO_MASCULINO = 21;
    public static int PERSONA_GENERO_FEMENINO = 22;
    public static int PERSONA_GENERO_NO_APLICA = 23;
    public static int PERSONA_TIPO_NATURAL = 31;
    public static int PERSONA_TIPO_JURIDICA = 32;

    /**
     * Direccion y Sector
     */
    public static int SECTOR_DEFECTO = 190001;
    public static String DIRECCION_DEFECTO = "POPAYÁN";

    /**
     * Tipos de Datos
     */
    public static int CATEGORIA = 2;

    public static int SUBCATEGORIA = 50;

    /**
     * Persona
     */
    public static String PERSONA_NN = "NO TIENE NOMBRE";

}
