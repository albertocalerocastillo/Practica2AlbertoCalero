package es.studium.practica2;

/**
 * Clase para crear objetos de tipo Cuenta
 * @author Alberto Calero
 *
 */
public class Cuenta {

	// Atributos
	private int codigoCuenta;
	private int dineroCuenta;
	private Cliente cliente;

	// Constructores
	/**
	 * Constructor vacío
	 */
	// Constructor por defecto
	public Cuenta() {
		codigoCuenta = 0;
		dineroCuenta = 0;
		cliente = new Cliente();
	}
	/**
	 * Constructor por parámetros
	 * @param codigoCuenta
	 * @param dineroCuenta
	 * @param cliente
	 */
	// Constructor por parámetros
	public Cuenta(int codigoCuenta, int dineroCuenta, Cliente cliente) {
		super();
		this.codigoCuenta = codigoCuenta;
		this.dineroCuenta = dineroCuenta;
		this.cliente = cliente;
	}
	/**
	 * Método get de la variable de tipo entero codigoCuenta.
	 * @return devuelve el valor de la variable de tipo entero codigoCuenta.
	 */
	// Métodos get y set
	public int getCodigoCuenta() {
		return codigoCuenta;
	}
	/**
	 * Método set de la variable de tipo entero codigoCuenta.
	 * @param codigoCuenta 
	 */
	public void setCodigoCuenta(int codigoCuenta) {
		this.codigoCuenta = codigoCuenta;
	}
	/**
	 * Método get de la variable de tipo entero dineroCuenta.
	 * @return devuelve el valor de la variable de tipo entero dineroCuenta.
	 */
	public int getDineroCuenta() {
		return dineroCuenta;
	}
	/**
	 * Método set de la variable de tipo entero dineroCuenta.
	 * @param dineroCuenta 
	 */
	public void setDineroCuenta(int dineroCuenta) {
		this.dineroCuenta = dineroCuenta;
	}
	/**
	 * Método get del atributo cliente de la clase Cliente.
	 * @return devuelve el valor del atributo cliente de la clase Cliente.
	 */
	public Cliente getCliente() {
		return cliente;
	}
	/**
	 * Método set del atributo cliente de la clase Cliente
	 * @param cliente
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
