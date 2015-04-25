package br.com.kronos.casting.domain;

import java.util.HashSet;
import java.util.Set;

import org.joda.time.LocalDate;

import br.com.kronos.casting.domain.enumeration.Agenciamento;
import br.com.kronos.casting.domain.enumeration.EstadoCivil;
import br.com.kronos.casting.domain.enumeration.Sexo;

public class Artista {

	private final String nome;
	private String nomeArtistico;
	private final Sexo sexo;
	private final LocalDate dataNascimento;
	private EstadoCivil estadoCivil;
	private final String nacionalidade;
	private final Set<Documento> listaDocumentos;
	private final Set<Agenciamento> listaAgenciamentos;
	private final Contatos contatos;

	public Artista(String nome, String nomeArtistico, Sexo sexo, LocalDate dataNascimento, EstadoCivil estadoCivil, String nacionalidade, Documento documento, Contatos contatos) {
		this.listaDocumentos = new HashSet<Documento>();
		this.listaAgenciamentos = new HashSet<Agenciamento>();
		this.nome = nome;
		this.nomeArtistico = nomeArtistico;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.estadoCivil = estadoCivil;
		this.nacionalidade = nacionalidade;
		this.listaDocumentos.add(documento);
		this.contatos = contatos;
	}

	public String getNomeArtistico() {
		return nomeArtistico;
	}

	public void setNomeArtistico(String nomeArtistico) {
		this.nomeArtistico = nomeArtistico;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getNome() {
		return nome;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public Set<Documento> getListaDocumentos() {
		return listaDocumentos;
	}

	public Set<Agenciamento> getListaAgenciamentos() {
		return listaAgenciamentos;
	}

	public Contatos getContatos() {
		return contatos;
	}

}
