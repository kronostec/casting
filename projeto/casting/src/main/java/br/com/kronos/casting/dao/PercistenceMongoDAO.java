package br.com.kronos.casting.dao;

import java.util.List;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Component;

import br.com.kronos.casting.bean.Bean;

/**
 * @author Jefferson Alves Cordeiro
 *
 */

@Component
public interface PercistenceMongoDAO<T extends Bean> {

	public void salvar(T objeto);
	
	public List<? extends Bean> buscarTodos(Class<? extends Bean> entidade);
	
	public List<? extends Bean> buscaPersonalizada(Criteria criteria, Class<? extends Bean> entidade);
	
	public T buscarUmObjeto(T objeto);
	
	public void deletar(T objeto);
	
		
}
