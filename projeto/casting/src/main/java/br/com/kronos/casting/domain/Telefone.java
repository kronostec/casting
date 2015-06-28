package br.com.kronos.casting.domain;

import java.io.Serializable;

import br.com.kronos.casting.domain.enumeration.PrioridadeContato;
import br.com.kronos.casting.domain.enumeration.TipoTelefone;

public class Telefone implements Serializable {

	private static final long serialVersionUID = 8698842592156977227L;

	private String ddi;
	private String ddd;
	private String telefone;
	private TipoTelefone tipo;
	private PrioridadeContato prioridade;

	public String getDdi() {
		return ddi;
	}

	public void setDdi(String ddi) {
		this.ddi = ddi;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public TipoTelefone getTipo() {
		return tipo;
	}

	public void setTipo(TipoTelefone tipo) {
		this.tipo = tipo;
	}

	public PrioridadeContato getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(PrioridadeContato prioridade) {
		this.prioridade = prioridade;
	}

}
