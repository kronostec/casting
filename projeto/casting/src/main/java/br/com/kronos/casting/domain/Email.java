package br.com.kronos.casting.domain;

import br.com.kronos.casting.domain.enumeration.PrioridadeContato;

public class Email {

	private String email;
	private PrioridadeContato prioridade;

	public Email(String email, PrioridadeContato prioridade) {
		this.email = email;
		this.prioridade = prioridade;
	}

	public String getEmail() {
		return email;
	}

	public PrioridadeContato getPrioridade() {
		return prioridade;
	}

}
