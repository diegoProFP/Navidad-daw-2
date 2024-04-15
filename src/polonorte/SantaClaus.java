package polonorte;

import utils.Utils;

import java.time.LocalDate;
import java.time.Month;


/**
 * Esta clase describe a un santa claus en el programa de Navidad
 * @author Baltasar
 * @version 1.2
 */
public class SantaClaus {

	/** Los kilos de peso de SantaClaus */
	private int kilosPeso;

	/** Si está trabajando ya o no */
	private boolean trabajando;

	/** Valor de caracter actual */
	private String caracterActual;

	/**
	 * Constructor por defecto. Se asigna caracter amigable como valor por defecto
	 * del caracter actual
	 * @see Utils
	 */
	public SantaClaus() {
		this.trabajando = false;
		this.caracterActual = Utils.CARACTER_AMIGABLE;
	}

	// (Este método se ha introducido desde la versión 1.1)

	/**
	 * Devuelve un saludo según el carácter de entrada.
	 * Si no hay coincidencias con el de entrada, se devolverá un "hoho? otra vez?"
	 * @param caracter El valor de carácter contra el que se comparará. Mirar en Utils los valores
	 * @return El valor de saludo según el carácter. Por defecto será "hoho? otra vez?"
	 * @see Utils
	 * @since 1.1
	 */
	public String generarSaludoSegunCaracter(String caracter) {

		String saludo;
		switch (caracter) {
		case Utils.CARACTER_AMIGABLE:
			saludo = "hohoho, ¡feliz navidad pequeños y adorables niños!";
			break;
		case Utils.CARACTER_CABREADO:
			saludo = "¡todos los años pidiendo juguetes! ¡Me tenéis harto!";
			break;
		case Utils.CARACTER_FURIOSO:
			saludo = "ODIO LA NAVIDAAAAADD!! DEJAD DE ESCRIBIRME!";
			break;
		default:
			saludo = "hoho? otra vez?";

		}
		return saludo;
	}

	// (Este método se ha introducido desde la versión 1.2)
	// Incluir con javadoc que se lanza la DatosInvalidosException (mirar ->
	// https://www.oracle.com/technical-resources/articles/java/javadoc-tool.html#@exception)

	/**
	 * Comprueba si la fecha de entrada es 25 de Diciembre, porque tocará trabajar.
	 * @param fecha La fecha que se quiere comprobar
	 * @return True si la fecha es 25/12, false en caso contrario
	 * @throws DatosInvalidosException Se eleva la excepción cuando la fecha es nula
	 * @since 1.2
	 */
	public boolean comprobarTrabajo(LocalDate fecha) throws DatosInvalidosException {

		if (fecha == null) {
			throw new DatosInvalidosException("La fecha no puede ser nula");
		}

		if (fecha.getMonth().equals(Month.DECEMBER) && fecha.getDayOfMonth() == 25) {
			this.trabajando = true;
		} else {
			this.trabajando = false;
		}

		return this.trabajando;
	}

	// Este metodo está desde la versión 0.5. se tiene que considerar obsoleto, y
	// referenciar al metodo
	// generarSaludoSegunCaracter

	/**
	 * Un saludo siempre fijo. "hohoho".
	 * @deprecated Desde la version 1.1, se sustituye por {@link #generarSaludoSegunCaracter(String)}
	 * @return Devuelve el saludo "hohoho" siempre.
	 * @since 0.5
	 */
	public String saludar() {
		return "hohoho ";
	}


	public int getKilosPeso() {
		return kilosPeso;
	}

	public void setKilosPeso(int kilosPeso) {
		this.kilosPeso = kilosPeso;
	}

	public boolean isTrabajando() {
		return trabajando;
	}

	public void setTrabajando(boolean trabajando) {
		this.trabajando = trabajando;
	}

	public String getCaracterActual() {
		return caracterActual;
	}

	public void setCaracterActual(String caracterActual) {
		this.caracterActual = caracterActual;
	}

	/* Getters y setters. No hace falta Javadoc en este caso */

}
