package com.cleverbo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.cleverbo.entity.ClassesEntity;
import com.cleverbo.dao.ClassesDao;
import com.cleverbo.service.ClassesService;

/**
 * @author V.Bo.Dong
 *
 */
@Service
public class ClassesServiceImpl implements ClassesService {
	
	@Autowired
	private ClassesDao classesDao;
	
	@Override
	public boolean add(ClassesEntity entity) {
		return classesDao.insertClasses(entity);
	}
	@Cacheable(value = "test")
	@Override
	public ClassesEntity get(Long id) {
		ClassesEntity entity = classesDao.queryById(id);
		return entity;
	}

	@Override
	public List<ClassesEntity> list() {
		List<ClassesEntity> list = classesDao.queryAll();
		return list;
	}

}
