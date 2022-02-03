package es.studium.practica2;

public class Cliente {

	// Atributos
	private String dniCliente;
	private String nombreCliente;
	private String direccionCliente;

	// Constructores
	// Constructor por defecto
	public Cliente() {
		dniCliente = "";
		nombreCliente = "";
		direccionCliente = "";
	}
	
	// Constructor por parámetros
	public Cliente(String dniCliente, String nombreCliente, String direccionCliente) {
		super();
		this.dniCliente = dniCliente;
		this.nombreCliente = nombreCliente;
		this.direccionCliente = direccionCliente;
	}

	// Métodos get y set
	public String getDniCliente() {
		return dniCliente;
	}

	public void setDniCliente(String dniCliente) {
		this.dniCliente = dniCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getDireccionCliente() {
		return direccionCliente;
	}

	public void setDireccionCliente(String direccionCliente) {
		this.direccionCliente = direccionCliente;
	}

}