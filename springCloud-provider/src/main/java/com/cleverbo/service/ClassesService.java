package com.cleverbo.service;

import java.util.List;

import com.cleverbo.entity.ClassesEntity;

/**
 * @author V.Bo.Dong
 *
 */
public interface ClassesService {

     boolean add(ClassesEntity entity);
	 
	 ClassesEntity get(Long id);
	 
	 List<ClassesEntity> list();
}
