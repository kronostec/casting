/**
 * 
 */
package br.com.kronos.casting.enumeration;

/**
 * @author Jefferson Alves Cordeiro
 * 
 */
public enum EstadoCivil {

	SOLTEIRO("Solteiro(a)"), CASADO("Casado(a)"), DIVORCIADO("Divorciado(a)"), VIUVO("Viuvo(a)");

	private String estadoCivil;

	private EstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getEstadoCivil() {
		return this.estadoCivil;
	}

}
