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
	 * Constructor vac�o
	 */
	// Constructor por defecto
	public Cliente() {
		dniCliente = "";
		nombreCliente = "";
		direccionCliente = "";
	}
	/**
	 * Constructor por par�metros
	 * @param dniCliente
	 * @param nombreCliente
	 * @param direccionCliente
	 */
	// Constructor por par�metros
	public Cliente(String dniCliente, String nombreCliente, String direccionCliente) {
		super();
		this.dniCliente = dniCliente;
		this.nombreCliente = nombreCliente;
		this.direccionCliente = direccionCliente;
	}
	/**
	 * M�todo get del atributo dniCliente.
	 * @return devuelve el valor del atributo dniCliente.
	 */
	// M�todos get y set
	public String getDniCliente() {
		return dniCliente;
	}
	/**
	 * M�todo set del atributo dniCliente.
	 * @param dniCliente 
	 */
	public void setDniCliente(String dniCliente) {
		this.dniCliente = dniCliente;
	}
	/**
	 * M�todo get del atributo nombreCliente.
	 * @return devuelve el valor del atributo nombreCliente.
	 */
	public String getNombreCliente() {
		return nombreCliente;
	}
	/**
	 * M�todo set del atributo nombreCliente.
	 * @param nombreCliente
	 */
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	/**
	 * M�todo get del atributo direccionCliente.
	 * @return devuelve el valor del atributo direccionCliente.
	 */
	public String getDireccionCliente() {
		return direccionCliente;
	}
	/**
	 * M�todo set del atributo direccionCliente.
	 * @param direccionCliente
	 */
	public void setDireccionCliente(String direccionCliente) {
		this.direccionCliente = direccionCliente;
	}

}