package es.studium.practica2;

public class Cuenta {

	// Atributos
	private int codigoCuenta;
	private int dineroCuenta;
	private Cliente cliente;

	// Constructores
	// Constructor por defecto
	public Cuenta() {
		codigoCuenta = 0;
		dineroCuenta = 0;
		cliente = new Cliente();
	}
	
	// Constructor por parámetros
	public Cuenta(int codigoCuenta, int dineroCuenta, Cliente cliente) {
		super();
		this.codigoCuenta = codigoCuenta;
		this.dineroCuenta = dineroCuenta;
		this.cliente = cliente;
	}
	
	// Métodos get y set
	public int getCodigoCuenta() {
		return codigoCuenta;
	}

	public void setCodigoCuenta(int codigoCuenta) {
		this.codigoCuenta = codigoCuenta;
	}

	public int getDineroCuenta() {
		return dineroCuenta;
	}

	public void setDineroCuenta(int dineroCuenta) {
		this.dineroCuenta = dineroCuenta;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
