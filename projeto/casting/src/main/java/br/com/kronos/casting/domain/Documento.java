package br.com.kronos.casting.domain;

import java.io.Serializable;

import br.com.kronos.casting.domain.enumeration.TipoDocumento;

public class Documento implements Serializable {

	private static final long serialVersionUID = 7111435363451750386L;

	private String numero;
	private TipoDocumento tipo;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public TipoDocumento getTipo() {
		return tipo;
	}

	public void setTipo(TipoDocumento tipo) {
		this.tipo = tipo;
	}

}
