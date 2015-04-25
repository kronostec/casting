package br.com.kronos.casting.domain;

import br.com.kronos.casting.domain.enumeration.PrioridadeContato;
import br.com.kronos.casting.domain.enumeration.TipoTelefone;

public class Telefone {

	private String ddi;
	private String ddd;
	private String telefone;
	private TipoTelefone tipo;
	private PrioridadeContato prioridade;

	public Telefone(String ddi, String ddd, String telefone, TipoTelefone tipo, PrioridadeContato prioridade) {
		this.ddi = ddi;
		this.ddd = ddd;
		this.telefone = telefone;
		this.tipo = tipo;
		this.prioridade = prioridade;
	}

	public String getDdi() {
		return ddi;
	}

	public String getDdd() {
		return ddd;
	}

	public String getTelefone() {
		return telefone;
	}

	public TipoTelefone getTipo() {
		return tipo;
	}

	public PrioridadeContato getPrioridade() {
		return prioridade;
	}

}
