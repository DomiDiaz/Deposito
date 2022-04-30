package Cuentas;

    /**
     * Este es un comentario de tipo JavaDoc en la Clase CCuenta
     * para la tarea 04 de Entornos de Desarrollo 
     * @author Domingo Diaz
     */

public class CCuenta {

    /**
     * Setter del atributo nombre
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Getter del atributo nombre
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter del atributo cuenta
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Setter del atributo cuenta
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Getter del atributo saldo
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Setter del atributo saldo
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Getter del atributo tipoInterés
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Setter del atributo tipoInterés
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
   /**
     * Método estado...
     */
    public double estado()
    {
        return getSaldo();
    }
   /**
     * Método ingesar...
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
   /**
     * Método retirar
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
