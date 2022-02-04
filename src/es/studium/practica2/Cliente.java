package es.studium.practica2;

/**
 * Clase para crear objetos de tipo Cliente
 * @author Alberto Calero
 *
 */
public class Cliente {

	// Atributos
	private String dniCliente;
	private String nombreCliente;
	private String direccionCliente;

	// Constructores
	/**
	 * Constructor vacío
	 */
	// Constructor por defecto
	public Cliente() {
		dniCliente = "";
		nombreCliente = "";
		direccionCliente = "";
	}
	/**
	 * Constructor por parámetros
	 * @param dniCliente
	 * @param nombreCliente
	 * @param direccionCliente
	 */
	// Constructor por parámetros
	public Cliente(String dniCliente, String nombreCliente, String direccionCliente) {
		super();
		this.dniCliente = dniCliente;
		this.nombreCliente = nombreCliente;
		this.direccionCliente = direccionCliente;
	}
	/**
	 * Método get del atributo dniCliente.
	 * @return devuelve el valor del atributo dniCliente.
	 */
	// Métodos get y set
	public String getDniCliente() {
		return dniCliente;
	}
	/**
	 * Método set del atributo dniCliente.
	 * @param dniCliente 
	 */
	public void setDniCliente(String dniCliente) {
		this.dniCliente = dniCliente;
	}
	/**
	 * Método get del atributo nombreCliente.
	 * @return devuelve el valor del atributo nombreCliente.
	 */
	public String getNombreCliente() {
		return nombreCliente;
	}
	/**
	 * Método set del atributo nombreCliente.
	 * @param nombreCliente
	 */
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	/**
	 * Método get del atributo direccionCliente.
	 * @return devuelve el valor del atributo direccionCliente.
	 */
	public String getDireccionCliente() {
		return direccionCliente;
	}
	/**
	 * Método set del atributo direccionCliente.
	 * @param direccionCliente
	 */
	public void setDireccionCliente(String direccionCliente) {
		this.direccionCliente = direccionCliente;
	}

}