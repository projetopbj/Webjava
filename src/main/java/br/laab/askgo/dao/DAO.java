package br.laab.askgo.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

public abstract class DAO<T, I extends Serializable> implements IDAO<T, I> {

	@PersistenceContext
	protected EntityManager manager;
	
	@Override
	public T save(T entity) {

		T saved = null;
		
		saved = manager.merge(entity);
		return saved;
	}

	@Override
	public void remove(T entity) {
	
		manager.remove(entity);
	}

	@Override
	public T getById(Class<T> classe, I pk) {

		try {
			return manager.find(classe, pk);
		} catch (NoResultException e) {
			return null;
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> getAll(Class<T> classe) {

		return manager.createQuery("select o from " + classe.getSimpleName() + " o").getResultList();
	}


}
