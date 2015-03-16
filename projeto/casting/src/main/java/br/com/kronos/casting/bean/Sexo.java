/**
 * 
 */
package br.com.kronos.casting.bean;

/**
 * @author Jefferson Alves Cordeiro
 * 
 */
public enum Sexo {

	MASCULINO("Masculino"), FEMININO("Feminino");

	private String sexo;

	private Sexo(String sexo) {
		this.sexo = sexo;
	}

	public String getSexo() {
		return this.sexo;
	}

}
