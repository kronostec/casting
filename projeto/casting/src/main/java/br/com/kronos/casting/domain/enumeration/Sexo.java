package br.com.kronos.casting.domain.enumeration;

public enum Sexo {

	MASCULINO("Masculino"), FEMININO("Feminino");

	private String sexo;

	private Sexo(String sexo) {
		this.sexo = sexo;
	}

	public String getSexo() {
		return sexo;
	}

}
