package es.studium.practica2;

/**
 * Clase Principal de mi programa.
 * @author Alberto Calero
 *
 */
public class TestBanco {

	private static final String LA_CUENTA_DE = "La cuenta de ";
	/**
	 * Método principal del programa.
	 * @param args
	 */
	public static void main(String[] args) {
		/* Antonio y Beatriz se hacen clientes del banco */
		Cliente antonio = new Cliente("123456789Z", "Antonio Alonso", "Av. Pueblo Saharaui, s/n");
		Cliente beatriz = new Cliente("987654321A", "Beatriz Benítez", "Calle Sol, 4");
		/* Por defecto, todas las cuentas nuevas tienen 100€ */
		Cuenta cuentaAntonio = new Cuenta(48151, 100, antonio);
		Cuenta cuentaBeatriz = new Cuenta(62342, 100, beatriz);
		/* Antonio y Beatriz consultan el saldo */
		System.out.println(LA_CUENTA_DE + cuentaAntonio.getCliente().getNombreCliente() + " tiene "
				+ cuentaAntonio.getDineroCuenta() + " euros.");
		System.out.println(LA_CUENTA_DE + cuentaBeatriz.getCliente().getNombreCliente() + " tiene "
				+ cuentaBeatriz.getDineroCuenta() + " euros.");
		/* Beatriz transfiere 50€ a Antonio */
		cuentaBeatriz.setDineroCuenta(cuentaBeatriz.getDineroCuenta() - 50);
		cuentaAntonio.setDineroCuenta(cuentaAntonio.getDineroCuenta() + 50);
		/*
		 * Antonio y Beatriz vuelven a consultar su saldo para comprobar que todo ha ido
		 * bien
		 */
		System.out.println(LA_CUENTA_DE + cuentaAntonio.getCliente().getNombreCliente() + " tiene "
				+ cuentaAntonio.getDineroCuenta() + " euros.");
		System.out.println(LA_CUENTA_DE + cuentaBeatriz.getCliente().getNombreCliente() + " tiene "
				+ cuentaBeatriz.getDineroCuenta() + " euros.");
		/* Antonio gana 100€ en una rifa y lo ingresa en su cuenta */
		cuentaAntonio.setDineroCuenta(cuentaAntonio.getDineroCuenta() + 100);
		/* Beatriz tiene que pagar 30€ a hacienda y retira el dinero */
		cuentaBeatriz.setDineroCuenta(cuentaBeatriz.getDineroCuenta() - 30);
		/*
		 * Antonio y Beatriz consultan de nuevo el saldo de su cuenta.
		 */
		System.out.println(LA_CUENTA_DE + cuentaAntonio.getCliente().getNombreCliente() + " tiene "
				+ cuentaAntonio.getDineroCuenta() + " euros.");
		System.out.println(LA_CUENTA_DE + cuentaBeatriz.getCliente().getNombreCliente() + " tiene "
				+ cuentaBeatriz.getDineroCuenta() + " euros.");
		/*
		 * Antonio transfiere 50€ a Beatriz y vuelven a consultar el saldo de su cuenta
		 */
		cuentaAntonio.setDineroCuenta(cuentaAntonio.getDineroCuenta() - 50);
		cuentaBeatriz.setDineroCuenta(cuentaBeatriz.getDineroCuenta() + 50);
		System.out.println(LA_CUENTA_DE + cuentaAntonio.getCliente().getNombreCliente() + " tiene "
				+ cuentaAntonio.getDineroCuenta() + " euros.");
		System.out.println(LA_CUENTA_DE + cuentaBeatriz.getCliente().getNombreCliente() + " tiene "
				+ cuentaBeatriz.getDineroCuenta() + " euros.");
	}
}