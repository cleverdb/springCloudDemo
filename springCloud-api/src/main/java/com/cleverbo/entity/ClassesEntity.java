package com.cleverbo.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author V.Bo.Dong
 *
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
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
}
