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
	 * Constructor vac�o
	 */
	// Constructor por defecto
	public Cuenta() {
		codigoCuenta = 0;
		dineroCuenta = 0;
		cliente = new Cliente();
	}
	/**
	 * Constructor por par�metros
	 * @param codigoCuenta
	 * @param dineroCuenta
	 * @param cliente
	 */
	// Constructor por par�metros
	public Cuenta(int codigoCuenta, int dineroCuenta, Cliente cliente) {
		super();
		this.codigoCuenta = codigoCuenta;
		this.dineroCuenta = dineroCuenta;
		this.cliente = cliente;
	}
	/**
	 * M�todo get de la variable de tipo entero codigoCuenta.
	 * @return devuelve el valor de la variable de tipo entero codigoCuenta.
	 */
	// M�todos get y set
	public int getCodigoCuenta() {
		return codigoCuenta;
	}
	/**
	 * M�todo set de la variable de tipo entero codigoCuenta.
	 * @param codigoCuenta 
	 */
	public void setCodigoCuenta(int codigoCuenta) {
		this.codigoCuenta = codigoCuenta;
	}
	/**
	 * M�todo get de la variable de tipo entero dineroCuenta.
	 * @return devuelve el valor de la variable de tipo entero dineroCuenta.
	 */
	public int getDineroCuenta() {
		return dineroCuenta;
	}
	/**
	 * M�todo set de la variable de tipo entero dineroCuenta.
	 * @param dineroCuenta 
	 */
	public void setDineroCuenta(int dineroCuenta) {
		this.dineroCuenta = dineroCuenta;
	}
	/**
	 * M�todo get del atributo cliente de la clase Cliente.
	 * @return devuelve el valor del atributo cliente de la clase Cliente.
	 */
	public Cliente getCliente() {
		return cliente;
	}
	/**
	 * M�todo set del atributo cliente de la clase Cliente
	 * @param cliente
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
