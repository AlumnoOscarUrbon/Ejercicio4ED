package Cuentas;

/**
 * Esta clase representa una cuenta bancaria que contiene su nombre, identificador de cuenta, 
 * saldo y tipo de interes.
 * 
 * @author Oscar Urbon Risueno
 * @version 1.1
 */
public class CCuenta {

	/** Nombre del titular de la cuenta. */
    private String nombre;
	/** Identificador de la cuenta. */
    private String cuenta;
	/** Saldo de la cuenta. */
    private double saldo;
	/** Tipo de interes de la cuenta. */
    private double tipoInteres;

    /** Constructor sin parametros de la clase CCuenta. */
    public CCuenta()
    {
    }

    /**
     * Constructor de la  clase CCuenta donde se 
     * establecen los valores de nombre, identificador de cuenta, saldo y tipo de interes.
     *   
     * @param nom Nombre del titular de la cuenta.
     * @param cue Identificador de la cuenta.
     * @param sal Saldo de la cuenta.
     * @param tipo Tipo de interes de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    
   	/**
   	 * Devuelve el saldo actual de la cuenta. 
   	 * 
     * @return Saldo actual.
     */
    public double estado()
    {
         return getSaldo();
    }

    
    /**
     * Ingresa una cantidad en la cuenta.
     * 
     * @param cantidad Cantidad a ingresar.
     * @throws Exception Si la cantidad a ingresar es menor a cero.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    
    /**
     * Retira una cantidad de la cuenta.
     * 
     * @param cantidad Cantidad a retirar.
     * @throws Exception Si la cantidad a retirar es menor o igual a 
     * 0 o si no hay suficiente saldo en la cuenta.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Devuelve el nombre del titular de la cuenta.
     * 
     * @return Nombre del titular de la cuenta.
     */
	private String getNombre() {
		return nombre;
	}

    /**
     * Establece el nombre del titular de la cuenta.
     * 
     * @param nombre Nombre del titular de la cuenta.
     */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

    /**
     * Devuelve el identificador de la cuenta.
     * 
     * @return Identificador de la cuenta.
     */
	private String getCuenta() {
		return cuenta;
	}

    /**
     * Establece el identificador de la cuenta.
     * 
     * @param cuenta Identificador de la cuenta.
     */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

    /**
     * Devuelve el saldo actual de la cuenta.
     * 
     * @return Saldo actual de la cuenta.
     */
	private double getSaldo() {
		return saldo;
	}

    /**
     * Establece el saldo de la cuenta.
     * 
     * @param saldo Saldo de la cuenta.
     */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

    /**
     * Devuelve el tipo de interes de la cuenta.
     * 
     * @return Tipo de interes de la cuenta
     */
	private double getTipoInteres() {
		return tipoInteres;
	}

	 /**
     * Establece el tipo de interes de la cuenta.
     * 
     * @param tipoInteres Tipo de interes de la cuenta. 
     */
	private void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}


