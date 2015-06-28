package br.com.kronos.casting.domain;

import java.io.Serializable;
import java.util.Set;

import org.joda.time.LocalDate;

import br.com.kronos.casting.domain.enumeration.Agenciamento;
import br.com.kronos.casting.domain.enumeration.EstadoCivil;
import br.com.kronos.casting.domain.enumeration.Sexo;

public class Artista implements Serializable {

	private static final long serialVersionUID = 7030413227215474036L;
	
	private String nome;
	private String nomeArtistico;
	private Sexo sexo;
	private LocalDate dataNascimento;
	private EstadoCivil estadoCivil;
	private String nacionalidade;
	private Set<Documento> listaDocumentos;
	private Set<Agenciamento> listaAgenciamentos;
	private Contatos contatos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeArtistico() {
		return nomeArtistico;
	}

	public void setNomeArtistico(String nomeArtistico) {
		this.nomeArtistico = nomeArtistico;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public Set<Documento> getListaDocumentos() {
		return listaDocumentos;
	}

	public void setListaDocumentos(Set<Documento> listaDocumentos) {
		this.listaDocumentos = listaDocumentos;
	}

	public Set<Agenciamento> getListaAgenciamentos() {
		return listaAgenciamentos;
	}

	public void setListaAgenciamentos(Set<Agenciamento> listaAgenciamentos) {
		this.listaAgenciamentos = listaAgenciamentos;
	}

	public Contatos getContatos() {
		return contatos;
	}

	public void setContatos(Contatos contatos) {
		this.contatos = contatos;
	}

}
