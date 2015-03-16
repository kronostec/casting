package br.com.kronos.casting.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import br.com.kronos.casting.bean.Bean;

/**
 * @author Jefferson Alves Cordeiro
 *
 */
@Component
public class PercistenceMongoDAOImpl<T extends Bean> implements PercistenceMongoDAO<T>{
	
	private MongoOperations mongoOperations;
	
	@Autowired
	public PercistenceMongoDAOImpl(MongoOperations mongoOperations) {
		this.mongoOperations = mongoOperations;
	}

	public void salvar(T objeto) {
		this.mongoOperations.save(objeto);
	}

	public List<? extends Bean> buscarTodos(Class<? extends Bean> entidade) {
		return this.mongoOperations.findAll(entidade);
	}

	public List<? extends Bean> buscaPersonalizada(Criteria criteria, Class<? extends Bean> entidade) {
		Query paramQuery = new Query(criteria);
		return this.mongoOperations.find(paramQuery, entidade);
	}

	@SuppressWarnings("unchecked")
	public T buscarUmObjeto(T objeto) {
		Criteria criteria = new Criteria().gt(objeto);
		Query paramQuery = new Query(criteria);
		return (T) this.mongoOperations.findOne(paramQuery, objeto.getClass());
	}

	public void deletar(T objeto) {
		this.mongoOperations.remove(objeto);
	}

		

}
