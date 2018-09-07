package com.cleverbo.entity;

import java.io.Serializable;

/**
 * @author V.Bo.Dong
 *
 */
public class ClassesEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//主键
	private Long id;
	//班级名称
	private String ClassesName;
	//数据源
	private String dbSource;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getClassesName() {
		return ClassesName;
	}
	public void setClassesName(String classesName) {
		ClassesName = classesName;
	}
	public String getDbSource() {
		return dbSource;
	}
	public void setDbSource(String dbSource) {
		this.dbSource = dbSource;
	}
	
	
}
