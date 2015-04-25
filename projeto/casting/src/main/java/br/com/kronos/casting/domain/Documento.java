package br.com.kronos.casting.domain;

public class Documento {

	private String numero;
	private TipoDocumento tipo;

	public Documento(String numero, TipoDocumento tipo) {
		this.numero = numero;
		this.tipo = tipo;
	}

	public String getNumero() {
		return numero;
	}

	public TipoDocumento getTipo() {
		return tipo;
	}

}
