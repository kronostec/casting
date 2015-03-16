/**
 * 
 */
package br.com.casting.dao;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import org.joda.time.LocalDate;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;

import br.com.kronos.casting.bean.Artista;
import br.com.kronos.casting.bean.Bean;
import br.com.kronos.casting.bean.Sexo;
import br.com.kronos.casting.dao.PercistenceMongoDAO;
import br.com.kronos.casting.dao.PercistenceMongoDAOImpl;
import br.com.kronos.casting.enumeration.EstadoCivil;

import com.mongodb.Mongo;

/**
 * @author Jefferson Alves Cordeiro
 *
 */
public class PercistenceMongoDAOImplTest {

	private static PercistenceMongoDAO<Bean> dao;
	
	@BeforeClass
	public static void setUp() throws UnknownHostException{
		Mongo mongo = new Mongo("localhost", 27017);
		MongoOperations mongoOperations= new MongoTemplate(mongo, "castingTeste");
		dao = new PercistenceMongoDAOImpl<Bean>(mongoOperations);
	}
	
	@Test
	public void deveInserirEConsultarOResultadoInserido() {
		Artista artista = this.getMockArtista();
		dao.salvar(artista);
		
		Artista artistaBusca = (Artista) dao.buscarUmObjeto(artista);
		
		Assert.assertEquals(artista, artistaBusca);				
	}
	
	
	private Artista getMockArtista(){
		Artista artista = new Artista(36097809832L);
		List<String> agenciamentos = this.getMockAgenciamentos();
		LocalDate dataNascimento = new LocalDate(1988, 5, 19);
		artista.setAgenciamentos(agenciamentos);
		artista.setDataNascimento(dataNascimento);
		artista.setEstadoCivil(EstadoCivil.SOLTEIRO);
		artista.setNacionalidade("Brasileiro");
		artista.setNome("Jefferson Alves Cordeiro");
		artista.setNomeArtistico("Jeff");
		artista.setSexo(Sexo.MASCULINO);
		return artista;		
	}

	private List<String> getMockAgenciamentos() {
		List<String> agenciamentos = new ArrayList<String>();
		agenciamentos.add("Ator");
		agenciamentos.add("Fotografia");
		return agenciamentos;
	}

}
