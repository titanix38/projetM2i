package com.doubleedgedsword.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class AbstractRepository<T> implements IRepository<T>,IUoW
{
	private EntityManager entityManager;
	private EntityTransaction transaction;
	private Class<T> entityClass;
	
	@Override
	public EntityManager getEntityManager()
	{
		// TODO Auto-generated method stub
		return entityManager;
	}

	@Override
	public void setEntityManager(EntityManager em)
	{
		// TODO Auto-generated method stub
		this.entityManager = em;
	}

	@Override
	public EntityTransaction getTransaction()
	{
		// TODO Auto-generated method stub
		return transaction;
	}

	@Override
	public void setTransaction(EntityTransaction et)
	{
		// TODO Auto-generated method stub
		this.transaction = et;
	}

	@Override
	public void commit()
	{
		// TODO Auto-generated method stub
		getTransaction().commit();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> getAll()
	{
		// TODO Auto-generated method stub
		return getEntityManager().createQuery("select e from "+entityClass.getSimpleName()+" e").getResultList();
	}

	@Override
	public T getById(int id)
	{
		// TODO Auto-generated method stub
		return getEntityManager().find(entityClass, id);
	}

	@Override
	public T update(T entity)
	{
		// TODO Auto-generated method stub
		return getEntityManager().merge(entity);
	}

	@Override
	public void remove(T entity)
	{
		// TODO Auto-generated method stub
		getEntityManager().remove(entity);
	}

	@Override
	public T save(T entity)
	{
		// TODO Auto-generated method stub
		getEntityManager().persist(entity);
		return entity;
	}
}
