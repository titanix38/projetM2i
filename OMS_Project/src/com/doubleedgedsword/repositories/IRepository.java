package com.doubleedgedsword.repositories;

import java.util.*;

public interface IRepository<T>
{
	public abstract List<T> getAll();
	public abstract T getById(int id);
	public abstract T update(T entity);
	public abstract void remove(T entity);
	public abstract T save(T entity);	
}
