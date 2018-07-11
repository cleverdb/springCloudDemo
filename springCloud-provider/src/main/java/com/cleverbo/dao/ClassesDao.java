package com.cleverbo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cleverbo.entity.ClassesEntity;

/**
 * @author V.Bo.Dong
 *
 */
@Mapper
public interface ClassesDao {

	 boolean insertClasses(ClassesEntity entity);
	 
	 ClassesEntity queryById(Long id);
	 
	 List<ClassesEntity> queryAll();
	
}
