package com.ibeifeng.ssm.service;

import java.util.List;


public interface BaseService<T> {
	public T findById(Integer id);
	
	public int add(T s);
	
	public int delete(T s);
	
	public int update(T s);
	
	public List<T> selectAll();
	
} 
